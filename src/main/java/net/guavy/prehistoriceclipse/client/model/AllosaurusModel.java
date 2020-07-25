package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.land.AllosaurusEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class AllosaurusModel extends DinosaurModel<AllosaurusEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer tailbase;
	private final AnimatedModelRenderer tail;
	private final AnimatedModelRenderer tail1;
	private final AnimatedModelRenderer tail2;
	private final AnimatedModelRenderer tail3;
	private final AnimatedModelRenderer tail4;
	private final AnimatedModelRenderer body2;
	private final AnimatedModelRenderer neckbase;
	private final AnimatedModelRenderer neck;
	private final AnimatedModelRenderer neckunder;
	private final AnimatedModelRenderer neckunder2;
	private final AnimatedModelRenderer neckunder3;
	private final AnimatedModelRenderer neckunder4;
	private final AnimatedModelRenderer neck1;
	private final AnimatedModelRenderer neck2;
	private final AnimatedModelRenderer neck3;
	private final AnimatedModelRenderer neck4;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer jawup;
	private final AnimatedModelRenderer jawup1;
	private final AnimatedModelRenderer jawup2;
	private final AnimatedModelRenderer jawup3;
	private final AnimatedModelRenderer Teeth2;
	private final AnimatedModelRenderer jawup4;
	private final AnimatedModelRenderer jawup5;
	private final AnimatedModelRenderer Teeth1;
	private final AnimatedModelRenderer jawdown1;
	private final AnimatedModelRenderer jawdown2;
	private final AnimatedModelRenderer jawdown3;
	private final AnimatedModelRenderer jawdownunder;
	private final AnimatedModelRenderer cheek1;
	private final AnimatedModelRenderer cheek2;
	private final AnimatedModelRenderer EyeRidgeLeft;
	private final AnimatedModelRenderer EyeRidgeRight;
	private final AnimatedModelRenderer rightarm1;
	private final AnimatedModelRenderer rightarm2;
	private final AnimatedModelRenderer rightarm3;
	private final AnimatedModelRenderer hand1;
	private final AnimatedModelRenderer hand6;
	private final AnimatedModelRenderer hand2;
	private final AnimatedModelRenderer hand5;
	private final AnimatedModelRenderer hand3;
	private final AnimatedModelRenderer hand4;
	private final AnimatedModelRenderer leftarm4;
	private final AnimatedModelRenderer leftarm5;
	private final AnimatedModelRenderer leftarm6;
	private final AnimatedModelRenderer hand7;
	private final AnimatedModelRenderer hand8;
	private final AnimatedModelRenderer hand9;
	private final AnimatedModelRenderer hand10;
	private final AnimatedModelRenderer hand11;
	private final AnimatedModelRenderer hand12;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer l4;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer r4;

    public AllosaurusModel()
    {
        textureWidth = 140;
		textureHeight = 130;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 13.2F, 4.3F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, -11.1F, -5.2F);
		root.addChild(body);
		setRotationAngle(body, -0.0412F, 0.0F, 0.0F);
		body.setTextureOffset(103, 109).addBox(-3.5F, 0.0F, 0.0F, 8.0F, 10.0F, 9.0F, 0.0F, true);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		tailbase = new AnimatedModelRenderer(this);
		tailbase.setRotationPoint(0.0F, 4.0F, 8.5F);
		body.addChild(tailbase);
		setRotationAngle(tailbase, 0.0248F, 0.0F, 0.0F);
		tailbase.setTextureOffset(0, 65).addBox(-3.0F, -4.0F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, true);
		tailbase.setModelRendererName("tailbase");
		this.registerModelRenderer(tailbase);

		tail = new AnimatedModelRenderer(this);
		tail.setRotationPoint(0.0F, -0.5F, 3.5F);
		tailbase.addChild(tail);
		setRotationAngle(tail, 0.0815F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 51).addBox(-2.0F, -3.5F, 0.0F, 5.0F, 6.0F, 7.0F, 0.0F, true);
		tail.setModelRendererName("tail");
		this.registerModelRenderer(tail);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(0.0F, -0.5F, 5.7F);
		tail.addChild(tail1);
		setRotationAngle(tail1, -0.0552F, 0.0F, 0.0F);
		tail1.setTextureOffset(0, 39).addBox(-1.5F, -3.0F, 0.0F, 4.0F, 5.0F, 6.0F, 0.0F, true);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.5F, 5.2F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, -0.0314F, 0.0F, 0.0F);
		tail2.setTextureOffset(0, 27).addBox(-1.0F, -2.5F, 0.0F, 3.0F, 4.0F, 7.0F, 0.0F, true);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(0.0F, -0.5F, 6.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, -0.1133F, 0.0F, 0.0F);
		tail3.setTextureOffset(0, 13).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 3.0F, 8.0F, 0.0F, true);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		tail4 = new AnimatedModelRenderer(this);
		tail4.setRotationPoint(0.0F, -0.5F, 7.0F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, -0.1492F, 0.0F, 0.0F);
		tail4.setTextureOffset(0, 0).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 8.0F, 0.0F, true);
		tail4.setModelRendererName("tail4");
		this.registerModelRenderer(tail4);

		body2 = new AnimatedModelRenderer(this);
		body2.setRotationPoint(0.0F, 4.7F, 0.8F);
		body.addChild(body2);
		setRotationAngle(body2, 0.1004F, 0.0F, 0.0F);
		body2.setTextureOffset(73, 112).addBox(-3.0F, -4.5F, -7.0F, 7.0F, 9.0F, 7.0F, 0.0F, true);
		body2.setModelRendererName("body2");
		this.registerModelRenderer(body2);

		neckbase = new AnimatedModelRenderer(this);
		neckbase.setRotationPoint(0.0F, -0.2F, -6.7F);
		body2.addChild(neckbase);
		setRotationAngle(neckbase, 0.014F, 0.0F, 0.0F);
		neckbase.setTextureOffset(23, 0).addBox(-2.5F, -4.0F, -5.0F, 6.0F, 8.0F, 5.0F, 0.0F, true);
		neckbase.setModelRendererName("neckbase");
		this.registerModelRenderer(neckbase);

		neck = new AnimatedModelRenderer(this);
		neck.setRotationPoint(-0.5F, -1.0F, -3.5F);
		neckbase.addChild(neck);
		setRotationAngle(neck, -0.2724F, 0.0F, 0.0F);
		neck.setTextureOffset(94, 32).addBox(-1.0F, -2.5F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		neck.setModelRendererName("neck");
		this.registerModelRenderer(neck);

		neckunder = new AnimatedModelRenderer(this);
		neckunder.setRotationPoint(0.5F, 1.6F, 2.2F);
		neck.addChild(neckunder);
		setRotationAngle(neckunder, -0.5772F, 0.0F, 0.0F);
		neckunder.setTextureOffset(56, 9).addBox(-1.0F, 0.0F, -8.0F, 3.0F, 4.0F, 8.0F, 0.0F, true);
		neckunder.setModelRendererName("neckunder");
		this.registerModelRenderer(neckunder);

		neckunder2 = new AnimatedModelRenderer(this);
		neckunder2.setRotationPoint(0.5F, 0.1F, -3.0F);
		neckunder.addChild(neckunder2);
		setRotationAngle(neckunder2, 0.4048F, 0.0F, 0.0F);
		neckunder2.setTextureOffset(60, 38).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, true);
		neckunder2.setModelRendererName("neckunder2");
		this.registerModelRenderer(neckunder2);

		neckunder3 = new AnimatedModelRenderer(this);
		neckunder3.setRotationPoint(0.0F, 0.0205F, -4.5773F);
		neckunder2.addChild(neckunder3);
		setRotationAngle(neckunder3, 0.2594F, 0.0F, 0.0F);
		neckunder3.setTextureOffset(58, 22).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, true);
		neckunder3.setModelRendererName("neckunder3");
		this.registerModelRenderer(neckunder3);

		neckunder4 = new AnimatedModelRenderer(this);
		neckunder4.setRotationPoint(0.0F, 0.2F, -1.8F);
		neckunder3.addChild(neckunder4);
		setRotationAngle(neckunder4, -0.3007F, 0.0F, 0.0F);
		neckunder4.setTextureOffset(58, 30).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, true);
		neckunder4.setModelRendererName("neckunder4");
		this.registerModelRenderer(neckunder4);

		neck1 = new AnimatedModelRenderer(this);
		neck1.setRotationPoint(0.0F, 0.1F, -3.5F);
		neck.addChild(neck1);
		setRotationAngle(neck1, -0.3002F, 0.0F, 0.0F);
		neck1.setTextureOffset(94, 16).addBox(-1.0F, -2.5F, -3.0F, 4.0F, 4.0F, 3.0F, 0.0F, true);
		neck1.setModelRendererName("neck1");
		this.registerModelRenderer(neck1);

		neck2 = new AnimatedModelRenderer(this);
		neck2.setRotationPoint(0.0F, -2.5F, -3.0F);
		neck1.addChild(neck2);
		setRotationAngle(neck2, 0.1459F, 0.0F, 0.0F);
		neck2.setTextureOffset(94, 24).addBox(-1.0F, 0.0F, -2.5F, 4.0F, 4.0F, 3.0F, 0.0F, true);
		neck2.setModelRendererName("neck2");
		this.registerModelRenderer(neck2);

		neck3 = new AnimatedModelRenderer(this);
		neck3.setRotationPoint(0.0F, 0.0F, -2.4F);
		neck2.addChild(neck3);
		setRotationAngle(neck3, 0.3067F, 0.0F, 0.0F);
		neck3.setTextureOffset(80, 18).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		neck3.setModelRendererName("neck3");
		this.registerModelRenderer(neck3);

		neck4 = new AnimatedModelRenderer(this);
		neck4.setRotationPoint(0.0F, 0.0F, -2.0F);
		neck3.addChild(neck4);
		setRotationAngle(neck4, 0.5255F, 0.0F, 0.0F);
		neck4.setTextureOffset(80, 25).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		neck4.setModelRendererName("neck4");
		this.registerModelRenderer(neck4);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.5F, 2.8382F, -0.9337F);
		neck4.addChild(head);
		setRotationAngle(head, -0.2219F, 0.0F, 0.0F);
		head.setTextureOffset(100, 0).addBox(-2.0F, -2.5F, -4.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		jawup = new AnimatedModelRenderer(this);
		jawup.setRotationPoint(0.0F, -0.7F, -3.6F);
		head.addChild(jawup);
		setRotationAngle(jawup, 0.0911F, 0.0F, 0.0F);
		jawup.setTextureOffset(115, 46).addBox(-1.5F, 0.2F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, true);
		jawup.setModelRendererName("jawup");
		this.registerModelRenderer(jawup);

		jawup1 = new AnimatedModelRenderer(this);
		jawup1.setRotationPoint(0.0F, -1.82F, -1.2F);
		jawup.addChild(jawup1);
		setRotationAngle(jawup1, 0.1117F, 0.0F, 0.0F);
		jawup1.setTextureOffset(115, 52).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		jawup1.setModelRendererName("jawup1");
		this.registerModelRenderer(jawup1);

		jawup2 = new AnimatedModelRenderer(this);
		jawup2.setRotationPoint(0.5F, -1.5F, -4.1F);
		jawup.addChild(jawup2);
		setRotationAngle(jawup2, 0.3513F, 0.0F, 0.0F);
		jawup2.setTextureOffset(115, 59).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		jawup2.setModelRendererName("jawup2");
		this.registerModelRenderer(jawup2);

		jawup3 = new AnimatedModelRenderer(this);
		jawup3.setRotationPoint(0.0F, 0.2F, -3.0F);
		jawup.addChild(jawup3);
		setRotationAngle(jawup3, -0.0927F, 0.0F, 0.0F);
		jawup3.setTextureOffset(115, 64).addBox(-1.0F, 0.0F, -3.8F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		jawup3.setModelRendererName("jawup3");
		this.registerModelRenderer(jawup3);

		Teeth2 = new AnimatedModelRenderer(this);
		Teeth2.setRotationPoint(0.0F, 2.4537F, 0.4188F);
		jawup3.addChild(Teeth2);
		Teeth2.setTextureOffset(126, 9).addBox(-0.5F, -0.6935F, -3.9495F, 2.0F, 1.0F, 4.0F, 0.0F, true);
		Teeth2.setModelRendererName("Teeth2");
		this.registerModelRenderer(Teeth2);

		jawup4 = new AnimatedModelRenderer(this);
		jawup4.setRotationPoint(0.0F, -1.8F, -0.2F);
		jawup.addChild(jawup4);
		setRotationAngle(jawup4, -0.0145F, 0.0F, 0.0F);
		jawup4.setTextureOffset(115, 71).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		jawup4.setModelRendererName("jawup4");
		this.registerModelRenderer(jawup4);

		jawup5 = new AnimatedModelRenderer(this);
		jawup5.setRotationPoint(0.5F, -0.8F, -6.0F);
		jawup.addChild(jawup5);
		setRotationAngle(jawup5, 0.7154F, 0.0F, 0.0F);
		jawup5.setTextureOffset(115, 76).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		jawup5.setModelRendererName("jawup5");
		this.registerModelRenderer(jawup5);

		Teeth1 = new AnimatedModelRenderer(this);
		Teeth1.setRotationPoint(0.0F, 2.7F, 0.0F);
		jawup.addChild(Teeth1);
		Teeth1.setTextureOffset(110, 9).addBox(-1.0F, -0.9783F, -3.1457F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		Teeth1.setModelRendererName("Teeth1");
		this.registerModelRenderer(Teeth1);

		jawdown1 = new AnimatedModelRenderer(this);
		jawdown1.setRotationPoint(0.5F, 1.9F, 0.0F);
		head.addChild(jawdown1);
		setRotationAngle(jawdown1, 0.0121F, 0.0F, 0.0F);
		jawdown1.setTextureOffset(110, 15).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 4.0F, 0.03F, true);
		jawdown1.setModelRendererName("jawdown1");
		this.registerModelRenderer(jawdown1);

		jawdown2 = new AnimatedModelRenderer(this);
		jawdown2.setRotationPoint(0.0F, -0.5F, -3.5F);
		jawdown1.addChild(jawdown2);
		setRotationAngle(jawdown2, 6.4589F, 0.0F, 0.0F);
		jawdown2.setTextureOffset(110, 25).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, 0.03F, true);
		jawdown2.setModelRendererName("jawdown2");
		this.registerModelRenderer(jawdown2);

		jawdown3 = new AnimatedModelRenderer(this);
		jawdown3.setRotationPoint(-0.5F, 0.0F, -3.0F);
		jawdown2.addChild(jawdown3);
		setRotationAngle(jawdown3, 6.1189F, 0.0F, 0.0F);
		jawdown3.setTextureOffset(112, 30).addBox(-0.5F, -0.5F, -3.0F, 2.0F, 1.0F, 4.0F, 0.03F, true);
		jawdown3.setModelRendererName("jawdown3");
		this.registerModelRenderer(jawdown3);

		jawdownunder = new AnimatedModelRenderer(this);
		jawdownunder.setRotationPoint(-0.5F, 1.0F, -0.1F);
		jawdown2.addChild(jawdownunder);
		setRotationAngle(jawdownunder, 6.0371F, 0.0F, 0.0F);
		jawdownunder.setTextureOffset(113, 36).addBox(-0.5F, -0.5F, -6.7F, 2.0F, 1.0F, 7.0F, 0.03F, true);
		jawdownunder.setModelRendererName("jawdownunder");
		this.registerModelRenderer(jawdownunder);

		cheek1 = new AnimatedModelRenderer(this);
		cheek1.setRotationPoint(1.5F, 0.1F, -0.1F);
		jawdown1.addChild(cheek1);
		setRotationAngle(cheek1, -3.3402F, 0.0F, 0.0F);
		cheek1.setTextureOffset(87, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, true);
		cheek1.setModelRendererName("cheek1");
		this.registerModelRenderer(cheek1);

		cheek2 = new AnimatedModelRenderer(this);
		cheek2.setRotationPoint(-1.5F, 0.1F, -0.1F);
		jawdown1.addChild(cheek2);
		setRotationAngle(cheek2, -3.3388F, 0.0F, 0.0F);
		cheek2.setTextureOffset(77, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, true);
		cheek2.setModelRendererName("cheek2");
		this.registerModelRenderer(cheek2);

		EyeRidgeLeft = new AnimatedModelRenderer(this);
		EyeRidgeLeft.setRotationPoint(2.7F, -2.4F, -2.1F);
		head.addChild(EyeRidgeLeft);
		setRotationAngle(EyeRidgeLeft, 3.7924F, 0.3239F, 0.0F);
		EyeRidgeLeft.setTextureOffset(120, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		EyeRidgeLeft.setModelRendererName("EyeRidgeLeft");
		this.registerModelRenderer(EyeRidgeLeft);

		EyeRidgeRight = new AnimatedModelRenderer(this);
		EyeRidgeRight.setRotationPoint(-1.7F, -2.4F, -2.1F);
		head.addChild(EyeRidgeRight);
		setRotationAngle(EyeRidgeRight, 3.7924F, -0.3239F, 0.0F);
		EyeRidgeRight.setTextureOffset(130, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		EyeRidgeRight.setModelRendererName("EyeRidgeRight");
		this.registerModelRenderer(EyeRidgeRight);

		rightarm1 = new AnimatedModelRenderer(this);
		rightarm1.setRotationPoint(-2.0F, 2.1955F, -3.1242F);
		neckbase.addChild(rightarm1);
		setRotationAngle(rightarm1, 0.9809F, 0.0F, 0.4259F);
		rightarm1.setTextureOffset(93, 60).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
		rightarm1.setModelRendererName("rightarm1");
		this.registerModelRenderer(rightarm1);

		rightarm2 = new AnimatedModelRenderer(this);
		rightarm2.setRotationPoint(-0.2819F, 2.6195F, 0.9997F);
		rightarm1.addChild(rightarm2);
		setRotationAngle(rightarm2, -1.216F, -0.2793F, 0.2569F);
		rightarm2.setTextureOffset(96, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		rightarm2.setModelRendererName("rightarm2");
		this.registerModelRenderer(rightarm2);

		rightarm3 = new AnimatedModelRenderer(this);
		rightarm3.setRotationPoint(-0.55F, 3.75F, 0.0F);
		rightarm2.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.3491F, 1.6581F, -0.2618F);
		rightarm3.setTextureOffset(90, 70).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		rightarm3.setModelRendererName("rightarm3");
		this.registerModelRenderer(rightarm3);

		hand1 = new AnimatedModelRenderer(this);
		hand1.setRotationPoint(-0.3F, 1.5F, 0.6F);
		rightarm3.addChild(hand1);
		setRotationAngle(hand1, 0.1367F, 0.0F, -0.4098F);
		hand1.setTextureOffset(97, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand1.setModelRendererName("hand1");
		this.registerModelRenderer(hand1);

		hand6 = new AnimatedModelRenderer(this);
		hand6.setRotationPoint(0.0F, 1.7F, 0.0F);
		hand1.addChild(hand6);
		setRotationAngle(hand6, 0.2998F, 0.0F, 0.0F);
		hand6.setTextureOffset(102, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand6.setModelRendererName("hand6");
		this.registerModelRenderer(hand6);

		hand2 = new AnimatedModelRenderer(this);
		hand2.setRotationPoint(0.3F, 1.5F, 0.6F);
		rightarm3.addChild(hand2);
		setRotationAngle(hand2, 0.0178F, 0.0F, 0.4098F);
		hand2.setTextureOffset(107, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand2.setModelRendererName("hand2");
		this.registerModelRenderer(hand2);

		hand5 = new AnimatedModelRenderer(this);
		hand5.setRotationPoint(0.0F, 1.7F, 0.0F);
		hand2.addChild(hand5);
		setRotationAngle(hand5, 0.2983F, 0.0F, 0.0F);
		hand5.setTextureOffset(97, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand5.setModelRendererName("hand5");
		this.registerModelRenderer(hand5);

		hand3 = new AnimatedModelRenderer(this);
		hand3.setRotationPoint(0.0F, 2.2F, 0.5F);
		rightarm3.addChild(hand3);
		setRotationAngle(hand3, -0.0087F, 0.0F, 0.0F);
		hand3.setTextureOffset(108, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand3.setModelRendererName("hand3");
		this.registerModelRenderer(hand3);

		hand4 = new AnimatedModelRenderer(this);
		hand4.setRotationPoint(0.0F, 1.6F, 0.0F);
		hand3.addChild(hand4);
		setRotationAngle(hand4, 0.3824F, 0.0F, 0.0F);
		hand4.setTextureOffset(102, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		hand4.setModelRendererName("hand4");
		this.registerModelRenderer(hand4);

		leftarm4 = new AnimatedModelRenderer(this);
		leftarm4.setRotationPoint(3.0F, 2.1955F, -3.1242F);
		neckbase.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.9809F, 0.0F, -0.4259F);
		leftarm4.setTextureOffset(93, 60).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		leftarm4.setModelRendererName("leftarm4");
		this.registerModelRenderer(leftarm4);

		leftarm5 = new AnimatedModelRenderer(this);
		leftarm5.setRotationPoint(0.2819F, 2.6195F, 0.9997F);
		leftarm4.addChild(leftarm5);
		setRotationAngle(leftarm5, -1.216F, 0.2793F, -0.2569F);
		leftarm5.setTextureOffset(96, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		leftarm5.setModelRendererName("leftarm5");
		this.registerModelRenderer(leftarm5);

		leftarm6 = new AnimatedModelRenderer(this);
		leftarm6.setRotationPoint(0.55F, 3.75F, 0.0F);
		leftarm5.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.3491F, -1.6581F, 0.2618F);
		leftarm6.setTextureOffset(90, 70).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		leftarm6.setModelRendererName("leftarm6");
		this.registerModelRenderer(leftarm6);

		hand7 = new AnimatedModelRenderer(this);
		hand7.setRotationPoint(0.3F, 1.5F, 0.6F);
		leftarm6.addChild(hand7);
		setRotationAngle(hand7, 0.1367F, 0.0F, 0.4098F);
		hand7.setTextureOffset(97, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand7.setModelRendererName("hand7");
		this.registerModelRenderer(hand7);

		hand8 = new AnimatedModelRenderer(this);
		hand8.setRotationPoint(0.0F, 1.7F, 0.0F);
		hand7.addChild(hand8);
		setRotationAngle(hand8, 0.2998F, 0.0F, 0.0F);
		hand8.setTextureOffset(102, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand8.setModelRendererName("hand8");
		this.registerModelRenderer(hand8);

		hand9 = new AnimatedModelRenderer(this);
		hand9.setRotationPoint(-0.3F, 1.5F, 0.6F);
		leftarm6.addChild(hand9);
		setRotationAngle(hand9, 0.0178F, 0.0F, -0.4098F);
		hand9.setTextureOffset(107, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand9.setModelRendererName("hand9");
		this.registerModelRenderer(hand9);

		hand10 = new AnimatedModelRenderer(this);
		hand10.setRotationPoint(0.0F, 1.7F, 0.0F);
		hand9.addChild(hand10);
		setRotationAngle(hand10, 0.2983F, 0.0F, 0.0F);
		hand10.setTextureOffset(97, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand10.setModelRendererName("hand10");
		this.registerModelRenderer(hand10);

		hand11 = new AnimatedModelRenderer(this);
		hand11.setRotationPoint(0.0F, 2.2F, 0.5F);
		leftarm6.addChild(hand11);
		setRotationAngle(hand11, -0.0087F, 0.0F, 0.0F);
		hand11.setTextureOffset(108, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand11.setModelRendererName("hand11");
		this.registerModelRenderer(hand11);

		hand12 = new AnimatedModelRenderer(this);
		hand12.setRotationPoint(0.0F, 1.6F, 0.0F);
		hand11.addChild(hand12);
		setRotationAngle(hand12, 0.3824F, 0.0F, 0.0F);
		hand12.setTextureOffset(102, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		hand12.setModelRendererName("hand12");
		this.registerModelRenderer(hand12);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(5.6F, 4.3F, 6.0F);
		body.addChild(l1);
		setRotationAngle(l1, -0.39F, 0.0F, 0.0F);
		l1.setTextureOffset(0, 98).addBox(-3.0F, -0.5244F, -3.459F, 3.0F, 9.0F, 7.0F, 0.0F, true);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(-0.5F, 6.5756F, -0.559F);
		l1.addChild(l2);
		setRotationAngle(l2, 1.0718F, 0.0F, 0.0F);
		l2.setTextureOffset(29, 82).addBox(-2.0F, -1.7807F, -2.7927F, 2.0F, 9.0F, 5.0F, 0.0F, true);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.0F, 6.0193F, 0.3073F);
		l2.addChild(l3);
		setRotationAngle(l3, -0.8875F, 0.0F, 0.0F);
		l3.setTextureOffset(2, 86).addBox(-2.02F, -0.0308F, -1.7802F, 2.0F, 7.0F, 3.0F, 0.0F, true);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(-1.0F, 6.2692F, -0.4802F);
		l3.addChild(l4);
		setRotationAngle(l4, 0.2583F, 0.0F, 0.0F);
		l4.setTextureOffset(0, 117).addBox(-1.5F, -0.8226F, -3.0243F, 3.0F, 2.0F, 5.0F, 0.0F, true);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-4.6F, 5.1F, 5.7F);
		body.addChild(r1);
		setRotationAngle(r1, -0.3899F, 0.0F, 0.0F);
		r1.setTextureOffset(21, 98).addBox(0.0F, -1.3786F, -3.4856F, 3.0F, 9.0F, 7.0F, 0.0F, true);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(0.5F, 6.4214F, -0.4856F);
		r1.addChild(r2);
		setRotationAngle(r2, 1.0718F, 0.0F, 0.0F);
		r2.setTextureOffset(44, 82).addBox(0.0F, -2.2035F, -2.2259F, 2.0F, 9.0F, 5.0F, 0.0F, true);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(0.02F, 5.2965F, 0.7741F);
		r2.addChild(r3);
		setRotationAngle(r3, -0.8875F, 0.0F, 0.0F);
		r3.setTextureOffset(13, 86).addBox(0.0F, 0.081F, -1.4844F, 2.0F, 7.0F, 3.0F, 0.0F, true);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(1.0F, 6.281F, 0.1156F);
		r3.addChild(r4);
		setRotationAngle(r4, 0.2583F, 0.0F, 0.0F);
		r4.setTextureOffset(20, 117).addBox(-1.5F, -0.8026F, -3.3399F, 3.0F, 2.0F, 5.0F, 0.0F, true);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		this.rootBones.add(root);
	}
}