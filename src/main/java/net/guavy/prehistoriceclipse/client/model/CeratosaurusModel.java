package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class CeratosaurusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer body1;
	private final AnimatedModelRenderer body2;
	private final AnimatedModelRenderer body3;
	private final AnimatedModelRenderer leftarm1;
	private final AnimatedModelRenderer leftarm;
	private final AnimatedModelRenderer lefthand;
	private final AnimatedModelRenderer leftfinger1;
	private final AnimatedModelRenderer leftfinger;
	private final AnimatedModelRenderer leftfinger3;
	private final AnimatedModelRenderer leftfinger4;
	private final AnimatedModelRenderer rightarm;
	private final AnimatedModelRenderer rightarm3;
	private final AnimatedModelRenderer righthand;
	private final AnimatedModelRenderer rightfinger;
	private final AnimatedModelRenderer rightfinger5;
	private final AnimatedModelRenderer rightfinger6;
	private final AnimatedModelRenderer rightfinger7;
	private final AnimatedModelRenderer neck;
	private final AnimatedModelRenderer neck1;
	private final AnimatedModelRenderer neck2;
	private final AnimatedModelRenderer neck3;
	private final AnimatedModelRenderer neck4;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer jawup1;
	private final AnimatedModelRenderer snout;
	private final AnimatedModelRenderer snout2;
	private final AnimatedModelRenderer snout3;
	private final AnimatedModelRenderer horn4;
	private final AnimatedModelRenderer horn5;
	private final AnimatedModelRenderer jawup2;
	private final AnimatedModelRenderer jawdown1;
	private final AnimatedModelRenderer jawdown2;
	private final AnimatedModelRenderer cheek1;
	private final AnimatedModelRenderer cheek2;
	private final AnimatedModelRenderer jawdown4;
	private final AnimatedModelRenderer Horn6;
	private final AnimatedModelRenderer Horn2;
	private final AnimatedModelRenderer neckunder2;
	private final AnimatedModelRenderer neckunder3;
	private final AnimatedModelRenderer neckunder4;
	private final AnimatedModelRenderer tailbase;
	private final AnimatedModelRenderer tail;
	private final AnimatedModelRenderer tail2;
	private final AnimatedModelRenderer tail3;
	private final AnimatedModelRenderer tail4;
	private final AnimatedModelRenderer tail5;
	private final AnimatedModelRenderer r1;
	private final AnimatedModelRenderer r2;
	private final AnimatedModelRenderer r3;
	private final AnimatedModelRenderer r4;
	private final AnimatedModelRenderer l1;
	private final AnimatedModelRenderer l2;
	private final AnimatedModelRenderer l3;
	private final AnimatedModelRenderer l4;
	private final AnimatedModelRenderer bone;

    public CeratosaurusModel()
    {
        textureWidth = 112;
		textureHeight = 112;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		body1 = new AnimatedModelRenderer(this);
		body1.setRotationPoint(-0.5F, 5.925F, 2.2F);
		root.addChild(body1);
		setRotationAngle(body1, -0.0904F, 0.0F, 0.0F);
		body1.setTextureOffset(0, 0).addBox(-6.5F, -7.8606F, -7.51F, 14.0F, 15.0F, 14.0F, 0.0F, false);
		body1.setTextureOffset(37, 24).addBox(0.5F, -9.6397F, -6.6339F, 0.0F, 2.0F, 13.0F, 0.0F, false);
		body1.setModelRendererName("body1");
		this.registerModelRenderer(body1);

		body2 = new AnimatedModelRenderer(this);
		body2.setRotationPoint(0.0F, -0.8606F, -6.11F);
		body1.addChild(body2);
		setRotationAngle(body2, 0.1047F, 0.0F, 0.0F);
		body2.setTextureOffset(0, 29).addBox(-6.0F, -6.7791F, -9.9239F, 13.0F, 13.0F, 11.0F, 0.0F, false);
		body2.setTextureOffset(48, 28).addBox(0.5F, -8.7791F, -9.9239F, 0.0F, 2.0F, 11.0F, 0.0F, false);
		body2.setModelRendererName("body2");
		this.registerModelRenderer(body2);

		body3 = new AnimatedModelRenderer(this);
		body3.setRotationPoint(0.0F, -0.2791F, -9.6239F);
		body2.addChild(body3);
		setRotationAngle(body3, 0.0524F, 0.0F, 0.0F);
		body3.setTextureOffset(40, 45).addBox(-5.0F, -6.3F, -6.8F, 11.0F, 12.0F, 8.0F, 0.0F, false);
		body3.setTextureOffset(0, 0).addBox(0.5F, -8.3F, -6.3F, 0.0F, 2.0F, 7.0F, 0.0F, false);
		body3.setModelRendererName("body3");
		this.registerModelRenderer(body3);

		leftarm1 = new AnimatedModelRenderer(this);
		leftarm1.setRotationPoint(-3.5F, 3.2F, -5.1F);
		body3.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.7023F, 0.0F, 0.2124F);
		leftarm1.setTextureOffset(42, 6).addBox(-2.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		leftarm1.setModelRendererName("leftarm1");
		this.registerModelRenderer(leftarm1);

		leftarm = new AnimatedModelRenderer(this);
		leftarm.setRotationPoint(-1.3F, 3.2F, 0.3F);
		leftarm1.addChild(leftarm);
		setRotationAngle(leftarm, -0.7358F, 0.0F, -0.2019F);
		leftarm.setTextureOffset(0, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		leftarm.setModelRendererName("leftarm");
		this.registerModelRenderer(leftarm);

		lefthand = new AnimatedModelRenderer(this);
		lefthand.setRotationPoint(-1.0F, 3.8F, 0.0F);
		leftarm.addChild(lefthand);
		setRotationAngle(lefthand, -0.1222F, 0.0F, -0.2155F);
		lefthand.setTextureOffset(62, 41).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lefthand.setModelRendererName("lefthand");
		this.registerModelRenderer(lefthand);

		leftfinger1 = new AnimatedModelRenderer(this);
		leftfinger1.setRotationPoint(0.575F, 1.3F, -0.5F);
		lefthand.addChild(leftfinger1);
		setRotationAngle(leftfinger1, -0.6299F, 0.0F, -0.0653F);
		leftfinger1.setTextureOffset(51, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftfinger1.setModelRendererName("leftfinger1");
		this.registerModelRenderer(leftfinger1);

		leftfinger = new AnimatedModelRenderer(this);
		leftfinger.setRotationPoint(0.5F, 0.8F, -0.1F);
		lefthand.addChild(leftfinger);
		setRotationAngle(leftfinger, -0.0873F, 0.0F, -0.0342F);
		leftfinger.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leftfinger.setModelRendererName("leftfinger");
		this.registerModelRenderer(leftfinger);

		leftfinger3 = new AnimatedModelRenderer(this);
		leftfinger3.setRotationPoint(0.525F, 1.4F, 0.5F);
		lefthand.addChild(leftfinger3);
		setRotationAngle(leftfinger3, 0.1859F, 0.0F, -0.0304F);
		leftfinger3.setTextureOffset(42, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftfinger3.setModelRendererName("leftfinger3");
		this.registerModelRenderer(leftfinger3);

		leftfinger4 = new AnimatedModelRenderer(this);
		leftfinger4.setRotationPoint(0.7F, 0.8F, 0.2F);
		lefthand.addChild(leftfinger4);
		setRotationAngle(leftfinger4, 0.796F, 0.1047F, 0.022F);
		leftfinger4.setTextureOffset(10, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftfinger4.setModelRendererName("leftfinger4");
		this.registerModelRenderer(leftfinger4);

		rightarm = new AnimatedModelRenderer(this);
		rightarm.setRotationPoint(4.5F, 3.2F, -5.1F);
		body3.addChild(rightarm);
		setRotationAngle(rightarm, 0.7023F, 0.0F, -0.2124F);
		rightarm.setTextureOffset(42, 6).addBox(-0.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
		rightarm.setModelRendererName("rightarm");
		this.registerModelRenderer(rightarm);

		rightarm3 = new AnimatedModelRenderer(this);
		rightarm3.setRotationPoint(1.3F, 3.2F, 0.3F);
		rightarm.addChild(rightarm3);
		setRotationAngle(rightarm3, -0.7358F, 0.0F, 0.2019F);
		rightarm3.setTextureOffset(0, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		rightarm3.setModelRendererName("rightarm3");
		this.registerModelRenderer(rightarm3);

		righthand = new AnimatedModelRenderer(this);
		righthand.setRotationPoint(1.0F, 3.8F, 0.0F);
		rightarm3.addChild(righthand);
		setRotationAngle(righthand, -0.1222F, 0.0F, 0.2155F);
		righthand.setTextureOffset(62, 41).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		righthand.setModelRendererName("righthand");
		this.registerModelRenderer(righthand);

		rightfinger = new AnimatedModelRenderer(this);
		rightfinger.setRotationPoint(-0.575F, 1.3F, -0.5F);
		righthand.addChild(rightfinger);
		setRotationAngle(rightfinger, -0.6299F, 0.0F, 0.0653F);
		rightfinger.setTextureOffset(51, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		rightfinger.setModelRendererName("rightfinger");
		this.registerModelRenderer(rightfinger);

		rightfinger5 = new AnimatedModelRenderer(this);
		rightfinger5.setRotationPoint(-0.5F, 0.8F, -0.1F);
		righthand.addChild(rightfinger5);
		setRotationAngle(rightfinger5, -0.0873F, 0.0F, 0.0342F);
		rightfinger5.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		rightfinger5.setModelRendererName("rightfinger5");
		this.registerModelRenderer(rightfinger5);

		rightfinger6 = new AnimatedModelRenderer(this);
		rightfinger6.setRotationPoint(-0.525F, 1.4F, 0.5F);
		righthand.addChild(rightfinger6);
		setRotationAngle(rightfinger6, 0.1859F, 0.0F, 0.0304F);
		rightfinger6.setTextureOffset(42, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		rightfinger6.setModelRendererName("rightfinger6");
		this.registerModelRenderer(rightfinger6);

		rightfinger7 = new AnimatedModelRenderer(this);
		rightfinger7.setRotationPoint(-0.7F, 0.8F, 0.2F);
		righthand.addChild(rightfinger7);
		setRotationAngle(rightfinger7, 0.796F, -0.1047F, -0.022F);
		rightfinger7.setTextureOffset(10, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		rightfinger7.setModelRendererName("rightfinger7");
		this.registerModelRenderer(rightfinger7);

		neck = new AnimatedModelRenderer(this);
		neck.setRotationPoint(0.32F, -3.8843F, -6.3741F);
		body3.addChild(neck);
		setRotationAngle(neck, -0.3248F, 0.0F, 0.0F);
		neck.setTextureOffset(88, 88).addBox(-2.82F, -2.1934F, -2.8085F, 6.0F, 5.0F, 4.0F, 0.01F, false);
		neck.setTextureOffset(48, 40).addBox(0.18F, -3.8157F, -2.9259F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		neck.setModelRendererName("neck");
		this.registerModelRenderer(neck);

		neck1 = new AnimatedModelRenderer(this);
		neck1.setRotationPoint(-0.2F, 0.5217F, -2.3812F);
		neck.addChild(neck1);
		setRotationAngle(neck1, -0.2129F, 0.0F, 0.0F);
		neck1.setTextureOffset(87, 14).addBox(-2.62F, -2.6492F, -3.7295F, 6.0F, 5.0F, 4.0F, 0.0F, false);
		neck1.setTextureOffset(37, 32).addBox(0.38F, -4.3375F, -3.5447F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		neck1.setModelRendererName("neck1");
		this.registerModelRenderer(neck1);

		neck2 = new AnimatedModelRenderer(this);
		neck2.setRotationPoint(-0.1F, 0.3996F, -3.2816F);
		neck1.addChild(neck2);
		setRotationAngle(neck2, -0.081F, 0.0F, 0.0F);
		neck2.setTextureOffset(85, 70).addBox(-2.52F, -2.9971F, -3.5134F, 6.0F, 5.0F, 4.0F, 0.01F, false);
		neck2.setTextureOffset(0, 1).addBox(0.48F, -4.737F, -3.763F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		neck2.setModelRendererName("neck2");
		this.registerModelRenderer(neck2);

		neck3 = new AnimatedModelRenderer(this);
		neck3.setRotationPoint(-0.2F, -0.5885F, -2.6388F);
		neck2.addChild(neck3);
		setRotationAngle(neck3, 0.4288F, 0.0F, 0.0F);
		neck3.setTextureOffset(90, 7).addBox(-2.32F, -2.5121F, -2.3581F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		neck3.setTextureOffset(8, 2).addBox(0.68F, -4.1485F, -2.8243F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		neck3.setModelRendererName("neck3");
		this.registerModelRenderer(neck3);

		neck4 = new AnimatedModelRenderer(this);
		neck4.setRotationPoint(0.2F, -0.05F, -1.8F);
		neck3.addChild(neck4);
		setRotationAngle(neck4, 0.359F, 0.0F, 0.0F);
		neck4.setTextureOffset(90, 0).addBox(-2.52F, -2.5121F, -2.3581F, 6.0F, 5.0F, 2.0F, -0.01F, false);
		neck4.setModelRendererName("neck4");
		this.registerModelRenderer(neck4);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.58F, 0.0112F, -1.1154F);
		neck4.addChild(head);
		setRotationAngle(head, 3.0666F, 0.0F, 0.0F);
		head.setTextureOffset(48, 81).addBox(-3.6F, -2.5F, 0.0F, 7.0F, 5.0F, 5.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		jawup1 = new AnimatedModelRenderer(this);
		jawup1.setRotationPoint(1.9F, -2.4F, 4.3F);
		head.addChild(jawup1);
		setRotationAngle(jawup1, 0.1511F, 0.0F, 0.0F);
		jawup1.setTextureOffset(44, 65).addBox(-5.0F, 0.0F, 0.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		jawup1.setTextureOffset(78, 54).addBox(-4.5F, -1.0F, 0.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		jawup1.setModelRendererName("jawup1");
		this.registerModelRenderer(jawup1);

		snout = new AnimatedModelRenderer(this);
		snout.setRotationPoint(-0.5F, 2.9F, 0.275F);
		jawup1.addChild(snout);
		setRotationAngle(snout, -0.0063F, 0.0F, 0.0F);
		snout.setTextureOffset(81, 29).addBox(-4.0F, 0.0F, -0.9F, 5.0F, 2.0F, 6.0F, -0.01F, false);
		snout.setModelRendererName("snout");
		this.registerModelRenderer(snout);

		snout2 = new AnimatedModelRenderer(this);
		snout2.setRotationPoint(0.0F, 0.1F, 4.5F);
		snout.addChild(snout2);
		setRotationAngle(snout2, 0.3004F, 0.0F, 0.0F);
		snout2.setTextureOffset(0, 11).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 1.0F, -0.01F, false);
		snout2.setModelRendererName("snout2");
		this.registerModelRenderer(snout2);

		snout3 = new AnimatedModelRenderer(this);
		snout3.setRotationPoint(0.0F, 0.2F, 0.125F);
		snout2.addChild(snout3);
		setRotationAngle(snout3, 0.4156F, 0.0F, 0.0F);
		snout3.setTextureOffset(0, 37).addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, -0.01F, false);
		snout3.setModelRendererName("snout3");
		this.registerModelRenderer(snout3);

		horn4 = new AnimatedModelRenderer(this);
		horn4.setRotationPoint(-1.5F, 4.3059F, 3.2836F);
		snout.addChild(horn4);
		setRotationAngle(horn4, 2.1731F, 0.0F, 0.0F);
		horn4.setTextureOffset(25, 57).addBox(-0.5F, -0.0011F, -0.0145F, 1.0F, 2.0F, 3.0F, -0.01F, false);
		horn4.setModelRendererName("horn4");
		this.registerModelRenderer(horn4);

		horn5 = new AnimatedModelRenderer(this);
		horn5.setRotationPoint(-0.5F, 0.6F, 1.4F);
		horn4.addChild(horn5);
		setRotationAngle(horn5, -0.7535F, 0.0F, 0.0F);
		horn5.setTextureOffset(55, 0).addBox(0.0F, -0.0011F, -0.0145F, 1.0F, 2.0F, 2.0F, 0.01F, false);
		horn5.setModelRendererName("horn5");
		this.registerModelRenderer(horn5);

		jawup2 = new AnimatedModelRenderer(this);
		jawup2.setRotationPoint(-0.5F, 0.0F, 2.8F);
		jawup1.addChild(jawup2);
		setRotationAngle(jawup2, -0.2257F, 0.0F, 0.0F);
		jawup2.setTextureOffset(89, 54).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		jawup2.setTextureOffset(42, 0).addBox(-3.5F, -1.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		jawup2.setModelRendererName("jawup2");
		this.registerModelRenderer(jawup2);

		jawdown1 = new AnimatedModelRenderer(this);
		jawdown1.setRotationPoint(1.9F, -3.5F, 0.3F);
		head.addChild(jawdown1);
		setRotationAngle(jawdown1, 0.0429F, 0.0F, 0.0F);
		jawdown1.setTextureOffset(85, 37).addBox(-5.0F, -0.5F, -0.4F, 6.0F, 2.0F, 5.0F, 0.02F, false);
		jawdown1.setModelRendererName("jawdown1");
		this.registerModelRenderer(jawdown1);

		jawdown2 = new AnimatedModelRenderer(this);
		jawdown2.setRotationPoint(-0.5F, 0.5F, 4.3F);
		jawdown1.addChild(jawdown2);
		setRotationAngle(jawdown2, 0.1788F, 0.0F, 0.0F);
		jawdown2.setTextureOffset(87, 23).addBox(-4.0F, 0.0F, -0.3F, 5.0F, 1.0F, 3.0F, 0.02F, false);
		jawdown2.setTextureOffset(25, 53).addBox(-3.5F, 1.0F, -0.3F, 4.0F, 1.0F, 3.0F, 0.02F, false);
		jawdown2.setModelRendererName("jawdown2");
		this.registerModelRenderer(jawdown2);

		cheek1 = new AnimatedModelRenderer(this);
		cheek1.setRotationPoint(-0.4F, 3.2F, -0.8F);
		jawdown1.addChild(cheek1);
		setRotationAngle(cheek1, 1.1442F, 0.0F, 0.0F);
		cheek1.setTextureOffset(0, 29).addBox(1.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.02F, false);
		cheek1.setModelRendererName("cheek1");
		this.registerModelRenderer(cheek1);

		cheek2 = new AnimatedModelRenderer(this);
		cheek2.setRotationPoint(-4.5F, 3.2F, -0.8F);
		jawdown1.addChild(cheek2);
		setRotationAngle(cheek2, 1.1442F, 0.0F, 0.0F);
		cheek2.setTextureOffset(0, 25).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.02F, false);
		cheek2.setModelRendererName("cheek2");
		this.registerModelRenderer(cheek2);

		jawdown4 = new AnimatedModelRenderer(this);
		jawdown4.setRotationPoint(-1.0F, -0.5F, 3.9F);
		jawdown1.addChild(jawdown4);
		setRotationAngle(jawdown4, -0.1336F, 0.0F, 0.0F);
		jawdown4.setTextureOffset(84, 45).addBox(-3.0F, 0.0F, 0.0F, 4.0F, 1.0F, 8.0F, 0.02F, false);
		jawdown4.setTextureOffset(0, 0).addBox(-2.5F, 1.0F, 3.9F, 3.0F, 1.0F, 4.0F, 0.02F, false);
		jawdown4.setModelRendererName("jawdown4");
		this.registerModelRenderer(jawdown4);

		Horn6 = new AnimatedModelRenderer(this);
		Horn6.setRotationPoint(-2.0F, 2.6768F, 5.1131F);
		head.addChild(Horn6);
		setRotationAngle(Horn6, 0.9598F, 0.2588F, 0.3964F);
		Horn6.setTextureOffset(37, 29).addBox(-1.2746F, -2.3069F, -1.5601F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Horn6.setModelRendererName("Horn6");
		this.registerModelRenderer(Horn6);

		Horn2 = new AnimatedModelRenderer(this);
		Horn2.setRotationPoint(1.8F, 2.6768F, 5.1131F);
		head.addChild(Horn2);
		setRotationAngle(Horn2, 0.9598F, -0.2588F, -0.3964F);
		Horn2.setTextureOffset(37, 29).addBox(0.2746F, -2.3069F, -1.5601F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		Horn2.setModelRendererName("Horn2");
		this.registerModelRenderer(Horn2);

		neckunder2 = new AnimatedModelRenderer(this);
		neckunder2.setRotationPoint(0.36F, 4.1804F, 2.1122F);
		neck.addChild(neckunder2);
		setRotationAngle(neckunder2, -0.1014F, 0.0F, 0.0F);
		neckunder2.setTextureOffset(72, 58).addBox(-2.64F, -3.116F, -5.5448F, 5.0F, 5.0F, 7.0F, 0.0F, false);
		neckunder2.setModelRendererName("neckunder2");
		this.registerModelRenderer(neckunder2);

		neckunder3 = new AnimatedModelRenderer(this);
		neckunder3.setRotationPoint(0.0F, 0.0459F, -5.2947F);
		neckunder2.addChild(neckunder3);
		setRotationAngle(neckunder3, -0.1421F, 0.0F, 0.0F);
		neckunder3.setTextureOffset(22, 85).addBox(-2.64F, -3.2611F, -5.3204F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		neckunder3.setModelRendererName("neckunder3");
		this.registerModelRenderer(neckunder3);

		neckunder4 = new AnimatedModelRenderer(this);
		neckunder4.setRotationPoint(0.0F, 0.0F, -5.2F);
		neckunder3.addChild(neckunder4);
		setRotationAngle(neckunder4, 0.3292F, 0.0F, 0.0F);
		neckunder4.setTextureOffset(0, 85).addBox(-2.64F, -3.2611F, -5.3204F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		neckunder4.setModelRendererName("neckunder4");
		this.registerModelRenderer(neckunder4);

		tailbase = new AnimatedModelRenderer(this);
		tailbase.setRotationPoint(0.0F, -2.6606F, 5.79F);
		body1.addChild(tailbase);
		setRotationAngle(tailbase, 0.1026F, 0.0F, 0.0F);
		tailbase.setTextureOffset(56, 0).addBox(-5.0F, -5.1692F, -0.3511F, 11.0F, 12.0F, 6.0F, 0.0F, false);
		tailbase.setTextureOffset(0, 3).addBox(0.5F, -6.9791F, 0.5761F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		tailbase.setModelRendererName("tailbase");
		this.registerModelRenderer(tailbase);

		tail = new AnimatedModelRenderer(this);
		tail.setRotationPoint(0.5F, -0.0698F, 4.7295F);
		tailbase.addChild(tail);
		setRotationAngle(tail, 0.0179F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 53).addBox(-4.0F, -4.6954F, -0.1763F, 8.0F, 10.0F, 9.0F, 0.0F, false);
		tail.setTextureOffset(48, 33).addBox(0.0F, -6.5093F, 1.3466F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		tail.setModelRendererName("tail");
		this.registerModelRenderer(tail);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.2954F, 8.6275F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.0349F, 0.0F, 0.0F);
		tail2.setTextureOffset(45, 18).addBox(-3.5F, -3.9F, -0.4F, 7.0F, 8.0F, 11.0F, 0.0F, false);
		tail2.setTextureOffset(48, 33).addBox(0.0F, -5.3139F, 0.5191F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.1F, 10.6F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.063F, 0.0F, 0.0F);
		tail3.setTextureOffset(53, 65).addBox(-2.5F, -3.4132F, -0.1883F, 5.0F, 7.0F, 9.0F, 0.0F, false);
		tail3.setTextureOffset(48, 33).addBox(0.0F, -4.7139F, -2.7809F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		tail4 = new AnimatedModelRenderer(this);
		tail4.setRotationPoint(0.0F, -0.1714F, 9.0474F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, -0.0873F, 0.0F, 0.0F);
		tail4.setTextureOffset(0, 72).addBox(-2.0F, -2.3F, -0.6F, 4.0F, 5.0F, 8.0F, 0.0F, false);
		tail4.setModelRendererName("tail4");
		this.registerModelRenderer(tail4);

		tail5 = new AnimatedModelRenderer(this);
		tail5.setRotationPoint(0.0F, -0.1F, 7.4F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, -0.0911F, 0.0F, 0.0F);
		tail5.setTextureOffset(71, 71).addBox(-1.0F, -2.0313F, -0.8063F, 2.0F, 4.0F, 10.0F, 0.0F, false);
		tail5.setModelRendererName("tail5");
		this.registerModelRenderer(tail5);

		r1 = new AnimatedModelRenderer(this);
		r1.setRotationPoint(-4.5F, -1.2993F, 0.9917F);
		body1.addChild(r1);
		setRotationAngle(r1, -0.2948F, 0.0F, 0.0F);
		r1.setTextureOffset(25, 65).addBox(-4.0F, -1.0592F, -4.0839F, 5.0F, 11.0F, 9.0F, 0.0F, false);
		r1.setModelRendererName("r1");
		this.registerModelRenderer(r1);

		r2 = new AnimatedModelRenderer(this);
		r2.setRotationPoint(-0.5F, 8.0408F, -1.9839F);
		r1.addChild(r2);
		setRotationAngle(r2, 1.0633F, 0.0F, 0.0F);
		r2.setTextureOffset(70, 37).addBox(-3.0F, -0.5889F, -2.1918F, 4.0F, 9.0F, 7.0F, 0.0F, false);
		r2.setModelRendererName("r2");
		this.registerModelRenderer(r2);

		r3 = new AnimatedModelRenderer(this);
		r3.setRotationPoint(-0.5F, 6.3111F, 0.8082F);
		r2.addChild(r3);
		setRotationAngle(r3, -0.942F, 0.0F, 0.0F);
		r3.setTextureOffset(72, 85).addBox(-2.02F, -1.2037F, -2.0337F, 3.0F, 9.0F, 5.0F, 0.0F, false);
		r3.setModelRendererName("r3");
		this.registerModelRenderer(r3);

		r4 = new AnimatedModelRenderer(this);
		r4.setRotationPoint(-1.0F, 6.6963F, 0.1663F);
		r3.addChild(r4);
		setRotationAngle(r4, 0.2609F, 0.0F, 0.0F);
		r4.setTextureOffset(70, 18).addBox(-1.5F, -0.3888F, -5.9913F, 4.0F, 2.0F, 9.0F, 0.0F, false);
		r4.setModelRendererName("r4");
		this.registerModelRenderer(r4);

		l1 = new AnimatedModelRenderer(this);
		l1.setRotationPoint(5.5F, -0.5993F, 0.9917F);
		body1.addChild(l1);
		setRotationAngle(l1, -0.2948F, 0.0F, 0.0F);
		l1.setTextureOffset(25, 65).addBox(-1.0F, -1.729F, -4.2873F, 5.0F, 11.0F, 9.0F, 0.0F, true);
		l1.setModelRendererName("l1");
		this.registerModelRenderer(l1);

		l2 = new AnimatedModelRenderer(this);
		l2.setRotationPoint(0.5F, 7.371F, -2.1873F);
		l1.addChild(l2);
		setRotationAngle(l2, 1.0633F, 0.0F, 0.0F);
		l2.setTextureOffset(70, 37).addBox(-1.0F, -0.5889F, -2.1918F, 4.0F, 9.0F, 7.0F, 0.0F, true);
		l2.setModelRendererName("l2");
		this.registerModelRenderer(l2);

		l3 = new AnimatedModelRenderer(this);
		l3.setRotationPoint(0.5F, 6.3111F, 0.8082F);
		l2.addChild(l3);
		setRotationAngle(l3, -0.942F, 0.0F, 0.0F);
		l3.setTextureOffset(72, 85).addBox(-0.98F, -1.2037F, -2.0337F, 3.0F, 9.0F, 5.0F, 0.0F, true);
		l3.setModelRendererName("l3");
		this.registerModelRenderer(l3);

		l4 = new AnimatedModelRenderer(this);
		l4.setRotationPoint(1.0F, 6.6963F, 0.1663F);
		l3.addChild(l4);
		setRotationAngle(l4, 0.2609F, 0.0F, 0.0F);
		l4.setTextureOffset(70, 18).addBox(-2.5F, -0.3888F, -5.9913F, 4.0F, 2.0F, 9.0F, 0.0F, true);
		l4.setModelRendererName("l4");
		this.registerModelRenderer(l4);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 4.3F, -0.5F);
		body1.addChild(bone);
		setRotationAngle(bone, -0.3316F, 0.0F, 0.0F);
		bone.setTextureOffset(36, 90).addBox(-2.0F, -6.0F, -5.0F, 5.0F, 9.0F, 13.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		this.rootBones.add(root);
	}
}