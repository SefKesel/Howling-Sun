package sefkesel.entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;
import sefkesel.entities.custom.HowlerEntity;

public class ModEntities {
    public static void registerModEntities(){
        HowlingSun.LOGGER.info("Registering ModEntities for "+HowlingSun.MOD_ID);
    }

    public static final EntityType<HowlerEntity> HOWLER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(HowlingSun.MOD_ID, "howler"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HowlerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f,2f)).build());
}
