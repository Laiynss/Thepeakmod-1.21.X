package net.iroase.thepeakmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iroase.thepeakmod.Thepeakmod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

             //------------------------------//ADD BLOCKS HERE//-------------------------------//
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new
            Block(AbstractBlock.Settings.create().
                strength(1f).
                requiresTool().
                sounds(BlockSoundGroup.STONE)
            ));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().
                    strength(1f).
                    requiresTool().
                    sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SLOYNOR_FRAGMENT_BLOCK = registerBlock("sloynor_fragment_block",
            new Block(AbstractBlock.Settings.create().
                    strength(1f).
                    requiresTool().
                    sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));
    public static  final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.create().
                    strength(1f).
                    requiresTool().
                    sounds(BlockSoundGroup.DEEPSLATE)

            ));
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1,4), AbstractBlock.Settings.create().
                    strength(1f).
                    requiresTool().
                    sounds(BlockSoundGroup.STONE)
            ));
                  //------------------------------//END BLOCKS HERE//-------------------------------//



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Thepeakmod.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Thepeakmod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }


    public static void registeredModBlocks() {
        Thepeakmod.LOGGER.info("Registering block for Mod"+ Thepeakmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            entries.add(ModBlocks.SLOYNOR_FRAGMENT_BLOCK);
            entries.add(ModBlocks.PINK_GARNET_ORE);
            entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        });
    }
}
