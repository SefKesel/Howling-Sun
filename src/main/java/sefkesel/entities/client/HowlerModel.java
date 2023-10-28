package sefkesel.entities.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import sefkesel.entities.animation.ModAnimations;
import sefkesel.entities.custom.HowlerEntity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class HowlerModel<T extends HowlerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart howler;
	private final ModelPart head;
	public HowlerModel(ModelPart root) {
		this.howler = root.getChild("howler");
		this.head = howler.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData howler = modelPartData.addChild("howler", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.0F, 0.0F));

		ModelPartData head = howler.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-3.5F, -4.25F, -7.75F, 7.0F, 7.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.25F, -6.25F));

		ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create().uv(15, 65).cuboid(-3.4F, -14.9F, -8.9F, 6.8F, 5.4F, 3.9F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.75F, 1.25F));

		ModelPartData horn1 = head.addChild("horn1", ModelPartBuilder.create(), ModelTransform.of(4.0F, -2.05F, -1.25F, 2.3562F, -0.0873F, 0.0F));

		ModelPartData punta_r1 = horn1.addChild("punta_r1", ModelPartBuilder.create().uv(24, 17).cuboid(-0.5F, -0.75F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData head_r1 = horn1.addChild("head_r1", ModelPartBuilder.create().uv(0, 20).cuboid(-2.5F, -0.25F, -4.25F, 1.5F, 1.75F, 1.5F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.5F, 3.5F, 0.0F, 0.0F, 1.309F));

		ModelPartData head_r2 = horn1.addChild("head_r2", ModelPartBuilder.create().uv(0, 3).cuboid(-9.5F, -13.5F, -4.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-13.0F, 8.5F, 3.5F, 0.0F, 0.0F, 1.5708F));

		ModelPartData head_r3 = horn1.addChild("head_r3", ModelPartBuilder.create().uv(21, 32).cuboid(-1.0F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData horn2 = head.addChild("horn2", ModelPartBuilder.create(), ModelTransform.of(-4.0F, -2.25F, -1.25F, 0.7854F, -0.0873F, -3.1416F));

		ModelPartData punta_r2 = horn2.addChild("punta_r2", ModelPartBuilder.create().uv(24, 17).cuboid(-0.5F, -0.75F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData head_r4 = horn2.addChild("head_r4", ModelPartBuilder.create().uv(0, 16).cuboid(-2.5F, -0.25F, -4.25F, 1.5F, 1.75F, 1.5F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.5F, 3.5F, 0.0F, 0.0F, 1.309F));

		ModelPartData head_r5 = horn2.addChild("head_r5", ModelPartBuilder.create().uv(0, 0).cuboid(-9.5F, -13.5F, -4.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-13.0F, 8.5F, 3.5F, 0.0F, 0.0F, 1.5708F));

		ModelPartData head_r6 = horn2.addChild("head_r6", ModelPartBuilder.create().uv(10, 32).cuboid(-1.0F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData hear2 = head.addChild("hear2", ModelPartBuilder.create().uv(40, 11).cuboid(-1.0749F, -5.6529F, 0.0387F, 2.5F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 32).cuboid(-1.3249F, -2.6529F, 0.0387F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.25F, -4.25F, -3.0F, -0.4305F, 0.0735F, 0.1585F));

		ModelPartData hear1 = head.addChild("hear1", ModelPartBuilder.create().uv(0, 32).cuboid(-1.5076F, -2.6632F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 8).cuboid(-1.2576F, -5.6632F, -0.5F, 2.5F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, -4.0F, -2.25F, -0.4305F, -0.0735F, -0.1585F));

		ModelPartData upjaw = head.addChild("upjaw", ModelPartBuilder.create().uv(12, 38).cuboid(-1.5F, -0.77F, -5.75F, 3.0F, 2.0F, 6.0F, new Dilation(0.0F))
				.uv(58, 47).cuboid(-1.4F, 1.15F, -5.4F, 2.7F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, -8.0F));

		ModelPartData downjaw = head.addChild("downjaw", ModelPartBuilder.create().uv(40, 8).cuboid(-1.5F, -0.52F, -5.75F, 3.0F, 1.0F, 6.0F, new Dilation(0.0F))
				.uv(47, 62).cuboid(-1.3F, -2.5F, -5.4F, 2.5F, 2.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, -7.75F, 0.7854F, 0.0F, 0.0F));

		ModelPartData body = howler.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -10.0F, 2.0F));

		ModelPartData stomach = body.addChild("stomach", ModelPartBuilder.create().uv(26, 26).cuboid(-4.0F, 3.0F, -2.0F, 8.0F, 13.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData fur2 = stomach.addChild("fur2", ModelPartBuilder.create().uv(0, 36).cuboid(-3.0F, 1.0F, 3.0F, 6.0F, 13.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 1.0F));

		ModelPartData lfur_r1 = fur2.addChild("lfur_r1", ModelPartBuilder.create().uv(31, 16).cuboid(-6.55F, 0.5F, 7.0F, 3.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(7.3F, -5.5F, -3.0F, -1.5708F, 1.0472F, 0.0F));

		ModelPartData rfur_r1 = fur2.addChild("rfur_r1", ModelPartBuilder.create().uv(0, 38).cuboid(-1.8557F, 2.75F, 5.0F, 3.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, -3.5F, 3.0F, -1.5708F, -1.0472F, 0.0F));

		ModelPartData lfur_r2 = fur2.addChild("lfur_r2", ModelPartBuilder.create().uv(36, 55).cuboid(-2.0F, -7.0F, 6.0F, 3.0F, 13.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, -3.0F, 0.0F, 0.5236F, 0.0F));

		ModelPartData rfur_r2 = fur2.addChild("rfur_r2", ModelPartBuilder.create().uv(39, 55).cuboid(-1.0F, -7.0F, 6.0F, 3.0F, 13.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, -3.0F, 0.0F, -0.5236F, 0.0F));

		ModelPartData chest = body.addChild("chest", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -4.0F, -8.0F, 10.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

		ModelPartData fur = chest.addChild("fur", ModelPartBuilder.create().uv(31, 56).cuboid(-3.0F, -15.0F, -6.0F, 6.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.0F, -2.0F));

		ModelPartData lfur_r3 = fur.addChild("lfur_r3", ModelPartBuilder.create().uv(0, 32).cuboid(-3.3F, 1.5F, -6.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(7.3F, -13.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData rfur_r3 = fur.addChild("rfur_r3", ModelPartBuilder.create().uv(32, 17).cuboid(0.5F, 1.5F, -6.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-7.5F, -13.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(50, 32).cuboid(-1.4F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, 6.0F, 11.5F, 0.6981F, 0.0F, 0.0F));

		ModelPartData bone = tail.addChild("bone", ModelPartBuilder.create().uv(51, 42).cuboid(-1.25F, -1.2614F, -1.1198F, 2.5F, 7.0F, 2.5F, new Dilation(0.0F)), ModelTransform.of(0.1F, 7.25F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create().uv(8, 57).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.7386F, 0.1302F, 0.5236F, 0.0F, 0.0F));

		ModelPartData leg1 = body.addChild("leg1", ModelPartBuilder.create().uv(50, 15).cuboid(-1.75F, -1.5F, -1.5F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.25F, 10.5F, 9.0F));

		ModelPartData foreleg1 = leg1.addChild("foreleg1", ModelPartBuilder.create().uv(0, 54).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.25F, 6.5F, 0.0F));

		ModelPartData l1foot = foreleg1.addChild("l1foot", ModelPartBuilder.create().uv(24, 17).cuboid(-1.25F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.25F, 6.0F, 0.0F));

		ModelPartData l1nails = l1foot.addChild("l1nails", ModelPartBuilder.create().uv(6, 0).cuboid(-4.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-5.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 5).cuboid(-6.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(2, 5).cuboid(-7.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.75F, -13.0F, -7.0F));

		ModelPartData leg2 = body.addChild("leg2", ModelPartBuilder.create().uv(10, 46).cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(3.5F, 10.5F, 9.0F));

		ModelPartData foreleg2 = leg2.addChild("foreleg2", ModelPartBuilder.create().uv(51, 52).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.5F, 0.0F));

		ModelPartData l2foot = foreleg2.addChild("l2foot", ModelPartBuilder.create().uv(10, 32).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData l2nails = l2foot.addChild("l2nails", ModelPartBuilder.create().uv(4, 6).cuboid(7.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 3).cuboid(6.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 2).cuboid(5.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(2, 6).cuboid(4.0F, 13.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -13.0F, -7.0F));

		ModelPartData leg3 = body.addChild("leg3", ModelPartBuilder.create().uv(39, 44).cuboid(-1.5F, -1.5F, -1.25F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.5F, 10.5F, -6.25F));

		ModelPartData foreleg3 = leg3.addChild("foreleg3", ModelPartBuilder.create().uv(20, 55).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.5F, 0.25F));

		ModelPartData l3foot = foreleg3.addChild("l3foot", ModelPartBuilder.create().uv(48, 0).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData l3nails = l3foot.addChild("l3nails", ModelPartBuilder.create().uv(0, 5).cuboid(-4.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 3).cuboid(-5.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 2).cuboid(-6.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-7.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, -13.0F, 9.0F));

		ModelPartData leg4 = body.addChild("leg4", ModelPartBuilder.create().uv(27, 44).cuboid(-1.25F, -1.75F, -1.75F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(4.25F, 10.75F, -5.75F));

		ModelPartData foreleg4 = leg4.addChild("foreleg4", ModelPartBuilder.create().uv(28, 55).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.25F, 6.25F, -0.25F));

		ModelPartData l4foot = foreleg4.addChild("l4foot", ModelPartBuilder.create().uv(44, 26).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData l4nails = l4foot.addChild("l4nails", ModelPartBuilder.create().uv(6, 15).cuboid(4.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 15).cuboid(5.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 6).cuboid(6.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 5).cuboid(7.0F, 13.0F, -14.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -13.0F, 9.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(HowlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.HOWLER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.HOWLER_IDLE, ageInTicks, 1f);
	}
	public void setHeadAngles(float netHeadYaw, float headPitch){
		netHeadYaw = MathHelper.clamp(netHeadYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = netHeadYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		howler.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return howler;
	}
}