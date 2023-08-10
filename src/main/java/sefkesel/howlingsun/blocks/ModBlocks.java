package sefkesel.howlingsun.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.jetbrains.annotations.Nullable;
import sefkesel.howlingsun.HowlingSun;

public class ModBlocks extends Block implements BlockEntityProvider {
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool().strength(3f,3f), UniformIntProvider.create(2,5)));
    public static final Block SILVER_ORE_DEEPSLATE = registerBlock("silver_ore_deepslate",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).requiresTool().strength(3.5f,3f), UniformIntProvider.create(3,8)));

    public ModBlocks(Settings settings) {
        super(settings);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HowlingSun.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HowlingSun.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlock(){
        HowlingSun.LOGGER.info("Registering ModBlocks for "+HowlingSun.MOD_ID);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
