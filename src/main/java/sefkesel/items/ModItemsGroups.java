package sefkesel.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;
import sefkesel.blocks.ModBlocks;

public class ModItemsGroups {
    public static final ItemGroup Howling_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HowlingSun.MOD_ID, "howlingsun"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.howling"))
                    .icon(() -> new ItemStack(ModItems.SILVER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVER_RAW);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.SILVER_INGOT);



                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.SILVER_ORE_DEEPSLATE);

                        entries.add(ModItems.SILVERSWORD);
                    }).build());
    public static void registerItemGroup(){
        HowlingSun.LOGGER.info("Registering item groups for "+HowlingSun.MOD_ID);

    }
}
