package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class DunkleosteusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer body2;
	private final AnimatedModelRenderer body3;
	private final AnimatedModelRenderer body4;
	private final AnimatedModelRenderer body5;
	private final AnimatedModelRenderer body6;
	private final AnimatedModelRenderer body7;
	private final AnimatedModelRenderer body8;
	private final AnimatedModelRenderer body9;
	private final AnimatedModelRenderer body10;
	private final AnimatedModelRenderer body11;
	private final AnimatedModelRenderer body12;
	private final AnimatedModelRenderer TailHD1;
	private final AnimatedModelRenderer underfin1;
	private final AnimatedModelRenderer Underfin12;
	private final AnimatedModelRenderer underfin2;
	private final AnimatedModelRenderer Underfin22;
	private final AnimatedModelRenderer FinHD;
	private final AnimatedModelRenderer head1;
	private final AnimatedModelRenderer jaw1;
	private final AnimatedModelRenderer jaw2;
	private final AnimatedModelRenderer Upperjaw;
	private final AnimatedModelRenderer toothplate1;
	private final AnimatedModelRenderer toothplate2;
	private final AnimatedModelRenderer Upperjaw2;
	private final AnimatedModelRenderer toothplate3;
	private final AnimatedModelRenderer toothplate4;
	private final AnimatedModelRenderer toothplate5;
	private final AnimatedModelRenderer toothplate6;
	private final AnimatedModelRenderer toothplate7;
	private final AnimatedModelRenderer toothplate8;
	private final AnimatedModelRenderer head2;
	private final AnimatedModelRenderer head3;
	private final AnimatedModelRenderer head4;
	private final AnimatedModelRenderer HeadPlate;
	private final AnimatedModelRenderer jaw3;
	private final AnimatedModelRenderer jaw4;
	private final AnimatedModelRenderer jaw5;
	private final AnimatedModelRenderer jaw6;
	private final AnimatedModelRenderer finleft1;
	private final AnimatedModelRenderer finleft12;
	private final AnimatedModelRenderer finright1;
	private final AnimatedModelRenderer finright12;

    public DunkleosteusModel()
    {
        textureWidth = 200;
		textureHeight = 200;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(-8.0F, 20.2F, 9.2F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(8.5F, -5.9F, -24.6F);
		root.addChild(body);
		setRotationAngle(body, 0.018F, 0.0F, 0.0F);
		body.setTextureOffset(141, 2).addBox(-8.0F, -8.5F, -6.5F, 16.0F, 17.0F, 13.0F, 0.0F, true);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		body2 = new AnimatedModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, 5.1F);
		body.addChild(body2);
		setRotationAngle(body2, -0.0456F, 0.0F, 0.0F);
		body2.setTextureOffset(141, 33).addBox(-7.5F, -8.0F, 0.0F, 15.0F, 16.0F, 13.0F, 0.0F, true);
		body2.setModelRendererName("body2");
		this.registerModelRenderer(body2);

		body3 = new AnimatedModelRenderer(this);
		body3.setRotationPoint(0.0F, -1.2F, 12.0F);
		body2.addChild(body3);
		setRotationAngle(body3, -0.0456F, 0.0F, 0.0F);
		body3.setTextureOffset(152, 63).addBox(-7.0F, -6.5F, 0.0F, 14.0F, 15.0F, 9.0F, 0.0F, true);
		body3.setModelRendererName("body3");
		this.registerModelRenderer(body3);

		body4 = new AnimatedModelRenderer(this);
		body4.setRotationPoint(0.0F, 1.0F, 8.0F);
		body3.addChild(body4);
		setRotationAngle(body4, 0.0843F, 0.0F, 0.0F);
		body4.setTextureOffset(155, 88).addBox(-6.5F, -7.0F, 0.0F, 13.0F, 14.0F, 9.0F, 0.0F, true);
		body4.setModelRendererName("body4");
		this.registerModelRenderer(body4);

		body5 = new AnimatedModelRenderer(this);
		body5.setRotationPoint(0.0F, -0.1F, 7.9F);
		body4.addChild(body5);
		setRotationAngle(body5, 0.0456F, 0.0F, 0.0F);
		body5.setTextureOffset(161, 112).addBox(-5.5F, -6.5F, 0.0F, 11.0F, 13.0F, 8.0F, 0.0F, true);
		body5.setModelRendererName("body5");
		this.registerModelRenderer(body5);

		body6 = new AnimatedModelRenderer(this);
		body6.setRotationPoint(0.0F, 0.1F, 6.0F);
		body5.addChild(body6);
		setRotationAngle(body6, -0.0168F, 0.0F, 0.0F);
		body6.setTextureOffset(162, 136).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 12.0F, 8.0F, 0.0F, true);
		body6.setModelRendererName("body6");
		this.registerModelRenderer(body6);

		body7 = new AnimatedModelRenderer(this);
		body7.setRotationPoint(0.0F, 0.1F, 6.0F);
		body6.addChild(body7);
		setRotationAngle(body7, 0.0466F, 0.0F, 0.0F);
		body7.setTextureOffset(164, 158).addBox(-4.5F, -5.0F, 0.0F, 9.0F, 10.0F, 8.0F, 0.0F, true);
		body7.setModelRendererName("body7");
		this.registerModelRenderer(body7);

		body8 = new AnimatedModelRenderer(this);
		body8.setRotationPoint(0.0F, 0.1F, 6.0F);
		body7.addChild(body8);
		setRotationAngle(body8, 0.0403F, 0.0F, 0.0F);
		body8.setTextureOffset(167, 177).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);
		body8.setModelRendererName("body8");
		this.registerModelRenderer(body8);

		body9 = new AnimatedModelRenderer(this);
		body9.setRotationPoint(0.0F, -0.2F, 6.0F);
		body8.addChild(body9);
		setRotationAngle(body9, -0.0051F, 0.0F, 0.0F);
		body9.setTextureOffset(137, 179).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, 0.0F, true);
		body9.setModelRendererName("body9");
		this.registerModelRenderer(body9);

		body10 = new AnimatedModelRenderer(this);
		body10.setRotationPoint(0.0F, -0.2F, 5.5F);
		body9.addChild(body10);
		setRotationAngle(body10, -0.0881F, 0.0F, 0.0F);
		body10.setTextureOffset(137, 165).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 8.0F, 0.0F, true);
		body10.setModelRendererName("body10");
		this.registerModelRenderer(body10);

		body11 = new AnimatedModelRenderer(this);
		body11.setRotationPoint(0.0F, -2.0F, 6.0F);
		body10.addChild(body11);
		setRotationAngle(body11, -0.0525F, 0.0F, 0.0F);
		body11.setTextureOffset(137, 152).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 8.0F, 0.0F, true);
		body11.setModelRendererName("body11");
		this.registerModelRenderer(body11);

		body12 = new AnimatedModelRenderer(this);
		body12.setRotationPoint(0.0F, 2.0F, 6.0F);
		body11.addChild(body12);
		setRotationAngle(body12, -0.0068F, 0.0F, 0.0F);
		body12.setTextureOffset(137, 140).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 8.0F, 0.0F, true);
		body12.setModelRendererName("body12");
		this.registerModelRenderer(body12);

		TailHD1 = new AnimatedModelRenderer(this);
		TailHD1.setRotationPoint(0.0F, -0.5F, 6.0F);
		body7.addChild(TailHD1);
		setRotationAngle(TailHD1, -0.0911F, 0.0F, 0.0F);
		TailHD1.setTextureOffset(61, 135).addBox(0.0F, -12.5F, 0.0F, 0.0F, 25.0F, 37.0F, 0.0F, true);
		TailHD1.setModelRendererName("TailHD1");
		this.registerModelRenderer(TailHD1);

		underfin1 = new AnimatedModelRenderer(this);
		underfin1.setRotationPoint(4.7F, 5.6F, 2.5F);
		body4.addChild(underfin1);
		setRotationAngle(underfin1, -2.5498F, 0.0456F, -0.8334F);
		underfin1.setTextureOffset(15, 110).addBox(-1.5F, -7.5F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);
		underfin1.setModelRendererName("underfin1");
		this.registerModelRenderer(underfin1);

		Underfin12 = new AnimatedModelRenderer(this);
		Underfin12.setRotationPoint(0.0F, -3.3F, 0.0F);
		underfin1.addChild(Underfin12);
		setRotationAngle(Underfin12, -0.0227F, 0.0F, 0.0F);
		Underfin12.setTextureOffset(15, 117).addBox(0.0F, -10.0F, -3.7F, 0.0F, 11.0F, 7.0F, 0.0F, false);
		Underfin12.setModelRendererName("Underfin12");
		this.registerModelRenderer(Underfin12);

		underfin2 = new AnimatedModelRenderer(this);
		underfin2.setRotationPoint(-4.8F, 5.6F, 2.5F);
		body4.addChild(underfin2);
		setRotationAngle(underfin2, -2.5498F, -0.0456F, 0.8334F);
		underfin2.setTextureOffset(0, 110).addBox(-1.5F, -7.5F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);
		underfin2.setModelRendererName("underfin2");
		this.registerModelRenderer(underfin2);

		Underfin22 = new AnimatedModelRenderer(this);
		Underfin22.setRotationPoint(0.0F, -3.3F, 0.0F);
		underfin2.addChild(Underfin22);
		setRotationAngle(Underfin22, -0.0227F, 0.0F, 0.0F);
		Underfin22.setTextureOffset(0, 117).addBox(0.0F, -10.0F, -3.7F, 0.0F, 11.0F, 7.0F, 0.0F, false);
		Underfin22.setModelRendererName("Underfin22");
		this.registerModelRenderer(Underfin22);

		FinHD = new AnimatedModelRenderer(this);
		FinHD.setRotationPoint(0.0F, -7.0F, -5.6F);
		body3.addChild(FinHD);
		setRotationAngle(FinHD, 0.0038F, 0.0F, 0.0F);
		FinHD.setTextureOffset(13, 160).addBox(0.0F, -6.5F, 0.0F, 0.0F, 13.0F, 23.0F, 0.0F, true);
		FinHD.setModelRendererName("FinHD");
		this.registerModelRenderer(FinHD);

		head1 = new AnimatedModelRenderer(this);
		head1.setRotationPoint(0.0F, -0.5F, -5.8F);
		body.addChild(head1);
		setRotationAngle(head1, -0.0456F, 0.0F, 0.0F);
		head1.setTextureOffset(0, 0).addBox(-7.0F, -7.5F, -6.5F, 14.0F, 16.0F, 7.0F, 0.0F, true);
		head1.setModelRendererName("head1");
		this.registerModelRenderer(head1);

		jaw1 = new AnimatedModelRenderer(this);
		jaw1.setRotationPoint(0.0F, -1.8F, -5.0F);
		head1.addChild(jaw1);
		setRotationAngle(jaw1, -0.0113F, 0.0F, 0.0F);
		jaw1.setTextureOffset(0, 70).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 6.0F, 6.0F, 0.0F, true);
		jaw1.setModelRendererName("jaw1");
		this.registerModelRenderer(jaw1);

		jaw2 = new AnimatedModelRenderer(this);
		jaw2.setRotationPoint(0.0F, 0.0F, -5.5F);
		jaw1.addChild(jaw2);
		setRotationAngle(jaw2, -0.0113F, 0.0F, 0.0F);
		jaw2.setTextureOffset(0, 58).addBox(-5.0F, -3.0F, -6.0F, 10.0F, 5.0F, 6.0F, 0.0F, true);
		jaw2.setModelRendererName("jaw2");
		this.registerModelRenderer(jaw2);

		Upperjaw = new AnimatedModelRenderer(this);
		Upperjaw.setRotationPoint(2.5F, 2.5F, -4.7F);
		jaw2.addChild(Upperjaw);
		setRotationAngle(Upperjaw, 0.0F, 0.1044F, 0.0F);
		Upperjaw.setTextureOffset(43, 39).addBox(-3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, true);
		Upperjaw.setModelRendererName("Upperjaw");
		this.registerModelRenderer(Upperjaw);

		toothplate1 = new AnimatedModelRenderer(this);
		toothplate1.setRotationPoint(1.817F, -1.8018F, -0.4367F);
		Upperjaw.addChild(toothplate1);
		setRotationAngle(toothplate1, 0.2189F, 0.0F, -0.147F);
		toothplate1.setTextureOffset(43, 44).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		toothplate1.setModelRendererName("toothplate1");
		this.registerModelRenderer(toothplate1);

		toothplate2 = new AnimatedModelRenderer(this);
		toothplate2.setRotationPoint(0.0F, 1.7F, 0.0F);
		toothplate1.addChild(toothplate2);
		setRotationAngle(toothplate2, 0.1684F, 0.0F, -0.0705F);
		toothplate2.setTextureOffset(43, 49).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		toothplate2.setModelRendererName("toothplate2");
		this.registerModelRenderer(toothplate2);

		Upperjaw2 = new AnimatedModelRenderer(this);
		Upperjaw2.setRotationPoint(-2.5F, 2.5F, -4.7F);
		jaw2.addChild(Upperjaw2);
		setRotationAngle(Upperjaw2, 0.0F, -0.1044F, 0.0F);
		Upperjaw2.setTextureOffset(77, 39).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
		Upperjaw2.setModelRendererName("Upperjaw2");
		this.registerModelRenderer(Upperjaw2);

		toothplate3 = new AnimatedModelRenderer(this);
		toothplate3.setRotationPoint(1.8999F, -1.0997F, -0.4102F);
		Upperjaw2.addChild(toothplate3);
		setRotationAngle(toothplate3, 0.2189F, 0.0F, 0.147F);
		toothplate3.setTextureOffset(77, 44).addBox(-4.0F, 0.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		toothplate3.setModelRendererName("toothplate3");
		this.registerModelRenderer(toothplate3);

		toothplate4 = new AnimatedModelRenderer(this);
		toothplate4.setRotationPoint(0.0587F, 1.7902F, -0.0658F);
		toothplate3.addChild(toothplate4);
		setRotationAngle(toothplate4, 0.1684F, 0.0F, 0.0705F);
		toothplate4.setTextureOffset(77, 49).addBox(-4.1F, 0.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		toothplate4.setModelRendererName("toothplate4");
		this.registerModelRenderer(toothplate4);

		toothplate5 = new AnimatedModelRenderer(this);
		toothplate5.setRotationPoint(4.5F, 1.4F, -2.9F);
		jaw2.addChild(toothplate5);
		setRotationAngle(toothplate5, 0.2712F, 0.0F, 0.0F);
		toothplate5.setTextureOffset(43, 53).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		toothplate5.setModelRendererName("toothplate5");
		this.registerModelRenderer(toothplate5);

		toothplate6 = new AnimatedModelRenderer(this);
		toothplate6.setRotationPoint(0.0F, 1.7F, 0.0F);
		toothplate5.addChild(toothplate6);
		setRotationAngle(toothplate6, 0.0876F, 0.0F, 0.0F);
		toothplate6.setTextureOffset(43, 59).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		toothplate6.setModelRendererName("toothplate6");
		this.registerModelRenderer(toothplate6);

		toothplate7 = new AnimatedModelRenderer(this);
		toothplate7.setRotationPoint(-3.5F, 1.4F, -2.9F);
		jaw2.addChild(toothplate7);
		setRotationAngle(toothplate7, 0.2712F, 0.0F, 0.0F);
		toothplate7.setTextureOffset(80, 53).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		toothplate7.setModelRendererName("toothplate7");
		this.registerModelRenderer(toothplate7);

		toothplate8 = new AnimatedModelRenderer(this);
		toothplate8.setRotationPoint(0.0F, 1.7F, 0.0F);
		toothplate7.addChild(toothplate8);
		setRotationAngle(toothplate8, 0.0876F, 0.0F, 0.0F);
		toothplate8.setTextureOffset(80, 59).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		toothplate8.setModelRendererName("toothplate8");
		this.registerModelRenderer(toothplate8);

		head2 = new AnimatedModelRenderer(this);
		head2.setRotationPoint(0.0F, -2.6F, -1.2F);
		jaw1.addChild(head2);
		setRotationAngle(head2, 0.0456F, 0.0F, 0.0F);
		head2.setTextureOffset(0, 24).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 6.0F, 5.0F, 0.0F, true);
		head2.setModelRendererName("head2");
		this.registerModelRenderer(head2);

		head3 = new AnimatedModelRenderer(this);
		head3.setRotationPoint(0.01F, -1.9F, -6.3F);
		jaw1.addChild(head3);
		setRotationAngle(head3, 0.2053F, 0.0F, 0.0F);
		head3.setTextureOffset(0, 37).addBox(-5.0F, -3.0F, -3.0F, 10.0F, 6.0F, 4.0F, 0.0F, true);
		head3.setModelRendererName("head3");
		this.registerModelRenderer(head3);

		head4 = new AnimatedModelRenderer(this);
		head4.setRotationPoint(-0.01F, -1.8F, -8.1F);
		jaw1.addChild(head4);
		setRotationAngle(head4, 0.6308F, 0.0F, 0.0F);
		head4.setTextureOffset(0, 49).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 6.0F, 2.0F, 0.0F, true);
		head4.setModelRendererName("head4");
		this.registerModelRenderer(head4);

		HeadPlate = new AnimatedModelRenderer(this);
		HeadPlate.setRotationPoint(0.0F, 1.9F, -7.7F);
		head1.addChild(HeadPlate);
		setRotationAngle(HeadPlate, -0.9107F, 0.0F, 0.0F);
		HeadPlate.setTextureOffset(43, 0).addBox(-6.5F, -3.0F, -6.0F, 13.0F, 6.0F, 12.0F, 0.0F, true);
		HeadPlate.setModelRendererName("HeadPlate");
		this.registerModelRenderer(HeadPlate);

		jaw3 = new AnimatedModelRenderer(this);
		jaw3.setRotationPoint(2.8F, 8.4F, -5.0F);
		head1.addChild(jaw3);
		setRotationAngle(jaw3, 0.0F, 0.2569F, 0.0F);
		jaw3.setTextureOffset(43, 19).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, true);
		jaw3.setModelRendererName("jaw3");
		this.registerModelRenderer(jaw3);

		jaw4 = new AnimatedModelRenderer(this);
		jaw4.setRotationPoint(0.0F, 0.0F, -4.5F);
		jaw3.addChild(jaw4);
		setRotationAngle(jaw4, -0.0464F, 0.0F, 0.0F);
		jaw4.setTextureOffset(43, 29).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		jaw4.setModelRendererName("jaw4");
		this.registerModelRenderer(jaw4);

		jaw5 = new AnimatedModelRenderer(this);
		jaw5.setRotationPoint(-5.5F, 0.0F, -1.5F);
		jaw3.addChild(jaw5);
		setRotationAngle(jaw5, -0.0113F, -0.5138F, 0.0F);
		jaw5.setTextureOffset(67, 19).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, true);
		jaw5.setModelRendererName("jaw5");
		this.registerModelRenderer(jaw5);

		jaw6 = new AnimatedModelRenderer(this);
		jaw6.setRotationPoint(0.0F, 0.1F, -4.5F);
		jaw5.addChild(jaw6);
		setRotationAngle(jaw6, -0.0464F, 0.0F, 0.0F);
		jaw6.setTextureOffset(71, 29).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		jaw6.setModelRendererName("jaw6");
		this.registerModelRenderer(jaw6);

		finleft1 = new AnimatedModelRenderer(this);
		finleft1.setRotationPoint(4.3F, 5.4F, -1.9F);
		body.addChild(finleft1);
		setRotationAngle(finleft1, -1.7752F, 0.7728F, -0.182F);
		finleft1.setTextureOffset(15, 83).addBox(0.0F, -8.5F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, true);
		finleft1.setModelRendererName("finleft1");
		this.registerModelRenderer(finleft1);

		finleft12 = new AnimatedModelRenderer(this);
		finleft12.setRotationPoint(1.5F, -3.3F, 0.0F);
		finleft1.addChild(finleft12);
		setRotationAngle(finleft12, 0.0291F, 0.0F, 0.0F);
		finleft12.setTextureOffset(15, 91).addBox(0.0F, -10.0F, -3.7F, 0.0F, 11.0F, 7.0F, 0.0F, true);
		finleft12.setModelRendererName("finleft12");
		this.registerModelRenderer(finleft12);

		finright1 = new AnimatedModelRenderer(this);
		finright1.setRotationPoint(-4.3F, 5.4F, -1.9F);
		body.addChild(finright1);
		setRotationAngle(finright1, -1.8668F, -0.8196F, 0.2276F);
		finright1.setTextureOffset(0, 83).addBox(-3.0F, -8.5F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, true);
		finright1.setModelRendererName("finright1");
		this.registerModelRenderer(finright1);

		finright12 = new AnimatedModelRenderer(this);
		finright12.setRotationPoint(-1.5F, -3.3F, 0.0F);
		finright1.addChild(finright12);
		setRotationAngle(finright12, 0.0291F, 0.0F, 0.0F);
		finright12.setTextureOffset(0, 91).addBox(0.0F, -10.0F, -3.7F, 0.0F, 11.0F, 7.0F, 0.0F, true);
		finright12.setModelRendererName("finright12");
		this.registerModelRenderer(finright12);

		this.rootBones.add(root);
	}
}