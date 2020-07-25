package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class TyrannosaurusModel extends DinosaurModel<DinosaurEntity> {

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
	private final AnimatedModelRenderer neck1;
	private final AnimatedModelRenderer neck2;
	private final AnimatedModelRenderer neck3;
	private final AnimatedModelRenderer neck4;
	private final AnimatedModelRenderer neck5;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer jawup;
	private final AnimatedModelRenderer jawup1;
	private final AnimatedModelRenderer keratinridge1;
	private final AnimatedModelRenderer keratinridge2;
	private final AnimatedModelRenderer jawup2;
	private final AnimatedModelRenderer jawup5;
	private final AnimatedModelRenderer jawup3;
	private final AnimatedModelRenderer teeth;
	private final AnimatedModelRenderer teeth2;
	private final AnimatedModelRenderer jawdown1;
	private final AnimatedModelRenderer jawdown2;
	private final AnimatedModelRenderer jawdown3;
	private final AnimatedModelRenderer teeth3;
	private final AnimatedModelRenderer teeth4;
	private final AnimatedModelRenderer cheek2;
	private final AnimatedModelRenderer cheek3;
	private final AnimatedModelRenderer keratin4;
	private final AnimatedModelRenderer keratin2;
	private final AnimatedModelRenderer keratin5;
	private final AnimatedModelRenderer keratin3;
	private final AnimatedModelRenderer keratin6;
	private final AnimatedModelRenderer keratin7;
	private final AnimatedModelRenderer neckunder;
	private final AnimatedModelRenderer neckunder2;
	private final AnimatedModelRenderer neckunder3;
	private final AnimatedModelRenderer neckunder4;
	private final AnimatedModelRenderer Lowerarmleft;
	private final AnimatedModelRenderer Handleft;
	private final AnimatedModelRenderer Finger1upperleft;
	private final AnimatedModelRenderer Fingerupperleft;
	private final AnimatedModelRenderer Finger1middleleft;
	private final AnimatedModelRenderer Fingermiddleleft;
	private final AnimatedModelRenderer Lowerarmright;
	private final AnimatedModelRenderer Handright;
	private final AnimatedModelRenderer Finger1upperright;
	private final AnimatedModelRenderer Fingerupperright;
	private final AnimatedModelRenderer Finger1middleright;
	private final AnimatedModelRenderer Fingermiddleright;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer l4;
	private final AnimatedModelRenderer bone;

    public TyrannosaurusModel()
    {
        textureWidth = 96;
		textureHeight = 96;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 6.3F, 0.0F);
		root.addChild(body);
		setRotationAngle(body, -0.0192F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.5F, -5.5993F, -5.3083F, 9.0F, 13.0F, 10.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		tailbase = new AnimatedModelRenderer(this);
		tailbase.setRotationPoint(0.0F, -1.5993F, 3.9917F);
		body.addChild(tailbase);
		setRotationAngle(tailbase, 0.0911F, 0.0F, 0.0F);
		tailbase.setTextureOffset(26, 48).addBox(-3.5F, -4.0F, 0.0F, 7.0F, 10.0F, 5.0F, 0.0F, false);
		tailbase.setModelRendererName("tailbase");
		this.registerModelRenderer(tailbase);

		tail = new AnimatedModelRenderer(this);
		tail.setRotationPoint(0.0F, -0.4F, 3.7F);
		tailbase.addChild(tail);
		setRotationAngle(tail, 0.0258F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 42).addBox(-3.0F, -3.5F, 0.0F, 6.0F, 8.0F, 7.0F, 0.0F, false);
		tail.setModelRendererName("tail");
		this.registerModelRenderer(tail);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(0.0F, -0.4F, 5.8F);
		tail.addChild(tail1);
		setRotationAngle(tail1, -0.075F, 0.0F, 0.0F);
		tail1.setTextureOffset(60, 11).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.4F, 5.2F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, -0.014F, 0.0F, 0.0F);
		tail2.setTextureOffset(0, 57).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 7.0F, 0.0F, false);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(0.0F, -0.4F, 5.8F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, -0.063F, 0.0F, 0.0F);
		tail3.setTextureOffset(56, 32).addBox(-1.5F, -1.9496F, -0.7984F, 3.0F, 4.0F, 8.0F, 0.0F, false);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		tail4 = new AnimatedModelRenderer(this);
		tail4.setRotationPoint(0.0F, -0.4496F, 6.7016F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, -0.0969F, 0.0F, 0.0F);
		tail4.setTextureOffset(14, 61).addBox(-1.0F, -1.3549F, -1.493F, 2.0F, 3.0F, 8.0F, 0.0F, false);
		tail4.setModelRendererName("tail4");
		this.registerModelRenderer(tail4);

		body2 = new AnimatedModelRenderer(this);
		body2.setRotationPoint(0.0F, -0.3993F, -5.0083F);
		body.addChild(body2);
		setRotationAngle(body2, 0.0106F, 0.0F, 0.0F);
		body2.setTextureOffset(0, 23).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 12.0F, 7.0F, 0.0F, false);
		body2.setModelRendererName("body2");
		this.registerModelRenderer(body2);

		neckbase = new AnimatedModelRenderer(this);
		neckbase.setRotationPoint(0.0F, -0.3F, -6.6F);
		body2.addChild(neckbase);
		setRotationAngle(neckbase, 0.026F, 0.0F, 0.0F);
		neckbase.setTextureOffset(38, 0).addBox(-3.5F, -4.5F, -6.0F, 7.0F, 11.0F, 6.0F, 0.0F, false);
		neckbase.setModelRendererName("neckbase");
		this.registerModelRenderer(neckbase);

		neck = new AnimatedModelRenderer(this);
		neck.setRotationPoint(0.0F, -1.6F, -4.6F);
		neckbase.addChild(neck);
		setRotationAngle(neck, -0.2806F, 0.0F, 0.0F);
		neck.setTextureOffset(66, 71).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		neck.setModelRendererName("neck");
		this.registerModelRenderer(neck);

		neck1 = new AnimatedModelRenderer(this);
		neck1.setRotationPoint(0.0F, 0.1F, -2.3F);
		neck.addChild(neck1);
		setRotationAngle(neck1, -0.2798F, 0.0F, 0.0F);
		neck1.setTextureOffset(70, 31).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 3.0F, -0.02F, false);
		neck1.setModelRendererName("neck1");
		this.registerModelRenderer(neck1);

		neck2 = new AnimatedModelRenderer(this);
		neck2.setRotationPoint(0.0F, -0.2F, -2.4F);
		neck1.addChild(neck2);
		setRotationAngle(neck2, -0.255F, 0.0F, 0.0F);
		neck2.setTextureOffset(64, 0).addBox(-2.5F, -2.2344F, -3.6325F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		neck2.setModelRendererName("neck2");
		this.registerModelRenderer(neck2);

		neck3 = new AnimatedModelRenderer(this);
		neck3.setRotationPoint(0.0F, -0.2344F, -2.9325F);
		neck2.addChild(neck3);
		setRotationAngle(neck3, 0.3607F, 0.0F, 0.0F);
		neck3.setTextureOffset(76, 61).addBox(-2.5F, -2.1183F, -1.9491F, 5.0F, 5.0F, 2.0F, -0.02F, false);
		neck3.setModelRendererName("neck3");
		this.registerModelRenderer(neck3);

		neck4 = new AnimatedModelRenderer(this);
		neck4.setRotationPoint(0.0F, 0.3817F, -0.9491F);
		neck3.addChild(neck4);
		setRotationAngle(neck4, 0.4011F, 0.0F, 0.0F);
		neck4.setTextureOffset(76, 9).addBox(-2.5F, -2.692F, -1.9446F, 5.0F, 5.0F, 2.0F, 0.01F, false);
		neck4.setModelRendererName("neck4");
		this.registerModelRenderer(neck4);

		neck5 = new AnimatedModelRenderer(this);
		neck5.setRotationPoint(0.0F, -0.792F, -1.1446F);
		neck4.addChild(neck5);
		setRotationAngle(neck5, 0.4883F, 0.0F, 0.0F);
		neck5.setTextureOffset(46, 75).addBox(-2.5F, -2.0532F, -1.8151F, 5.0F, 5.0F, 2.0F, 0.02F, false);
		neck5.setModelRendererName("neck5");
		this.registerModelRenderer(neck5);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, 0.6468F, -1.0151F);
		neck5.addChild(head);
		setRotationAngle(head, -0.1876F, 0.0F, 0.0F);
		head.setTextureOffset(68, 23).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 3.0F, 0.02F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		jawup = new AnimatedModelRenderer(this);
		jawup.setRotationPoint(0.0F, -0.8F, -2.7F);
		head.addChild(jawup);
		setRotationAngle(jawup, 0.1073F, 0.0F, 0.0F);
		jawup.setTextureOffset(48, 68).addBox(-2.5F, 0.2F, -4.0F, 5.0F, 3.0F, 4.0F, 0.02F, false);
		jawup.setModelRendererName("jawup");
		this.registerModelRenderer(jawup);

		jawup1 = new AnimatedModelRenderer(this);
		jawup1.setRotationPoint(0.0F, -1.6F, 0.3F);
		jawup.addChild(jawup1);
		setRotationAngle(jawup1, 0.066F, 0.0F, 0.0F);
		jawup1.setTextureOffset(75, 41).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.02F, false);
		jawup1.setModelRendererName("jawup1");
		this.registerModelRenderer(jawup1);

		keratinridge1 = new AnimatedModelRenderer(this);
		keratinridge1.setRotationPoint(-1.9F, 0.0F, -1.0F);
		jawup1.addChild(keratinridge1);
		setRotationAngle(keratinridge1, -0.04F, -0.1426F, 0.2618F);
		keratinridge1.setTextureOffset(28, 6).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.02F, false);
		keratinridge1.setModelRendererName("keratinridge1");
		this.registerModelRenderer(keratinridge1);

		keratinridge2 = new AnimatedModelRenderer(this);
		keratinridge2.setRotationPoint(1.9F, 0.0F, -1.0F);
		jawup1.addChild(keratinridge2);
		setRotationAngle(keratinridge2, -0.04F, 0.1426F, -0.2618F);
		keratinridge2.setTextureOffset(0, 5).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.02F, false);
		keratinridge2.setModelRendererName("keratinridge2");
		this.registerModelRenderer(keratinridge2);

		jawup2 = new AnimatedModelRenderer(this);
		jawup2.setRotationPoint(0.5F, -1.4F, -2.7F);
		jawup.addChild(jawup2);
		setRotationAngle(jawup2, -0.0706F, 0.0F, 0.0F);
		jawup2.setTextureOffset(28, 0).addBox(-2.5F, 0.0F, -2.9F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		jawup2.setModelRendererName("jawup2");
		this.registerModelRenderer(jawup2);

		jawup5 = new AnimatedModelRenderer(this);
		jawup5.setRotationPoint(-0.5F, 0.0F, -2.9F);
		jawup2.addChild(jawup5);
		setRotationAngle(jawup5, 0.8241F, 0.0F, 0.0F);
		jawup5.setTextureOffset(30, 35).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		jawup5.setModelRendererName("jawup5");
		this.registerModelRenderer(jawup5);

		jawup3 = new AnimatedModelRenderer(this);
		jawup3.setRotationPoint(0.0F, 1.4F, -2.9F);
		jawup.addChild(jawup3);
		setRotationAngle(jawup3, -0.3525F, 0.0F, 0.0F);
		jawup3.setTextureOffset(16, 72).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 3.0F, 4.0F, 0.02F, false);
		jawup3.setModelRendererName("jawup3");
		this.registerModelRenderer(jawup3);

		teeth = new AnimatedModelRenderer(this);
		teeth.setRotationPoint(0.5F, 2.9F, -3.8F);
		jawup3.addChild(teeth);
		teeth.setTextureOffset(0, 77).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		teeth.setModelRendererName("teeth");
		this.registerModelRenderer(teeth);

		teeth2 = new AnimatedModelRenderer(this);
		teeth2.setRotationPoint(1.0F, 4.0F, -3.5F);
		jawup.addChild(teeth2);
		setRotationAngle(teeth2, 0.0175F, 0.0F, 0.0F);
		teeth2.setTextureOffset(23, 25).addBox(-3.0F, -1.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		teeth2.setModelRendererName("teeth2");
		this.registerModelRenderer(teeth2);

		jawdown1 = new AnimatedModelRenderer(this);
		jawdown1.setRotationPoint(0.5F, 2.8F, 0.1F);
		head.addChild(jawdown1);
		setRotationAngle(jawdown1, 0.1625F, 0.0F, 0.0F);
		jawdown1.setTextureOffset(70, 56).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 2.0F, 3.0F, 0.02F, false);
		jawdown1.setModelRendererName("jawdown1");
		this.registerModelRenderer(jawdown1);

		jawdown2 = new AnimatedModelRenderer(this);
		jawdown2.setRotationPoint(0.0F, -0.6F, -2.3F);
		jawdown1.addChild(jawdown2);
		setRotationAngle(jawdown2, -0.0225F, 0.0F, 0.0F);
		jawdown2.setTextureOffset(48, 32).addBox(-2.5F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, 0.02F, false);
		jawdown2.setModelRendererName("jawdown2");
		this.registerModelRenderer(jawdown2);

		jawdown3 = new AnimatedModelRenderer(this);
		jawdown3.setRotationPoint(-0.5F, 0.1F, -3.6F);
		jawdown2.addChild(jawdown3);
		setRotationAngle(jawdown3, -0.3587F, 0.0F, 0.0F);
		jawdown3.setTextureOffset(62, 62).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 8.0F, 0.05F, false);
		jawdown3.setModelRendererName("jawdown3");
		this.registerModelRenderer(jawdown3);

		teeth3 = new AnimatedModelRenderer(this);
		teeth3.setRotationPoint(0.0F, -0.5F, -4.0F);
		jawdown3.addChild(teeth3);
		teeth3.setTextureOffset(19, 44).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		teeth3.setModelRendererName("teeth3");
		this.registerModelRenderer(teeth3);

		teeth4 = new AnimatedModelRenderer(this);
		teeth4.setRotationPoint(-0.5F, -0.4F, -3.2F);
		jawdown2.addChild(teeth4);
		teeth4.setTextureOffset(35, 25).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.03F, false);
		teeth4.setModelRendererName("teeth4");
		this.registerModelRenderer(teeth4);

		cheek2 = new AnimatedModelRenderer(this);
		cheek2.setRotationPoint(-2.5F, 0.1F, -0.2F);
		jawdown1.addChild(cheek2);
		setRotationAngle(cheek2, 2.892F, -0.0873F, 0.0F);
		cheek2.setTextureOffset(0, 20).addBox(-0.39F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		cheek2.setModelRendererName("cheek2");
		this.registerModelRenderer(cheek2);

		cheek3 = new AnimatedModelRenderer(this);
		cheek3.setRotationPoint(1.5F, 0.1F, -0.2F);
		jawdown1.addChild(cheek3);
		setRotationAngle(cheek3, 2.892F, 0.0873F, 0.0F);
		cheek3.setTextureOffset(0, 20).addBox(0.39F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		cheek3.setModelRendererName("cheek3");
		this.registerModelRenderer(cheek3);

		keratin4 = new AnimatedModelRenderer(this);
		keratin4.setRotationPoint(-1.8F, -2.3F, -2.9F);
		head.addChild(keratin4);
		setRotationAngle(keratin4, 0.1824F, -0.465F, 0.3142F);
		keratin4.setTextureOffset(33, 6).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.02F, false);
		keratin4.setModelRendererName("keratin4");
		this.registerModelRenderer(keratin4);

		keratin2 = new AnimatedModelRenderer(this);
		keratin2.setRotationPoint(-0.1F, -0.1F, 0.6F);
		keratin4.addChild(keratin2);
		setRotationAngle(keratin2, -0.465F, 0.447F, -0.1386F);
		keratin2.setTextureOffset(0, 42).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.02F, false);
		keratin2.setModelRendererName("keratin2");
		this.registerModelRenderer(keratin2);

		keratin5 = new AnimatedModelRenderer(this);
		keratin5.setRotationPoint(-0.4F, -0.1F, -0.8F);
		keratin4.addChild(keratin5);
		setRotationAngle(keratin5, -0.2381F, 1.0587F, -0.1386F);
		keratin5.setTextureOffset(28, 2).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.02F, false);
		keratin5.setModelRendererName("keratin5");
		this.registerModelRenderer(keratin5);

		keratin3 = new AnimatedModelRenderer(this);
		keratin3.setRotationPoint(1.8F, -2.3F, -2.9F);
		head.addChild(keratin3);
		setRotationAngle(keratin3, 0.1824F, 0.465F, -0.3142F);
		keratin3.setTextureOffset(23, 26).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.02F, false);
		keratin3.setModelRendererName("keratin3");
		this.registerModelRenderer(keratin3);

		keratin6 = new AnimatedModelRenderer(this);
		keratin6.setRotationPoint(0.1F, -0.1F, 0.6F);
		keratin3.addChild(keratin6);
		setRotationAngle(keratin6, -0.465F, -0.447F, 0.1386F);
		keratin6.setTextureOffset(0, 26).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.02F, false);
		keratin6.setModelRendererName("keratin6");
		this.registerModelRenderer(keratin6);

		keratin7 = new AnimatedModelRenderer(this);
		keratin7.setRotationPoint(0.4F, -0.1F, -0.8F);
		keratin3.addChild(keratin7);
		setRotationAngle(keratin7, -0.2381F, -1.0587F, 0.1386F);
		keratin7.setTextureOffset(6, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.02F, false);
		keratin7.setModelRendererName("keratin7");
		this.registerModelRenderer(keratin7);

		neckunder = new AnimatedModelRenderer(this);
		neckunder.setRotationPoint(0.0F, 1.9F, 2.2F);
		neck.addChild(neckunder);
		setRotationAngle(neckunder, -0.137F, 0.0F, 0.0F);
		neckunder.setTextureOffset(34, 63).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 4.0F, 5.0F, 0.05F, false);
		neckunder.setModelRendererName("neckunder");
		this.registerModelRenderer(neckunder);

		neckunder2 = new AnimatedModelRenderer(this);
		neckunder2.setRotationPoint(0.5F, 0.0F, -4.3F);
		neckunder.addChild(neckunder2);
		setRotationAngle(neckunder2, -0.1909F, 0.0F, 0.0F);
		neckunder2.setTextureOffset(0, 69).addBox(-2.5F, 0.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.02F, false);
		neckunder2.setModelRendererName("neckunder2");
		this.registerModelRenderer(neckunder2);

		neckunder3 = new AnimatedModelRenderer(this);
		neckunder3.setRotationPoint(0.0F, -0.1F, -4.3F);
		neckunder2.addChild(neckunder3);
		setRotationAngle(neckunder3, 0.3728F, 0.0F, 0.0F);
		neckunder3.setTextureOffset(32, 72).addBox(-2.5F, 0.2F, -3.0F, 4.0F, 4.0F, 3.0F, -0.09F, false);
		neckunder3.setModelRendererName("neckunder3");
		this.registerModelRenderer(neckunder3);

		neckunder4 = new AnimatedModelRenderer(this);
		neckunder4.setRotationPoint(0.5F, 0.4F, -1.1F);
		neckunder3.addChild(neckunder4);
		setRotationAngle(neckunder4, -0.2978F, 0.0F, 0.0F);
		neckunder4.setTextureOffset(78, 47).addBox(-2.5F, 0.0F, -3.7F, 3.0F, 4.0F, 3.0F, 0.02F, false);
		neckunder4.setModelRendererName("neckunder4");
		this.registerModelRenderer(neckunder4);

		Lowerarmleft = new AnimatedModelRenderer(this);
		Lowerarmleft.setRotationPoint(-3.8F, 4.68F, -4.1F);
		neckbase.addChild(Lowerarmleft);
		setRotationAngle(Lowerarmleft, 0.9718F, -0.0911F, 0.003F);
		Lowerarmleft.setTextureOffset(0, 0).addBox(-1.232F, -0.3495F, -1.0008F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Lowerarmleft.setModelRendererName("Lowerarmleft");
		this.registerModelRenderer(Lowerarmleft);

		Handleft = new AnimatedModelRenderer(this);
		Handleft.setRotationPoint(-1.082F, 1.8505F, 0.1992F);
		Lowerarmleft.addChild(Handleft);
		setRotationAngle(Handleft, -0.9561F, -0.1274F, 0.1065F);
		Handleft.setTextureOffset(30, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Handleft.setModelRendererName("Handleft");
		this.registerModelRenderer(Handleft);

		Finger1upperleft = new AnimatedModelRenderer(this);
		Finger1upperleft.setRotationPoint(0.0F, 2.0F, -0.4F);
		Handleft.addChild(Finger1upperleft);
		setRotationAngle(Finger1upperleft, -0.2655F, -0.0456F, -0.182F);
		Finger1upperleft.setTextureOffset(23, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Finger1upperleft.setModelRendererName("Finger1upperleft");
		this.registerModelRenderer(Finger1upperleft);

		Fingerupperleft = new AnimatedModelRenderer(this);
		Fingerupperleft.setRotationPoint(0.0F, 2.0F, 0.0F);
		Finger1upperleft.addChild(Fingerupperleft);
		setRotationAngle(Fingerupperleft, 1.5935F, 0.0F, -0.1693F);
		Fingerupperleft.setTextureOffset(28, 0).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Fingerupperleft.setModelRendererName("Fingerupperleft");
		this.registerModelRenderer(Fingerupperleft);

		Finger1middleleft = new AnimatedModelRenderer(this);
		Finger1middleleft.setRotationPoint(0.0F, 2.0F, 0.4F);
		Handleft.addChild(Finger1middleleft);
		setRotationAngle(Finger1middleleft, 0.1253F, 0.0F, -0.0456F);
		Finger1middleleft.setTextureOffset(5, 5).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Finger1middleleft.setModelRendererName("Finger1middleleft");
		this.registerModelRenderer(Finger1middleleft);

		Fingermiddleleft = new AnimatedModelRenderer(this);
		Fingermiddleleft.setRotationPoint(0.0F, 2.0F, 0.0F);
		Finger1middleleft.addChild(Fingermiddleleft);
		setRotationAngle(Fingermiddleleft, 1.5481F, 0.0456F, -0.3862F);
		Fingermiddleleft.setTextureOffset(27, 23).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Fingermiddleleft.setModelRendererName("Fingermiddleleft");
		this.registerModelRenderer(Fingermiddleleft);

		Lowerarmright = new AnimatedModelRenderer(this);
		Lowerarmright.setRotationPoint(3.8F, 4.68F, -4.1F);
		neckbase.addChild(Lowerarmright);
		setRotationAngle(Lowerarmright, 0.9718F, 0.0911F, -0.003F);
		Lowerarmright.setTextureOffset(0, 0).addBox(-0.768F, -0.3495F, -1.0008F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		Lowerarmright.setModelRendererName("Lowerarmright");
		this.registerModelRenderer(Lowerarmright);

		Handright = new AnimatedModelRenderer(this);
		Handright.setRotationPoint(1.082F, 1.8505F, 0.1992F);
		Lowerarmright.addChild(Handright);
		setRotationAngle(Handright, -0.9561F, 0.1274F, -0.1065F);
		Handright.setTextureOffset(30, 30).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		Handright.setModelRendererName("Handright");
		this.registerModelRenderer(Handright);

		Finger1upperright = new AnimatedModelRenderer(this);
		Finger1upperright.setRotationPoint(0.0F, 2.0F, -0.4F);
		Handright.addChild(Finger1upperright);
		setRotationAngle(Finger1upperright, -0.2655F, 0.0456F, 0.182F);
		Finger1upperright.setTextureOffset(23, 23).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Finger1upperright.setModelRendererName("Finger1upperright");
		this.registerModelRenderer(Finger1upperright);

		Fingerupperright = new AnimatedModelRenderer(this);
		Fingerupperright.setRotationPoint(0.0F, 2.0F, 0.0F);
		Finger1upperright.addChild(Fingerupperright);
		setRotationAngle(Fingerupperright, 1.5935F, 0.0F, 0.1693F);
		Fingerupperright.setTextureOffset(28, 0).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Fingerupperright.setModelRendererName("Fingerupperright");
		this.registerModelRenderer(Fingerupperright);

		Finger1middleright = new AnimatedModelRenderer(this);
		Finger1middleright.setRotationPoint(0.0F, 2.0F, 0.4F);
		Handright.addChild(Finger1middleright);
		setRotationAngle(Finger1middleright, 0.1253F, 0.0F, 0.0456F);
		Finger1middleright.setTextureOffset(5, 5).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Finger1middleright.setModelRendererName("Finger1middleright");
		this.registerModelRenderer(Finger1middleright);

		Fingermiddleright = new AnimatedModelRenderer(this);
		Fingermiddleright.setRotationPoint(0.0F, 2.0F, 0.0F);
		Finger1middleright.addChild(Fingermiddleright);
		setRotationAngle(Fingermiddleright, 1.5481F, -0.0456F, 0.3862F);
		Fingermiddleright.setTextureOffset(27, 23).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Fingermiddleright.setModelRendererName("Fingermiddleright");
		this.registerModelRenderer(Fingermiddleright);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-2.0F, -1.6993F, 1.2917F);
		body.addChild(r1);
		setRotationAngle(r1, -0.2948F, 0.0F, 0.0F);
		r1.setTextureOffset(30, 30).addBox(-4.0F, -0.2937F, -3.8515F, 5.0F, 10.0F, 8.0F, 0.0F, false);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(-0.5F, 8.4063F, -1.4515F);
		r1.addChild(r2);
		setRotationAngle(r2, 0.9411F, 0.0F, 0.0F);
		r2.setTextureOffset(50, 50).addBox(-3.0F, -0.5889F, -2.1918F, 4.0F, 8.0F, 6.0F, 0.0F, false);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(-0.5F, 6.3111F, 0.8082F);
		r2.addChild(r3);
		setRotationAngle(r3, -0.8721F, 0.0F, 0.0F);
		r3.setTextureOffset(64, 44).addBox(-2.02F, -1.2037F, -2.0337F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(-1.0F, 5.6963F, 0.1663F);
		r3.addChild(r4);
		setRotationAngle(r4, 0.2435F, 0.0F, 0.0F);
		r4.setTextureOffset(32, 17).addBox(-1.5F, -0.3888F, -3.9913F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(2.0F, -1.0993F, 0.3917F);
		body.addChild(l1);
		setRotationAngle(l1, -0.2948F, 0.0F, 0.0F);
		l1.setTextureOffset(30, 30).addBox(-1.0F, -1.1293F, -3.1646F, 5.0F, 10.0F, 8.0F, 0.0F, true);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(0.5F, 7.0707F, -0.4646F);
		l1.addChild(l2);
		setRotationAngle(l2, 0.9411F, 0.0F, 0.0F);
		l2.setTextureOffset(50, 50).addBox(-1.0F, -0.5369F, -2.7726F, 4.0F, 8.0F, 6.0F, 0.0F, true);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.5F, 6.2631F, 0.3274F);
		l2.addChild(l3);
		setRotationAngle(l3, -0.8721F, 0.0F, 0.0F);
		l3.setTextureOffset(64, 44).addBox(-0.98F, -1.0628F, -2.0214F, 3.0F, 8.0F, 4.0F, 0.0F, true);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(1.0F, 5.9372F, 0.5786F);
		l3.addChild(l4);
		setRotationAngle(l4, 0.2435F, 0.0F, 0.0F);
		l4.setTextureOffset(32, 17).addBox(-2.5F, -0.5823F, -4.3554F, 4.0F, 2.0F, 6.0F, 0.0F, true);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 5.5007F, -1.4083F);
		body.addChild(bone);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bone.setTextureOffset(48, 17).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 7.0F, 8.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		this.rootBones.add(root);
	}
}