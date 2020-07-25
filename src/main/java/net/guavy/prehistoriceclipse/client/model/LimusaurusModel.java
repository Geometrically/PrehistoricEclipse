package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class LimusaurusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer body_base;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer body_segment_1;
	private final AnimatedModelRenderer body_segment_2;
	private final AnimatedModelRenderer neck_base;
	private final AnimatedModelRenderer neck_segment_1;
	private final AnimatedModelRenderer neck_segment_2;
	private final AnimatedModelRenderer neck_segment_3;
	private final AnimatedModelRenderer neck_segment_4;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer lower_jaw_1;
	private final AnimatedModelRenderer lower_jaw_2;
	private final AnimatedModelRenderer lower_beak;
	private final AnimatedModelRenderer upper_jaw_1;
	private final AnimatedModelRenderer upper_beak;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer right_arm_1;
	private final AnimatedModelRenderer right_arm_2;
	private final AnimatedModelRenderer right_arm_3;
	private final AnimatedModelRenderer left_arm_4;
	private final AnimatedModelRenderer left_arm_5;
	private final AnimatedModelRenderer left_arm_6;
	private final AnimatedModelRenderer tail_base;
	private final AnimatedModelRenderer tail_segment_1;
	private final AnimatedModelRenderer tail_segment_2;
	private final AnimatedModelRenderer tail_segment_3;
	private final AnimatedModelRenderer tail_segment_4;
	private final AnimatedModelRenderer tail_segment_5;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer l4;

    public LimusaurusModel()
    {
        textureWidth = 128;
		textureHeight = 128;
		body_base = new AnimatedModelRenderer(this);
		body_base.setRotationPoint(0.0F, -6.75F, 3.0F);
		setRotationAngle(body_base, -0.0698F, 0.0F, 0.0F);
		body_base.setTextureOffset(0, 0).addBox(-6.0F, -6.4139F, -6.2668F, 12.0F, 18.0F, 12.0F, 0.0F, false);
		body_base.setModelRendererName("body_base");
		this.registerModelRenderer(body_base);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(1.5F, 1.624F, -0.2874F);
		body_base.addChild(bone);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		bone.setTextureOffset(68, 0).addBox(-3.5F, -6.4139F, -4.2668F, 4.0F, 18.0F, 10.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		body_segment_1 = new AnimatedModelRenderer(this);
		body_segment_1.setRotationPoint(0.2F, -0.0148F, -6.1389F);
		body_base.addChild(body_segment_1);
		setRotationAngle(body_segment_1, 0.0456F, 0.0F, 0.0F);
		body_segment_1.setTextureOffset(0, 30).addBox(-5.2F, -5.8985F, -10.9362F, 10.0F, 15.0F, 13.0F, 0.0F, false);
		body_segment_1.setModelRendererName("body_segment_1");
		this.registerModelRenderer(body_segment_1);

		body_segment_2 = new AnimatedModelRenderer(this);
		body_segment_2.setRotationPoint(-0.1F, -0.5501F, -10.4308F);
		body_segment_1.addChild(body_segment_2);
		setRotationAngle(body_segment_2, 0.0911F, 0.0F, 0.0F);
		body_segment_2.setTextureOffset(64, 64).addBox(-4.1F, -4.909F, -9.5041F, 8.0F, 13.0F, 11.0F, 0.01F, false);
		body_segment_2.setModelRendererName("body_segment_2");
		this.registerModelRenderer(body_segment_2);

		neck_base = new AnimatedModelRenderer(this);
		neck_base.setRotationPoint(0.0F, -1.5426F, -8.9997F);
		body_segment_2.addChild(neck_base);
		setRotationAngle(neck_base, -0.2372F, 0.0F, 0.0F);
		neck_base.setTextureOffset(84, 28).addBox(-4.1F, -3.0F, -4.5F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		neck_base.setModelRendererName("neck_base");
		this.registerModelRenderer(neck_base);

		neck_segment_1 = new AnimatedModelRenderer(this);
		neck_segment_1.setRotationPoint(0.0F, 0.6F, -3.3F);
		neck_base.addChild(neck_segment_1);
		setRotationAngle(neck_segment_1, -0.3674F, 0.0F, 0.0F);
		neck_segment_1.setTextureOffset(78, 88).addBox(-3.1F, -2.5F, -7.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		neck_segment_1.setModelRendererName("neck_segment_1");
		this.registerModelRenderer(neck_segment_1);

		neck_segment_2 = new AnimatedModelRenderer(this);
		neck_segment_2.setRotationPoint(-0.1F, 0.4F, -5.8F);
		neck_segment_1.addChild(neck_segment_2);
		setRotationAngle(neck_segment_2, -0.5711F, 0.0F, 0.0F);
		neck_segment_2.setTextureOffset(36, 0).addBox(-2.0F, -2.0F, -6.5F, 4.0F, 5.0F, 7.0F, 0.01F, false);
		neck_segment_2.setModelRendererName("neck_segment_2");
		this.registerModelRenderer(neck_segment_2);

		neck_segment_3 = new AnimatedModelRenderer(this);
		neck_segment_3.setRotationPoint(0.0F, 0.3F, -6.0F);
		neck_segment_2.addChild(neck_segment_3);
		setRotationAngle(neck_segment_3, -0.1478F, 0.0F, 0.0F);
		neck_segment_3.setTextureOffset(91, 60).addBox(-2.0F, -2.2869F, -5.4123F, 4.0F, 5.0F, 6.0F, 0.0F, false);
		neck_segment_3.setModelRendererName("neck_segment_3");
		this.registerModelRenderer(neck_segment_3);

		neck_segment_4 = new AnimatedModelRenderer(this);
		neck_segment_4.setRotationPoint(0.0F, -0.3648F, -4.4313F);
		neck_segment_3.addChild(neck_segment_4);
		setRotationAngle(neck_segment_4, 0.7056F, 0.0F, 0.0F);
		neck_segment_4.setTextureOffset(96, 10).addBox(-2.0F, -2.0F, -3.5F, 4.0F, 4.0F, 4.0F, -0.02F, false);
		neck_segment_4.setModelRendererName("neck_segment_4");
		this.registerModelRenderer(neck_segment_4);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, -0.5135F, -2.6353F);
		neck_segment_4.addChild(head);
		setRotationAngle(head, 0.7218F, 0.0F, 0.0F);
		head.setTextureOffset(58, 0).addBox(-3.0F, -1.7394F, -3.6172F, 6.0F, 4.0F, 4.0F, -0.01F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		lower_jaw_1 = new AnimatedModelRenderer(this);
		lower_jaw_1.setRotationPoint(0.8F, 1.8989F, 0.3761F);
		head.addChild(lower_jaw_1);
		setRotationAngle(lower_jaw_1, -0.0039F, 0.0F, 0.0F);
		lower_jaw_1.setTextureOffset(96, 18).addBox(-2.8F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F, -0.016F, false);
		lower_jaw_1.setTextureOffset(6, 31).addBox(1.12F, -1.9034F, -3.9445F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		lower_jaw_1.setTextureOffset(6, 2).addBox(-2.72F, -2.3333F, -3.8213F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		lower_jaw_1.setModelRendererName("lower_jaw_1");
		this.registerModelRenderer(lower_jaw_1);

		lower_jaw_2 = new AnimatedModelRenderer(this);
		lower_jaw_2.setRotationPoint(-0.7F, 0.0F, -3.5F);
		lower_jaw_1.addChild(lower_jaw_2);
		setRotationAngle(lower_jaw_2, 0.0608F, 0.0F, 0.0F);
		lower_jaw_2.setTextureOffset(54, 8).addBox(-1.6F, -0.5F, -4.0F, 3.0F, 2.0F, 4.0F, -0.01F, false);
		lower_jaw_2.setModelRendererName("lower_jaw_2");
		this.registerModelRenderer(lower_jaw_2);

		lower_beak = new AnimatedModelRenderer(this);
		lower_beak.setRotationPoint(0.0F, 0.4153F, -3.4685F);
		lower_jaw_2.addChild(lower_beak);
		setRotationAngle(lower_beak, -0.2967F, 0.0F, 0.0F);
		lower_beak.setTextureOffset(0, 30).addBox(-1.6F, -1.1203F, -2.0021F, 3.0F, 2.0F, 2.0F, -0.03F, false);
		lower_beak.setModelRendererName("lower_beak");
		this.registerModelRenderer(lower_beak);

		upper_jaw_1 = new AnimatedModelRenderer(this);
		upper_jaw_1.setRotationPoint(0.5F, 1.3316F, -2.5419F);
		head.addChild(upper_jaw_1);
		setRotationAngle(upper_jaw_1, 0.1241F, 0.0F, 0.0F);
		upper_jaw_1.setTextureOffset(54, 66).addBox(-2.5F, -2.2656F, -5.0972F, 4.0F, 3.0F, 5.0F, -0.01F, false);
		upper_jaw_1.setModelRendererName("upper_jaw_1");
		this.registerModelRenderer(upper_jaw_1);

		upper_beak = new AnimatedModelRenderer(this);
		upper_beak.setRotationPoint(0.0F, -1.7534F, -5.8085F);
		upper_jaw_1.addChild(upper_beak);
		setRotationAngle(upper_beak, 2.5307F, 0.0F, 0.0F);
		upper_beak.setTextureOffset(0, 0).addBox(-2.0F, -2.1F, -2.2F, 3.0F, 3.0F, 2.0F, -0.01F, false);
		upper_beak.setModelRendererName("upper_beak");
		this.registerModelRenderer(upper_beak);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(0.0F, -2.8867F, -0.4326F);
		upper_jaw_1.addChild(bone2);
		setRotationAngle(bone2, 0.1222F, 0.0F, 0.0F);
		bone2.setTextureOffset(32, 94).addBox(-2.0F, -0.2418F, -4.7005F, 3.0F, 3.0F, 5.0F, -0.01F, false);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		right_arm_1 = new AnimatedModelRenderer(this);
		right_arm_1.setRotationPoint(-4.6F, 5.4349F, -6.4825F);
		body_segment_2.addChild(right_arm_1);
		setRotationAngle(right_arm_1, 1.5575F, -0.3542F, 0.0186F);
		right_arm_1.setTextureOffset(86, 0).addBox(-1.5F, -1.0F, -1.5F, 4.0F, 6.0F, 4.0F, -0.2F, false);
		right_arm_1.setModelRendererName("right_arm_1");
		this.registerModelRenderer(right_arm_1);

		right_arm_2 = new AnimatedModelRenderer(this);
		right_arm_2.setRotationPoint(0.4368F, 4.2224F, 0.4992F);
		right_arm_1.addChild(right_arm_2);
		setRotationAngle(right_arm_2, -0.5427F, -0.0524F, -0.1213F);
		right_arm_2.setTextureOffset(0, 5).addBox(-1.1494F, -0.5559F, -0.8887F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		right_arm_2.setModelRendererName("right_arm_2");
		this.registerModelRenderer(right_arm_2);

		right_arm_3 = new AnimatedModelRenderer(this);
		right_arm_3.setRotationPoint(-0.0005F, 3.0864F, -0.428F);
		right_arm_2.addChild(right_arm_3);
		setRotationAngle(right_arm_3, -0.0222F, 0.0692F, -0.2572F);
		right_arm_3.setTextureOffset(0, 34).addBox(-1.0733F, -0.1501F, -0.4945F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		right_arm_3.setTextureOffset(8, 0).addBox(-0.8587F, 2.0696F, -0.5203F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_3.setTextureOffset(8, 36).addBox(-0.8733F, 1.6999F, -0.0945F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm_3.setTextureOffset(8, 8).addBox(-0.8733F, 1.4999F, 0.6055F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm_3.setModelRendererName("right_arm_3");
		this.registerModelRenderer(right_arm_3);

		left_arm_4 = new AnimatedModelRenderer(this);
		left_arm_4.setRotationPoint(4.7F, 5.4349F, -6.4825F);
		body_segment_2.addChild(left_arm_4);
		setRotationAngle(left_arm_4, 1.5575F, 0.3542F, -0.0186F);
		left_arm_4.setTextureOffset(86, 0).addBox(-2.8F, -1.0F, -1.5F, 4.0F, 6.0F, 4.0F, -0.2F, true);
		left_arm_4.setModelRendererName("left_arm_4");
		this.registerModelRenderer(left_arm_4);

		left_arm_5 = new AnimatedModelRenderer(this);
		left_arm_5.setRotationPoint(-0.4368F, 4.2224F, 0.4992F);
		left_arm_4.addChild(left_arm_5);
		setRotationAngle(left_arm_5, -0.5427F, 0.0524F, 0.1213F);
		left_arm_5.setTextureOffset(0, 5).addBox(-0.8506F, -0.5559F, -0.8887F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		left_arm_5.setModelRendererName("left_arm_5");
		this.registerModelRenderer(left_arm_5);

		left_arm_6 = new AnimatedModelRenderer(this);
		left_arm_6.setRotationPoint(0.0005F, 3.0864F, -0.428F);
		left_arm_5.addChild(left_arm_6);
		setRotationAngle(left_arm_6, -0.0222F, -0.0692F, 0.2572F);
		left_arm_6.setTextureOffset(0, 34).addBox(-0.9267F, -0.1501F, -0.4945F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		left_arm_6.setTextureOffset(8, 0).addBox(-0.1413F, 2.0696F, -0.5203F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		left_arm_6.setTextureOffset(8, 36).addBox(-0.1267F, 1.6999F, -0.0945F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		left_arm_6.setTextureOffset(8, 8).addBox(-0.1267F, 1.4999F, 0.6055F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		left_arm_6.setModelRendererName("left_arm_6");
		this.registerModelRenderer(left_arm_6);

		tail_base = new AnimatedModelRenderer(this);
		tail_base.setRotationPoint(0.0F, -1.2139F, 4.7332F);
		body_base.addChild(tail_base);
		setRotationAngle(tail_base, 0.0737F, 0.0F, 0.0F);
		tail_base.setTextureOffset(34, 16).addBox(-5.0F, -5.0F, -1.5F, 10.0F, 11.0F, 14.0F, 0.0F, false);
		tail_base.setModelRendererName("tail_base");
		this.registerModelRenderer(tail_base);

		tail_segment_1 = new AnimatedModelRenderer(this);
		tail_segment_1.setRotationPoint(0.0F, -0.2544F, 11.4972F);
		tail_base.addChild(tail_segment_1);
		tail_segment_1.setTextureOffset(33, 45).addBox(-4.0F, -4.5F, -0.5F, 8.0F, 8.0F, 13.0F, 0.0F, false);
		tail_segment_1.setModelRendererName("tail_segment_1");
		this.registerModelRenderer(tail_segment_1);

		tail_segment_2 = new AnimatedModelRenderer(this);
		tail_segment_2.setRotationPoint(-0.5F, -1.3F, 11.5F);
		tail_segment_1.addChild(tail_segment_2);
		setRotationAngle(tail_segment_2, -0.0227F, 0.0F, 0.0F);
		tail_segment_2.setTextureOffset(0, 58).addBox(-2.5F, -3.0F, -0.5F, 6.0F, 5.0F, 15.0F, 0.0F, false);
		tail_segment_2.setModelRendererName("tail_segment_2");
		this.registerModelRenderer(tail_segment_2);

		tail_segment_3 = new AnimatedModelRenderer(this);
		tail_segment_3.setRotationPoint(0.5F, -1.5433F, 13.7234F);
		tail_segment_2.addChild(tail_segment_3);
		setRotationAngle(tail_segment_3, -0.0682F, 0.0F, 0.0F);
		tail_segment_3.setTextureOffset(62, 41).addBox(-2.0F, -1.0896F, -0.6041F, 4.0F, 3.0F, 14.0F, 0.0F, false);
		tail_segment_3.setModelRendererName("tail_segment_3");
		this.registerModelRenderer(tail_segment_3);

		tail_segment_4 = new AnimatedModelRenderer(this);
		tail_segment_4.setRotationPoint(0.0F, 0.4645F, 12.5301F);
		tail_segment_3.addChild(tail_segment_4);
		setRotationAngle(tail_segment_4, -0.0319F, 0.0F, 0.0F);
		tail_segment_4.setTextureOffset(86, 46).addBox(-1.0F, -1.1007F, -0.4553F, 2.0F, 2.0F, 12.0F, 0.01F, false);
		tail_segment_4.setModelRendererName("tail_segment_4");
		this.registerModelRenderer(tail_segment_4);

		tail_segment_5 = new AnimatedModelRenderer(this);
		tail_segment_5.setRotationPoint(0.0F, -0.4315F, 10.492F);
		tail_segment_4.addChild(tail_segment_5);
		tail_segment_5.setTextureOffset(0, 78).addBox(-1.0F, -0.7151F, -0.4463F, 2.0F, 2.0F, 14.0F, -0.1F, false);
		tail_segment_5.setModelRendererName("tail_segment_5");
		this.registerModelRenderer(tail_segment_5);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-6.5F, -0.5F, 0.9F);
		body_base.addChild(r1);
		setRotationAngle(r1, -0.226F, 0.0698F, 0.0F);
		r1.setTextureOffset(32, 68).addBox(-2.2F, -3.5F, -3.5F, 6.0F, 16.0F, 10.0F, 0.0F, false);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(1.0F, 11.2668F, 1.5652F);
		r1.addChild(r2);
		setRotationAngle(r2, 0.8931F, 0.0F, 0.0F);
		r2.setTextureOffset(58, 88).addBox(-2.4F, -3.66F, -3.3908F, 4.0F, 16.0F, 6.0F, 0.01F, false);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(0.0F, 10.5938F, -0.9156F);
		r2.addChild(r3);
		setRotationAngle(r3, -1.0905F, 0.0F, 0.0F);
		r3.setTextureOffset(0, 94).addBox(-2.4F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(0.0F, 10.227F, 0.5175F);
		r3.addChild(r4);
		setRotationAngle(r4, -1.0823F, 0.0F, 0.0F);
		r4.setTextureOffset(16, 94).addBox(-3.5F, -1.379F, -0.8149F, 6.0F, 8.0F, 2.0F, 0.0F, false);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(6.5F, -0.5F, 0.9F);
		body_base.addChild(l1);
		setRotationAngle(l1, -0.226F, -0.0698F, 0.0F);
		l1.setTextureOffset(32, 68).addBox(-3.8F, -3.5F, -3.5F, 6.0F, 16.0F, 10.0F, 0.0F, true);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(-1.0F, 11.2668F, 1.5652F);
		l1.addChild(l2);
		setRotationAngle(l2, 0.8931F, 0.0F, 0.0F);
		l2.setTextureOffset(58, 88).addBox(-1.6F, -3.66F, -3.3908F, 4.0F, 16.0F, 6.0F, 0.01F, true);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.0F, 10.5938F, -0.9156F);
		l2.addChild(l3);
		setRotationAngle(l3, -1.0905F, 0.0F, 0.0F);
		l3.setTextureOffset(0, 94).addBox(-1.6F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(0.0F, 10.227F, 0.5175F);
		l3.addChild(l4);
		setRotationAngle(l4, -1.0823F, 0.0F, 0.0F);
		l4.setTextureOffset(16, 94).addBox(-2.5F, -1.379F, -0.8149F, 6.0F, 8.0F, 2.0F, 0.0F, true);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		this.rootBones.add(body_base);
	}
}