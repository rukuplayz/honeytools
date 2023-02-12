package people.honeytools.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;


public class HoneyToolsEffects {
    public static StatusEffect HONEY_DRAG;

    public static StatusEffect register(String name, StatusEffect effect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier("honeytools", name), effect);
    }

    public static void registerEffects() {
        HONEY_DRAG = register("honey_drag", new HoneyDragStatusEffect(StatusEffectCategory.HARMFUL, 15898890)
                .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "91AEAA56-476B-4498-935B-2F7F68070635", 0.8f, EntityAttributeModifier.Operation.ADDITION)
                .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-776B-4498-935B-2F7F68070635", -0.5f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    }
}
