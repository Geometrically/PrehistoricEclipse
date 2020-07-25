package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class PaleotrionyxModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Shelltop;
	private final AnimatedModelRenderer Shelltop2;
	private final AnimatedModelRenderer Shelltop2front;
	private final AnimatedModelRenderer Shelltop2back;
	private final AnimatedModelRenderer Shellslope2;
	private final AnimatedModelRenderer Neck1;
	private final AnimatedModelRenderer Neck2;
	private final AnimatedModelRenderer Neck3;
	private final AnimatedModelRenderer NeckU3;
	private final AnimatedModelRenderer Head1;
	private final AnimatedModelRenderer Snoot1;
	private final AnimatedModelRenderer Snoot2;
	private final AnimatedModelRenderer Jaw;
	private final AnimatedModelRenderer Jaw2;
	private final AnimatedModelRenderer SnootTop;
	private final AnimatedModelRenderer Neckunder1;
	private final AnimatedModelRenderer NeckU2;
	private final AnimatedModelRenderer ShellRim1;
	private final AnimatedModelRenderer ShellRim_1;
	private final AnimatedModelRenderer ShellRim_4;
	private final AnimatedModelRenderer ShellRim2;
	private final AnimatedModelRenderer ShellRim_2;
	private final AnimatedModelRenderer ShellRim_3;
	private final AnimatedModelRenderer ShellRim3;
	private final AnimatedModelRenderer Shellslope;
	private final AnimatedModelRenderer ShellRim4;
	private final AnimatedModelRenderer Shellpart1;
	private final AnimatedModelRenderer shellpart2;
	private final AnimatedModelRenderer shellpart3;
	private final AnimatedModelRenderer leftarm3;
	private final AnimatedModelRenderer leftarm4;
	private final AnimatedModelRenderer righttarm5;
	private final AnimatedModelRenderer rightarm6;
	private final AnimatedModelRenderer rightarm7;
	private final AnimatedModelRenderer rightarm8;
	private final AnimatedModelRenderer lefttarm9;
	private final AnimatedModelRenderer leftarm0;
	private final AnimatedModelRenderer Tail1;
	private final AnimatedModelRenderer Tail2;
	private final AnimatedModelRenderer Tail3;

    public PaleotrionyxModel()
    {
        textureWidth = 100;
		textureHeight = 100;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.9F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 16).addBox(-5.5F, -2.0F, -8.5F, 11.0F, 4.0F, 17.0F, 0.0F, true);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Shelltop = new AnimatedModelRenderer(this);
		Shelltop.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.addChild(Shelltop);
		Shelltop.setTextureOffset(25, 58).addBox(-5.5F, -2.0F, -7.5F, 11.0F, 2.0F, 15.0F, 0.0F, true);
		Shelltop.setModelRendererName("Shelltop");
		this.registerModelRenderer(Shelltop);

		Shelltop2 = new AnimatedModelRenderer(this);
		Shelltop2.setRotationPoint(0.0F, -1.6F, -1.5F);
		Shelltop.addChild(Shelltop2);
		Shelltop2.setTextureOffset(45, 18).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 1.0F, 9.0F, 0.0F, true);
		Shelltop2.setModelRendererName("Shelltop2");
		this.registerModelRenderer(Shelltop2);

		Shelltop2front = new AnimatedModelRenderer(this);
		Shelltop2front.setRotationPoint(0.0F, -0.5F, -3.8F);
		Shelltop2.addChild(Shelltop2front);
		setRotationAngle(Shelltop2front, 0.2972F, 0.0F, 0.0F);
		Shelltop2front.setTextureOffset(63, 1).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 2.0F, 0.0F, true);
		Shelltop2front.setModelRendererName("Shelltop2front");
		this.registerModelRenderer(Shelltop2front);

		Shelltop2back = new AnimatedModelRenderer(this);
		Shelltop2back.setRotationPoint(0.0F, -0.5F, 4.9F);
		Shelltop2.addChild(Shelltop2back);
		setRotationAngle(Shelltop2back, -0.2035F, 0.0F, 0.0F);
		Shelltop2back.setTextureOffset(14, 56).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 1.0F, 3.0F, 0.0F, true);
		Shelltop2back.setModelRendererName("Shelltop2back");
		this.registerModelRenderer(Shelltop2back);

		Shellslope2 = new AnimatedModelRenderer(this);
		Shellslope2.setRotationPoint(0.0F, -1.0F, 8.8F);
		Shelltop.addChild(Shellslope2);
		setRotationAngle(Shellslope2, -0.3164F, 0.0F, 0.0F);
		Shellslope2.setTextureOffset(57, 9).addBox(-5.0F, -0.5F, -2.0F, 10.0F, 1.0F, 2.0F, 0.0F, true);
		Shellslope2.setModelRendererName("Shellslope2");
		this.registerModelRenderer(Shellslope2);

		Neck1 = new AnimatedModelRenderer(this);
		Neck1.setRotationPoint(0.0F, 0.0F, -4.5F);
		Body.addChild(Neck1);
		setRotationAngle(Neck1, 0.0534F, 0.0F, 0.0F);
		Neck1.setTextureOffset(40, 8).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		Neck1.setModelRendererName("Neck1");
		this.registerModelRenderer(Neck1);

		Neck2 = new AnimatedModelRenderer(this);
		Neck2.setRotationPoint(0.0F, 0.0F, -4.7F);
		Neck1.addChild(Neck2);
		setRotationAngle(Neck2, -0.3396F, 0.0F, 0.0F);
		Neck2.setTextureOffset(79, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		Neck2.setModelRendererName("Neck2");
		this.registerModelRenderer(Neck2);

		Neck3 = new AnimatedModelRenderer(this);
		Neck3.setRotationPoint(0.0F, 0.0F, -2.7F);
		Neck2.addChild(Neck3);
		setRotationAngle(Neck3, -0.0424F, 0.0F, 0.0F);
		Neck3.setTextureOffset(81, 9).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		Neck3.setModelRendererName("Neck3");
		this.registerModelRenderer(Neck3);

		NeckU3 = new AnimatedModelRenderer(this);
		NeckU3.setRotationPoint(0.0F, 0.8F, 0.3F);
		Neck3.addChild(NeckU3);
		setRotationAngle(NeckU3, -0.1606F, 0.0F, 0.0F);
		NeckU3.setTextureOffset(39, 0).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		NeckU3.setModelRendererName("NeckU3");
		this.registerModelRenderer(NeckU3);

		Head1 = new AnimatedModelRenderer(this);
		Head1.setRotationPoint(-0.01F, -0.3F, -1.9F);
		Neck3.addChild(Head1);
		setRotationAngle(Head1, 0.3821F, 0.0F, 0.0F);
		Head1.setTextureOffset(11, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		Head1.setModelRendererName("Head1");
		this.registerModelRenderer(Head1);

		Snoot1 = new AnimatedModelRenderer(this);
		Snoot1.setRotationPoint(0.0F, -0.3F, -2.7F);
		Head1.addChild(Snoot1);
		setRotationAngle(Snoot1, 0.1698F, 0.0F, 0.0F);
		Snoot1.setTextureOffset(22, 9).addBox(-1.5F, -1.7F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		Snoot1.setModelRendererName("Snoot1");
		this.registerModelRenderer(Snoot1);

		Snoot2 = new AnimatedModelRenderer(this);
		Snoot2.setRotationPoint(0.0F, -0.5F, 0.0F);
		Snoot1.addChild(Snoot2);
		setRotationAngle(Snoot2, -0.1274F, 0.0F, 0.0F);
		Snoot2.setTextureOffset(33, 7).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		Snoot2.setModelRendererName("Snoot2");
		this.registerModelRenderer(Snoot2);

		Jaw = new AnimatedModelRenderer(this);
		Jaw.setRotationPoint(0.0F, 0.2F, -0.8F);
		Head1.addChild(Jaw);
		setRotationAngle(Jaw, 0.0424F, 0.0F, 0.0F);
		Jaw.setTextureOffset(0, 20).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		Jaw.setModelRendererName("Jaw");
		this.registerModelRenderer(Jaw);

		Jaw2 = new AnimatedModelRenderer(this);
		Jaw2.setRotationPoint(0.0F, 0.5F, -1.8F);
		Jaw.addChild(Jaw2);
		setRotationAngle(Jaw2, -0.1698F, 0.0F, 0.0F);
		Jaw2.setTextureOffset(0, 15).addBox(-1.0F, -0.5F, -2.7F, 2.0F, 1.0F, 3.0F, 0.0F, true);
		Jaw2.setModelRendererName("Jaw2");
		this.registerModelRenderer(Jaw2);

		SnootTop = new AnimatedModelRenderer(this);
		SnootTop.setRotationPoint(0.5F, -1.0F, -2.7F);
		Head1.addChild(SnootTop);
		setRotationAngle(SnootTop, -0.0461F, 0.0F, 0.0F);
		SnootTop.setTextureOffset(12, 10).addBox(-1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		SnootTop.setModelRendererName("SnootTop");
		this.registerModelRenderer(SnootTop);

		Neckunder1 = new AnimatedModelRenderer(this);
		Neckunder1.setRotationPoint(0.0F, 0.8F, -1.2F);
		Neck1.addChild(Neckunder1);
		setRotationAngle(Neckunder1, -0.0137F, 0.0F, 0.0F);
		Neckunder1.setTextureOffset(50, 0).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, true);
		Neckunder1.setModelRendererName("Neckunder1");
		this.registerModelRenderer(Neckunder1);

		NeckU2 = new AnimatedModelRenderer(this);
		NeckU2.setRotationPoint(0.0F, 0.0F, -3.7F);
		Neckunder1.addChild(NeckU2);
		setRotationAngle(NeckU2, -0.3423F, 0.0F, 0.0F);
		NeckU2.setTextureOffset(27, 0).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		NeckU2.setModelRendererName("NeckU2");
		this.registerModelRenderer(NeckU2);

		ShellRim1 = new AnimatedModelRenderer(this);
		ShellRim1.setRotationPoint(-5.2F, -1.3F, 0.0F);
		Body.addChild(ShellRim1);
		ShellRim1.setTextureOffset(0, 62).addBox(-2.0F, -1.0F, -7.0F, 2.0F, 3.0F, 16.0F, 0.0F, true);
		ShellRim1.setModelRendererName("ShellRim1");
		this.registerModelRenderer(ShellRim1);

		ShellRim_1 = new AnimatedModelRenderer(this);
		ShellRim_1.setRotationPoint(-1.2F, 0.1F, -6.2F);
		ShellRim1.addChild(ShellRim_1);
		setRotationAngle(ShellRim_1, 0.0F, -0.7741F, 0.0F);
		ShellRim_1.setTextureOffset(66, 31).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		ShellRim_1.setModelRendererName("ShellRim_1");
		this.registerModelRenderer(ShellRim_1);

		ShellRim_4 = new AnimatedModelRenderer(this);
		ShellRim_4.setRotationPoint(-1.4F, -0.2F, 8.0F);
		ShellRim1.addChild(ShellRim_4);
		setRotationAngle(ShellRim_4, -0.1799F, 0.9561F, 0.0F);
		ShellRim_4.setTextureOffset(83, 39).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		ShellRim_4.setModelRendererName("ShellRim_4");
		this.registerModelRenderer(ShellRim_4);

		ShellRim2 = new AnimatedModelRenderer(this);
		ShellRim2.setRotationPoint(5.2F, -1.3F, 0.0F);
		Body.addChild(ShellRim2);
		ShellRim2.setTextureOffset(63, 46).addBox(0.0F, -1.0F, -7.0F, 2.0F, 3.0F, 16.0F, 0.0F, true);
		ShellRim2.setModelRendererName("ShellRim2");
		this.registerModelRenderer(ShellRim2);

		ShellRim_2 = new AnimatedModelRenderer(this);
		ShellRim_2.setRotationPoint(1.4F, -0.2F, 8.0F);
		ShellRim2.addChild(ShellRim_2);
		setRotationAngle(ShellRim_2, -0.2698F, -0.9561F, -0.081F);
		ShellRim_2.setTextureOffset(78, 31).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		ShellRim_2.setModelRendererName("ShellRim_2");
		this.registerModelRenderer(ShellRim_2);

		ShellRim_3 = new AnimatedModelRenderer(this);
		ShellRim_3.setRotationPoint(1.2F, 0.1F, -6.2F);
		ShellRim2.addChild(ShellRim_3);
		setRotationAngle(ShellRim_3, 0.0F, 0.7741F, 0.0F);
		ShellRim_3.setTextureOffset(71, 39).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		ShellRim_3.setModelRendererName("ShellRim_3");
		this.registerModelRenderer(ShellRim_3);

		ShellRim3 = new AnimatedModelRenderer(this);
		ShellRim3.setRotationPoint(0.0F, -1.2F, -5.3F);
		Body.addChild(ShellRim3);
		ShellRim3.setTextureOffset(42, 38).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 3.0F, 3.0F, 0.0F, true);
		ShellRim3.setModelRendererName("ShellRim3");
		this.registerModelRenderer(ShellRim3);

		Shellslope = new AnimatedModelRenderer(this);
		Shellslope.setRotationPoint(0.0F, -0.5F, -3.7F);
		ShellRim3.addChild(Shellslope);
		setRotationAngle(Shellslope, -2.7447F, 0.0F, 0.0F);
		Shellslope.setTextureOffset(60, 14).addBox(-4.5F, -0.5F, -2.0F, 9.0F, 1.0F, 2.0F, 0.0F, true);
		Shellslope.setModelRendererName("Shellslope");
		this.registerModelRenderer(Shellslope);

		ShellRim4 = new AnimatedModelRenderer(this);
		ShellRim4.setRotationPoint(0.0F, -1.6F, 7.6F);
		Body.addChild(ShellRim4);
		setRotationAngle(ShellRim4, -0.1274F, 0.0F, 0.0F);
		ShellRim4.setTextureOffset(0, 43).addBox(-4.5F, -1.0F, 0.0F, 9.0F, 2.0F, 3.0F, 0.0F, true);
		ShellRim4.setModelRendererName("ShellRim4");
		this.registerModelRenderer(ShellRim4);

		Shellpart1 = new AnimatedModelRenderer(this);
		Shellpart1.setRotationPoint(0.0F, 0.0F, 3.0F);
		ShellRim4.addChild(Shellpart1);
		setRotationAngle(Shellpart1, -0.0424F, 0.0F, 0.0F);
		Shellpart1.setTextureOffset(45, 49).addBox(-3.5F, -1.0F, 0.0F, 7.0F, 3.0F, 2.0F, 0.0F, true);
		Shellpart1.setModelRendererName("Shellpart1");
		this.registerModelRenderer(Shellpart1);

		shellpart2 = new AnimatedModelRenderer(this);
		shellpart2.setRotationPoint(2.6F, 0.1F, 1.4F);
		Shellpart1.addChild(shellpart2);
		setRotationAngle(shellpart2, 0.0F, 0.9561F, 0.0F);
		shellpart2.setTextureOffset(34, 45).addBox(0.0F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
		shellpart2.setModelRendererName("shellpart2");
		this.registerModelRenderer(shellpart2);

		shellpart3 = new AnimatedModelRenderer(this);
		shellpart3.setRotationPoint(-2.6F, 0.1F, 1.4F);
		Shellpart1.addChild(shellpart3);
		setRotationAngle(shellpart3, 0.0F, -0.9561F, 0.0F);
		shellpart3.setTextureOffset(25, 41).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
		shellpart3.setModelRendererName("shellpart3");
		this.registerModelRenderer(shellpart3);

		leftarm3 = new AnimatedModelRenderer(this);
		leftarm3.setRotationPoint(5.2F, 0.4F, -6.3F);
		Body.addChild(leftarm3);
		setRotationAngle(leftarm3, 0.2546F, 0.0F, 1.8174F);
		leftarm3.setTextureOffset(37, 78).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		leftarm3.setModelRendererName("leftarm3");
		this.registerModelRenderer(leftarm3);

		leftarm4 = new AnimatedModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, -4.1F, 0.1F);
		leftarm3.addChild(leftarm4);
		setRotationAngle(leftarm4, -0.1477F, 0.0F, -0.1745F);
		leftarm4.setTextureOffset(0, 64).addBox(-0.5F, -5.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
		leftarm4.setModelRendererName("leftarm4");
		this.registerModelRenderer(leftarm4);

		righttarm5 = new AnimatedModelRenderer(this);
		righttarm5.setRotationPoint(-5.2F, 0.4F, -6.3F);
		Body.addChild(righttarm5);
		setRotationAngle(righttarm5, 0.2546F, 0.0F, -1.8174F);
		righttarm5.setTextureOffset(50, 78).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		righttarm5.setModelRendererName("righttarm5");
		this.registerModelRenderer(righttarm5);

		rightarm6 = new AnimatedModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, -4.1F, 0.1F);
		righttarm5.addChild(rightarm6);
		setRotationAngle(rightarm6, -0.1477F, 0.0F, 0.1745F);
		rightarm6.setTextureOffset(22, 62).addBox(-0.5F, -5.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
		rightarm6.setModelRendererName("rightarm6");
		this.registerModelRenderer(rightarm6);

		rightarm7 = new AnimatedModelRenderer(this);
		rightarm7.setRotationPoint(4.7F, 0.9F, 6.5F);
		Body.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.658F, -0.0703F, -1.4987F);
		rightarm7.setTextureOffset(63, 79).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, true);
		rightarm7.setModelRendererName("rightarm7");
		this.registerModelRenderer(rightarm7);

		rightarm8 = new AnimatedModelRenderer(this);
		rightarm8.setRotationPoint(0.0F, 4.2F, 0.0F);
		rightarm7.addChild(rightarm8);
		setRotationAngle(rightarm8, 0.1477F, 0.0F, -0.0024F);
		rightarm8.setTextureOffset(0, 52).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, true);
		rightarm8.setModelRendererName("rightarm8");
		this.registerModelRenderer(rightarm8);

		lefttarm9 = new AnimatedModelRenderer(this);
		lefttarm9.setRotationPoint(-4.7F, 0.9F, 6.5F);
		Body.addChild(lefttarm9);
		setRotationAngle(lefttarm9, 0.658F, 0.0703F, 1.4987F);
		lefttarm9.setTextureOffset(78, 80).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, true);
		lefttarm9.setModelRendererName("lefttarm9");
		this.registerModelRenderer(lefttarm9);

		leftarm0 = new AnimatedModelRenderer(this);
		leftarm0.setRotationPoint(0.0F, 4.2F, 0.0F);
		lefttarm9.addChild(leftarm0);
		setRotationAngle(leftarm0, 0.1477F, 0.0F, 0.0897F);
		leftarm0.setTextureOffset(79, 66).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, true);
		leftarm0.setModelRendererName("leftarm0");
		this.registerModelRenderer(leftarm0);

		Tail1 = new AnimatedModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 0.5F, 8.0F);
		Body.addChild(Tail1);
		setRotationAngle(Tail1, -0.0848F, 0.0F, 0.0F);
		Tail1.setTextureOffset(0, 25).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		Tail1.setModelRendererName("Tail1");
		this.registerModelRenderer(Tail1);

		Tail2 = new AnimatedModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
		Tail1.addChild(Tail2);
		setRotationAngle(Tail2, 0.0424F, 0.0F, 0.0F);
		Tail2.setTextureOffset(0, 8).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
		Tail2.setModelRendererName("Tail2");
		this.registerModelRenderer(Tail2);

		Tail3 = new AnimatedModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, 0.0424F, 0.0F, 0.0F);
		Tail3.setTextureOffset(0, 1).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		Tail3.setModelRendererName("Tail3");
		this.registerModelRenderer(Tail3);

		this.rootBones.add(root);
	}
}