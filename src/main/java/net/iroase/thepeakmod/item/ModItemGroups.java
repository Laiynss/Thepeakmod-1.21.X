package net.iroase.thepeakmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iroase.thepeakmod.Thepeakmod;
import net.iroase.thepeakmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PeakOres = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Thepeakmod.MOD_ID,"pink_garnet"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.Thepeakmod.pink_garnet"))
                    .entries((displayContext, entries) -> {

                        entries.add(new ItemStack(ModItems.PINK_GARNET));
                        entries.add(new ItemStack(ModItems.RAW_PINK_GARNET));
                        entries.add(new ItemStack(ModItems.SLOYNOR_FRAGMENT));

                    }).build());

    public static final ItemGroup PeakBlocks = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Thepeakmod.MOD_ID,"pink_garnet_block"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SLOYNOR_FRAGMENT_BLOCK))
                    .displayName(Text.translatable("itemgroup.Thepeakmod.pink_garnet"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                    }).build());


    public static void  registerItemGroups() {

        Thepeakmod.LOGGER.info("Registering Mod Item Groups" + Thepeakmod.MOD_ID);

    }
}
