package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class GyrodusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Bodymiddle;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer Back2;
	private final AnimatedModelRenderer Dorsalfin1;
	private final AnimatedModelRenderer Belly2;
	private final AnimatedModelRenderer Analfin1;
	private final AnimatedModelRenderer Tail;
	private final AnimatedModelRenderer Back3;
	private final AnimatedModelRenderer Dorsalfin2;
	private final AnimatedModelRenderer Belly3;
	private final AnimatedModelRenderer Analfin2;
	private final AnimatedModelRenderer shape18;
	private final AnimatedModelRenderer shape182;
	private final AnimatedModelRenderer Tail5;
	private final AnimatedModelRenderer Bodyfront;
	private final AnimatedModelRenderer Back1;
	private final AnimatedModelRenderer Belly1;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Headslope;
	private final AnimatedModelRenderer Headfront1;
	private final AnimatedModelRenderer Upperjaw;
	private final AnimatedModelRenderer Lowerjaw;
	private final AnimatedModelRenderer Throat1;
	private final AnimatedModelRenderer Throat2;
	private final AnimatedModelRenderer Leftpectoralfin;
	private final AnimatedModelRenderer Rightpectoralfin;
	private final AnimatedModelRenderer Leftpelvicfin;
	private final AnimatedModelRenderer Rightpelvicfin;

    public GyrodusModel()
    {
        textureWidth = 80;
		textureHeight = 80;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 12.5F, -2.8F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Bodymiddle = new AnimatedModelRenderer(this);
		Bodymiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Bodymiddle);
		Bodymiddle.setTextureOffset(0, 0).addBox(-2.5F, -6.0F, -2.5F, 5.0F, 15.0F, 9.0F, 0.0F, true);
		Bodymiddle.setModelRendererName("Bodymiddle");
		this.registerModelRenderer(Bodymiddle);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(0.0F, 1.0F, 6.0F);
		Bodymiddle.addChild(Body2);
		Body2.setTextureOffset(29, 0).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		Back2 = new AnimatedModelRenderer(this);
		Back2.setRotationPoint(0.01F, -7.0F, -0.05F);
		Body2.addChild(Back2);
		setRotationAngle(Back2, -0.6397F, 0.0F, 0.0F);
		Back2.setTextureOffset(46, 26).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		Back2.setModelRendererName("Back2");
		this.registerModelRenderer(Back2);

		Dorsalfin1 = new AnimatedModelRenderer(this);
		Dorsalfin1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back2.addChild(Dorsalfin1);
		Dorsalfin1.setTextureOffset(10, 31).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		Dorsalfin1.setModelRendererName("Dorsalfin1");
		this.registerModelRenderer(Dorsalfin1);

		Belly2 = new AnimatedModelRenderer(this);
		Belly2.setRotationPoint(0.01F, 8.0F, -0.05F);
		Body2.addChild(Belly2);
		setRotationAngle(Belly2, 0.6369F, 0.0F, 0.0F);
		Belly2.setTextureOffset(13, 27).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		Belly2.setModelRendererName("Belly2");
		this.registerModelRenderer(Belly2);

		Analfin1 = new AnimatedModelRenderer(this);
		Analfin1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belly2.addChild(Analfin1);
		Analfin1.setTextureOffset(10, 37).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, true);
		Analfin1.setModelRendererName("Analfin1");
		this.registerModelRenderer(Analfin1);

		Tail = new AnimatedModelRenderer(this);
		Tail.setRotationPoint(0.01F, 0.0F, 3.5F);
		Body2.addChild(Tail);
		Tail.setTextureOffset(46, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		Tail.setModelRendererName("Tail");
		this.registerModelRenderer(Tail);

		Back3 = new AnimatedModelRenderer(this);
		Back3.setRotationPoint(-0.01F, -4.2F, -0.1F);
		Tail.addChild(Back3);
		setRotationAngle(Back3, -0.6397F, 0.0F, 0.0F);
		Back3.setTextureOffset(58, 15).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		Back3.setModelRendererName("Back3");
		this.registerModelRenderer(Back3);

		Dorsalfin2 = new AnimatedModelRenderer(this);
		Dorsalfin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back3.addChild(Dorsalfin2);
		Dorsalfin2.setTextureOffset(0, 31).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, true);
		Dorsalfin2.setModelRendererName("Dorsalfin2");
		this.registerModelRenderer(Dorsalfin2);

		Belly3 = new AnimatedModelRenderer(this);
		Belly3.setRotationPoint(-0.01F, 5.2F, -0.1F);
		Tail.addChild(Belly3);
		setRotationAngle(Belly3, 0.6369F, 0.0F, 0.0F);
		Belly3.setTextureOffset(31, 27).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		Belly3.setModelRendererName("Belly3");
		this.registerModelRenderer(Belly3);

		Analfin2 = new AnimatedModelRenderer(this);
		Analfin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Belly3.addChild(Analfin2);
		Analfin2.setTextureOffset(0, 37).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, true);
		Analfin2.setModelRendererName("Analfin2");
		this.registerModelRenderer(Analfin2);

		shape18 = new AnimatedModelRenderer(this);
		shape18.setRotationPoint(0.0F, 0.5F, 2.5F);
		Tail.addChild(shape18);
		shape18.setTextureOffset(59, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		shape18.setModelRendererName("shape18");
		this.registerModelRenderer(shape18);

		shape182 = new AnimatedModelRenderer(this);
		shape182.setRotationPoint(0.0F, 0.0F, 1.5F);
		shape18.addChild(shape182);
		shape182.setTextureOffset(22, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		shape182.setModelRendererName("shape182");
		this.registerModelRenderer(shape182);

		Tail5 = new AnimatedModelRenderer(this);
		Tail5.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape182.addChild(Tail5);
		Tail5.setTextureOffset(0, 39).addBox(0.0F, -8.0F, 0.0F, 0.0F, 15.0F, 9.0F, 0.0F, true);
		Tail5.setModelRendererName("Tail5");
		this.registerModelRenderer(Tail5);

		Bodyfront = new AnimatedModelRenderer(this);
		Bodyfront.setRotationPoint(0.0F, 0.17F, -2.1F);
		Bodymiddle.addChild(Bodyfront);
		Bodyfront.setTextureOffset(42, 10).addBox(-2.0F, -3.5F, -4.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);
		Bodyfront.setModelRendererName("Bodyfront");
		this.registerModelRenderer(Bodyfront);

		Back1 = new AnimatedModelRenderer(this);
		Back1.setRotationPoint(-0.01F, -3.42F, -4.1F);
		Bodyfront.addChild(Back1);
		setRotationAngle(Back1, 0.5781F, 0.0F, 0.0F);
		Back1.setTextureOffset(54, 6).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		Back1.setModelRendererName("Back1");
		this.registerModelRenderer(Back1);

		Belly1 = new AnimatedModelRenderer(this);
		Belly1.setRotationPoint(-0.01F, 7.5F, -3.9F);
		Bodyfront.addChild(Belly1);
		setRotationAngle(Belly1, -0.2634F, 0.0F, 0.0F);
		Belly1.setTextureOffset(0, 25).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, true);
		Belly1.setModelRendererName("Belly1");
		this.registerModelRenderer(Belly1);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -1.35F, -1.6F);
		Bodyfront.addChild(Head);
		setRotationAngle(Head, -0.0424F, 0.0F, 0.0F);
		Head.setTextureOffset(21, 36).addBox(-2.5F, -1.0F, -5.0F, 5.0F, 6.0F, 6.0F, 0.0F, true);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Headslope = new AnimatedModelRenderer(this);
		Headslope.setRotationPoint(0.01F, -2.16F, -2.15F);
		Head.addChild(Headslope);
		setRotationAngle(Headslope, 0.3908F, 0.0F, 0.0F);
		Headslope.setTextureOffset(38, 35).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, true);
		Headslope.setModelRendererName("Headslope");
		this.registerModelRenderer(Headslope);

		Headfront1 = new AnimatedModelRenderer(this);
		Headfront1.setRotationPoint(0.0F, -1.0F, -5.0F);
		Head.addChild(Headfront1);
		setRotationAngle(Headfront1, -0.3821F, 0.0F, 0.0F);
		Headfront1.setTextureOffset(44, 41).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 2.0F, 0.0F, true);
		Headfront1.setModelRendererName("Headfront1");
		this.registerModelRenderer(Headfront1);

		Upperjaw = new AnimatedModelRenderer(this);
		Upperjaw.setRotationPoint(-0.01F, 5.0F, 0.0F);
		Headfront1.addChild(Upperjaw);
		setRotationAngle(Upperjaw, 0.5519F, 0.0F, 0.0F);
		Upperjaw.setTextureOffset(52, 35).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, 0.0F, true);
		Upperjaw.setModelRendererName("Upperjaw");
		this.registerModelRenderer(Upperjaw);

		Lowerjaw = new AnimatedModelRenderer(this);
		Lowerjaw.setRotationPoint(0.0F, 5.0F, -3.0F);
		Head.addChild(Lowerjaw);
		setRotationAngle(Lowerjaw, 0.1698F, 0.0F, 0.0F);
		Lowerjaw.setTextureOffset(28, 21).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		Lowerjaw.setModelRendererName("Lowerjaw");
		this.registerModelRenderer(Lowerjaw);

		Throat1 = new AnimatedModelRenderer(this);
		Throat1.setRotationPoint(-0.01F, 0.9F, -1.9F);
		Lowerjaw.addChild(Throat1);
		setRotationAngle(Throat1, 0.6793F, 0.0F, 0.0F);
		Throat1.setTextureOffset(29, 14).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, true);
		Throat1.setModelRendererName("Throat1");
		this.registerModelRenderer(Throat1);

		Throat2 = new AnimatedModelRenderer(this);
		Throat2.setRotationPoint(0.01F, 7.5F, -4.0F);
		Bodyfront.addChild(Throat2);
		setRotationAngle(Throat2, 0.5943F, 0.0F, 0.0F);
		Throat2.setTextureOffset(60, 22).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 5.0F, 3.0F, 0.0F, true);
		Throat2.setModelRendererName("Throat2");
		this.registerModelRenderer(Throat2);

		Leftpectoralfin = new AnimatedModelRenderer(this);
		Leftpectoralfin.setRotationPoint(-2.5F, 4.0F, -2.3F);
		Bodymiddle.addChild(Leftpectoralfin);
		setRotationAngle(Leftpectoralfin, 0.1698F, -0.5095F, 0.0F);
		Leftpectoralfin.setTextureOffset(21, 45).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, true);
		Leftpectoralfin.setModelRendererName("Leftpectoralfin");
		this.registerModelRenderer(Leftpectoralfin);

		Rightpectoralfin = new AnimatedModelRenderer(this);
		Rightpectoralfin.setRotationPoint(2.5F, 4.0F, -2.3F);
		Bodymiddle.addChild(Rightpectoralfin);
		setRotationAngle(Rightpectoralfin, 0.1698F, 0.5095F, 0.0F);
		Rightpectoralfin.setTextureOffset(30, 45).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, true);
		Rightpectoralfin.setModelRendererName("Rightpectoralfin");
		this.registerModelRenderer(Rightpectoralfin);

		Leftpelvicfin = new AnimatedModelRenderer(this);
		Leftpelvicfin.setRotationPoint(-2.5F, 7.5F, 1.5F);
		Bodymiddle.addChild(Leftpelvicfin);
		setRotationAngle(Leftpelvicfin, -0.1698F, -0.0848F, -0.0848F);
		Leftpelvicfin.setTextureOffset(39, 46).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		Leftpelvicfin.setModelRendererName("Leftpelvicfin");
		this.registerModelRenderer(Leftpelvicfin);

		Rightpelvicfin = new AnimatedModelRenderer(this);
		Rightpelvicfin.setRotationPoint(2.5F, 7.5F, 1.5F);
		Bodymiddle.addChild(Rightpelvicfin);
		setRotationAngle(Rightpelvicfin, -0.1698F, 0.0848F, 0.0848F);
		Rightpelvicfin.setTextureOffset(46, 46).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		Rightpelvicfin.setModelRendererName("Rightpelvicfin");
		this.registerModelRenderer(Rightpelvicfin);

		this.rootBones.add(root);
	}
}