package com.starlitwixen.dndoriginsexpanded.item;

import com.starlitwixen.dndoriginsexpanded.DNDOriginsExpanded;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DND_ORIGINS_EXPANDED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DNDOriginsExpanded.MOD_ID, "dndoriginsexpanded"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dndoriginsexpanded"))
                    .icon(() -> new ItemStack(ModItems.SPELL_SCROLL_EPIC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SPELL_SCROLL_COMMON);
                        entries.add(ModItems.SPELL_SCROLL_UNCOMMON);
                        entries.add(ModItems.SPELL_SCROLL_RARE);
                        entries.add(ModItems.SPELL_SCROLL_EPIC);
                        entries.add(ModItems.SPELL_SCROLL_LEGENDARY);
                    }).build());
    public static void registerItemGroups() {
        DNDOriginsExpanded.LOGGER.info("Registering Item Groups for " + DNDOriginsExpanded.MOD_ID);
    }
}
