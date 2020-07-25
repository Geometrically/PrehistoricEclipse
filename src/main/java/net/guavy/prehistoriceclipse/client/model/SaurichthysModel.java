package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class SaurichthysModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer UpperJaw1;
	private final AnimatedModelRenderer UpperJaw2;
	private final AnimatedModelRenderer Head2;
	private final AnimatedModelRenderer UpperJaw3;
	private final AnimatedModelRenderer UpperJaw4;
	private final AnimatedModelRenderer Eye_1;
	private final AnimatedModelRenderer shape60;
	private final AnimatedModelRenderer shape11;
	private final AnimatedModelRenderer shape12;
	private final AnimatedModelRenderer shape13;
	private final AnimatedModelRenderer shape14;
	private final AnimatedModelRenderer shape26;
	private final AnimatedModelRenderer shape262;
	private final AnimatedModelRenderer shape28;
	private final AnimatedModelRenderer shape282;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer Tail;
	private final AnimatedModelRenderer Tail2;
	private final AnimatedModelRenderer shape18;
	private final AnimatedModelRenderer shape182;
	private final AnimatedModelRenderer shape22;
	private final AnimatedModelRenderer shape222;
	private final AnimatedModelRenderer shape24;
	private final AnimatedModelRenderer shape242;

    public SaurichthysModel()
    {
        textureWidth = 150;
		textureHeight = 150;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 21.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		setRotationAngle(Body, 0.0175F, 0.0F, 0.0F);
		Body.setTextureOffset(1, 102).addBox(-2.5F, -2.5F, -15.0F, 5.0F, 5.0F, 20.0F, 0.0F, true);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(2.5F, -1.57F, -14.6F);
		Body.addChild(Head);
		setRotationAngle(Head, 0.2484F, 0.0F, 0.0F);
		Head.setTextureOffset(71, 5).addBox(-5.0F, -1.0F, -5.0F, 5.0F, 2.0F, 5.0F, 0.0F, true);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		UpperJaw1 = new AnimatedModelRenderer(this);
		UpperJaw1.setRotationPoint(0.0F, 0.9F, -0.4F);
		Head.addChild(UpperJaw1);
		setRotationAngle(UpperJaw1, -0.3049F, 0.0F, 0.0F);
		UpperJaw1.setTextureOffset(66, 19).addBox(-5.0F, -0.3F, -5.0F, 5.0F, 2.0F, 5.0F, 0.0F, true);
		UpperJaw1.setModelRendererName("UpperJaw1");
		this.registerModelRenderer(UpperJaw1);

		UpperJaw2 = new AnimatedModelRenderer(this);
		UpperJaw2.setRotationPoint(-2.5F, 1.0F, -4.8F);
		UpperJaw1.addChild(UpperJaw2);
		UpperJaw2.setTextureOffset(86, 16).addBox(-2.0F, -0.3F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, true);
		UpperJaw2.setModelRendererName("UpperJaw2");
		this.registerModelRenderer(UpperJaw2);

		Head2 = new AnimatedModelRenderer(this);
		Head2.setRotationPoint(0.0F, -0.4F, 0.2F);
		UpperJaw2.addChild(Head2);
		setRotationAngle(Head2, 0.195F, 0.0F, 0.0F);
		Head2.setTextureOffset(57, 29).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		Head2.setModelRendererName("Head2");
		this.registerModelRenderer(Head2);

		UpperJaw3 = new AnimatedModelRenderer(this);
		UpperJaw3.setRotationPoint(0.0F, 0.0F, -4.8F);
		UpperJaw2.addChild(UpperJaw3);
		setRotationAngle(UpperJaw3, 0.0911F, 0.0F, 0.0F);
		UpperJaw3.setTextureOffset(58, 4).addBox(-1.5F, -0.3F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		UpperJaw3.setModelRendererName("UpperJaw3");
		this.registerModelRenderer(UpperJaw3);

		UpperJaw4 = new AnimatedModelRenderer(this);
		UpperJaw4.setRotationPoint(0.0F, 0.0F, -3.0F);
		UpperJaw3.addChild(UpperJaw4);
		UpperJaw4.setTextureOffset(99, 6).addBox(-1.0F, -0.3F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, true);
		UpperJaw4.setModelRendererName("UpperJaw4");
		this.registerModelRenderer(UpperJaw4);

		Eye_1 = new AnimatedModelRenderer(this);
		Eye_1.setRotationPoint(0.02F, -0.4F, -2.8F);
		UpperJaw1.addChild(Eye_1);
		Eye_1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, true);
		Eye_1.setModelRendererName("Eye_1");
		this.registerModelRenderer(Eye_1);

		shape60 = new AnimatedModelRenderer(this);
		shape60.setRotationPoint(-5.02F, -0.4F, -2.8F);
		UpperJaw1.addChild(shape60);
		shape60.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, true);
		shape60.setModelRendererName("shape60");
		this.registerModelRenderer(shape60);

		shape11 = new AnimatedModelRenderer(this);
		shape11.setRotationPoint(-2.5F, 2.1F, -0.6F);
		Head.addChild(shape11);
		setRotationAngle(shape11, -0.3505F, 0.0F, 0.0F);
		shape11.setTextureOffset(104, 25).addBox(-2.5F, -0.2F, -4.8F, 5.0F, 2.0F, 5.0F, 0.0F, true);
		shape11.setModelRendererName("shape11");
		this.registerModelRenderer(shape11);

		shape12 = new AnimatedModelRenderer(this);
		shape12.setRotationPoint(0.0F, 0.8F, -3.8F);
		shape11.addChild(shape12);
		setRotationAngle(shape12, 0.0145F, 0.0F, 0.0F);
		shape12.setTextureOffset(51, 13).addBox(-1.5F, -0.2F, -5.0F, 3.0F, 1.0F, 5.0F, 0.0F, true);
		shape12.setModelRendererName("shape12");
		this.registerModelRenderer(shape12);

		shape13 = new AnimatedModelRenderer(this);
		shape13.setRotationPoint(0.1F, 0.0F, -4.9F);
		shape12.addChild(shape13);
		setRotationAngle(shape13, 0.0284F, 0.0F, 0.0F);
		shape13.setTextureOffset(84, 32).addBox(-1.0F, -0.2F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, true);
		shape13.setModelRendererName("shape13");
		this.registerModelRenderer(shape13);

		shape14 = new AnimatedModelRenderer(this);
		shape14.setRotationPoint(-0.1F, 0.0F, -2.9F);
		shape13.addChild(shape14);
		shape14.setTextureOffset(112, 14).addBox(-0.5F, -0.2F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		shape14.setModelRendererName("shape14");
		this.registerModelRenderer(shape14);

		shape26 = new AnimatedModelRenderer(this);
		shape26.setRotationPoint(-2.4F, 1.4F, 2.1F);
		Body.addChild(shape26);
		setRotationAngle(shape26, 0.296F, 0.0F, -0.1367F);
		shape26.setTextureOffset(34, 0).addBox(4.8F, 0.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		shape26.setModelRendererName("shape26");
		this.registerModelRenderer(shape26);

		shape262 = new AnimatedModelRenderer(this);
		shape262.setRotationPoint(-2.4F, 1.4F, 2.1F);
		Body.addChild(shape262);
		setRotationAngle(shape262, 0.296F, 0.0F, -0.1367F);
		shape262.setTextureOffset(37, 5).addBox(0.0F, 0.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		shape262.setModelRendererName("shape262");
		this.registerModelRenderer(shape262);

		shape28 = new AnimatedModelRenderer(this);
		shape28.setRotationPoint(-2.0F, 1.4F, -11.9F);
		Body.addChild(shape28);
		setRotationAngle(shape28, 0.7741F, -0.4098F, 0.0F);
		shape28.setTextureOffset(35, 12).addBox(-0.4F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		shape28.setModelRendererName("shape28");
		this.registerModelRenderer(shape28);

		shape282 = new AnimatedModelRenderer(this);
		shape282.setRotationPoint(2.0F, 1.4F, -11.9F);
		Body.addChild(shape282);
		setRotationAngle(shape282, 0.7741F, 0.4098F, 0.0F);
		shape282.setTextureOffset(36, 20).addBox(0.4F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		shape282.setModelRendererName("shape282");
		this.registerModelRenderer(shape282);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
		Body.addChild(Body2);
		Body2.setTextureOffset(55, 105).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 16.0F, 0.0F, true);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		Tail = new AnimatedModelRenderer(this);
		Tail.setRotationPoint(0.0F, -0.5F, 15.8F);
		Body2.addChild(Tail);
		setRotationAngle(Tail, -0.1367F, 0.0F, 0.0F);
		Tail.setTextureOffset(68, 52).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 6.0F, 0.0F, true);
		Tail.setModelRendererName("Tail");
		this.registerModelRenderer(Tail);

		Tail2 = new AnimatedModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 1.9F, 0.2F);
		Tail.addChild(Tail2);
		setRotationAngle(Tail2, 0.3187F, 0.0F, 0.0F);
		Tail2.setTextureOffset(69, 68).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 6.0F, 0.0F, true);
		Tail2.setModelRendererName("Tail2");
		this.registerModelRenderer(Tail2);

		shape18 = new AnimatedModelRenderer(this);
		shape18.setRotationPoint(0.0F, -0.6F, 5.4F);
		Tail2.addChild(shape18);
		setRotationAngle(shape18, -0.182F, 0.0F, 0.0F);
		shape18.setTextureOffset(50, 61).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		shape18.setModelRendererName("shape18");
		this.registerModelRenderer(shape18);

		shape182 = new AnimatedModelRenderer(this);
		shape182.setRotationPoint(0.0F, 0.0F, 3.9F);
		shape18.addChild(shape182);
		shape182.setTextureOffset(33, 60).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 5.0F, 0.0F, true);
		shape182.setModelRendererName("shape182");
		this.registerModelRenderer(shape182);

		shape22 = new AnimatedModelRenderer(this);
		shape22.setRotationPoint(0.0F, -0.7F, 3.8F);
		shape182.addChild(shape22);
		setRotationAngle(shape22, -0.6374F, 0.0F, 0.0F);
		shape22.setTextureOffset(24, 0).addBox(0.0F, -7.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, true);
		shape22.setModelRendererName("shape22");
		this.registerModelRenderer(shape22);

		shape222 = new AnimatedModelRenderer(this);
		shape222.setRotationPoint(0.0F, -1.0F, 4.0F);
		shape182.addChild(shape222);
		setRotationAngle(shape222, 0.6374F, 0.0F, 0.0F);
		shape222.setTextureOffset(23, 10).addBox(0.0F, 0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, true);
		shape222.setModelRendererName("shape222");
		this.registerModelRenderer(shape222);

		shape24 = new AnimatedModelRenderer(this);
		shape24.setRotationPoint(0.0F, -1.0F, 10.0F);
		Body2.addChild(shape24);
		setRotationAngle(shape24, -0.6374F, 0.0F, 0.0F);
		shape24.setTextureOffset(12, 0).addBox(0.0F, -5.0F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		shape24.setModelRendererName("shape24");
		this.registerModelRenderer(shape24);

		shape242 = new AnimatedModelRenderer(this);
		shape242.setRotationPoint(0.0F, 0.6F, 10.0F);
		Body2.addChild(shape242);
		setRotationAngle(shape242, 0.6374F, 0.0F, 0.0F);
		shape242.setTextureOffset(10, 8).addBox(0.0F, 0.0F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		shape242.setModelRendererName("shape242");
		this.registerModelRenderer(shape242);

		this.rootBones.add(root);
	}
}