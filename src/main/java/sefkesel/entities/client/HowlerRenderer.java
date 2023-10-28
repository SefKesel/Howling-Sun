package sefkesel.entities.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import sefkesel.HowlingSun;
import sefkesel.entities.custom.HowlerEntity;

public class HowlerRenderer extends MobEntityRenderer<HowlerEntity, HowlerModel<HowlerEntity>> {
    private static final Identifier TEXTURE = new Identifier(HowlingSun.MOD_ID, "textures/entity/howler.png");

    public HowlerRenderer(EntityRendererFactory.Context context) {
        super(context, new HowlerModel<>(context.getPart(ModModelLayers.HOWLER)),1f);
    }

    @Override
    public Identifier getTexture(HowlerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(HowlerEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
