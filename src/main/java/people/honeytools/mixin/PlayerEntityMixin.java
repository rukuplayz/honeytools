package people.honeytools.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.math.Box;
import people.honeytools.item.HoneyToolItem;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin (PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Shadow private void collideWithEntity(Entity entity){
    }
    @Inject(method="tickMovement", at=@At(value="INVOKE",
            target = "Lnet/minecraft/world/World;getOtherEntities(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;)Ljava/util/List;"))
    public void IncreasePickupBox(CallbackInfo ci){
        if (this.getMainHandStack().getItem() instanceof HoneyToolItem){
            this.setBoundingBox(this.calculateBoundingBox());
            Box box = this.getBoundingBox().expand(5.0, 5.5, 5.0);
            List<Entity> list = this.world.getOtherEntities(this, box);
            for (Entity entity: list){
                if (entity.getType() == EntityType.ITEM){
                    this.collideWithEntity(entity);
                }
            }


            //Box BOX_NEW = new Box(0, 0, 0, 10, 10, 10);
        }
    }
}

