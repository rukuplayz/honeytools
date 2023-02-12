package people.honeytools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import people.honeytools.effect.HoneyToolsEffects;
import people.honeytools.item.*;

public class Honeytools implements ModInitializer {

    public static ToolItem HONEY_PICKAXE = new HoneyPickaxeItem(Material.INSTANCE, 2, -2.8F, new Item.Settings());
    public static ToolItem HONEY_SWORD = new HoneySwordItem(Material.INSTANCE, 3, -2.0F, new Item.Settings());
    public static ToolItem HONEY_AXE = new HoneyAxeItem(Material.INSTANCE, 4, -2.8F, new Item.Settings());
    public static ToolItem HONEY_SHOVEL = new HoneyShovelItem(Material.INSTANCE, 2, -2.8F, new Item.Settings());
    public static ToolItem HONEY_HOE = new HoneyHoeItem(Material.INSTANCE, 1, -2.8F, new Item.Settings());
    public static final String MOD_ID = "honeytools";
    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(HONEY_PICKAXE);
            content.add(HONEY_SWORD);
            content.add(HONEY_AXE);
            content.add(HONEY_SHOVEL);
            content.add(HONEY_HOE);
        });
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "honey_pickaxe"), HONEY_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "honey_sword"), HONEY_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "honey_axe"), HONEY_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "honey_shovel"), HONEY_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "honey_hoe"), HONEY_HOE);

        HoneyToolsEffects.registerEffects();
    }
}
