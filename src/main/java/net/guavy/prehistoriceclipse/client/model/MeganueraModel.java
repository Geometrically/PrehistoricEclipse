package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class MeganueraModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Thx;
	private final AnimatedModelRenderer Neck;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Eye1;
	private final AnimatedModelRenderer Eye2;
	private final AnimatedModelRenderer mouth;
	private final AnimatedModelRenderer Headantennae1;
	private final AnimatedModelRenderer x2;
	private final AnimatedModelRenderer headantennae3;
	private final AnimatedModelRenderer x4;
	private final AnimatedModelRenderer wingbase1;
	private final AnimatedModelRenderer base2;
	private final AnimatedModelRenderer wing1;
	private final AnimatedModelRenderer wing2;
	private final AnimatedModelRenderer wing3;
	private final AnimatedModelRenderer wing4;
	private final AnimatedModelRenderer curve1;
	private final AnimatedModelRenderer T1;
	private final AnimatedModelRenderer T2;
	private final AnimatedModelRenderer T3;
	private final AnimatedModelRenderer T4;
	private final AnimatedModelRenderer extrusion1;
	private final AnimatedModelRenderer extrusion2;
	private final AnimatedModelRenderer curve2;
	private final AnimatedModelRenderer legright1;
	private final AnimatedModelRenderer legright12;
	private final AnimatedModelRenderer shape149;
	private final AnimatedModelRenderer legleft4;
	private final AnimatedModelRenderer legleft5;
	private final AnimatedModelRenderer shape2;
	private final AnimatedModelRenderer legright2;
	private final AnimatedModelRenderer legright22;
	private final AnimatedModelRenderer shape150;
	private final AnimatedModelRenderer czxvc;
	private final AnimatedModelRenderer fzf;
	private final AnimatedModelRenderer dzd;
	private final AnimatedModelRenderer legright3;
	private final AnimatedModelRenderer legright32;
	private final AnimatedModelRenderer shape151;
	private final AnimatedModelRenderer hjgh;
	private final AnimatedModelRenderer gdfg;
	private final AnimatedModelRenderer dgd;

    public MeganueraModel()
    {
        textureWidth = 64;
		textureHeight = 128;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 1.5F, 1.3F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Thx = new AnimatedModelRenderer(this);
		Thx.setRotationPoint(0.0F, 16.0F, -7.0F);
		root.addChild(Thx);
		setRotationAngle(Thx, 0.1374F, 0.0F, 0.0F);
		Thx.setTextureOffset(14, 14).addBox(-2.0F, -3.0F, 0.0F, 5.0F, 6.0F, 10.0F, 0.0F, true);
		Thx.setModelRendererName("Thx");
		this.registerModelRenderer(Thx);

		Neck = new AnimatedModelRenderer(this);
		Neck.setRotationPoint(0.5F, 1.3F, 0.2F);
		Thx.addChild(Neck);
		setRotationAngle(Neck, -0.1939F, 0.0F, 0.0F);
		Neck.setTextureOffset(31, 90).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		Neck.setModelRendererName("Neck");
		this.registerModelRenderer(Neck);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.45F, -2.6F);
		Neck.addChild(Head);
		setRotationAngle(Head, 0.1651F, 0.0F, 0.0F);
		Head.setTextureOffset(31, 97).addBox(-2.5F, -2.0F, -4.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Eye1 = new AnimatedModelRenderer(this);
		Eye1.setRotationPoint(-4.6F, -1.5F, -0.7F);
		Head.addChild(Eye1);
		setRotationAngle(Eye1, 0.123F, 0.0F, 0.0F);
		Eye1.setTextureOffset(50, 99).addBox(1.5F, -1.0F, -3.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		Eye1.setModelRendererName("Eye1");
		this.registerModelRenderer(Eye1);

		Eye2 = new AnimatedModelRenderer(this);
		Eye2.setRotationPoint(-0.3F, -1.5F, -0.7F);
		Head.addChild(Eye2);
		setRotationAngle(Eye2, 0.123F, 0.0F, 0.0F);
		Eye2.setTextureOffset(50, 99).addBox(1.5F, -1.0F, -3.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		Eye2.setModelRendererName("Eye2");
		this.registerModelRenderer(Eye2);

		mouth = new AnimatedModelRenderer(this);
		mouth.setRotationPoint(0.0F, 1.7F, -2.2F);
		Head.addChild(mouth);
		setRotationAngle(mouth, -0.4479F, 0.0F, 0.0F);
		mouth.setTextureOffset(44, 65).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
		mouth.setModelRendererName("mouth");
		this.registerModelRenderer(mouth);

		Headantennae1 = new AnimatedModelRenderer(this);
		Headantennae1.setRotationPoint(-0.8F, -1.88F, -1.67F);
		Head.addChild(Headantennae1);
		setRotationAngle(Headantennae1, 0.4363F, 0.0F, -0.3491F);
		Headantennae1.setTextureOffset(22, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		Headantennae1.setModelRendererName("Headantennae1");
		this.registerModelRenderer(Headantennae1);

		x2 = new AnimatedModelRenderer(this);
		x2.setRotationPoint(-0.05F, -5.15F, -0.08F);
		Headantennae1.addChild(x2);
		setRotationAngle(x2, 0.5411F, 0.0031F, 0.0201F);
		x2.setTextureOffset(26, 1).addBox(-0.45F, -4.06F, -0.45F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		x2.setModelRendererName("2");
		this.registerModelRenderer(x2);

		headantennae3 = new AnimatedModelRenderer(this);
		headantennae3.setRotationPoint(0.8F, -1.88F, -1.67F);
		Head.addChild(headantennae3);
		setRotationAngle(headantennae3, 0.4363F, 0.0F, 0.3491F);
		headantennae3.setTextureOffset(22, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		headantennae3.setModelRendererName("headantennae3");
		this.registerModelRenderer(headantennae3);

		x4 = new AnimatedModelRenderer(this);
		x4.setRotationPoint(-0.03F, -5.21F, -0.08F);
		headantennae3.addChild(x4);
		setRotationAngle(x4, 0.5411F, -0.0031F, -0.0201F);
		x4.setTextureOffset(26, 1).addBox(-0.47F, -4.02F, -0.48F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		x4.setModelRendererName("4");
		this.registerModelRenderer(x4);

		wingbase1 = new AnimatedModelRenderer(this);
		wingbase1.setRotationPoint(-0.5F, -0.2F, 0.5F);
		Thx.addChild(wingbase1);
		wingbase1.setTextureOffset(16, 15).addBox(-1.0F, -3.0F, 0.0F, 4.0F, 6.0F, 9.0F, 0.0F, true);
		wingbase1.setModelRendererName("wingbase1");
		this.registerModelRenderer(wingbase1);

		base2 = new AnimatedModelRenderer(this);
		base2.setRotationPoint(2.0F, -3.4F, 0.5F);
		wingbase1.addChild(base2);
		base2.setTextureOffset(36, 14).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 1.0F, 8.0F, 0.0F, true);
		base2.setModelRendererName("base2");
		this.registerModelRenderer(base2);

		wing1 = new AnimatedModelRenderer(this);
		wing1.setRotationPoint(-0.7F, 0.7F, 1.85F);
		base2.addChild(wing1);
		setRotationAngle(wing1, 0.0F, 0.2765F, -0.1745F);
		wing1.setTextureOffset(0, 37).addBox(0.0F, 0.0F, -3.5F, 26.0F, 0.0F, 10.0F, 0.0F, true);
		wing1.setModelRendererName("wing1");
		this.registerModelRenderer(wing1);

		wing2 = new AnimatedModelRenderer(this);
		wing2.setRotationPoint(-0.7F, 0.7F, 5.85F);
		base2.addChild(wing2);
		setRotationAngle(wing2, 0.0F, -0.4754F, 0.0F);
		wing2.setTextureOffset(0, 49).addBox(0.0F, 0.0F, -3.5F, 28.0F, 0.0F, 10.0F, 0.0F, true);
		wing2.setModelRendererName("wing2");
		this.registerModelRenderer(wing2);

		wing3 = new AnimatedModelRenderer(this);
		wing3.setRotationPoint(-1.5F, 0.7F, 5.85F);
		base2.addChild(wing3);
		setRotationAngle(wing3, 0.0F, -0.4754F, -3.1416F);
		wing3.setTextureOffset(0, 49).addBox(0.0F, 0.0F, -3.5F, 28.0F, 0.0F, 10.0F, 0.0F, true);
		wing3.setModelRendererName("wing3");
		this.registerModelRenderer(wing3);

		wing4 = new AnimatedModelRenderer(this);
		wing4.setRotationPoint(-1.5F, 0.7F, 1.85F);
		base2.addChild(wing4);
		setRotationAngle(wing4, 0.0F, 0.2765F, -2.9671F);
		wing4.setTextureOffset(0, 37).addBox(0.0F, 0.0F, -3.5F, 26.0F, 0.0F, 10.0F, 0.0F, true);
		wing4.setModelRendererName("wing4");
		this.registerModelRenderer(wing4);

		curve1 = new AnimatedModelRenderer(this);
		curve1.setRotationPoint(1.0F, -2.0F, 0.9F);
		wingbase1.addChild(curve1);
		setRotationAngle(curve1, 0.9133F, 0.0F, 0.0F);
		curve1.setTextureOffset(28, 82).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		curve1.setModelRendererName("curve1");
		this.registerModelRenderer(curve1);

		T1 = new AnimatedModelRenderer(this);
		T1.setRotationPoint(0.0F, 0.9F, 9.3F);
		Thx.addChild(T1);
		setRotationAngle(T1, 0.0545F, 0.0F, 0.0F);
		T1.setTextureOffset(23, 60).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, true);
		T1.setModelRendererName("T1");
		this.registerModelRenderer(T1);

		T2 = new AnimatedModelRenderer(this);
		T2.setRotationPoint(0.0F, -0.4F, 5.29F);
		T1.addChild(T2);
		setRotationAngle(T2, -0.0428F, 0.0F, 0.0F);
		T2.setTextureOffset(39, 106).addBox(-1.5F, -2.0F, -1.0F, 4.0F, 4.0F, 9.0F, 0.0F, true);
		T2.setModelRendererName("T2");
		this.registerModelRenderer(T2);

		T3 = new AnimatedModelRenderer(this);
		T3.setRotationPoint(0.5F, -0.5F, 7.18F);
		T2.addChild(T3);
		setRotationAngle(T3, -0.0052F, 0.0F, 0.0F);
		T3.setTextureOffset(9, 100).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 4.0F, 10.0F, 0.0F, true);
		T3.setModelRendererName("T3");
		this.registerModelRenderer(T3);

		T4 = new AnimatedModelRenderer(this);
		T4.setRotationPoint(0.5F, 0.5F, 9.3F);
		T3.addChild(T4);
		setRotationAngle(T4, -0.0257F, 0.0F, 0.0F);
		T4.setTextureOffset(9, 114).addBox(-3.0F, -2.0F, 0.0F, 5.0F, 4.0F, 9.0F, 0.0F, true);
		T4.setModelRendererName("T4");
		this.registerModelRenderer(T4);

		extrusion1 = new AnimatedModelRenderer(this);
		extrusion1.setRotationPoint(0.0F, -0.3F, 8.6F);
		T4.addChild(extrusion1);
		setRotationAngle(extrusion1, -0.2443F, 0.3267F, 0.0F);
		extrusion1.setTextureOffset(39, 123).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		extrusion1.setModelRendererName("extrusion1");
		this.registerModelRenderer(extrusion1);

		extrusion2 = new AnimatedModelRenderer(this);
		extrusion2.setRotationPoint(-1.0F, -0.3F, 8.6F);
		T4.addChild(extrusion2);
		setRotationAngle(extrusion2, -0.2443F, -0.3267F, 0.0F);
		extrusion2.setTextureOffset(39, 123).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		extrusion2.setModelRendererName("extrusion2");
		this.registerModelRenderer(extrusion2);

		curve2 = new AnimatedModelRenderer(this);
		curve2.setRotationPoint(0.5F, -2.0F, 7.9F);
		Thx.addChild(curve2);
		setRotationAngle(curve2, 2.2059F, 0.0F, 0.0F);
		curve2.setTextureOffset(15, 93).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		curve2.setModelRendererName("curve2");
		this.registerModelRenderer(curve2);

		legright1 = new AnimatedModelRenderer(this);
		legright1.setRotationPoint(-1.3F, 0.0892F, 1.0487F);
		Thx.addChild(legright1);
		setRotationAngle(legright1, 0.0F, 2.8588F, 2.0604F);
		legright1.setTextureOffset(23, 71).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright1.setModelRendererName("legright1");
		this.registerModelRenderer(legright1);

		legright12 = new AnimatedModelRenderer(this);
		legright12.setRotationPoint(-3.3F, -0.1F, 0.0F);
		legright1.addChild(legright12);
		setRotationAngle(legright12, 0.1129F, 0.635F, 0.3639F);
		legright12.setTextureOffset(23, 76).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright12.setModelRendererName("legright12");
		this.registerModelRenderer(legright12);

		shape149 = new AnimatedModelRenderer(this);
		shape149.setRotationPoint(-3.8835F, 0.5284F, -0.5944F);
		legright12.addChild(shape149);
		setRotationAngle(shape149, 0.0F, -0.1532F, 0.0F);
		shape149.setTextureOffset(0, 69).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);
		shape149.setModelRendererName("shape149");
		this.registerModelRenderer(shape149);

		legleft4 = new AnimatedModelRenderer(this);
		legleft4.setRotationPoint(2.3F, 0.0892F, 1.0487F);
		Thx.addChild(legleft4);
		setRotationAngle(legleft4, 0.0F, -2.8588F, -2.0604F);
		legleft4.setTextureOffset(23, 71).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		legleft4.setModelRendererName("legleft4");
		this.registerModelRenderer(legleft4);

		legleft5 = new AnimatedModelRenderer(this);
		legleft5.setRotationPoint(3.3F, -0.1F, 0.0F);
		legleft4.addChild(legleft5);
		setRotationAngle(legleft5, 0.1129F, -0.635F, -0.3639F);
		legleft5.setTextureOffset(23, 76).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		legleft5.setModelRendererName("legleft5");
		this.registerModelRenderer(legleft5);

		shape2 = new AnimatedModelRenderer(this);
		shape2.setRotationPoint(3.969F, 0.5344F, -0.4138F);
		legleft5.addChild(shape2);
		setRotationAngle(shape2, 0.0F, 0.1358F, 0.0F);
		shape2.setTextureOffset(0, 69).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		shape2.setModelRendererName("shape2");
		this.registerModelRenderer(shape2);

		legright2 = new AnimatedModelRenderer(this);
		legright2.setRotationPoint(-1.3F, 0.4854F, 4.394F);
		Thx.addChild(legright2);
		setRotationAngle(legright2, 0.0F, 2.8588F, 2.0604F);
		legright2.setTextureOffset(42, 71).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright2.setModelRendererName("legright2");
		this.registerModelRenderer(legright2);

		legright22 = new AnimatedModelRenderer(this);
		legright22.setRotationPoint(-3.3F, -0.1F, 0.0F);
		legright2.addChild(legright22);
		setRotationAngle(legright22, 0.1129F, 0.4136F, 0.3639F);
		legright22.setTextureOffset(42, 76).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright22.setModelRendererName("legright22");
		this.registerModelRenderer(legright22);

		shape150 = new AnimatedModelRenderer(this);
		shape150.setRotationPoint(-3.8938F, 0.5251F, -0.6773F);
		legright22.addChild(shape150);
		setRotationAngle(shape150, 0.0F, -0.1009F, 0.0F);
		shape150.setTextureOffset(0, 75).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);
		shape150.setModelRendererName("shape150");
		this.registerModelRenderer(shape150);

		czxvc = new AnimatedModelRenderer(this);
		czxvc.setRotationPoint(2.3F, 0.4854F, 4.394F);
		Thx.addChild(czxvc);
		setRotationAngle(czxvc, 0.0F, -2.8588F, -2.0604F);
		czxvc.setTextureOffset(42, 71).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		czxvc.setModelRendererName("czxvc");
		this.registerModelRenderer(czxvc);

		fzf = new AnimatedModelRenderer(this);
		fzf.setRotationPoint(3.3F, -0.1F, 0.0F);
		czxvc.addChild(fzf);
		setRotationAngle(fzf, 0.1129F, -0.4136F, -0.3639F);
		fzf.setTextureOffset(42, 76).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		fzf.setModelRendererName("fzf");
		this.registerModelRenderer(fzf);

		dzd = new AnimatedModelRenderer(this);
		dzd.setRotationPoint(3.8938F, 0.5251F, -0.6773F);
		fzf.addChild(dzd);
		setRotationAngle(dzd, 0.0F, 0.066F, 0.0F);
		dzd.setTextureOffset(0, 75).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		dzd.setModelRendererName("dzd");
		this.registerModelRenderer(dzd);

		legright3 = new AnimatedModelRenderer(this);
		legright3.setRotationPoint(-1.3F, 0.9807F, 7.8255F);
		Thx.addChild(legright3);
		setRotationAngle(legright3, 0.0F, 2.8588F, 2.0604F);
		legright3.setTextureOffset(10, 71).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright3.setModelRendererName("legright3");
		this.registerModelRenderer(legright3);

		legright32 = new AnimatedModelRenderer(this);
		legright32.setRotationPoint(-3.3F, -0.1F, 0.0F);
		legright3.addChild(legright32);
		setRotationAngle(legright32, 0.1129F, 0.317F, 0.3639F);
		legright32.setTextureOffset(10, 76).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		legright32.setModelRendererName("legright32");
		this.registerModelRenderer(legright32);

		shape151 = new AnimatedModelRenderer(this);
		shape151.setRotationPoint(-3.9882F, 0.5165F, -0.6159F);
		legright32.addChild(shape151);
		setRotationAngle(shape151, 0.0F, 0.0213F, 0.0F);
		shape151.setTextureOffset(0, 82).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);
		shape151.setModelRendererName("shape151");
		this.registerModelRenderer(shape151);

		hjgh = new AnimatedModelRenderer(this);
		hjgh.setRotationPoint(2.3F, 0.9807F, 7.8255F);
		Thx.addChild(hjgh);
		setRotationAngle(hjgh, 0.0F, -2.8588F, -2.0604F);
		hjgh.setTextureOffset(10, 71).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		hjgh.setModelRendererName("hjgh");
		this.registerModelRenderer(hjgh);

		gdfg = new AnimatedModelRenderer(this);
		gdfg.setRotationPoint(3.3F, -0.1F, 0.0F);
		hjgh.addChild(gdfg);
		setRotationAngle(gdfg, 0.1129F, -0.317F, -0.3639F);
		gdfg.setTextureOffset(10, 76).addBox(0.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		gdfg.setModelRendererName("gdfg");
		this.registerModelRenderer(gdfg);

		dgd = new AnimatedModelRenderer(this);
		dgd.setRotationPoint(3.8902F, 0.5304F, -0.63F);
		gdfg.addChild(dgd);
		setRotationAngle(dgd, 0.0F, 0.1009F, 0.0F);
		dgd.setTextureOffset(0, 82).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		dgd.setModelRendererName("dgd");
		this.registerModelRenderer(dgd);

		this.rootBones.add(root);
	}
}