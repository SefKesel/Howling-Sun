package sefkesel.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;

public class ModItems {
    public static final Item SILVER_INGOT = registerItem("silver_ingot",new Item(new FabricItemSettings()));
    public static final Item SILVER_RAW = registerItem("silver_raw",new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",new Item(new FabricItemSettings()));
    public static final Item SILVERSWORD = registerItem("silversword",new SwordItem(ToolMaterials.IRON, 5, 3, new FabricItemSettings()));
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HowlingSun.MOD_ID, name), item);
    }
    public static void registerModItems(){
        HowlingSun.LOGGER.info("Registering ModItems for "+HowlingSun.MOD_ID);
    }
}
