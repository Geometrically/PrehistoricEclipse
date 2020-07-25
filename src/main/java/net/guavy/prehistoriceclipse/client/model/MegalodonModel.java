package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class MegalodonModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer bodymain;
	private final AnimatedModelRenderer body1;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer jawlow1;
	private final AnimatedModelRenderer jawlow2;
	private final AnimatedModelRenderer jawlow3;
	private final AnimatedModelRenderer jawlow4;
	private final AnimatedModelRenderer teeth;
	private final AnimatedModelRenderer jawup1;
	private final AnimatedModelRenderer jawup2;
	private final AnimatedModelRenderer jawup3;
	private final AnimatedModelRenderer jawup4;
	private final AnimatedModelRenderer teeth2;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer Tail;
	private final AnimatedModelRenderer shape18;
	private final AnimatedModelRenderer shape182;
	private final AnimatedModelRenderer tail5;
	private final AnimatedModelRenderer tailfin1;
	private final AnimatedModelRenderer tailfin2;
	private final AnimatedModelRenderer tailfin5;
	private final AnimatedModelRenderer tailfin4;
	private final AnimatedModelRenderer tailfin6;
	private final AnimatedModelRenderer dorsalfin7;
	private final AnimatedModelRenderer dorsalfin8;
	private final AnimatedModelRenderer dorsalfin3fgdf;
	private final AnimatedModelRenderer dorsalfin3fgd;
	private final AnimatedModelRenderer dorsalfin1;
	private final AnimatedModelRenderer dorsalfin2;
	private final AnimatedModelRenderer dorsalfin3;
	private final AnimatedModelRenderer dorsalfin4;
	private final AnimatedModelRenderer fin4;
	private final AnimatedModelRenderer fin5;
	private final AnimatedModelRenderer fin6;
	private final AnimatedModelRenderer fin1;
	private final AnimatedModelRenderer fin2;
	private final AnimatedModelRenderer fin3;

    public MegalodonModel()
    {
        textureWidth = 100;
		textureHeight = 100;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		bodymain = new AnimatedModelRenderer(this);
		bodymain.setRotationPoint(0.0F, 19.2F, -1.1F);
		root.addChild(bodymain);
		setRotationAngle(bodymain, 0.0182F, 0.0F, 0.0F);
		bodymain.setTextureOffset(0, 18).addBox(-4.0F, -3.5F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
		bodymain.setModelRendererName("bodymain");
		this.registerModelRenderer(bodymain);

		body1 = new AnimatedModelRenderer(this);
		body1.setRotationPoint(0.0F, -0.8F, -4.7F);
		bodymain.addChild(body1);
		setRotationAngle(body1, 0.0415F, 0.0F, 0.0F);
		body1.setTextureOffset(25, 13).addBox(-3.5F, -2.5F, -3.0F, 7.0F, 7.0F, 3.0F, 0.0F, true);
		body1.setModelRendererName("body1");
		this.registerModelRenderer(body1);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, 0.8F, -2.5F);
		body1.addChild(head);
		setRotationAngle(head, 0.034F, 0.0F, 0.0F);
		head.setTextureOffset(0, 63).addBox(-3.0F, -2.983F, -3.5003F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		jawlow1 = new AnimatedModelRenderer(this);
		jawlow1.setRotationPoint(0.0F, 1.0889F, -2.999F);
		head.addChild(jawlow1);
		setRotationAngle(jawlow1, -0.0782F, 0.0F, 0.0F);
		jawlow1.setTextureOffset(48, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.03F, true);
		jawlow1.setModelRendererName("jawlow1");
		this.registerModelRenderer(jawlow1);

		jawlow2 = new AnimatedModelRenderer(this);
		jawlow2.setRotationPoint(0.0F, 1.0F, -4.0F);
		jawlow1.addChild(jawlow2);
		setRotationAngle(jawlow2, -0.3599F, 0.0F, 0.0F);
		jawlow2.setTextureOffset(49, 6).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.03F, true);
		jawlow2.setModelRendererName("jawlow2");
		this.registerModelRenderer(jawlow2);

		jawlow3 = new AnimatedModelRenderer(this);
		jawlow3.setRotationPoint(0.0F, 0.0F, 1.0F);
		jawlow2.addChild(jawlow3);
		setRotationAngle(jawlow3, 0.182F, 0.0F, 0.0F);
		jawlow3.setTextureOffset(54, 10).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.03F, true);
		jawlow3.setModelRendererName("jawlow3");
		this.registerModelRenderer(jawlow3);

		jawlow4 = new AnimatedModelRenderer(this);
		jawlow4.setRotationPoint(0.0F, 0.0F, 1.0F);
		jawlow3.addChild(jawlow4);
		setRotationAngle(jawlow4, 0.0367F, 0.0F, 0.0F);
		jawlow4.setTextureOffset(52, 14).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, 0.03F, true);
		jawlow4.setModelRendererName("jawlow4");
		this.registerModelRenderer(jawlow4);

		teeth = new AnimatedModelRenderer(this);
		teeth.setRotationPoint(-0.5F, -0.5F, -0.8F);
		jawlow1.addChild(teeth);
		teeth.setTextureOffset(67, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.03F, true);
		teeth.setModelRendererName("teeth");
		this.registerModelRenderer(teeth);

		jawup1 = new AnimatedModelRenderer(this);
		jawup1.setRotationPoint(0.0F, 0.017F, -2.8003F);
		head.addChild(jawup1);
		setRotationAngle(jawup1, 0.1285F, 0.0F, 0.0F);
		jawup1.setTextureOffset(23, 63).addBox(-2.5F, -2.9103F, -4.3058F, 5.0F, 3.0F, 5.0F, 0.0F, true);
		jawup1.setModelRendererName("jawup1");
		this.registerModelRenderer(jawup1);

		jawup2 = new AnimatedModelRenderer(this);
		jawup2.setRotationPoint(0.0F, -1.5103F, -2.5058F);
		jawup1.addChild(jawup2);
		setRotationAngle(jawup2, 0.4458F, 0.0F, 0.0F);
		jawup2.setTextureOffset(21, 72).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 3.0F, 1.0F, 0.0F, true);
		jawup2.setModelRendererName("jawup2");
		this.registerModelRenderer(jawup2);

		jawup3 = new AnimatedModelRenderer(this);
		jawup3.setRotationPoint(0.0F, -0.2F, -0.7F);
		jawup2.addChild(jawup3);
		setRotationAngle(jawup3, 0.166F, 0.0F, 0.0F);
		jawup3.setTextureOffset(0, 54).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 3.0F, 1.0F, 0.0F, true);
		jawup3.setModelRendererName("jawup3");
		this.registerModelRenderer(jawup3);

		jawup4 = new AnimatedModelRenderer(this);
		jawup4.setRotationPoint(0.0F, 0.5897F, 0.7942F);
		jawup1.addChild(jawup4);
		setRotationAngle(jawup4, -0.2025F, 0.0F, 0.0F);
		jawup4.setTextureOffset(0, 74).addBox(-2.5F, -1.0F, -5.0F, 5.0F, 2.0F, 5.0F, 0.0F, true);
		jawup4.setModelRendererName("jawup4");
		this.registerModelRenderer(jawup4);

		teeth2 = new AnimatedModelRenderer(this);
		teeth2.setRotationPoint(0.0F, 0.4F, -1.9F);
		jawup4.addChild(teeth2);
		teeth2.setTextureOffset(67, 5).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, true);
		teeth2.setModelRendererName("teeth2");
		this.registerModelRenderer(teeth2);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.3F, 3.0F);
		bodymain.addChild(Body2);
		setRotationAngle(Body2, -0.0819F, 0.0F, 0.0F);
		Body2.setTextureOffset(0, 0).addBox(-3.5F, -3.5946F, -1.1309F, 7.0F, 7.0F, 5.0F, 0.0F, true);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		Tail = new AnimatedModelRenderer(this);
		Tail.setRotationPoint(0.0F, -0.3946F, 3.8691F);
		Body2.addChild(Tail);
		setRotationAngle(Tail, 0.0157F, 0.0F, 0.0F);
		Tail.setTextureOffset(25, 0).addBox(-3.0F, -2.8998F, -0.978F, 6.0F, 6.0F, 5.0F, 0.0F, true);
		Tail.setModelRendererName("Tail");
		this.registerModelRenderer(Tail);

		shape18 = new AnimatedModelRenderer(this);
		shape18.setRotationPoint(0.0F, -0.1998F, 4.022F);
		Tail.addChild(shape18);
		setRotationAngle(shape18, 0.0087F, 0.0F, 0.0F);
		shape18.setTextureOffset(0, 42).addBox(-2.0F, -2.4999F, -0.9869F, 4.0F, 5.0F, 6.0F, 0.0F, true);
		shape18.setModelRendererName("shape18");
		this.registerModelRenderer(shape18);

		shape182 = new AnimatedModelRenderer(this);
		shape182.setRotationPoint(0.0F, -0.1999F, 5.0131F);
		shape18.addChild(shape182);
		shape182.setTextureOffset(22, 49).addBox(-1.5F, -1.9F, -1.0F, 3.0F, 4.0F, 6.0F, 0.0F, true);
		shape182.setModelRendererName("shape182");
		this.registerModelRenderer(shape182);

		tail5 = new AnimatedModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
		shape182.addChild(tail5);
		tail5.setTextureOffset(17, 37).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 6.0F, 0.0F, true);
		tail5.setModelRendererName("tail5");
		this.registerModelRenderer(tail5);

		tailfin1 = new AnimatedModelRenderer(this);
		tailfin1.setRotationPoint(0.0F, 0.0F, 3.0F);
		tail5.addChild(tailfin1);
		setRotationAngle(tailfin1, -0.5878F, 0.0F, 0.0F);
		tailfin1.setTextureOffset(39, 33).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, true);
		tailfin1.setModelRendererName("tailfin1");
		this.registerModelRenderer(tailfin1);

		tailfin2 = new AnimatedModelRenderer(this);
		tailfin2.setRotationPoint(0.0F, -1.9F, 2.0F);
		tailfin1.addChild(tailfin2);
		setRotationAngle(tailfin2, -0.3187F, 0.0F, 0.0F);
		tailfin2.setTextureOffset(40, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		tailfin2.setModelRendererName("tailfin2");
		this.registerModelRenderer(tailfin2);

		tailfin5 = new AnimatedModelRenderer(this);
		tailfin5.setRotationPoint(0.0F, 1.7F, 1.2F);
		tailfin2.addChild(tailfin5);
		setRotationAngle(tailfin5, -1.4048F, 0.0F, 0.0F);
		tailfin5.setTextureOffset(40, 48).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		tailfin5.setModelRendererName("tailfin5");
		this.registerModelRenderer(tailfin5);

		tailfin4 = new AnimatedModelRenderer(this);
		tailfin4.setRotationPoint(0.0F, -3.8F, 0.5F);
		tailfin1.addChild(tailfin4);
		setRotationAngle(tailfin4, -0.0113F, 0.0F, 0.0F);
		tailfin4.setTextureOffset(31, 33).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		tailfin4.setModelRendererName("tailfin4");
		this.registerModelRenderer(tailfin4);

		tailfin6 = new AnimatedModelRenderer(this);
		tailfin6.setRotationPoint(0.0F, -3.8F, 0.6F);
		tailfin4.addChild(tailfin6);
		setRotationAngle(tailfin6, -0.1072F, 0.0F, 0.0F);
		tailfin6.setTextureOffset(50, 33).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		tailfin6.setModelRendererName("tailfin6");
		this.registerModelRenderer(tailfin6);

		dorsalfin7 = new AnimatedModelRenderer(this);
		dorsalfin7.setRotationPoint(0.0F, 0.2F, -0.6F);
		shape182.addChild(dorsalfin7);
		setRotationAngle(dorsalfin7, -0.3595F, 0.0F, 0.0F);
		dorsalfin7.setTextureOffset(66, 40).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		dorsalfin7.setModelRendererName("dorsalfin7");
		this.registerModelRenderer(dorsalfin7);

		dorsalfin8 = new AnimatedModelRenderer(this);
		dorsalfin8.setRotationPoint(0.0F, -1.8F, -0.1F);
		dorsalfin7.addChild(dorsalfin8);
		setRotationAngle(dorsalfin8, -0.2826F, 0.0F, 0.0F);
		dorsalfin8.setTextureOffset(66, 63).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		dorsalfin8.setModelRendererName("dorsalfin8");
		this.registerModelRenderer(dorsalfin8);

		dorsalfin3fgdf = new AnimatedModelRenderer(this);
		dorsalfin3fgdf.setRotationPoint(0.0F, -0.3999F, 0.4131F);
		shape18.addChild(dorsalfin3fgdf);
		setRotationAngle(dorsalfin3fgdf, -2.0687F, -0.0869F, -0.2845F);
		dorsalfin3fgdf.setTextureOffset(66, 47).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);
		dorsalfin3fgdf.setModelRendererName("dorsalfin3fgdf");
		this.registerModelRenderer(dorsalfin3fgdf);

		dorsalfin3fgd = new AnimatedModelRenderer(this);
		dorsalfin3fgd.setRotationPoint(0.2F, -0.4001F, 0.421F);
		shape18.addChild(dorsalfin3fgd);
		setRotationAngle(dorsalfin3fgd, -2.0687F, -0.0869F, 0.2845F);
		dorsalfin3fgd.setTextureOffset(66, 47).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		dorsalfin3fgd.setModelRendererName("dorsalfin3fgd");
		this.registerModelRenderer(dorsalfin3fgd);

		dorsalfin1 = new AnimatedModelRenderer(this);
		dorsalfin1.setRotationPoint(0.0F, -3.5F, -0.8F);
		bodymain.addChild(dorsalfin1);
		setRotationAngle(dorsalfin1, -0.182F, 0.0F, 0.0F);
		dorsalfin1.setTextureOffset(55, 54).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		dorsalfin1.setModelRendererName("dorsalfin1");
		this.registerModelRenderer(dorsalfin1);

		dorsalfin2 = new AnimatedModelRenderer(this);
		dorsalfin2.setRotationPoint(0.0F, 0.0F, 0.4F);
		dorsalfin1.addChild(dorsalfin2);
		setRotationAngle(dorsalfin2, -0.148F, 0.0F, 0.0F);
		dorsalfin2.setTextureOffset(48, 47).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, true);
		dorsalfin2.setModelRendererName("dorsalfin2");
		this.registerModelRenderer(dorsalfin2);

		dorsalfin3 = new AnimatedModelRenderer(this);
		dorsalfin3.setRotationPoint(0.0F, -1.9F, 0.4F);
		dorsalfin2.addChild(dorsalfin3);
		setRotationAngle(dorsalfin3, -0.148F, 0.0F, 0.0F);
		dorsalfin3.setTextureOffset(68, 56).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		dorsalfin3.setModelRendererName("dorsalfin3");
		this.registerModelRenderer(dorsalfin3);

		dorsalfin4 = new AnimatedModelRenderer(this);
		dorsalfin4.setRotationPoint(0.0F, -1.8F, 0.5F);
		dorsalfin3.addChild(dorsalfin4);
		setRotationAngle(dorsalfin4, -0.148F, 0.0F, 0.0F);
		dorsalfin4.setTextureOffset(55, 41).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		dorsalfin4.setModelRendererName("dorsalfin4");
		this.registerModelRenderer(dorsalfin4);

		fin4 = new AnimatedModelRenderer(this);
		fin4.setRotationPoint(2.7F, 1.8F, -3.5F);
		bodymain.addChild(fin4);
		setRotationAngle(fin4, 0.3053F, 0.07F, -0.8639F);
		fin4.setTextureOffset(49, 21).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		fin4.setModelRendererName("fin4");
		this.registerModelRenderer(fin4);

		fin5 = new AnimatedModelRenderer(this);
		fin5.setRotationPoint(-0.5F, 1.0F, 0.5F);
		fin4.addChild(fin5);
		setRotationAngle(fin5, 0.0171F, 0.0F, 0.0F);
		fin5.setTextureOffset(59, 25).addBox(0.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		fin5.setModelRendererName("fin5");
		this.registerModelRenderer(fin5);

		fin6 = new AnimatedModelRenderer(this);
		fin6.setRotationPoint(0.0F, 3.0F, -1.0F);
		fin5.addChild(fin6);
		setRotationAngle(fin6, 0.0585F, 0.0F, 0.0F);
		fin6.setTextureOffset(59, 36).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fin6.setModelRendererName("fin6");
		this.registerModelRenderer(fin6);

		fin1 = new AnimatedModelRenderer(this);
		fin1.setRotationPoint(-2.7F, 1.8F, -3.5F);
		bodymain.addChild(fin1);
		setRotationAngle(fin1, 0.3053F, -0.07F, 0.8639F);
		fin1.setTextureOffset(49, 21).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		fin1.setModelRendererName("fin1");
		this.registerModelRenderer(fin1);

		fin2 = new AnimatedModelRenderer(this);
		fin2.setRotationPoint(-0.5F, 1.0F, 0.5F);
		fin1.addChild(fin2);
		setRotationAngle(fin2, 0.0171F, 0.0F, 0.0F);
		fin2.setTextureOffset(59, 25).addBox(0.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		fin2.setModelRendererName("fin2");
		this.registerModelRenderer(fin2);

		fin3 = new AnimatedModelRenderer(this);
		fin3.setRotationPoint(0.0F, 3.0F, -1.0F);
		fin2.addChild(fin3);
		setRotationAngle(fin3, 0.0585F, 0.0F, 0.0F);
		fin3.setTextureOffset(59, 36).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		fin3.setModelRendererName("fin3");
		this.registerModelRenderer(fin3);

		this.rootBones.add(root);
	}
}