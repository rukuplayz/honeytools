package people.honeytools.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HoneySwordItem extends SwordItem implements HoneyToolItem {
    public HoneySwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
