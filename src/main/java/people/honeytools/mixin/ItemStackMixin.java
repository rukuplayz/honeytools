package people.honeytools.mixin;

import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import people.honeytools.item.HoneyToolItem;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements FabricItemStack {
    @Shadow public abstract void addEnchantment(Enchantment enchantment, int level);

    @Inject(method="<init>(Lnet/minecraft/item/ItemConvertible;I)V", at=@At("TAIL"))
    public void AddSilkTouchToHoneyTool(ItemConvertible item, int count, CallbackInfo ci){
        if ((item != null) && (item.asItem() instanceof HoneyToolItem)){
            this.addEnchantment(Enchantments.SILK_TOUCH, 1);
        }
    }
}
