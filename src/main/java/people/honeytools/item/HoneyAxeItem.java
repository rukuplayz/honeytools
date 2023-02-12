package people.honeytools.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class HoneyAxeItem extends AxeItem implements HoneyToolItem {
    public HoneyAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
