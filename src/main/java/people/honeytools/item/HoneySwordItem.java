package people.honeytools.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import people.honeytools.effect.HoneyToolsEffects;

public class HoneySwordItem extends SwordItem implements HoneyToolItem {
    public HoneySwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        target.addStatusEffect(new StatusEffectInstance(HoneyToolsEffects.HONEY_DRAG, 40), attacker);
        return true;
    }
}
