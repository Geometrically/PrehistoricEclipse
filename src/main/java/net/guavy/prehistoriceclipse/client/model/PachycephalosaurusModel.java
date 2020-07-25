package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class PachycephalosaurusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer Chest;
	private final AnimatedModelRenderer BaseNeck;
	private final AnimatedModelRenderer Neck;
	private final AnimatedModelRenderer NeckSupport2;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer JawBase;
	private final AnimatedModelRenderer Mouth;
	private final AnimatedModelRenderer Mouth2;
	private final AnimatedModelRenderer LipBase;
	private final AnimatedModelRenderer Lip;
	private final AnimatedModelRenderer RightMembrane1;
	private final AnimatedModelRenderer LeftMembrane1;
	private final AnimatedModelRenderer RightMembrane2;
	private final AnimatedModelRenderer LeftMembrane2;
	private final AnimatedModelRenderer SnoutBase;
	private final AnimatedModelRenderer Snout3;
	private final AnimatedModelRenderer UpperLip;
	private final AnimatedModelRenderer Snout;
	private final AnimatedModelRenderer Snout2;
	private final AnimatedModelRenderer SnoutThingy;
	private final AnimatedModelRenderer Skull;
	private final AnimatedModelRenderer Skull2;
	private final AnimatedModelRenderer Skull3;
	private final AnimatedModelRenderer Skull4;
	private final AnimatedModelRenderer Skull5;
	private final AnimatedModelRenderer PreSnoutSkull;
	private final AnimatedModelRenderer SkullBase;
	private final AnimatedModelRenderer SkullBase2;
	private final AnimatedModelRenderer SkullBase3;
	private final AnimatedModelRenderer LeftSpike;
	private final AnimatedModelRenderer LeftSpike2;
	private final AnimatedModelRenderer RightSpike;
	private final AnimatedModelRenderer RightSpike2;
	private final AnimatedModelRenderer LeftSpike3;
	private final AnimatedModelRenderer RightSpike3;
	private final AnimatedModelRenderer LeftSpike4;
	private final AnimatedModelRenderer LeftSpike5;
	private final AnimatedModelRenderer righttSpike4;
	private final AnimatedModelRenderer RightSpike5;
	private final AnimatedModelRenderer NeckSupport;
	private final AnimatedModelRenderer LeftArm;
	private final AnimatedModelRenderer LeftArm2;
	private final AnimatedModelRenderer LeftPalm;
	private final AnimatedModelRenderer MiddleLeftFinger;
	private final AnimatedModelRenderer LeftFinger2;
	private final AnimatedModelRenderer LeftFinger3;
	private final AnimatedModelRenderer LeftFinger4;
	private final AnimatedModelRenderer LeftFinger5;
	private final AnimatedModelRenderer RightArm;
	private final AnimatedModelRenderer RightArm2;
	private final AnimatedModelRenderer RightPalm;
	private final AnimatedModelRenderer MiddleRightFinger;
	private final AnimatedModelRenderer RightFinger2;
	private final AnimatedModelRenderer RightFinger3;
	private final AnimatedModelRenderer RightFinger4;
	private final AnimatedModelRenderer RightFinger5;
	private final AnimatedModelRenderer tail1;
	private final AnimatedModelRenderer tail2;
	private final AnimatedModelRenderer tail3;
	private final AnimatedModelRenderer tail4;
	private final AnimatedModelRenderer tail5;
	private final AnimatedModelRenderer tail6;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer LeftCalf;
	private final AnimatedModelRenderer LeftLeg2;
	private final AnimatedModelRenderer LeftCalf2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer LeftLeg4;
	private final AnimatedModelRenderer LeftLeg5;
	private final AnimatedModelRenderer LeftLeg6;
	private final AnimatedModelRenderer LeftLeg7;
	private final AnimatedModelRenderer LeftLeg8;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer RightCalf;
	private final AnimatedModelRenderer RightLeg2;
	private final AnimatedModelRenderer RightCalf2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer RightLeg4;
	private final AnimatedModelRenderer RightLeg5;
	private final AnimatedModelRenderer RightLeg6;
	private final AnimatedModelRenderer RightLeg7;
	private final AnimatedModelRenderer RightLeg8;
	private final AnimatedModelRenderer l4;

    public PachycephalosaurusModel()
    {
        textureWidth = 250;
		textureHeight = 200;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, -16.0F, 0.0F);
		root.addChild(Body);
		setRotationAngle(Body, -0.0873F, 0.0F, 0.0F);
		Body.setTextureOffset(129, 0).addBox(-9.0F, -11.5F, -8.0F, 18.0F, 23.0F, 16.0F, 0.0F, true);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(0.0F, -3.8F, -7.2F);
		Body.addChild(Body2);
		setRotationAngle(Body2, 0.2123F, 0.0F, 0.0F);
		Body2.setTextureOffset(128, 77).addBox(-8.0F, -7.7069F, -13.265F, 16.0F, 22.0F, 14.0F, 0.0F, true);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		Chest = new AnimatedModelRenderer(this);
		Chest.setRotationPoint(0.0F, 1.4246F, -11.4479F);
		Body2.addChild(Chest);
		setRotationAngle(Chest, -0.1491F, 0.0F, 0.0F);
		Chest.setTextureOffset(130, 118).addBox(-7.0F, -8.7528F, -10.9089F, 14.0F, 20.0F, 12.0F, 0.0F, true);
		Chest.setModelRendererName("Chest");
		this.registerModelRenderer(Chest);

		BaseNeck = new AnimatedModelRenderer(this);
		BaseNeck.setRotationPoint(0.0F, -0.5528F, -10.9089F);
		Chest.addChild(BaseNeck);
		setRotationAngle(BaseNeck, -0.3703F, 0.0F, 0.0F);
		BaseNeck.setTextureOffset(80, 0).addBox(-6.0F, -7.0F, -5.7293F, 12.0F, 18.0F, 10.0F, 0.0F, true);
		BaseNeck.setModelRendererName("BaseNeck");
		this.registerModelRenderer(BaseNeck);

		Neck = new AnimatedModelRenderer(this);
		Neck.setRotationPoint(0.0F, 1.7069F, -2.3778F);
		BaseNeck.addChild(Neck);
		setRotationAngle(Neck, -0.4538F, 0.0F, 0.0F);
		Neck.setTextureOffset(0, 112).addBox(-5.0F, -3.1105F, -10.5547F, 10.0F, 11.0F, 12.0F, 0.0F, true);
		Neck.setModelRendererName("Neck");
		this.registerModelRenderer(Neck);

		NeckSupport2 = new AnimatedModelRenderer(this);
		NeckSupport2.setRotationPoint(0.0F, -2.4105F, -10.5547F);
		Neck.addChild(NeckSupport2);
		setRotationAngle(NeckSupport2, 0.1939F, 0.0F, 0.0F);
		NeckSupport2.setTextureOffset(0, 90).addBox(-4.5F, -3.4554F, -9.9137F, 9.0F, 9.0F, 11.0F, 0.0F, true);
		NeckSupport2.setModelRendererName("NeckSupport2");
		this.registerModelRenderer(NeckSupport2);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.6446F, -6.1137F);
		NeckSupport2.addChild(Head);
		setRotationAngle(Head, -0.4515F, 0.0F, 0.0F);
		Head.setTextureOffset(87, 144).addBox(-6.0F, -3.1852F, -3.9968F, 12.0F, 12.0F, 8.0F, 0.0F, true);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		JawBase = new AnimatedModelRenderer(this);
		JawBase.setRotationPoint(0.0F, 2.9148F, 4.8032F);
		Head.addChild(JawBase);
		setRotationAngle(JawBase, -0.0911F, 0.0F, 0.0F);
		JawBase.setTextureOffset(0, 60).addBox(-5.5F, -0.9317F, -1.8926F, 11.0F, 7.0F, 5.0F, 0.0F, true);
		JawBase.setModelRendererName("JawBase");
		this.registerModelRenderer(JawBase);

		Mouth = new AnimatedModelRenderer(this);
		Mouth.setRotationPoint(0.0F, 6.0683F, -0.4926F);
		JawBase.addChild(Mouth);
		Mouth.setTextureOffset(28, 58).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 3.0F, 0.0F, true);
		Mouth.setModelRendererName("Mouth");
		this.registerModelRenderer(Mouth);

		Mouth2 = new AnimatedModelRenderer(this);
		Mouth2.setRotationPoint(0.0F, 3.0F, 0.0F);
		Mouth.addChild(Mouth2);
		Mouth2.setTextureOffset(51, 58).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 3.0F, 0.0F, true);
		Mouth2.setModelRendererName("Mouth2");
		this.registerModelRenderer(Mouth2);

		LipBase = new AnimatedModelRenderer(this);
		LipBase.setRotationPoint(0.0F, 6.0F, 3.0F);
		Mouth2.addChild(LipBase);
		setRotationAngle(LipBase, -0.4014F, 0.0F, 0.0F);
		LipBase.setTextureOffset(70, 65).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		LipBase.setModelRendererName("LipBase");
		this.registerModelRenderer(LipBase);

		Lip = new AnimatedModelRenderer(this);
		Lip.setRotationPoint(0.0F, 4.0F, -2.0F);
		LipBase.addChild(Lip);
		setRotationAngle(Lip, 0.2793F, 0.0F, 0.0F);
		Lip.setTextureOffset(70, 58).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		Lip.setModelRendererName("Lip");
		this.registerModelRenderer(Lip);

		RightMembrane1 = new AnimatedModelRenderer(this);
		RightMembrane1.setRotationPoint(-1.0F, -0.1F, 0.0F);
		Mouth2.addChild(RightMembrane1);
		RightMembrane1.setTextureOffset(56, 72).addBox(3.5F, 0.0F, -4.0F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		RightMembrane1.setModelRendererName("RightMembrane1");
		this.registerModelRenderer(RightMembrane1);

		LeftMembrane1 = new AnimatedModelRenderer(this);
		LeftMembrane1.setRotationPoint(0.0F, -0.1F, 0.0F);
		Mouth2.addChild(LeftMembrane1);
		LeftMembrane1.setTextureOffset(56, 72).addBox(-2.5F, 0.0F, -4.0F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		LeftMembrane1.setModelRendererName("LeftMembrane1");
		this.registerModelRenderer(LeftMembrane1);

		RightMembrane2 = new AnimatedModelRenderer(this);
		RightMembrane2.setRotationPoint(0.0F, -0.1F, 0.0F);
		Mouth.addChild(RightMembrane2);
		RightMembrane2.setTextureOffset(29, 69).addBox(2.5F, -3.0F, -6.0F, 1.0F, 6.0F, 6.0F, 0.0F, true);
		RightMembrane2.setModelRendererName("RightMembrane2");
		this.registerModelRenderer(RightMembrane2);

		LeftMembrane2 = new AnimatedModelRenderer(this);
		LeftMembrane2.setRotationPoint(0.0F, -0.1F, 0.0F);
		Mouth.addChild(LeftMembrane2);
		LeftMembrane2.setTextureOffset(29, 69).addBox(-3.5F, -3.0F, -6.0F, 1.0F, 6.0F, 6.0F, 0.0F, true);
		LeftMembrane2.setModelRendererName("LeftMembrane2");
		this.registerModelRenderer(LeftMembrane2);

		SnoutBase = new AnimatedModelRenderer(this);
		SnoutBase.setRotationPoint(0.0F, 8.8148F, 0.5032F);
		Head.addChild(SnoutBase);
		setRotationAngle(SnoutBase, -0.0911F, 0.0F, 0.0F);
		SnoutBase.setTextureOffset(0, 46).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 6.0F, 4.0F, 0.0F, true);
		SnoutBase.setModelRendererName("SnoutBase");
		this.registerModelRenderer(SnoutBase);

		Snout3 = new AnimatedModelRenderer(this);
		Snout3.setRotationPoint(0.0F, 6.0F, 0.0F);
		SnoutBase.addChild(Snout3);
		Snout3.setTextureOffset(25, 46).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, true);
		Snout3.setModelRendererName("Snout3");
		this.registerModelRenderer(Snout3);

		UpperLip = new AnimatedModelRenderer(this);
		UpperLip.setRotationPoint(0.0F, 5.0F, 0.0F);
		Snout3.addChild(UpperLip);
		setRotationAngle(UpperLip, 1.0472F, 0.0F, 0.0F);
		UpperLip.setTextureOffset(46, 48).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 2.0F, 0.0F, true);
		UpperLip.setModelRendererName("UpperLip");
		this.registerModelRenderer(UpperLip);

		Snout = new AnimatedModelRenderer(this);
		Snout.setRotationPoint(0.0F, 1.4F, -3.9F);
		SnoutBase.addChild(Snout);
		setRotationAngle(Snout, 0.5934F, 0.0F, 0.0F);
		Snout.setTextureOffset(52, 93).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 5.0F, 5.0F, 0.0F, true);
		Snout.setModelRendererName("Snout");
		this.registerModelRenderer(Snout);

		Snout2 = new AnimatedModelRenderer(this);
		Snout2.setRotationPoint(0.0F, 4.4F, 0.0F);
		Snout.addChild(Snout2);
		setRotationAngle(Snout2, -0.3316F, 0.0F, 0.0F);
		Snout2.setTextureOffset(56, 112).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		Snout2.setModelRendererName("Snout2");
		this.registerModelRenderer(Snout2);

		SnoutThingy = new AnimatedModelRenderer(this);
		SnoutThingy.setRotationPoint(0.0F, 5.0F, 0.0F);
		Snout.addChild(SnoutThingy);
		setRotationAngle(SnoutThingy, 0.7854F, 0.0F, 0.0F);
		SnoutThingy.setTextureOffset(53, 104).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 2.0F, 2.0F, 0.0F, true);
		SnoutThingy.setModelRendererName("SnoutThingy");
		this.registerModelRenderer(SnoutThingy);

		Skull = new AnimatedModelRenderer(this);
		Skull.setRotationPoint(0.0F, -2.8852F, -4.3968F);
		Head.addChild(Skull);
		setRotationAngle(Skull, -0.733F, 0.0F, 0.0F);
		Skull.setTextureOffset(40, 83).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 3.0F, 3.0F, 0.0F, true);
		Skull.setModelRendererName("Skull");
		this.registerModelRenderer(Skull);

		Skull2 = new AnimatedModelRenderer(this);
		Skull2.setRotationPoint(0.0F, 3.0F, 0.0F);
		Skull.addChild(Skull2);
		setRotationAngle(Skull2, 0.3665F, 0.0F, 0.0F);
		Skull2.setTextureOffset(9, 82).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 3.0F, 4.0F, 0.0F, true);
		Skull2.setModelRendererName("Skull2");
		this.registerModelRenderer(Skull2);

		Skull3 = new AnimatedModelRenderer(this);
		Skull3.setRotationPoint(0.0F, 3.0F, 0.0F);
		Skull2.addChild(Skull3);
		setRotationAngle(Skull3, 0.3665F, 0.0F, 0.0F);
		Skull3.setTextureOffset(9, 82).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 3.0F, 4.0F, 0.0F, true);
		Skull3.setModelRendererName("Skull3");
		this.registerModelRenderer(Skull3);

		Skull4 = new AnimatedModelRenderer(this);
		Skull4.setRotationPoint(0.0F, 3.0F, 0.0F);
		Skull3.addChild(Skull4);
		setRotationAngle(Skull4, 0.3665F, 0.0F, 0.0F);
		Skull4.setTextureOffset(9, 82).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 3.0F, 4.0F, 0.0F, true);
		Skull4.setModelRendererName("Skull4");
		this.registerModelRenderer(Skull4);

		Skull5 = new AnimatedModelRenderer(this);
		Skull5.setRotationPoint(0.0F, 3.0F, 0.0F);
		Skull4.addChild(Skull5);
		setRotationAngle(Skull5, 0.3665F, 0.0F, 0.0F);
		Skull5.setTextureOffset(9, 82).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 3.0F, 4.0F, 0.0F, true);
		Skull5.setModelRendererName("Skull5");
		this.registerModelRenderer(Skull5);

		PreSnoutSkull = new AnimatedModelRenderer(this);
		PreSnoutSkull.setRotationPoint(0.0F, 3.0F, 0.0F);
		Skull5.addChild(PreSnoutSkull);
		setRotationAngle(PreSnoutSkull, 0.1745F, 0.0F, 0.0F);
		PreSnoutSkull.setTextureOffset(30, 90).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 3.0F, 4.0F, 0.0F, true);
		PreSnoutSkull.setModelRendererName("PreSnoutSkull");
		this.registerModelRenderer(PreSnoutSkull);

		SkullBase = new AnimatedModelRenderer(this);
		SkullBase.setRotationPoint(0.0F, -1.0852F, -4.4968F);
		Head.addChild(SkullBase);
		setRotationAngle(SkullBase, 0.2276F, 0.0F, 0.0F);
		SkullBase.setTextureOffset(0, 20).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 2.0F, 2.0F, 0.0F, true);
		SkullBase.setModelRendererName("SkullBase");
		this.registerModelRenderer(SkullBase);

		SkullBase2 = new AnimatedModelRenderer(this);
		SkullBase2.setRotationPoint(-4.6F, -3.1852F, -4.5968F);
		Head.addChild(SkullBase2);
		SkullBase2.setTextureOffset(0, 85).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		SkullBase2.setModelRendererName("SkullBase2");
		this.registerModelRenderer(SkullBase2);

		SkullBase3 = new AnimatedModelRenderer(this);
		SkullBase3.setRotationPoint(4.6F, -3.1852F, -4.5968F);
		Head.addChild(SkullBase3);
		SkullBase3.setTextureOffset(0, 85).addBox(0.0F, 0.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		SkullBase3.setModelRendererName("SkullBase3");
		this.registerModelRenderer(SkullBase3);

		LeftSpike = new AnimatedModelRenderer(this);
		LeftSpike.setRotationPoint(-5.2F, -1.5852F, -3.5968F);
		Head.addChild(LeftSpike);
		setRotationAngle(LeftSpike, 2.0071F, 0.0F, 0.6458F);
		LeftSpike.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		LeftSpike.setModelRendererName("LeftSpike");
		this.registerModelRenderer(LeftSpike);

		LeftSpike2 = new AnimatedModelRenderer(this);
		LeftSpike2.setRotationPoint(-3.4F, -0.8852F, -3.3968F);
		Head.addChild(LeftSpike2);
		setRotationAngle(LeftSpike2, 2.2689F, 0.0F, 0.0F);
		LeftSpike2.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		LeftSpike2.setModelRendererName("LeftSpike2");
		this.registerModelRenderer(LeftSpike2);

		RightSpike = new AnimatedModelRenderer(this);
		RightSpike.setRotationPoint(5.2F, -1.5852F, -3.5968F);
		Head.addChild(RightSpike);
		setRotationAngle(RightSpike, 2.0071F, 0.0F, -0.6458F);
		RightSpike.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		RightSpike.setModelRendererName("RightSpike");
		this.registerModelRenderer(RightSpike);

		RightSpike2 = new AnimatedModelRenderer(this);
		RightSpike2.setRotationPoint(3.4F, -0.8852F, -3.3968F);
		Head.addChild(RightSpike2);
		setRotationAngle(RightSpike2, 2.2689F, 0.0F, 0.0F);
		RightSpike2.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		RightSpike2.setModelRendererName("RightSpike2");
		this.registerModelRenderer(RightSpike2);

		LeftSpike3 = new AnimatedModelRenderer(this);
		LeftSpike3.setRotationPoint(-1.1F, -0.8852F, -3.3968F);
		Head.addChild(LeftSpike3);
		setRotationAngle(LeftSpike3, 2.3736F, 0.0F, 0.1745F);
		LeftSpike3.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		LeftSpike3.setModelRendererName("LeftSpike3");
		this.registerModelRenderer(LeftSpike3);

		RightSpike3 = new AnimatedModelRenderer(this);
		RightSpike3.setRotationPoint(1.1F, -0.8852F, -3.3968F);
		Head.addChild(RightSpike3);
		setRotationAngle(RightSpike3, 2.3736F, 0.0F, -0.1745F);
		RightSpike3.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		RightSpike3.setModelRendererName("RightSpike3");
		this.registerModelRenderer(RightSpike3);

		LeftSpike4 = new AnimatedModelRenderer(this);
		LeftSpike4.setRotationPoint(-5.0F, 0.1148F, -3.2968F);
		Head.addChild(LeftSpike4);
		setRotationAngle(LeftSpike4, 0.0F, -0.3665F, 0.0F);
		LeftSpike4.setTextureOffset(0, 79).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		LeftSpike4.setModelRendererName("LeftSpike4");
		this.registerModelRenderer(LeftSpike4);

		LeftSpike5 = new AnimatedModelRenderer(this);
		LeftSpike5.setRotationPoint(-5.0F, 2.8148F, -3.2968F);
		Head.addChild(LeftSpike5);
		setRotationAngle(LeftSpike5, 0.0F, -0.3665F, 0.2793F);
		LeftSpike5.setTextureOffset(0, 79).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		LeftSpike5.setModelRendererName("LeftSpike5");
		this.registerModelRenderer(LeftSpike5);

		righttSpike4 = new AnimatedModelRenderer(this);
		righttSpike4.setRotationPoint(5.0F, 0.1148F, -3.2968F);
		Head.addChild(righttSpike4);
		setRotationAngle(righttSpike4, 0.0F, 0.3665F, 0.0F);
		righttSpike4.setTextureOffset(0, 79).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		righttSpike4.setModelRendererName("righttSpike4");
		this.registerModelRenderer(righttSpike4);

		RightSpike5 = new AnimatedModelRenderer(this);
		RightSpike5.setRotationPoint(5.0F, 2.8148F, -3.2968F);
		Head.addChild(RightSpike5);
		setRotationAngle(RightSpike5, 0.0F, 0.3665F, -0.2793F);
		RightSpike5.setTextureOffset(0, 79).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		RightSpike5.setModelRendererName("RightSpike5");
		this.registerModelRenderer(RightSpike5);

		NeckSupport = new AnimatedModelRenderer(this);
		NeckSupport.setRotationPoint(0.0F, -1.9105F, 1.8453F);
		Neck.addChild(NeckSupport);
		setRotationAngle(NeckSupport, 0.0911F, 0.0F, 0.0F);
		NeckSupport.setTextureOffset(38, 125).addBox(-4.5F, -5.0F, -12.0F, 9.0F, 5.0F, 12.0F, 0.0F, true);
		NeckSupport.setModelRendererName("NeckSupport");
		this.registerModelRenderer(NeckSupport);

		LeftArm = new AnimatedModelRenderer(this);
		LeftArm.setRotationPoint(-4.7F, 7.4472F, -7.9089F);
		Chest.addChild(LeftArm);
		setRotationAngle(LeftArm, 1.0996F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(86, 31).addBox(-4.0F, -1.2F, -2.5F, 4.0F, 10.0F, 5.0F, 0.0F, true);
		LeftArm.setModelRendererName("LeftArm");
		this.registerModelRenderer(LeftArm);

		LeftArm2 = new AnimatedModelRenderer(this);
		LeftArm2.setRotationPoint(-2.0F, 9.0F, 0.4F);
		LeftArm.addChild(LeftArm2);
		setRotationAngle(LeftArm2, 0.48F, 0.0F, 0.0F);
		LeftArm2.setTextureOffset(95, 37).addBox(-1.5F, -3.1227F, -8.3147F, 3.0F, 4.0F, 10.0F, 0.0F, true);
		LeftArm2.setModelRendererName("LeftArm2");
		this.registerModelRenderer(LeftArm2);

		LeftPalm = new AnimatedModelRenderer(this);
		LeftPalm.setRotationPoint(-1.5F, -1.1227F, -8.3147F);
		LeftArm2.addChild(LeftPalm);
		setRotationAngle(LeftPalm, 0.0F, -0.4538F, 0.0F);
		LeftPalm.setTextureOffset(112, 38).addBox(0.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, true);
		LeftPalm.setModelRendererName("LeftPalm");
		this.registerModelRenderer(LeftPalm);

		MiddleLeftFinger = new AnimatedModelRenderer(this);
		MiddleLeftFinger.setRotationPoint(0.0F, 0.0F, -3.9F);
		LeftPalm.addChild(MiddleLeftFinger);
		setRotationAngle(MiddleLeftFinger, 0.0F, -0.1396F, 0.0F);
		MiddleLeftFinger.setTextureOffset(32, 7).addBox(0.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
		MiddleLeftFinger.setModelRendererName("MiddleLeftFinger");
		this.registerModelRenderer(MiddleLeftFinger);

		LeftFinger2 = new AnimatedModelRenderer(this);
		LeftFinger2.setRotationPoint(0.0F, 1.2F, -3.9F);
		LeftPalm.addChild(LeftFinger2);
		setRotationAngle(LeftFinger2, 0.4538F, -0.1396F, 0.0F);
		LeftFinger2.setTextureOffset(32, 0).addBox(0.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		LeftFinger2.setModelRendererName("LeftFinger2");
		this.registerModelRenderer(LeftFinger2);

		LeftFinger3 = new AnimatedModelRenderer(this);
		LeftFinger3.setRotationPoint(0.0F, -1.2F, -3.9F);
		LeftPalm.addChild(LeftFinger3);
		setRotationAngle(LeftFinger3, -0.4538F, -0.1396F, 0.0F);
		LeftFinger3.setTextureOffset(32, 0).addBox(0.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		LeftFinger3.setModelRendererName("LeftFinger3");
		this.registerModelRenderer(LeftFinger3);

		LeftFinger4 = new AnimatedModelRenderer(this);
		LeftFinger4.setRotationPoint(0.0F, -1.6F, -3.3F);
		LeftPalm.addChild(LeftFinger4);
		setRotationAngle(LeftFinger4, -1.1839F, -0.4098F, 0.0F);
		LeftFinger4.setTextureOffset(33, 1).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		LeftFinger4.setModelRendererName("LeftFinger4");
		this.registerModelRenderer(LeftFinger4);

		LeftFinger5 = new AnimatedModelRenderer(this);
		LeftFinger5.setRotationPoint(0.3F, 1.8F, -3.0F);
		LeftPalm.addChild(LeftFinger5);
		setRotationAngle(LeftFinger5, 1.457F, -0.1349F, 0.0F);
		LeftFinger5.setTextureOffset(33, 1).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		LeftFinger5.setModelRendererName("LeftFinger5");
		this.registerModelRenderer(LeftFinger5);

		RightArm = new AnimatedModelRenderer(this);
		RightArm.setRotationPoint(4.7F, 7.4472F, -7.9089F);
		Chest.addChild(RightArm);
		setRotationAngle(RightArm, 1.0996F, 0.0F, 0.0F);
		RightArm.setTextureOffset(86, 31).addBox(0.0F, -1.2F, -2.5F, 4.0F, 10.0F, 5.0F, 0.0F, false);
		RightArm.setModelRendererName("RightArm");
		this.registerModelRenderer(RightArm);

		RightArm2 = new AnimatedModelRenderer(this);
		RightArm2.setRotationPoint(2.0F, 9.0F, -0.4F);
		RightArm.addChild(RightArm2);
		setRotationAngle(RightArm2, 0.48F, 0.0F, 0.0F);
		RightArm2.setTextureOffset(95, 37).addBox(-1.5F, -2.7532F, -7.6051F, 3.0F, 4.0F, 10.0F, 0.0F, false);
		RightArm2.setModelRendererName("RightArm2");
		this.registerModelRenderer(RightArm2);

		RightPalm = new AnimatedModelRenderer(this);
		RightPalm.setRotationPoint(1.5F, -0.7532F, -7.6051F);
		RightArm2.addChild(RightPalm);
		setRotationAngle(RightPalm, 0.0F, 0.4538F, 0.0F);
		RightPalm.setTextureOffset(112, 38).addBox(-2.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		RightPalm.setModelRendererName("RightPalm");
		this.registerModelRenderer(RightPalm);

		MiddleRightFinger = new AnimatedModelRenderer(this);
		MiddleRightFinger.setRotationPoint(0.0F, 0.0F, -3.9F);
		RightPalm.addChild(MiddleRightFinger);
		setRotationAngle(MiddleRightFinger, 0.0F, 0.1396F, 0.0F);
		MiddleRightFinger.setTextureOffset(32, 7).addBox(-2.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		MiddleRightFinger.setModelRendererName("MiddleRightFinger");
		this.registerModelRenderer(MiddleRightFinger);

		RightFinger2 = new AnimatedModelRenderer(this);
		RightFinger2.setRotationPoint(0.0F, 1.2F, -3.9F);
		RightPalm.addChild(RightFinger2);
		setRotationAngle(RightFinger2, 0.4538F, 0.1396F, 0.0F);
		RightFinger2.setTextureOffset(32, 0).addBox(-2.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		RightFinger2.setModelRendererName("RightFinger2");
		this.registerModelRenderer(RightFinger2);

		RightFinger3 = new AnimatedModelRenderer(this);
		RightFinger3.setRotationPoint(0.0F, -1.2F, -3.9F);
		RightPalm.addChild(RightFinger3);
		setRotationAngle(RightFinger3, -0.4538F, 0.1396F, 0.0F);
		RightFinger3.setTextureOffset(32, 0).addBox(-2.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		RightFinger3.setModelRendererName("RightFinger3");
		this.registerModelRenderer(RightFinger3);

		RightFinger4 = new AnimatedModelRenderer(this);
		RightFinger4.setRotationPoint(0.0F, -1.6F, -3.3F);
		RightPalm.addChild(RightFinger4);
		setRotationAngle(RightFinger4, -1.1839F, 0.4098F, 0.0F);
		RightFinger4.setTextureOffset(33, 1).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		RightFinger4.setModelRendererName("RightFinger4");
		this.registerModelRenderer(RightFinger4);

		RightFinger5 = new AnimatedModelRenderer(this);
		RightFinger5.setRotationPoint(-0.3F, 1.8F, -3.0F);
		RightPalm.addChild(RightFinger5);
		setRotationAngle(RightFinger5, 1.457F, -0.1349F, 0.0F);
		RightFinger5.setTextureOffset(33, 1).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		RightFinger5.setModelRendererName("RightFinger5");
		this.registerModelRenderer(RightFinger5);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(0.0F, -3.2F, 8.0F);
		Body.addChild(tail1);
		setRotationAngle(tail1, -0.0873F, 0.0F, 0.0F);
		tail1.setTextureOffset(129, 42).addBox(-8.0F, -8.2684F, -0.7234F, 16.0F, 22.0F, 9.0F, 0.0F, true);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.9133F, 7.1373F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, -0.0349F, 0.0F, 0.0F);
		tail2.setTextureOffset(0, 163).addBox(-7.0F, -7.4F, 0.0F, 14.0F, 15.0F, 18.0F, 0.0F, true);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(0.0F, -0.4F, 16.8F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, -0.0524F, 0.0F, 0.0F);
		tail3.setTextureOffset(69, 167).addBox(-6.0F, -6.9642F, -0.8657F, 12.0F, 13.0F, 16.0F, 0.0F, true);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		tail4 = new AnimatedModelRenderer(this);
		tail4.setRotationPoint(0.0F, -2.6642F, 14.6343F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, 0.1571F, 0.0F, 0.0F);
		tail4.setTextureOffset(130, 169).addBox(-5.0F, -4.3F, -0.9F, 10.0F, 10.0F, 18.0F, 0.0F, true);
		tail4.setModelRendererName("tail4");
		this.registerModelRenderer(tail4);

		tail5 = new AnimatedModelRenderer(this);
		tail5.setRotationPoint(0.0F, -0.5F, 16.7F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.1047F, 0.0F, 0.0F);
		tail5.setTextureOffset(0, 139).addBox(-4.0F, -3.8F, -1.6F, 8.0F, 8.0F, 12.0F, 0.0F, true);
		tail5.setModelRendererName("tail5");
		this.registerModelRenderer(tail5);

		tail6 = new AnimatedModelRenderer(this);
		tail6.setRotationPoint(0.0F, -0.7F, 10.6F);
		tail5.addChild(tail6);
		setRotationAngle(tail6, -0.1047F, 0.0F, 0.0F);
		tail6.setTextureOffset(48, 144).addBox(-3.0F, -2.94F, -1.9637F, 6.0F, 6.0F, 12.0F, 0.0F, true);
		tail6.setModelRendererName("tail6");
		this.registerModelRenderer(tail6);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-4.0F, -3.0F, 7.4F);
		Body.addChild(r1);
		setRotationAngle(r1, -0.1527F, 0.0F, 0.0F);
		r1.setTextureOffset(199, 0).addBox(-7.0F, -5.4833F, -8.3835F, 7.0F, 23.0F, 16.0F, 0.0F, true);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(-3.5F, 15.378F, -8.4436F);
		r1.addChild(r2);
		setRotationAngle(r2, 0.8727F, 0.0F, 0.0F);
		r2.setTextureOffset(219, 40).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 16.0F, 7.0F, 0.0F, true);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		LeftCalf = new AnimatedModelRenderer(this);
		LeftCalf.setRotationPoint(0.0F, 16.0F, 7.0F);
		r2.addChild(LeftCalf);
		setRotationAngle(LeftCalf, -0.3142F, 0.0F, 0.0F);
		LeftCalf.setTextureOffset(194, 40).addBox(-2.5F, -14.0F, -7.0F, 5.0F, 14.0F, 7.0F, 0.0F, true);
		LeftCalf.setModelRendererName("LeftCalf");
		this.registerModelRenderer(LeftCalf);

		LeftLeg2 = new AnimatedModelRenderer(this);
		LeftLeg2.setRotationPoint(0.0F, 15.5F, 0.0F);
		r2.addChild(LeftLeg2);
		LeftLeg2.setTextureOffset(225, 64).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 5.0F, 0.0F, true);
		LeftLeg2.setModelRendererName("LeftLeg2");
		this.registerModelRenderer(LeftLeg2);

		LeftCalf2 = new AnimatedModelRenderer(this);
		LeftCalf2.setRotationPoint(0.0F, 7.6F, 5.0F);
		LeftLeg2.addChild(LeftCalf2);
		setRotationAngle(LeftCalf2, -0.2269F, 0.0F, 0.0F);
		LeftCalf2.setTextureOffset(204, 64).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 8.0F, 5.0F, 0.0F, true);
		LeftCalf2.setModelRendererName("LeftCalf2");
		this.registerModelRenderer(LeftCalf2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(0.0F, 7.6F, 2.5F);
		LeftLeg2.addChild(r3);
		setRotationAngle(r3, -0.7679F, 0.0F, 0.0F);
		r3.setTextureOffset(0, 26).addBox(-1.0F, -1.4489F, -2.9238F, 2.0F, 12.0F, 5.0F, 0.0F, true);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		LeftLeg4 = new AnimatedModelRenderer(this);
		LeftLeg4.setRotationPoint(-0.9F, -1.4489F, 2.0762F);
		r3.addChild(LeftLeg4);
		setRotationAngle(LeftLeg4, 0.0F, 0.0F, -0.0524F);
		LeftLeg4.setTextureOffset(64, 0).addBox(-1.0F, 0.0F, -4.8F, 2.0F, 12.0F, 5.0F, 0.0F, true);
		LeftLeg4.setModelRendererName("LeftLeg4");
		this.registerModelRenderer(LeftLeg4);

		LeftLeg5 = new AnimatedModelRenderer(this);
		LeftLeg5.setRotationPoint(-0.2F, 5.0F, -4.8F);
		LeftLeg4.addChild(LeftLeg5);
		setRotationAngle(LeftLeg5, -0.1745F, 0.0F, 0.0F);
		LeftLeg5.setTextureOffset(15, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, true);
		LeftLeg5.setModelRendererName("LeftLeg5");
		this.registerModelRenderer(LeftLeg5);

		LeftLeg6 = new AnimatedModelRenderer(this);
		LeftLeg6.setRotationPoint(0.9F, -1.4489F, 2.0762F);
		r3.addChild(LeftLeg6);
		setRotationAngle(LeftLeg6, 0.0F, 0.0F, 0.0524F);
		LeftLeg6.setTextureOffset(45, 0).addBox(-1.0F, 0.0F, -4.8F, 2.0F, 12.0F, 5.0F, 0.0F, true);
		LeftLeg6.setModelRendererName("LeftLeg6");
		this.registerModelRenderer(LeftLeg6);

		LeftLeg7 = new AnimatedModelRenderer(this);
		LeftLeg7.setRotationPoint(0.2F, 5.0F, -4.8F);
		LeftLeg6.addChild(LeftLeg7);
		setRotationAngle(LeftLeg7, -0.1745F, 0.0F, 0.0F);
		LeftLeg7.setTextureOffset(15, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, true);
		LeftLeg7.setModelRendererName("LeftLeg7");
		this.registerModelRenderer(LeftLeg7);

		LeftLeg8 = new AnimatedModelRenderer(this);
		LeftLeg8.setRotationPoint(0.0F, 3.5511F, -2.9238F);
		r3.addChild(LeftLeg8);
		setRotationAngle(LeftLeg8, -0.1745F, 0.0F, 0.0F);
		LeftLeg8.setTextureOffset(23, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
		LeftLeg8.setModelRendererName("LeftLeg8");
		this.registerModelRenderer(LeftLeg8);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(0.0F, 9.8511F, -0.2238F);
		r3.addChild(r4);
		setRotationAngle(r4, 0.1396F, 0.0F, 0.0F);
		r4.setTextureOffset(32, 32).addBox(-3.0F, -0.5289F, -5.763F, 6.0F, 3.0F, 8.0F, 0.0F, true);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(4.0F, -5.0F, 6.4F);
		Body.addChild(l1);
		setRotationAngle(l1, -0.1527F, 0.0F, 0.0F);
		l1.setTextureOffset(199, 0).addBox(0.0F, -3.578F, -7.213F, 7.0F, 23.0F, 16.0F, 0.0F, false);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(3.5F, 16.6608F, -3.3757F);
		l1.addChild(l2);
		setRotationAngle(l2, 0.8727F, 0.0F, 0.0F);
		l2.setTextureOffset(219, 40).addBox(-3.0F, -2.5253F, -2.9022F, 6.0F, 16.0F, 7.0F, 0.0F, false);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		RightCalf = new AnimatedModelRenderer(this);
		RightCalf.setRotationPoint(0.0F, 13.4747F, 4.0978F);
		l2.addChild(RightCalf);
		setRotationAngle(RightCalf, -0.3142F, 0.0F, 0.0F);
		RightCalf.setTextureOffset(194, 40).addBox(-2.5F, -14.0F, -7.0F, 5.0F, 14.0F, 7.0F, 0.0F, false);
		RightCalf.setModelRendererName("RightCalf");
		this.registerModelRenderer(RightCalf);

		RightLeg2 = new AnimatedModelRenderer(this);
		RightLeg2.setRotationPoint(0.0F, 12.9747F, -2.9022F);
		l2.addChild(RightLeg2);
		RightLeg2.setTextureOffset(225, 64).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		RightLeg2.setModelRendererName("RightLeg2");
		this.registerModelRenderer(RightLeg2);

		RightCalf2 = new AnimatedModelRenderer(this);
		RightCalf2.setRotationPoint(0.0F, 7.6F, 5.0F);
		RightLeg2.addChild(RightCalf2);
		setRotationAngle(RightCalf2, -0.2269F, 0.0F, 0.0F);
		RightCalf2.setTextureOffset(204, 64).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);
		RightCalf2.setModelRendererName("RightCalf2");
		this.registerModelRenderer(RightCalf2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.0F, 7.1F, 3.0F);
		RightLeg2.addChild(l3);
		setRotationAngle(l3, -0.7679F, 0.0F, 0.0F);
		l3.setTextureOffset(0, 26).addBox(-1.0F, -0.7419F, -2.9361F, 2.0F, 12.0F, 5.0F, 0.0F, false);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		RightLeg4 = new AnimatedModelRenderer(this);
		RightLeg4.setRotationPoint(-0.9F, -0.7419F, 2.0639F);
		l3.addChild(RightLeg4);
		setRotationAngle(RightLeg4, 0.0F, 0.0F, -0.0524F);
		RightLeg4.setTextureOffset(45, 0).addBox(-1.0F, 0.0F, -4.8F, 2.0F, 12.0F, 5.0F, 0.0F, false);
		RightLeg4.setModelRendererName("RightLeg4");
		this.registerModelRenderer(RightLeg4);

		RightLeg5 = new AnimatedModelRenderer(this);
		RightLeg5.setRotationPoint(-0.2F, 5.0F, -4.8F);
		RightLeg4.addChild(RightLeg5);
		setRotationAngle(RightLeg5, -0.1745F, 0.0F, 0.0F);
		RightLeg5.setTextureOffset(15, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		RightLeg5.setModelRendererName("RightLeg5");
		this.registerModelRenderer(RightLeg5);

		RightLeg6 = new AnimatedModelRenderer(this);
		RightLeg6.setRotationPoint(0.9F, -0.7419F, 0.0639F);
		l3.addChild(RightLeg6);
		setRotationAngle(RightLeg6, 0.0F, 0.0F, 0.0524F);
		RightLeg6.setTextureOffset(64, 0).addBox(-1.0F, 0.0F, -2.8F, 2.0F, 12.0F, 5.0F, 0.0F, false);
		RightLeg6.setModelRendererName("RightLeg6");
		this.registerModelRenderer(RightLeg6);

		RightLeg7 = new AnimatedModelRenderer(this);
		RightLeg7.setRotationPoint(0.2F, 5.0F, -2.8F);
		RightLeg6.addChild(RightLeg7);
		setRotationAngle(RightLeg7, -0.1745F, 0.0F, 0.0F);
		RightLeg7.setTextureOffset(15, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		RightLeg7.setModelRendererName("RightLeg7");
		this.registerModelRenderer(RightLeg7);

		RightLeg8 = new AnimatedModelRenderer(this);
		RightLeg8.setRotationPoint(0.0F, 4.2581F, -2.9361F);
		l3.addChild(RightLeg8);
		setRotationAngle(RightLeg8, -0.1745F, 0.0F, 0.0F);
		RightLeg8.setTextureOffset(23, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		RightLeg8.setModelRendererName("RightLeg8");
		this.registerModelRenderer(RightLeg8);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(0.0F, 11.0581F, -0.8361F);
		l3.addChild(l4);
		setRotationAngle(l4, 0.1396F, 0.0F, 0.0F);
		l4.setTextureOffset(32, 32).addBox(-3.0F, -0.9405F, -5.0993F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		this.rootBones.add(root);
	}
}