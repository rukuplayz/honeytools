package people.honeytools.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoneyHoeItem extends HoeItem implements HoneyToolItem {
    public HoneyHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
