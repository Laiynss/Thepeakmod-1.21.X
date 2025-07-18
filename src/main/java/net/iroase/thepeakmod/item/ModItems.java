package net.iroase.thepeakmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iroase.thepeakmod.Thepeakmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item SLOYNOR_FRAGMENT = registerItem("sloynor_fragment", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Thepeakmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Thepeakmod.LOGGER.info("Registering Mods Items for " + Thepeakmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(SLOYNOR_FRAGMENT);
        });
    }
}
