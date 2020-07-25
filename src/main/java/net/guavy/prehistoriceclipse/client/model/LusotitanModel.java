package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class LusotitanModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer r5;
	private final AnimatedModelRenderer r6;
	private final AnimatedModelRenderer l4;
	private final AnimatedModelRenderer l5;
	private final AnimatedModelRenderer l6;
	private final AnimatedModelRenderer Body1;
	private final AnimatedModelRenderer Tail1;
	private final AnimatedModelRenderer Tail2;
	private final AnimatedModelRenderer Tail3;
	private final AnimatedModelRenderer Tail4;
	private final AnimatedModelRenderer Tail5;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer Body3;
	private final AnimatedModelRenderer Neck1;
	private final AnimatedModelRenderer Neck1Lower;
	private final AnimatedModelRenderer Neck2;
	private final AnimatedModelRenderer Neck3;
	private final AnimatedModelRenderer Neck4;
	private final AnimatedModelRenderer Neck5;
	private final AnimatedModelRenderer Neck6;
	private final AnimatedModelRenderer Neck7;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer UpperJaw1;
	private final AnimatedModelRenderer UpperJaw2;
	private final AnimatedModelRenderer UpperJaw3;
	private final AnimatedModelRenderer UpperJaw4;
	private final AnimatedModelRenderer LowerJaw1;
	private final AnimatedModelRenderer LowerJaw2;
	private final AnimatedModelRenderer lump;
	private final AnimatedModelRenderer Throat5;
	private final AnimatedModelRenderer Throat4;
	private final AnimatedModelRenderer Throat3;
	private final AnimatedModelRenderer Throat2;
	private final AnimatedModelRenderer Throat1;

    public LusotitanModel()
    {
        textureWidth = 240;
		textureHeight = 240;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 1.5F, 2.8F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(-9.7F, -10.7F, 14.2F);
		root.addChild(r4);
		setRotationAngle(r4, -0.122F, 0.0F, 0.0F);
		r4.setTextureOffset(142, 17).addBox(-5.8F, -1.9254F, -6.4825F, 11.0F, 20.0F, 14.0F, 0.0F, false);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		r5 = new AnimatedModelRenderer(this);
		r5.setRotationPoint(-0.8F, 13.9246F, -1.1425F);
		r4.addChild(r5);
		setRotationAngle(r5, 0.3332F, 0.0F, 0.0F);
		r5.setTextureOffset(178, 0).addBox(-4.0F, -0.6939F, -5.3683F, 9.0F, 18.0F, 11.0F, 0.0F, false);
		r5.setModelRendererName("r5");
		this.registerModelRenderer(r5);

		r6 = new AnimatedModelRenderer(this);
		r6.setRotationPoint(0.0F, 16.6261F, 0.6317F);
		r5.addChild(r6);
		setRotationAngle(r6, -0.2211F, 0.0F, 0.0F);
		r6.setTextureOffset(190, 68).addBox(-4.5F, -0.6F, -7.8F, 10.0F, 4.0F, 13.0F, 0.0F, false);
		r6.setModelRendererName("r6");
		this.registerModelRenderer(r6);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(9.7F, -10.7F, 14.2F);
		root.addChild(l4);
		setRotationAngle(l4, -0.122F, 0.0F, 0.0F);
		l4.setTextureOffset(0, 139).addBox(-5.2F, -1.9254F, -6.4825F, 11.0F, 20.0F, 14.0F, 0.0F, false);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		l5 = new AnimatedModelRenderer(this);
		l5.setRotationPoint(0.8F, 13.9246F, -1.1425F);
		l4.addChild(l5);
		setRotationAngle(l5, 0.3332F, 0.0F, 0.0F);
		l5.setTextureOffset(162, 177).addBox(-5.0F, -0.6939F, -5.3683F, 9.0F, 18.0F, 11.0F, 0.0F, false);
		l5.setModelRendererName("l5");
		this.registerModelRenderer(l5);

		l6 = new AnimatedModelRenderer(this);
		l6.setRotationPoint(0.0F, 16.6261F, 0.6317F);
		l5.addChild(l6);
		setRotationAngle(l6, -0.2211F, 0.0F, 0.0F);
		l6.setTextureOffset(131, 0).addBox(-5.5F, -0.6F, -7.8F, 10.0F, 4.0F, 13.0F, 0.0F, false);
		l6.setModelRendererName("l6");
		this.registerModelRenderer(l6);

		Body1 = new AnimatedModelRenderer(this);
		Body1.setRotationPoint(-0.5F, -11.0F, 8.7F);
		root.addChild(Body1);
		setRotationAngle(Body1, -0.4787F, 0.0F, 0.0F);
		Body1.setTextureOffset(74, 74).addBox(-10.0F, -11.5085F, -9.0551F, 21.0F, 25.0F, 18.0F, 0.0F, false);
		Body1.setModelRendererName("Body1");
		this.registerModelRenderer(Body1);

		Tail1 = new AnimatedModelRenderer(this);
		Tail1.setRotationPoint(0.0F, -2.9085F, 7.5549F);
		Body1.addChild(Tail1);
		setRotationAngle(Tail1, -0.011F, 0.0F, 0.0F);
		Tail1.setTextureOffset(60, 117).addBox(-8.0F, -7.2996F, -0.0803F, 17.0F, 15.0F, 13.0F, 0.0F, false);
		Tail1.setModelRendererName("Tail1");
		this.registerModelRenderer(Tail1);

		Tail2 = new AnimatedModelRenderer(this);
		Tail2.setRotationPoint(0.5F, -1.9696F, 11.8897F);
		Tail1.addChild(Tail2);
		setRotationAngle(Tail2, 0.1504F, 0.0F, 0.0F);
		Tail2.setTextureOffset(152, 78).addBox(-6.0F, -5.1413F, -1.2206F, 12.0F, 13.0F, 14.0F, 0.0F, false);
		Tail2.setModelRendererName("Tail2");
		this.registerModelRenderer(Tail2);

		Tail3 = new AnimatedModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 0.3487F, 11.6094F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, 0.0764F, 0.0F, 0.0F);
		Tail3.setTextureOffset(34, 171).addBox(-4.0F, -5.3842F, -0.5876F, 8.0F, 11.0F, 16.0F, 0.0F, false);
		Tail3.setModelRendererName("Tail3");
		this.registerModelRenderer(Tail3);

		Tail4 = new AnimatedModelRenderer(this);
		Tail4.setRotationPoint(0.0F, -1.2642F, 13.1824F);
		Tail3.addChild(Tail4);
		setRotationAngle(Tail4, 0.2388F, 0.0F, 0.0F);
		Tail4.setTextureOffset(104, 147).addBox(-3.5F, -3.6922F, -1.1013F, 7.0F, 8.0F, 19.0F, 0.0F, false);
		Tail4.setModelRendererName("Tail4");
		this.registerModelRenderer(Tail4);

		Tail5 = new AnimatedModelRenderer(this);
		Tail5.setRotationPoint(0.0F, -1.2722F, 16.2887F);
		Tail4.addChild(Tail5);
		setRotationAngle(Tail5, -0.0234F, 0.0F, 0.0F);
		Tail5.setTextureOffset(158, 127).addBox(-3.0F, -2.0994F, -0.0491F, 6.0F, 5.0F, 20.0F, 0.0F, false);
		Tail5.setModelRendererName("Tail5");
		this.registerModelRenderer(Tail5);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(0.0F, 1.2915F, -8.7551F);
		Body1.addChild(Body2);
		setRotationAngle(Body2, -0.1155F, 0.0F, 0.0F);
		Body2.setTextureOffset(0, 0).addBox(-11.5F, -12.92F, -27.3834F, 24.0F, 31.0F, 32.0F, 0.0F, false);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-10.0F, 14.2161F, -24.8101F);
		Body2.addChild(r1);
		setRotationAngle(r1, 0.7679F, 0.0F, 0.0F);
		r1.setTextureOffset(122, 174).addBox(-3.9F, -2.9817F, -5.3448F, 9.0F, 21.0F, 11.0F, 0.0F, false);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(0.0F, 15.8919F, 0.0459F);
		r1.addChild(r2);
		setRotationAngle(r2, -0.3873F, 0.0F, 0.0F);
		r2.setTextureOffset(192, 196).addBox(-3.4F, -0.6734F, -4.5556F, 8.0F, 17.0F, 10.0F, 0.0F, false);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(0.6F, 15.3118F, 0.5668F);
		r2.addChild(r3);
		setRotationAngle(r3, 0.2114F, 0.0F, 0.0F);
		r3.setTextureOffset(197, 152).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 8.0F, 10.0F, -0.03F, false);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(11.0F, 14.2161F, -24.8101F);
		Body2.addChild(l1);
		setRotationAngle(l1, 0.7679F, 0.0F, 0.0F);
		l1.setTextureOffset(82, 174).addBox(-5.1F, -2.9817F, -5.3448F, 9.0F, 21.0F, 11.0F, 0.0F, false);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(0.0F, 15.8919F, 0.0459F);
		l1.addChild(l2);
		setRotationAngle(l2, -0.3873F, 0.0F, 0.0F);
		l2.setTextureOffset(184, 41).addBox(-4.6F, -0.6734F, -4.5556F, 8.0F, 17.0F, 10.0F, 0.0F, false);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(-0.6F, 15.3118F, 0.5668F);
		l2.addChild(l3);
		setRotationAngle(l3, 0.2114F, 0.0F, 0.0F);
		l3.setTextureOffset(55, 63).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 8.0F, 10.0F, -0.03F, false);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		Body3 = new AnimatedModelRenderer(this);
		Body3.setRotationPoint(0.5F, 1.2703F, -24.0543F);
		Body2.addChild(Body3);
		setRotationAngle(Body3, 0.107F, 0.0F, 0.0F);
		Body3.setTextureOffset(0, 63).addBox(-9.0F, -13.0F, -15.0F, 18.0F, 28.0F, 19.0F, 0.0F, false);
		Body3.setModelRendererName("Body3");
		this.registerModelRenderer(Body3);

		Neck1 = new AnimatedModelRenderer(this);
		Neck1.setRotationPoint(0.0F, -4.3017F, -12.7708F);
		Body3.addChild(Neck1);
		setRotationAngle(Neck1, -0.3749F, 0.0F, 0.0F);
		Neck1.setTextureOffset(80, 0).addBox(-8.0F, -6.0F, -16.0F, 16.0F, 12.0F, 19.0F, 0.0F, false);
		Neck1.setModelRendererName("Neck1");
		this.registerModelRenderer(Neck1);

		Neck1Lower = new AnimatedModelRenderer(this);
		Neck1Lower.setRotationPoint(-1.0F, 11.6F, -9.4F);
		Neck1.addChild(Neck1Lower);
		setRotationAngle(Neck1Lower, -0.0698F, 0.0F, 0.0F);
		Neck1Lower.setTextureOffset(92, 43).addBox(-6.5F, -7.0F, -6.0F, 15.0F, 9.0F, 20.0F, 0.0F, false);
		Neck1Lower.setModelRendererName("Neck1Lower");
		this.registerModelRenderer(Neck1Lower);

		Neck2 = new AnimatedModelRenderer(this);
		Neck2.setRotationPoint(0.0F, 0.3825F, -13.806F);
		Neck1.addChild(Neck2);
		setRotationAngle(Neck2, -0.0873F, 0.0F, 0.0F);
		Neck2.setTextureOffset(120, 120).addBox(-7.0F, -6.0F, -15.0F, 14.0F, 12.0F, 15.0F, 0.0F, false);
		Neck2.setModelRendererName("Neck2");
		this.registerModelRenderer(Neck2);

		Neck3 = new AnimatedModelRenderer(this);
		Neck3.setRotationPoint(-0.5F, 0.4F, -11.0F);
		Neck2.addChild(Neck3);
		setRotationAngle(Neck3, -0.2169F, 0.0F, 0.0F);
		Neck3.setTextureOffset(0, 110).addBox(-5.5F, -6.1411F, -17.3664F, 12.0F, 11.0F, 18.0F, 0.0F, false);
		Neck3.setModelRendererName("Neck3");
		this.registerModelRenderer(Neck3);

		Neck4 = new AnimatedModelRenderer(this);
		Neck4.setRotationPoint(0.0F, -1.1411F, -17.3664F);
		Neck3.addChild(Neck4);
		setRotationAngle(Neck4, 0.0698F, 0.0F, 0.0F);
		Neck4.setTextureOffset(50, 145).addBox(-5.0F, -5.0069F, -15.7383F, 11.0F, 10.0F, 16.0F, 0.0F, false);
		Neck4.setModelRendererName("Neck4");
		this.registerModelRenderer(Neck4);

		Neck5 = new AnimatedModelRenderer(this);
		Neck5.setRotationPoint(0.0F, -0.3069F, -14.8383F);
		Neck4.addChild(Neck5);
		setRotationAngle(Neck5, 0.3097F, 0.0F, 0.0F);
		Neck5.setTextureOffset(0, 186).addBox(-4.0F, -4.5236F, -10.7245F, 9.0F, 9.0F, 12.0F, 0.0F, false);
		Neck5.setModelRendererName("Neck5");
		this.registerModelRenderer(Neck5);

		Neck6 = new AnimatedModelRenderer(this);
		Neck6.setRotationPoint(0.0F, -0.6236F, -9.7245F);
		Neck5.addChild(Neck6);
		setRotationAngle(Neck6, 0.3278F, 0.0F, 0.0F);
		Neck6.setTextureOffset(32, 198).addBox(-3.0F, -3.6699F, -8.6801F, 7.0F, 8.0F, 10.0F, -0.02F, false);
		Neck6.setModelRendererName("Neck6");
		this.registerModelRenderer(Neck6);

		Neck7 = new AnimatedModelRenderer(this);
		Neck7.setRotationPoint(0.0F, -1.5699F, -8.6801F);
		Neck6.addChild(Neck7);
		setRotationAngle(Neck7, 0.2443F, 0.0F, 0.0F);
		Neck7.setTextureOffset(0, 63).addBox(-2.5F, -2.0376F, -2.492F, 6.0F, 7.0F, 3.0F, 0.0F, false);
		Neck7.setModelRendererName("Neck7");
		this.registerModelRenderer(Neck7);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.7624F, -1.392F);
		Neck7.addChild(Head);
		setRotationAngle(Head, 0.5733F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -3.0538F, -4.4574F, 7.0F, 8.0F, 5.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		UpperJaw1 = new AnimatedModelRenderer(this);
		UpperJaw1.setRotationPoint(-0.5F, 0.9462F, -4.2574F);
		Head.addChild(UpperJaw1);
		setRotationAngle(UpperJaw1, 0.0F, 0.0F, 0.0F);
		UpperJaw1.setTextureOffset(0, 24).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		UpperJaw1.setModelRendererName("UpperJaw1");
		this.registerModelRenderer(UpperJaw1);

		UpperJaw2 = new AnimatedModelRenderer(this);
		UpperJaw2.setRotationPoint(0.0F, -3.2F, -0.6F);
		UpperJaw1.addChild(UpperJaw2);
		setRotationAngle(UpperJaw2, 0.2793F, 0.0F, 0.0F);
		UpperJaw2.setTextureOffset(0, 73).addBox(-1.5F, 0.0F, -3.0F, 5.0F, 3.0F, 4.0F, 0.01F, false);
		UpperJaw2.setModelRendererName("UpperJaw2");
		this.registerModelRenderer(UpperJaw2);

		UpperJaw3 = new AnimatedModelRenderer(this);
		UpperJaw3.setRotationPoint(0.0F, 0.0F, -3.0F);
		UpperJaw2.addChild(UpperJaw3);
		setRotationAngle(UpperJaw3, 0.4014F, 0.0F, 0.0F);
		UpperJaw3.setTextureOffset(20, 20).addBox(-1.5F, 0.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		UpperJaw3.setModelRendererName("UpperJaw3");
		this.registerModelRenderer(UpperJaw3);

		UpperJaw4 = new AnimatedModelRenderer(this);
		UpperJaw4.setRotationPoint(0.0F, 0.0F, -1.0F);
		UpperJaw3.addChild(UpperJaw4);
		setRotationAngle(UpperJaw4, 0.2269F, 0.0F, 0.0F);
		UpperJaw4.setTextureOffset(19, 0).addBox(-1.5F, 0.0F, -1.0F, 5.0F, 2.0F, 1.0F, -0.02F, false);
		UpperJaw4.setModelRendererName("UpperJaw4");
		this.registerModelRenderer(UpperJaw4);

		LowerJaw1 = new AnimatedModelRenderer(this);
		LowerJaw1.setRotationPoint(-0.5F, 1.9462F, -4.0574F);
		Head.addChild(LowerJaw1);
		setRotationAngle(LowerJaw1, -0.13F, 0.0F, 0.0F);
		LowerJaw1.setTextureOffset(42, 110).addBox(-1.5F, 0.0F, -5.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		LowerJaw1.setModelRendererName("LowerJaw1");
		this.registerModelRenderer(LowerJaw1);

		LowerJaw2 = new AnimatedModelRenderer(this);
		LowerJaw2.setRotationPoint(0.0F, 2.4F, 0.0F);
		LowerJaw1.addChild(LowerJaw2);
		setRotationAngle(LowerJaw2, -0.0739F, 0.0F, 0.0F);
		LowerJaw2.setTextureOffset(14, 13).addBox(-1.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		LowerJaw2.setModelRendererName("LowerJaw2");
		this.registerModelRenderer(LowerJaw2);

		lump = new AnimatedModelRenderer(this);
		lump.setRotationPoint(-0.5F, -3.0538F, -3.4574F);
		Head.addChild(lump);
		setRotationAngle(lump, 0.1222F, 0.0F, 0.0F);
		lump.setTextureOffset(0, 13).addBox(-1.0F, -2.0F, -4.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
		lump.setModelRendererName("lump");
		this.registerModelRenderer(lump);

		Throat5 = new AnimatedModelRenderer(this);
		Throat5.setRotationPoint(-0.5F, 7.2301F, 1.3199F);
		Neck6.addChild(Throat5);
		setRotationAngle(Throat5, -0.1719F, 0.0F, 0.0F);
		Throat5.setTextureOffset(140, 105).addBox(-1.5F, -3.0F, -12.0F, 5.0F, 3.0F, 12.0F, 0.0F, false);
		Throat5.setModelRendererName("Throat5");
		this.registerModelRenderer(Throat5);

		Throat4 = new AnimatedModelRenderer(this);
		Throat4.setRotationPoint(-0.5F, 8.7764F, 2.7755F);
		Neck5.addChild(Throat4);
		setRotationAngle(Throat4, -0.1571F, 0.0F, 0.0F);
		Throat4.setTextureOffset(190, 125).addBox(-3.0F, -5.0F, -13.0F, 8.0F, 5.0F, 13.0F, 0.0F, false);
		Throat4.setModelRendererName("Throat4");
		this.registerModelRenderer(Throat4);

		Throat3 = new AnimatedModelRenderer(this);
		Throat3.setRotationPoint(-0.5F, 9.5931F, 1.5617F);
		Neck4.addChild(Throat3);
		setRotationAngle(Throat3, -0.0873F, 0.0F, 0.0F);
		Throat3.setTextureOffset(163, 105).addBox(-4.0F, -5.0F, -15.0F, 10.0F, 5.0F, 15.0F, 0.0F, false);
		Throat3.setModelRendererName("Throat3");
		this.registerModelRenderer(Throat3);

		Throat2 = new AnimatedModelRenderer(this);
		Throat2.setRotationPoint(-0.5F, 10.6589F, 2.2336F);
		Neck3.addChild(Throat2);
		setRotationAngle(Throat2, -0.0873F, 0.0F, 0.0F);
		Throat2.setTextureOffset(144, 54).addBox(-4.5F, -6.0F, -19.0F, 11.0F, 6.0F, 18.0F, 0.0F, false);
		Throat2.setModelRendererName("Throat2");
		this.registerModelRenderer(Throat2);

		Throat1 = new AnimatedModelRenderer(this);
		Throat1.setRotationPoint(-1.0F, 12.4F, 0.9F);
		Neck2.addChild(Throat1);
		setRotationAngle(Throat1, -0.1047F, 0.0F, 0.0F);
		Throat1.setTextureOffset(156, 156).addBox(-5.5F, -6.0F, -14.0F, 13.0F, 6.0F, 15.0F, 0.0F, false);
		Throat1.setModelRendererName("Throat1");
		this.registerModelRenderer(Throat1);

		this.rootBones.add(root);
	}
}