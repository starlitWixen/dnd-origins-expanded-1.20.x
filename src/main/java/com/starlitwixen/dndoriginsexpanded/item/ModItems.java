package com.starlitwixen.dndoriginsexpanded.item;

import com.starlitwixen.dndoriginsexpanded.DNDOriginsExpanded;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPELL_SCROLL_COMMON = registerItem("spell_scroll_common", new Item(new FabricItemSettings()));
    public static final Item SPELL_SCROLL_UNCOMMON = registerItem("spell_scroll_uncommon", new Item(new FabricItemSettings()));
    public static final Item SPELL_SCROLL_RARE = registerItem("spell_scroll_rare", new Item(new FabricItemSettings()));
    public static final Item SPELL_SCROLL_EPIC = registerItem("spell_scroll_epic", new Item(new FabricItemSettings()));
    public static final Item SPELL_SCROLL_LEGENDARY = registerItem("spell_scroll_legendary", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DNDOriginsExpanded.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DNDOriginsExpanded.LOGGER.info("Registering Mod Items for " + DNDOriginsExpanded.MOD_ID);
    }
}
