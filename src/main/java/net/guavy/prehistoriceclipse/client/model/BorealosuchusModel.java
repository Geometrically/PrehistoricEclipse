package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class BorealosuchusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body1;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer body3;
	private final AnimatedModelRenderer Neckbase;
	private final AnimatedModelRenderer Neck1;
	private final AnimatedModelRenderer Neck2;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer jawup1;
	private final AnimatedModelRenderer snout;
	private final AnimatedModelRenderer teeth;
	private final AnimatedModelRenderer jawdown1;
	private final AnimatedModelRenderer jawdown2;
	private final AnimatedModelRenderer jawdownunder;
	private final AnimatedModelRenderer jawdown3;
	private final AnimatedModelRenderer teeth4;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer jawup2;
	private final AnimatedModelRenderer snout2;
	private final AnimatedModelRenderer snout3;
	private final AnimatedModelRenderer jawup3;
	private final AnimatedModelRenderer teeth3;
	private final AnimatedModelRenderer teeth2;
	private final AnimatedModelRenderer eyes;
	private final AnimatedModelRenderer neckunder2;
	private final AnimatedModelRenderer neckunder3;
	private final AnimatedModelRenderer neckunder1;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer tail1;
	private final AnimatedModelRenderer tail_1;
	private final AnimatedModelRenderer tail_2;
	private final AnimatedModelRenderer tail_3;
	private final AnimatedModelRenderer tail_4;
	private final AnimatedModelRenderer tail6;
	private final AnimatedModelRenderer scute8;
	private final AnimatedModelRenderer scute7;
	private final AnimatedModelRenderer scute5;
	private final AnimatedModelRenderer scute6;
	private final AnimatedModelRenderer scute3;
	private final AnimatedModelRenderer scute9;
	private final AnimatedModelRenderer scute2;
	private final AnimatedModelRenderer scute4;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer r5;
	private final AnimatedModelRenderer r6;
	private final AnimatedModelRenderer l4;
	private final AnimatedModelRenderer l5;
	private final AnimatedModelRenderer l6;

    public BorealosuchusModel()
    {
        textureWidth = 128;
		textureHeight = 128;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, -0.2F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body1 = new AnimatedModelRenderer(this);
		Body1.setRotationPoint(2.0F, 11.3F, 6.3F);
		root.addChild(Body1);
		setRotationAngle(Body1, -0.0119F, 0.0F, 0.0F);
		Body1.setTextureOffset(0, 0).addBox(-8.0F, -6.0202F, -7.3001F, 12.0F, 13.0F, 13.0F, 0.0F, false);
		Body1.setModelRendererName("Body1");
		this.registerModelRenderer(Body1);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(-2.0F, -0.2202F, -6.5001F);
		Body1.addChild(Body2);
		setRotationAngle(Body2, 0.1133F, 0.0F, 0.0F);
		Body2.setTextureOffset(34, 38).addBox(-5.5F, -5.6635F, -11.3557F, 11.0F, 12.0F, 12.0F, 0.0F, false);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		body3 = new AnimatedModelRenderer(this);
		body3.setRotationPoint(-0.2F, -1.3635F, -10.8557F);
		Body2.addChild(body3);
		setRotationAngle(body3, -0.0157F, 0.0F, 0.0F);
		body3.setTextureOffset(66, 0).addBox(-4.3F, -4.0998F, -7.3251F, 9.0F, 11.0F, 8.0F, 0.0F, false);
		body3.setModelRendererName("body3");
		this.registerModelRenderer(body3);

		Neckbase = new AnimatedModelRenderer(this);
		Neckbase.setRotationPoint(0.2F, -1.4998F, -6.0251F);
		body3.addChild(Neckbase);
		setRotationAngle(Neckbase, -0.1568F, 0.0F, 0.0F);
		Neckbase.setTextureOffset(88, 45).addBox(-3.0F, -2.5302F, -4.5674F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		Neckbase.setModelRendererName("Neckbase");
		this.registerModelRenderer(Neckbase);

		Neck1 = new AnimatedModelRenderer(this);
		Neck1.setRotationPoint(0.0F, -0.0302F, -4.1674F);
		Neckbase.addChild(Neck1);
		setRotationAngle(Neck1, -0.0796F, 0.0F, 0.0F);
		Neck1.setTextureOffset(99, 55).addBox(-3.0F, -2.4921F, -3.6988F, 6.0F, 5.0F, 4.0F, -0.01F, false);
		Neck1.setModelRendererName("Neck1");
		this.registerModelRenderer(Neck1);

		Neck2 = new AnimatedModelRenderer(this);
		Neck2.setRotationPoint(0.0F, -0.3121F, -2.9988F);
		Neck1.addChild(Neck2);
		setRotationAngle(Neck2, 0.2372F, 0.0F, 0.0F);
		Neck2.setTextureOffset(56, 0).addBox(-3.0F, -2.2785F, -2.9071F, 6.0F, 5.0F, 3.0F, 0.0F, false);
		Neck2.setModelRendererName("Neck2");
		this.registerModelRenderer(Neck2);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(-0.1F, 0.1215F, -2.1071F);
		Neck2.addChild(head);
		setRotationAngle(head, -2.9674F, 0.0F, 0.0F);
		head.setTextureOffset(97, 97).addBox(-3.4F, -2.5F, 0.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		jawup1 = new AnimatedModelRenderer(this);
		jawup1.setRotationPoint(3.1F, -2.5F, 3.8F);
		head.addChild(jawup1);
		setRotationAngle(jawup1, -0.015F, 0.0F, 0.0F);
		jawup1.setTextureOffset(95, 80).addBox(-6.0F, 0.0F, -0.1F, 6.0F, 3.0F, 5.0F, 0.0F, false);
		jawup1.setModelRendererName("jawup1");
		this.registerModelRenderer(jawup1);

		snout = new AnimatedModelRenderer(this);
		snout.setRotationPoint(-0.5F, 3.2F, -0.1F);
		jawup1.addChild(snout);
		setRotationAngle(snout, 0.129F, 0.0F, 0.0F);
		snout.setTextureOffset(36, 101).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		snout.setModelRendererName("snout");
		this.registerModelRenderer(snout);

		teeth = new AnimatedModelRenderer(this);
		teeth.setRotationPoint(0.0F, -1.0F, 0.0F);
		jawup1.addChild(teeth);
		setRotationAngle(teeth, -0.015F, 0.0F, 0.0F);
		teeth.setTextureOffset(100, 8).addBox(-6.0F, 0.0F, -0.1F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		teeth.setModelRendererName("teeth");
		this.registerModelRenderer(teeth);

		jawdown1 = new AnimatedModelRenderer(this);
		jawdown1.setRotationPoint(0.1F, -3.4F, 0.2F);
		head.addChild(jawdown1);
		setRotationAngle(jawdown1, -3.1148F, 0.0F, 0.0F);
		jawdown1.setTextureOffset(101, 88).addBox(-3.0F, -1.1511F, -3.6726F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		jawdown1.setModelRendererName("jawdown1");
		this.registerModelRenderer(jawdown1);

		jawdown2 = new AnimatedModelRenderer(this);
		jawdown2.setRotationPoint(1.0F, -0.7511F, -2.7726F);
		jawdown1.addChild(jawdown2);
		setRotationAngle(jawdown2, 6.3628F, 0.0F, 0.0F);
		jawdown2.setTextureOffset(32, 81).addBox(-3.5F, -0.5F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		jawdown2.setModelRendererName("jawdown2");
		this.registerModelRenderer(jawdown2);

		jawdownunder = new AnimatedModelRenderer(this);
		jawdownunder.setRotationPoint(-0.5F, 1.0F, -0.9F);
		jawdown2.addChild(jawdownunder);
		setRotationAngle(jawdownunder, 6.0496F, 0.0F, 0.0F);
		jawdownunder.setTextureOffset(66, 21).addBox(-2.5F, -0.5F, -13.0F, 4.0F, 1.0F, 13.0F, -0.02F, false);
		jawdownunder.setModelRendererName("jawdownunder");
		this.registerModelRenderer(jawdownunder);

		jawdown3 = new AnimatedModelRenderer(this);
		jawdown3.setRotationPoint(-0.5F, -0.1F, -4.0F);
		jawdown2.addChild(jawdown3);
		setRotationAngle(jawdown3, 6.0875F, 0.0F, 0.0F);
		jawdown3.setTextureOffset(41, 81).addBox(-2.5F, -0.5F, -8.5F, 4.0F, 1.0F, 9.0F, 0.01F, false);
		jawdown3.setModelRendererName("jawdown3");
		this.registerModelRenderer(jawdown3);

		teeth4 = new AnimatedModelRenderer(this);
		teeth4.setRotationPoint(1.5F, -0.4F, -0.8F);
		jawdown3.addChild(teeth4);
		setRotationAngle(teeth4, -3.1416F, 0.0F, 0.0F);
		teeth4.setTextureOffset(15, 81).addBox(-4.0F, 0.0F, -0.1F, 4.0F, 1.0F, 9.0F, 0.0F, false);
		teeth4.setModelRendererName("teeth4");
		this.registerModelRenderer(teeth4);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(-2.9F, -1.2F, 0.0F);
		jawdown2.addChild(bone);
		setRotationAngle(bone, -0.1047F, -0.0873F, 0.0F);
		bone.setTextureOffset(100, 8).addBox(-0.5F, -0.1405F, -4.7274F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(0.9F, -1.2F, 0.0F);
		jawdown2.addChild(bone2);
		setRotationAngle(bone2, -0.1047F, 0.0873F, 0.0F);
		bone2.setTextureOffset(100, 8).addBox(-0.5F, -0.1405F, -4.7274F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		jawup2 = new AnimatedModelRenderer(this);
		jawup2.setRotationPoint(2.6F, -2.3F, 7.8F);
		head.addChild(jawup2);
		setRotationAngle(jawup2, -0.2374F, 0.0F, 0.0F);
		jawup2.setTextureOffset(16, 100).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		jawup2.setModelRendererName("jawup2");
		this.registerModelRenderer(jawup2);

		snout2 = new AnimatedModelRenderer(this);
		snout2.setRotationPoint(0.0F, 2.5F, 0.0F);
		jawup2.addChild(snout2);
		setRotationAngle(snout2, 0.2484F, 0.0F, 0.0F);
		snout2.setTextureOffset(37, 0).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 9.0F, -0.01F, false);
		snout2.setModelRendererName("snout2");
		this.registerModelRenderer(snout2);

		snout3 = new AnimatedModelRenderer(this);
		snout3.setRotationPoint(0.0F, 2.0F, 9.0F);
		snout2.addChild(snout3);
		setRotationAngle(snout3, 2.0619F, 0.0F, 0.0F);
		snout3.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		snout3.setModelRendererName("snout3");
		this.registerModelRenderer(snout3);

		jawup3 = new AnimatedModelRenderer(this);
		jawup3.setRotationPoint(0.0F, -0.3F, 3.6F);
		jawup2.addChild(jawup3);
		setRotationAngle(jawup3, 0.1719F, 0.0F, 0.0F);
		jawup3.setTextureOffset(14, 91).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 3.0F, 6.0F, 0.01F, false);
		jawup3.setModelRendererName("jawup3");
		this.registerModelRenderer(jawup3);

		teeth3 = new AnimatedModelRenderer(this);
		teeth3.setRotationPoint(0.0F, -1.0F, 1.0F);
		jawup3.addChild(teeth3);
		setRotationAngle(teeth3, -0.015F, 0.0F, 0.0F);
		teeth3.setTextureOffset(101, 14).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		teeth3.setModelRendererName("teeth3");
		this.registerModelRenderer(teeth3);

		teeth2 = new AnimatedModelRenderer(this);
		teeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
		jawup2.addChild(teeth2);
		setRotationAngle(teeth2, 0.0031F, 0.0F, 0.0F);
		teeth2.setTextureOffset(71, 101).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		teeth2.setModelRendererName("teeth2");
		this.registerModelRenderer(teeth2);

		eyes = new AnimatedModelRenderer(this);
		eyes.setRotationPoint(0.1F, -0.7F, -0.1F);
		head.addChild(eyes);
		setRotationAngle(eyes, -0.1599F, 0.0F, 0.0F);
		eyes.setTextureOffset(92, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 5.0F, 0.0F, false);
		eyes.setModelRendererName("eyes");
		this.registerModelRenderer(eyes);

		neckunder2 = new AnimatedModelRenderer(this);
		neckunder2.setRotationPoint(0.5F, 2.2079F, 0.4012F);
		Neck1.addChild(neckunder2);
		setRotationAngle(neckunder2, -0.182F, 0.0F, 0.0F);
		neckunder2.setTextureOffset(56, 95).addBox(-3.0F, 0.0F, -4.0F, 5.0F, 5.0F, 5.0F, 0.01F, false);
		neckunder2.setModelRendererName("neckunder2");
		this.registerModelRenderer(neckunder2);

		neckunder3 = new AnimatedModelRenderer(this);
		neckunder3.setRotationPoint(0.0F, 0.2F, -2.6F);
		neckunder2.addChild(neckunder3);
		setRotationAngle(neckunder3, -0.2731F, 0.0F, 0.0F);
		neckunder3.setTextureOffset(92, 35).addBox(-3.0F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		neckunder3.setModelRendererName("neckunder3");
		this.registerModelRenderer(neckunder3);

		neckunder1 = new AnimatedModelRenderer(this);
		neckunder1.setRotationPoint(0.5F, 1.4975F, -0.675F);
		Neckbase.addChild(neckunder1);
		setRotationAngle(neckunder1, 0.1922F, 0.0F, 0.0F);
		neckunder1.setTextureOffset(36, 91).addBox(-3.0F, 0.0F, -4.6F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		neckunder1.setModelRendererName("neckunder1");
		this.registerModelRenderer(neckunder1);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-3.4F, 5.0984F, -3.1679F);
		body3.addChild(r1);
		setRotationAngle(r1, 0.8713F, -0.2978F, 0.3648F);
		r1.setTextureOffset(87, 19).addBox(-2.3977F, -1.1181F, -2.545F, 4.0F, 7.0F, 6.0F, 0.0F, false);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(-0.5658F, 3.6855F, -0.0105F);
		r1.addChild(r2);
		setRotationAngle(r2, -1.5532F, 0.1367F, -0.3482F);
		r2.setTextureOffset(0, 95).addBox(-1.0459F, -0.5589F, -2.1382F, 3.0F, 7.0F, 5.0F, 0.0F, false);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(-0.1459F, 6.4411F, 0.2618F);
		r2.addChild(r3);
		setRotationAngle(r3, 0.5618F, -0.1143F, -0.3161F);
		r3.setTextureOffset(89, 67).addBox(-1.4199F, -0.8939F, -4.9325F, 4.0F, 2.0F, 7.0F, 0.0F, false);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(3.8F, 5.0984F, -3.1679F);
		body3.addChild(l1);
		setRotationAngle(l1, 0.8713F, 0.2978F, -0.3648F);
		l1.setTextureOffset(87, 19).addBox(-1.6023F, -1.1181F, -2.545F, 4.0F, 7.0F, 6.0F, 0.0F, true);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(0.5658F, 3.6855F, -0.0105F);
		l1.addChild(l2);
		setRotationAngle(l2, -1.5532F, -0.1367F, 0.3482F);
		l2.setTextureOffset(0, 95).addBox(-1.9541F, -0.5589F, -2.1382F, 3.0F, 7.0F, 5.0F, 0.0F, true);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.1459F, 6.4411F, 0.2618F);
		l2.addChild(l3);
		setRotationAngle(l3, 0.5618F, 0.1143F, 0.3161F);
		l3.setTextureOffset(89, 67).addBox(-2.5801F, -0.8939F, -4.9325F, 4.0F, 2.0F, 7.0F, 0.0F, true);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(-1.5F, -0.9202F, 5.3999F);
		Body1.addChild(tail1);
		setRotationAngle(tail1, -0.1367F, 0.0F, 0.0F);
		tail1.setTextureOffset(0, 26).addBox(-6.0F, -4.7548F, -1.7832F, 11.0F, 12.0F, 12.0F, 0.0F, false);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail_1 = new AnimatedModelRenderer(this);
		tail_1.setRotationPoint(0.0F, -0.1548F, 9.2168F);
		tail1.addChild(tail_1);
		setRotationAngle(tail_1, -0.2775F, 0.0F, 0.0F);
		tail_1.setTextureOffset(0, 50).addBox(-5.0F, -4.3464F, -0.3835F, 9.0F, 9.0F, 12.0F, 0.0F, false);
		tail_1.setModelRendererName("tail_1");
		this.registerModelRenderer(tail_1);

		tail_2 = new AnimatedModelRenderer(this);
		tail_2.setRotationPoint(0.0F, -0.3464F, 10.3165F);
		tail_1.addChild(tail_2);
		setRotationAngle(tail_2, 0.0707F, 0.0F, 0.0F);
		tail_2.setTextureOffset(37, 13).addBox(-4.5F, -3.8965F, 0.0989F, 8.0F, 8.0F, 13.0F, 0.0F, false);
		tail_2.setModelRendererName("tail_2");
		this.registerModelRenderer(tail_2);

		tail_3 = new AnimatedModelRenderer(this);
		tail_3.setRotationPoint(0.0F, -1.2965F, 11.5989F);
		tail_2.addChild(tail_3);
		setRotationAngle(tail_3, 0.2395F, 0.0F, 0.0F);
		tail_3.setTextureOffset(30, 62).addBox(-4.0F, -2.0F, 0.0F, 7.0F, 7.0F, 12.0F, 0.0F, false);
		tail_3.setModelRendererName("tail_3");
		this.registerModelRenderer(tail_3);

		tail_4 = new AnimatedModelRenderer(this);
		tail_4.setRotationPoint(0.0F, 0.3F, 11.0F);
		tail_3.addChild(tail_4);
		setRotationAngle(tail_4, 0.0972F, 0.0F, 0.0F);
		tail_4.setTextureOffset(68, 68).addBox(-3.0F, -1.9976F, 0.0485F, 5.0F, 6.0F, 11.0F, 0.0F, false);
		tail_4.setModelRendererName("tail_4");
		this.registerModelRenderer(tail_4);

		tail6 = new AnimatedModelRenderer(this);
		tail6.setRotationPoint(-0.5F, -0.1976F, 9.8485F);
		tail_4.addChild(tail6);
		setRotationAngle(tail6, 0.0358F, 0.0F, 0.0F);
		tail6.setTextureOffset(69, 51).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);
		tail6.setModelRendererName("tail6");
		this.registerModelRenderer(tail6);

		scute8 = new AnimatedModelRenderer(this);
		scute8.setRotationPoint(0.0F, -0.6F, 4.9F);
		tail6.addChild(scute8);
		setRotationAngle(scute8, -0.0284F, 0.0F, 0.0F);
		scute8.setTextureOffset(56, 56).addBox(0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 11.0F, 0.0F, false);
		scute8.setModelRendererName("scute8");
		this.registerModelRenderer(scute8);

		scute7 = new AnimatedModelRenderer(this);
		scute7.setRotationPoint(-0.5F, -1.0976F, 4.9485F);
		tail_4.addChild(scute7);
		setRotationAngle(scute7, -0.0284F, 0.0F, 0.0F);
		scute7.setTextureOffset(0, 81).addBox(0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 10.0F, 0.0F, false);
		scute7.setModelRendererName("scute7");
		this.registerModelRenderer(scute7);

		scute5 = new AnimatedModelRenderer(this);
		scute5.setRotationPoint(0.0F, -1.0F, 6.0F);
		tail_3.addChild(scute5);
		setRotationAngle(scute5, 0.0F, -0.0944F, -0.2731F);
		
		scute5.setModelRendererName("scute5");
		this.registerModelRenderer(scute5);

		scute6 = new AnimatedModelRenderer(this);
		scute6.setRotationPoint(-0.5F, -1.0F, 6.0F);
		tail_3.addChild(scute6);
		scute6.setTextureOffset(0, 73).addBox(0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 10.0F, 0.0F, false);
		scute6.setModelRendererName("scute6");
		this.registerModelRenderer(scute6);

		scute3 = new AnimatedModelRenderer(this);
		scute3.setRotationPoint(-1.1F, -2.3965F, 5.0989F);
		tail_2.addChild(scute3);
		setRotationAngle(scute3, 0.0F, 0.1395F, -0.2731F);
		scute3.setTextureOffset(0, 67).addBox(0.1195F, -4.3611F, -4.1238F, 0.0F, 4.0F, 12.0F, 0.0F, false);
		scute3.setModelRendererName("scute3");
		this.registerModelRenderer(scute3);

		scute9 = new AnimatedModelRenderer(this);
		scute9.setRotationPoint(0.1F, -2.3965F, 5.0989F);
		tail_2.addChild(scute9);
		setRotationAngle(scute9, 0.0F, -0.1395F, 0.2731F);
		scute9.setTextureOffset(0, 67).addBox(-0.1195F, -4.3611F, -4.1238F, 0.0F, 4.0F, 12.0F, 0.0F, true);
		scute9.setModelRendererName("scute9");
		this.registerModelRenderer(scute9);

		scute2 = new AnimatedModelRenderer(this);
		scute2.setRotationPoint(-2.5F, -2.3464F, 3.6165F);
		tail_1.addChild(scute2);
		setRotationAngle(scute2, 0.0F, 0.0F, -0.3173F);
		scute2.setTextureOffset(34, 22).addBox(0.9874F, -4.4425F, -4.3306F, 0.0F, 4.0F, 12.0F, 0.0F, false);
		scute2.setModelRendererName("scute2");
		this.registerModelRenderer(scute2);

		scute4 = new AnimatedModelRenderer(this);
		scute4.setRotationPoint(1.5F, -2.3464F, 3.6165F);
		tail_1.addChild(scute4);
		setRotationAngle(scute4, 0.0F, 0.0F, 0.3173F);
		scute4.setTextureOffset(34, 22).addBox(-0.9874F, -4.4425F, -4.3306F, 0.0F, 4.0F, 12.0F, 0.0F, true);
		scute4.setModelRendererName("scute4");
		this.registerModelRenderer(scute4);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(-6.3F, 1.7518F, 7.228F);
		tail1.addChild(r4);
		setRotationAngle(r4, -0.7793F, 0.0524F, 0.2793F);
		r4.setTextureOffset(68, 35).addBox(-1.6135F, -1.2938F, -3.626F, 4.0F, 7.0F, 8.0F, 0.0F, false);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		r5 = new AnimatedModelRenderer(this);
		r5.setRotationPoint(-0.1255F, 3.3309F, -1.3632F);
		r4.addChild(r5);
		setRotationAngle(r5, 1.1217F, 0.0799F, -0.1916F);
		r5.setTextureOffset(83, 85).addBox(-1.217F, -0.1645F, -2.603F, 3.0F, 10.0F, 6.0F, 0.0F, false);
		r5.setModelRendererName("r5");
		this.registerModelRenderer(r5);

		r6 = new AnimatedModelRenderer(this);
		r6.setRotationPoint(0.0588F, 9.0968F, 0.0277F);
		r5.addChild(r6);
		setRotationAngle(r6, -0.192F, 0.0346F, -0.0576F);
		r6.setTextureOffset(59, 85).addBox(-1.576F, -0.8197F, -5.2849F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		r6.setModelRendererName("r6");
		this.registerModelRenderer(r6);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(5.3F, 1.7518F, 7.228F);
		tail1.addChild(l4);
		setRotationAngle(l4, -0.7793F, -0.0524F, -0.2793F);
		l4.setTextureOffset(68, 35).addBox(-2.3865F, -1.2938F, -3.626F, 4.0F, 7.0F, 8.0F, 0.0F, true);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		l5 = new AnimatedModelRenderer(this);
		l5.setRotationPoint(0.1255F, 3.3309F, -1.3632F);
		l4.addChild(l5);
		setRotationAngle(l5, 1.1217F, -0.0799F, 0.1916F);
		l5.setTextureOffset(83, 85).addBox(-1.783F, -0.1645F, -2.603F, 3.0F, 10.0F, 6.0F, 0.0F, true);
		l5.setModelRendererName("l5");
		this.registerModelRenderer(l5);

		l6 = new AnimatedModelRenderer(this);
		l6.setRotationPoint(-0.0588F, 9.0968F, 0.0277F);
		l5.addChild(l6);
		setRotationAngle(l6, -0.192F, -0.0346F, 0.0576F);
		l6.setTextureOffset(59, 85).addBox(-2.424F, -0.8197F, -5.2849F, 4.0F, 2.0F, 8.0F, 0.0F, true);
		l6.setModelRendererName("l6");
		this.registerModelRenderer(l6);

		this.rootBones.add(root);
	}
}