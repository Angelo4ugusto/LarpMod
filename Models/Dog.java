// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Dog extends EntityModel<Entity> {
	private final ModelPart Leg;
	private final ModelPart Leg4;
	private final ModelPart F_leg1;
	private final ModelPart Leg3;
	public Dog(ModelPart root) {
		this.Leg = root.getChild("Leg");
		this.Leg4 = root.getChild("Leg4");
		this.F_leg1 = root.getChild("F_leg1");
		this.Leg3 = root.getChild("Leg3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Leg = modelPartData.addChild("Leg", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.0F, 2.0F));

		ModelPartData Leg4 = modelPartData.addChild("Leg4", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 2.0F));

		ModelPartData F_leg1 = modelPartData.addChild("F_leg1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.0F, -3.0F));

		ModelPartData Leg3 = modelPartData.addChild("Leg3", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -3.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Leg4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		F_leg1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Leg3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}