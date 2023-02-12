package people.honeytools.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class HoneyShovelItem extends ShovelItem implements HoneyToolItem {
    public HoneyShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
