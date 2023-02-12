package people.honeytools.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class HoneyPickaxeItem extends PickaxeItem implements HoneyToolItem {
    public HoneyPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
