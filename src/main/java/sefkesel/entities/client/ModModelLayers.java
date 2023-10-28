package sefkesel.entities.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;

public class ModModelLayers {
    public static final EntityModelLayer HOWLER =
            new EntityModelLayer(new Identifier(HowlingSun.MOD_ID, "howler"),"main");
}
