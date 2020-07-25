package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
public class PteranodonModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body1;
	private final AnimatedModelRenderer Body2;
	private final AnimatedModelRenderer Body3;
	private final AnimatedModelRenderer Neck1;
	private final AnimatedModelRenderer Neck2;
	private final AnimatedModelRenderer Neck3;
	private final AnimatedModelRenderer Neck7;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Upperjaw3;
	private final AnimatedModelRenderer Upperjaw1;
	private final AnimatedModelRenderer Upperjaw4;
	private final AnimatedModelRenderer Upperjaw2;
//	private final AnimatedModelRenderer Upperjaw2;
//	private final AnimatedModelRenderer Upperjaw2;
//	private final AnimatedModelRenderer Upperjaw2;
//	private final AnimatedModelRenderer Upperjaw2;
//	private final AnimatedModelRenderer Upperjaw7;
//	private final AnimatedModelRenderer Upperjaw7;
//	private final AnimatedModelRenderer Upperjaw7;
//	private final AnimatedModelRenderer Upperjaw7;
	private final AnimatedModelRenderer Lowerjaw1;
	private final AnimatedModelRenderer Lowerjaw2;
	private final AnimatedModelRenderer Lowerjaw3;
//	private final AnimatedModelRenderer Lowerjaw3;
//	private final AnimatedModelRenderer Lowerjaw3;
	private final AnimatedModelRenderer Lowerjaw6;
	private final AnimatedModelRenderer CHEEK;
	private final AnimatedModelRenderer CHEEK2;
	private final AnimatedModelRenderer Neck4;
	private final AnimatedModelRenderer Neck5;
	private final AnimatedModelRenderer Neck6;
	private final AnimatedModelRenderer Neck8;
	private final AnimatedModelRenderer armleft;
	private final AnimatedModelRenderer armleftr;
	private final AnimatedModelRenderer armleft3;
	private final AnimatedModelRenderer armleftfoot;
	private final AnimatedModelRenderer armleft4;
	private final AnimatedModelRenderer armleft5;
	private final AnimatedModelRenderer leftmembrane5;
	private final AnimatedModelRenderer leftmembrane4;
	private final AnimatedModelRenderer leftmembrane3;
	private final AnimatedModelRenderer leftmembrane;
	private final AnimatedModelRenderer leftmembrane1;
	private final AnimatedModelRenderer armright;
	private final AnimatedModelRenderer armright6;
	private final AnimatedModelRenderer armright7;
	private final AnimatedModelRenderer armrightfoot;
	private final AnimatedModelRenderer armright8;
	private final AnimatedModelRenderer armright9;
	private final AnimatedModelRenderer rightmembrane;
	private final AnimatedModelRenderer rightmembrane6;
	private final AnimatedModelRenderer rightmembrane7;
	private final AnimatedModelRenderer rightmembrane8;
	private final AnimatedModelRenderer rightmembrane9;
	private final AnimatedModelRenderer hip;
	private final AnimatedModelRenderer Tail2;
	private final AnimatedModelRenderer Tail3;
	private final AnimatedModelRenderer legright1;
	private final AnimatedModelRenderer legright2;
	private final AnimatedModelRenderer legright4;
	private final AnimatedModelRenderer legleft3;
	private final AnimatedModelRenderer legleft5;
	private final AnimatedModelRenderer legleft6;

    public PteranodonModel()
    {
        textureWidth = 96;
		textureHeight = 96;
		root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body1 = new AnimatedModelRenderer(this);
		Body1.setRotationPoint(0.0F, 12.7F, 9.0F);
		root.addChild(Body1);
		setRotationAngle(Body1, -0.5206F, 0.0F, 0.0F);
		Body1.setTextureOffset(46, 0).addBox(-3.5F, -5.0F, -7.0F, 7.0F, 8.0F, 7.0F, 0.0F, false);
		Body1.setModelRendererName("Body1");
		this.registerModelRenderer(Body1);

		Body2 = new AnimatedModelRenderer(this);
		Body2.setRotationPoint(1.0F, -5.1F, -6.6F);
		Body1.addChild(Body2);
		setRotationAngle(Body2, 0.1175F, 0.0F, 0.0F);
		Body2.setTextureOffset(19, 19).addBox(-5.0F, 0.0F, -9.0F, 8.0F, 9.0F, 9.0F, 0.0F, false);
		Body2.setModelRendererName("Body2");
		this.registerModelRenderer(Body2);

		Body3 = new AnimatedModelRenderer(this);
		Body3.setRotationPoint(-1.0F, 3.4F, -8.4F);
		Body2.addChild(Body3);
		setRotationAngle(Body3, -0.1068F, 0.0F, 0.0F);
		Body3.setTextureOffset(22, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 7.0F, 5.0F, 0.0F, false);
		Body3.setModelRendererName("Body3");
		this.registerModelRenderer(Body3);

		Neck1 = new AnimatedModelRenderer(this);
		Neck1.setRotationPoint(-0.5F, -1.1F, -1.1F);
		Body3.addChild(Neck1);
		setRotationAngle(Neck1, -0.3807F, 0.0F, 0.0F);
		Neck1.setTextureOffset(12, 63).addBox(-1.0F, -1.5F, -4.0F, 3.0F, 6.0F, 4.0F, 0.02F, false);
		Neck1.setModelRendererName("Neck1");
		this.registerModelRenderer(Neck1);

		Neck2 = new AnimatedModelRenderer(this);
		Neck2.setRotationPoint(0.0F, 0.1F, -3.0F);
		Neck1.addChild(Neck2);
		setRotationAngle(Neck2, -0.2049F, 0.0F, 0.0F);
		Neck2.setTextureOffset(14, 73).addBox(-1.0F, -1.5F, -2.0F, 3.0F, 6.0F, 2.0F, 0.01F, false);
		Neck2.setModelRendererName("Neck2");
		this.registerModelRenderer(Neck2);

		Neck3 = new AnimatedModelRenderer(this);
		Neck3.setRotationPoint(0.0F, -0.3F, -1.2F);
		Neck2.addChild(Neck3);
		setRotationAngle(Neck3, -0.2443F, 0.0F, 0.0F);
		Neck3.setTextureOffset(54, 40).addBox(-1.0F, -1.0F, -4.5F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		Neck3.setModelRendererName("Neck3");
		this.registerModelRenderer(Neck3);

		Neck7 = new AnimatedModelRenderer(this);
		Neck7.setRotationPoint(0.0F, -0.1F, -4.5F);
		Neck3.addChild(Neck7);
		setRotationAngle(Neck7, 0.3421F, 0.0F, 0.0F);
		Neck7.setTextureOffset(35, 58).addBox(-1.0F, -0.8F, -4.6F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		Neck7.setModelRendererName("Neck7");
		this.registerModelRenderer(Neck7);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.3F, -3.9F);
		Neck7.addChild(Head);
		setRotationAngle(Head, 1.215F, 0.0F, 0.0F);
		Head.setTextureOffset(44, 17).addBox(-1.5F, -1.0F, -6.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Upperjaw3 = new AnimatedModelRenderer(this);
		Upperjaw3.setRotationPoint(0.0F, 1.0F, -5.5F);
		Head.addChild(Upperjaw3);
		setRotationAngle(Upperjaw3, 0.0344F, 0.0F, 0.0F);
		Upperjaw3.setTextureOffset(0, 26).addBox(-1.0F, -1.0F, -6.0F, 3.0F, 4.0F, 6.0F, 0.0F, false);
		Upperjaw3.setModelRendererName("Upperjaw3");
		this.registerModelRenderer(Upperjaw3);

		Upperjaw1 = new AnimatedModelRenderer(this);
		Upperjaw1.setRotationPoint(0.0F, 0.0F, -5.8F);
		Upperjaw3.addChild(Upperjaw1);
		setRotationAngle(Upperjaw1, -0.0614F, 0.0F, 0.0F);
		Upperjaw1.setTextureOffset(0, 68).addBox(-0.5F, 0.0F, -5.0F, 2.0F, 3.0F, 5.0F, -0.01F, false);
		Upperjaw1.setModelRendererName("Upperjaw1");
		this.registerModelRenderer(Upperjaw1);

		Upperjaw4 = new AnimatedModelRenderer(this);
		Upperjaw4.setRotationPoint(0.5F, 0.7F, -10.5F);
		Upperjaw3.addChild(Upperjaw4);
		setRotationAngle(Upperjaw4, -0.1094F, 0.0F, 0.0F);
		Upperjaw4.setTextureOffset(0, 59).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Upperjaw4.setModelRendererName("Upperjaw4");
		this.registerModelRenderer(Upperjaw4);

		Upperjaw2 = new AnimatedModelRenderer(this);
		Upperjaw2.setRotationPoint(0.0F, 1.0F, -5.7F);
		Upperjaw4.addChild(Upperjaw2);
		setRotationAngle(Upperjaw2, -0.0822F, 0.0F, 0.0F);
		Upperjaw2.setTextureOffset(65, 34).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		Upperjaw2.setModelRendererName("Upperjaw2");
		this.registerModelRenderer(Upperjaw2);
//
//		Upperjaw2 = new AnimatedModelRenderer(this);
//		Upperjaw2.setRotationPoint(0.0F, -1.0F, 0.0F);
//		Upperjaw2.addChild(Upperjaw2);
//		setRotationAngle(Upperjaw2, 0.1626F, 0.0F, 0.0F);
//		Upperjaw2.setTextureOffset(64, 45).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 6.0F, -0.01F, false);
//		Upperjaw2.setModelRendererName("Upperjaw2");
//		this.registerModelRenderer(Upperjaw2);
//
//		Upperjaw2 = new AnimatedModelRenderer(this);
//		Upperjaw2.setRotationPoint(0.0F, -1.0F, 0.0F);
//		Upperjaw4.addChild(Upperjaw2);
//		setRotationAngle(Upperjaw2, 0.1669F, 0.0F, 0.0F);
//		Upperjaw2.setTextureOffset(64, 23).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 6.0F, 0.01F, false);
//		Upperjaw2.setModelRendererName("Upperjaw2");
//		this.registerModelRenderer(Upperjaw2);
//
//		Upperjaw2 = new AnimatedModelRenderer(this);
//		Upperjaw2.setRotationPoint(0.5F, -1.0F, -5.7F);
//		Upperjaw3.addChild(Upperjaw2);
//		setRotationAngle(Upperjaw2, 0.1382F, 0.0F, 0.0F);
//		Upperjaw2.setTextureOffset(37, 37).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
//		Upperjaw2.setModelRendererName("Upperjaw2");
//		this.registerModelRenderer(Upperjaw2);
//
//		Upperjaw2 = new AnimatedModelRenderer(this);
//		Upperjaw2.setRotationPoint(0.5F, -2.0F, 0.0F);
//		Upperjaw3.addChild(Upperjaw2);
//		setRotationAngle(Upperjaw2, 0.1626F, 0.0F, 0.0F);
//		Upperjaw2.setTextureOffset(62, 62).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
//		Upperjaw2.setModelRendererName("Upperjaw2");
//		this.registerModelRenderer(Upperjaw2);

//		Upperjaw7 = new AnimatedModelRenderer(this);
//		Upperjaw7.setRotationPoint(0.0F, -0.8F, 8.0F);
//		Upperjaw2.addChild(Upperjaw7);
//		setRotationAngle(Upperjaw7, -2.9739F, 0.0F, 0.0F);
//		Upperjaw7.setTextureOffset(74, 21).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
//		Upperjaw7.setModelRendererName("Upperjaw7");
//		this.registerModelRenderer(Upperjaw7);
//
//		Upperjaw7 = new AnimatedModelRenderer(this);
//		Upperjaw7.setRotationPoint(0.0F, 0.5F, -3.5F);
//		Upperjaw7.addChild(Upperjaw7);
//		setRotationAngle(Upperjaw7, -0.2478F, 0.0F, 0.0F);
//		Upperjaw7.setTextureOffset(46, 37).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
//		Upperjaw7.setModelRendererName("Upperjaw7");
//		this.registerModelRenderer(Upperjaw7);
//TODO: FIx if this breaks model
//		Upperjaw7 = new AnimatedModelRenderer(this);
//		Upperjaw7.setRotationPoint(0.0F, -1.1F, 0.2F);
//		Upperjaw7.addChild(Upperjaw7);
//		setRotationAngle(Upperjaw7, 0.1819F, 0.0F, 0.0F);
//		Upperjaw7.setTextureOffset(10, 59).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
//		Upperjaw7.setModelRendererName("Upperjaw7");
//		this.registerModelRenderer(Upperjaw7);
//
//		Upperjaw7 = new AnimatedModelRenderer(this);
//		Upperjaw7.setRotationPoint(0.5F, 2.4F, -5.6F);
//		Head.addChild(Upperjaw7);
//		setRotationAngle(Upperjaw7, -2.6033F, 0.0F, 0.0F);
//		Upperjaw7.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -10.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
//		Upperjaw7.setModelRendererName("Upperjaw7");
//		this.registerModelRenderer(Upperjaw7);

		Lowerjaw1 = new AnimatedModelRenderer(this);
		Lowerjaw1.setRotationPoint(0.5F, 3.8F, -2.0F);
		Head.addChild(Lowerjaw1);
		setRotationAngle(Lowerjaw1, -0.0517F, 0.0F, 0.0F);
		Lowerjaw1.setTextureOffset(22, 55).addBox(-1.5F, -0.4F, -4.0F, 3.0F, 2.0F, 6.0F, 0.02F, false);
		Lowerjaw1.setModelRendererName("Lowerjaw1");
		this.registerModelRenderer(Lowerjaw1);

		Lowerjaw2 = new AnimatedModelRenderer(this);
		Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.9F);
		Lowerjaw1.addChild(Lowerjaw2);
		setRotationAngle(Lowerjaw2, 0.0965F, 0.0F, 0.0F);
		Lowerjaw2.setTextureOffset(58, 15).addBox(-1.0F, -0.4F, -5.5F, 2.0F, 2.0F, 6.0F, 0.02F, false);
		Lowerjaw2.setModelRendererName("Lowerjaw2");
		this.registerModelRenderer(Lowerjaw2);

		Lowerjaw3 = new AnimatedModelRenderer(this);
		Lowerjaw3.setRotationPoint(-0.5F, 0.0F, -5.4F);
		Lowerjaw2.addChild(Lowerjaw3);
		setRotationAngle(Lowerjaw3, -0.0308F, 0.0F, 0.0F);
		Lowerjaw3.setTextureOffset(72, 59).addBox(0.0F, -0.4F, -5.0F, 1.0F, 1.0F, 5.0F, 0.03F, false);
		Lowerjaw3.setModelRendererName("Lowerjaw3");
		this.registerModelRenderer(Lowerjaw3);
//TODO: Fix later!!
//		Lowerjaw3 = new AnimatedModelRenderer(this);
//		Lowerjaw3.setRotationPoint(0.0F, 0.0F, -4.9F);
//		Lowerjaw3.addChild(Lowerjaw3);
//		setRotationAngle(Lowerjaw3, -0.0629F, 0.0F, 0.0F);
//		Lowerjaw3.setTextureOffset(68, 9).addBox(0.0F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, 0.03F, false);
//		Lowerjaw3.setModelRendererName("Lowerjaw3");
//		this.registerModelRenderer(Lowerjaw3);
//
//		Lowerjaw3 = new AnimatedModelRenderer(this);
//		Lowerjaw3.setRotationPoint(0.0F, 0.0F, -5.5F);
//		Lowerjaw3.addChild(Lowerjaw3);
//		setRotationAngle(Lowerjaw3, -0.0729F, 0.0F, 0.0F);
//		Lowerjaw3.setTextureOffset(67, 0).addBox(0.0F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, 0.02F, false);
//		Lowerjaw3.setModelRendererName("Lowerjaw3");
//		this.registerModelRenderer(Lowerjaw3);

		Lowerjaw6 = new AnimatedModelRenderer(this);
		Lowerjaw6.setRotationPoint(-0.5F, 1.5F, -9.0F);
		Lowerjaw1.addChild(Lowerjaw6);
		setRotationAngle(Lowerjaw6, -0.055F, 0.0F, 0.0F);
		Lowerjaw6.setTextureOffset(28, 0).addBox(0.0F, -0.5F, -16.0F, 1.0F, 1.0F, 16.0F, 0.01F, false);
		Lowerjaw6.setModelRendererName("Lowerjaw6");
		this.registerModelRenderer(Lowerjaw6);

		CHEEK = new AnimatedModelRenderer(this);
		CHEEK.setRotationPoint(0.99F, -2.0F, 1.6F);
		Lowerjaw1.addChild(CHEEK);
		setRotationAngle(CHEEK, -0.1094F, 0.0175F, 0.0F);
		CHEEK.setTextureOffset(30, 31).addBox(0.1F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.02F, false);
		CHEEK.setModelRendererName("CHEEK");
		this.registerModelRenderer(CHEEK);

		CHEEK2 = new AnimatedModelRenderer(this);
		CHEEK2.setRotationPoint(-1.0F, -2.0F, 1.6F);
		Lowerjaw1.addChild(CHEEK2);
		setRotationAngle(CHEEK2, -0.1094F, 0.0F, 0.0F);
		CHEEK2.setTextureOffset(28, 6).addBox(0.0F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.02F, false);
		CHEEK2.setModelRendererName("CHEEK2");
		this.registerModelRenderer(CHEEK2);

		Neck4 = new AnimatedModelRenderer(this);
		Neck4.setRotationPoint(-0.5F, 4.3F, 0.5F);
		Neck2.addChild(Neck4);
		setRotationAngle(Neck4, 0.138F, 0.0F, 0.0F);
		Neck4.setTextureOffset(74, 65).addBox(0.5F, -2.0F, -4.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Neck4.setModelRendererName("Neck4");
		this.registerModelRenderer(Neck4);

		Neck5 = new AnimatedModelRenderer(this);
		Neck5.setRotationPoint(0.5F, 0.1F, -3.2F);
		Neck4.addChild(Neck5);
		setRotationAngle(Neck5, 0.1882F, 0.0F, 0.0F);
		Neck5.setTextureOffset(68, 52).addBox(-0.5F, -3.0F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		Neck5.setModelRendererName("Neck5");
		this.registerModelRenderer(Neck5);

		Neck6 = new AnimatedModelRenderer(this);
		Neck6.setRotationPoint(0.0F, -1.8F, 0.0F);
		Neck5.addChild(Neck6);
		setRotationAngle(Neck6, -0.4224F, 0.0F, 0.0F);
		Neck6.setTextureOffset(12, 5).addBox(-0.5F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Neck6.setModelRendererName("Neck6");
		this.registerModelRenderer(Neck6);

		Neck8 = new AnimatedModelRenderer(this);
		Neck8.setRotationPoint(0.0F, 1.5F, -3.0F);
		Neck6.addChild(Neck8);
		setRotationAngle(Neck8, -1.1901F, 0.0F, 0.0F);
		Neck8.setTextureOffset(0, 0).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 5.0F, 3.0F, -0.03F, false);
		Neck8.setModelRendererName("Neck8");
		this.registerModelRenderer(Neck8);

		armleft = new AnimatedModelRenderer(this);
		armleft.setRotationPoint(-4.8F, 4.4F, -7.9F);
		Body2.addChild(armleft);
		setRotationAngle(armleft, 0.6103F, 0.0456F, 0.3243F);
		armleft.setTextureOffset(26, 65).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		armleft.setModelRendererName("armleft");
		this.registerModelRenderer(armleft);

		armleftr = new AnimatedModelRenderer(this);
		armleftr.setRotationPoint(0.5F, 6.5F, 0.4F);
		armleft.addChild(armleftr);
		setRotationAngle(armleftr, -1.0027F, -0.1745F, -0.1621F);
		armleftr.setTextureOffset(24, 75).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		armleftr.setModelRendererName("armleftr");
		this.registerModelRenderer(armleftr);

		armleft3 = new AnimatedModelRenderer(this);
		armleft3.setRotationPoint(0.0F, 6.0F, -0.2F);
		armleftr.addChild(armleft3);
		setRotationAngle(armleft3, 0.8048F, 0.0953F, -0.0173F);
		armleft3.setTextureOffset(74, 41).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		armleft3.setModelRendererName("armleft3");
		this.registerModelRenderer(armleft3);

		armleftfoot = new AnimatedModelRenderer(this);
		armleftfoot.setRotationPoint(-0.5F, 7.4F, -0.2F);
		armleft3.addChild(armleftfoot);
		setRotationAngle(armleftfoot, -0.0382F, 2.1118F, -0.0349F);
		armleftfoot.setTextureOffset(68, 16).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		armleftfoot.setModelRendererName("armleftfoot");
		this.registerModelRenderer(armleftfoot);

		armleft4 = new AnimatedModelRenderer(this);
		armleft4.setRotationPoint(-0.0545F, 7.1965F, -0.0347F);
		armleft3.addChild(armleft4);
		setRotationAngle(armleft4, 1.5933F, -0.2538F, 0.1206F);
		armleft4.setTextureOffset(38, 68).addBox(-1.5F, 0.0F, -0.5F, 2.0F, 14.0F, 1.0F, 0.0F, false);
		armleft4.setModelRendererName("armleft4");
		this.registerModelRenderer(armleft4);

		armleft5 = new AnimatedModelRenderer(this);
		armleft5.setRotationPoint(-0.6931F, 13.5849F, -0.0678F);
		armleft4.addChild(armleft5);
		setRotationAngle(armleft5, 0.2684F, 0.0255F, -0.0173F);
		armleft5.setTextureOffset(44, 68).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);
		armleft5.setModelRendererName("armleft5");
		this.registerModelRenderer(armleft5);

		leftmembrane5 = new AnimatedModelRenderer(this);
		leftmembrane5.setRotationPoint(-0.3871F, 2.0321F, 1.981F);
		armleft5.addChild(leftmembrane5);
		setRotationAngle(leftmembrane5, -1.5999F, -0.0801F, -0.0145F);
		leftmembrane5.setTextureOffset(0, 0).addBox(0.0F, -10.0F, -1.5F, 0.0F, 12.0F, 14.0F, 0.0F, false);
		leftmembrane5.setModelRendererName("leftmembrane5");
		this.registerModelRenderer(leftmembrane5);

		leftmembrane4 = new AnimatedModelRenderer(this);
		leftmembrane4.setRotationPoint(-0.7691F, 2.3288F, 2.1878F);
		armleft4.addChild(leftmembrane4);
		setRotationAngle(leftmembrane4, -1.5999F, -0.1021F, 0.0314F);
		leftmembrane4.setTextureOffset(28, 30).addBox(0.0F, -10.0F, -1.5F, 0.0F, 12.0F, 13.0F, 0.0F, false);
		leftmembrane4.setModelRendererName("leftmembrane4");
		this.registerModelRenderer(leftmembrane4);

		leftmembrane3 = new AnimatedModelRenderer(this);
		leftmembrane3.setRotationPoint(-0.2F, -1.2F, 0.2F);
		armleft3.addChild(leftmembrane3);
		setRotationAngle(leftmembrane3, -0.0457F, -0.2721F, 0.0204F);
		leftmembrane3.setTextureOffset(0, 29).addBox(0.0F, 0.0F, -1.5F, 0.0F, 9.0F, 14.0F, 0.0F, false);
		leftmembrane3.setModelRendererName("leftmembrane3");
		this.registerModelRenderer(leftmembrane3);

		leftmembrane = new AnimatedModelRenderer(this);
		leftmembrane.setRotationPoint(-0.2F, 1.2F, -2.3F);
		armleftr.addChild(leftmembrane);
		setRotationAngle(leftmembrane, 0.6091F, -0.1665F, 0.0204F);
		leftmembrane.setTextureOffset(0, 23).addBox(0.0F, 0.0F, -1.5F, 0.0F, 6.0F, 14.0F, 0.0F, false);
		leftmembrane.setModelRendererName("leftmembrane");
		this.registerModelRenderer(leftmembrane);

		leftmembrane1 = new AnimatedModelRenderer(this);
		leftmembrane1.setRotationPoint(0.8F, 0.0F, -0.1F);
		armleft.addChild(leftmembrane1);
		setRotationAngle(leftmembrane1, -0.3255F, -0.2793F, 0.0204F);
		leftmembrane1.setTextureOffset(0, 38).addBox(0.0F, 0.0F, -1.5F, 0.0F, 7.0F, 14.0F, 0.0F, false);
		leftmembrane1.setModelRendererName("leftmembrane1");
		this.registerModelRenderer(leftmembrane1);

		armright = new AnimatedModelRenderer(this);
		armright.setRotationPoint(2.8F, 4.4F, -7.9F);
		Body2.addChild(armright);
		setRotationAngle(armright, 0.6103F, -0.0456F, -0.3243F);
		armright.setTextureOffset(26, 65).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		armright.setModelRendererName("armright");
		this.registerModelRenderer(armright);

		armright6 = new AnimatedModelRenderer(this);
		armright6.setRotationPoint(-0.5F, 6.5F, 0.4F);
		armright.addChild(armright6);
		setRotationAngle(armright6, -1.0027F, 0.1745F, 0.1621F);
		armright6.setTextureOffset(24, 75).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		armright6.setModelRendererName("armright6");
		this.registerModelRenderer(armright6);

		armright7 = new AnimatedModelRenderer(this);
		armright7.setRotationPoint(0.0F, 6.0F, -0.2F);
		armright6.addChild(armright7);
		setRotationAngle(armright7, 0.8048F, -0.0953F, 0.0173F);
		armright7.setTextureOffset(74, 41).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		armright7.setModelRendererName("armright7");
		this.registerModelRenderer(armright7);

		armrightfoot = new AnimatedModelRenderer(this);
		armrightfoot.setRotationPoint(0.5F, 7.4F, -0.2F);
		armright7.addChild(armrightfoot);
		setRotationAngle(armrightfoot, 0.0382F, -2.1118F, -0.0349F);
		armrightfoot.setTextureOffset(68, 16).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		armrightfoot.setModelRendererName("armrightfoot");
		this.registerModelRenderer(armrightfoot);

		armright8 = new AnimatedModelRenderer(this);
		armright8.setRotationPoint(0.0545F, 7.1965F, -0.0347F);
		armright7.addChild(armright8);
		setRotationAngle(armright8, 1.5933F, 0.2538F, -0.1206F);
		armright8.setTextureOffset(38, 68).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 14.0F, 1.0F, 0.0F, true);
		armright8.setModelRendererName("armright8");
		this.registerModelRenderer(armright8);

		armright9 = new AnimatedModelRenderer(this);
		armright9.setRotationPoint(0.6931F, 13.5849F, -0.0678F);
		armright8.addChild(armright9);
		setRotationAngle(armright9, 0.2684F, -0.0255F, 0.0173F);
		armright9.setTextureOffset(44, 68).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 14.0F, 1.0F, 0.0F, true);
		armright9.setModelRendererName("armright9");
		this.registerModelRenderer(armright9);

		rightmembrane = new AnimatedModelRenderer(this);
		rightmembrane.setRotationPoint(0.3871F, 2.0321F, 1.981F);
		armright9.addChild(rightmembrane);
		setRotationAngle(rightmembrane, -1.5999F, 0.0801F, 0.0145F);
		rightmembrane.setTextureOffset(0, 0).addBox(0.0F, -10.0F, -1.5F, 0.0F, 12.0F, 14.0F, 0.0F, true);
		rightmembrane.setModelRendererName("rightmembrane");
		this.registerModelRenderer(rightmembrane);

		rightmembrane6 = new AnimatedModelRenderer(this);
		rightmembrane6.setRotationPoint(0.7691F, 2.3288F, 2.1878F);
		armright8.addChild(rightmembrane6);
		setRotationAngle(rightmembrane6, -1.5999F, 0.1021F, -0.0314F);
		rightmembrane6.setTextureOffset(28, 30).addBox(0.0F, -10.0F, -1.5F, 0.0F, 12.0F, 13.0F, 0.0F, true);
		rightmembrane6.setModelRendererName("rightmembrane6");
		this.registerModelRenderer(rightmembrane6);

		rightmembrane7 = new AnimatedModelRenderer(this);
		rightmembrane7.setRotationPoint(0.2F, -1.2F, 0.2F);
		armright7.addChild(rightmembrane7);
		setRotationAngle(rightmembrane7, -0.0457F, 0.2721F, -0.0204F);
		rightmembrane7.setTextureOffset(0, 29).addBox(0.0F, 0.0F, -1.5F, 0.0F, 9.0F, 14.0F, 0.0F, true);
		rightmembrane7.setModelRendererName("rightmembrane7");
		this.registerModelRenderer(rightmembrane7);

		rightmembrane8 = new AnimatedModelRenderer(this);
		rightmembrane8.setRotationPoint(0.2F, 1.2F, -2.3F);
		armright6.addChild(rightmembrane8);
		setRotationAngle(rightmembrane8, 0.6091F, 0.1665F, -0.0204F);
		rightmembrane8.setTextureOffset(0, 23).addBox(0.0F, 0.0F, -1.5F, 0.0F, 6.0F, 14.0F, 0.0F, true);
		rightmembrane8.setModelRendererName("rightmembrane8");
		this.registerModelRenderer(rightmembrane8);

		rightmembrane9 = new AnimatedModelRenderer(this);
		rightmembrane9.setRotationPoint(-0.8F, 0.0F, -0.1F);
		armright.addChild(rightmembrane9);
		setRotationAngle(rightmembrane9, -0.3255F, 0.2793F, -0.0204F);
		rightmembrane9.setTextureOffset(0, 38).addBox(0.0F, 0.0F, -1.5F, 0.0F, 7.0F, 14.0F, 0.0F, true);
		rightmembrane9.setModelRendererName("rightmembrane9");
		this.registerModelRenderer(rightmembrane9);

		hip = new AnimatedModelRenderer(this);
		hip.setRotationPoint(-0.1F, -3.7F, 0.6F);
		Body1.addChild(hip);
		setRotationAngle(hip, -0.2821F, 0.0F, 0.0F);
		hip.setTextureOffset(50, 51).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 8.0F, 4.0F, 0.0F, false);
		hip.setModelRendererName("hip");
		this.registerModelRenderer(hip);

		Tail2 = new AnimatedModelRenderer(this);
		Tail2.setRotationPoint(-0.5F, -0.3F, 3.7F);
		hip.addChild(Tail2);
		setRotationAngle(Tail2, -0.1445F, 0.0F, 0.0F);
		Tail2.setTextureOffset(70, 72).addBox(-1.0F, -0.5F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Tail2.setModelRendererName("Tail2");
		this.registerModelRenderer(Tail2);

		Tail3 = new AnimatedModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 0.6F, 2.0F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, 0.1441F, 0.0F, 0.0F);
		Tail3.setTextureOffset(61, 69).addBox(-0.5F, -1.0F, -0.7F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		Tail3.setModelRendererName("Tail3");
		this.registerModelRenderer(Tail3);

		legright1 = new AnimatedModelRenderer(this);
		legright1.setRotationPoint(-2.7F, 1.5F, -0.9F);
		hip.addChild(legright1);
		setRotationAngle(legright1, 0.2384F, 0.0F, 0.0F);
		legright1.setTextureOffset(53, 28).addBox(-1.5F, -0.4959F, -2.0406F, 3.0F, 7.0F, 5.0F, 0.0F, false);
		legright1.setModelRendererName("legright1");
		this.registerModelRenderer(legright1);

		legright2 = new AnimatedModelRenderer(this);
		legright2.setRotationPoint(1.0F, 5.6041F, -0.6406F);
		legright1.addChild(legright2);
		setRotationAngle(legright2, 0.8376F, 0.0F, 0.0F);
		legright2.setTextureOffset(51, 63).addBox(-2.0F, -0.4379F, -1.6057F, 2.0F, 10.0F, 3.0F, 0.0F, false);
		legright2.setModelRendererName("legright2");
		this.registerModelRenderer(legright2);

		legright4 = new AnimatedModelRenderer(this);
		legright4.setRotationPoint(-1.0F, 8.7621F, -0.5057F);
		legright2.addChild(legright4);
		setRotationAngle(legright4, -0.2531F, 0.0F, 0.0F);
		legright4.setTextureOffset(12, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		legright4.setModelRendererName("legright4");
		this.registerModelRenderer(legright4);

		legleft3 = new AnimatedModelRenderer(this);
		legleft3.setRotationPoint(2.9F, 1.5F, -0.4F);
		hip.addChild(legleft3);
		setRotationAngle(legleft3, 0.2384F, 0.0F, 0.0F);
		legleft3.setTextureOffset(53, 28).addBox(-1.5F, -0.614F, -2.5265F, 3.0F, 7.0F, 5.0F, 0.0F, true);
		legleft3.setModelRendererName("legleft3");
		this.registerModelRenderer(legleft3);

		legleft5 = new AnimatedModelRenderer(this);
		legleft5.setRotationPoint(-1.0F, 5.986F, -1.7265F);
		legleft3.addChild(legleft5);
		setRotationAngle(legleft5, 0.8376F, 0.0F, 0.0F);
		legleft5.setTextureOffset(51, 63).addBox(0.0F, -0.3267F, -0.8326F, 2.0F, 10.0F, 3.0F, 0.0F, true);
		legleft5.setModelRendererName("legleft5");
		this.registerModelRenderer(legleft5);

		legleft6 = new AnimatedModelRenderer(this);
		legleft6.setRotationPoint(1.0F, 8.8733F, 0.2674F);
		legleft5.addChild(legleft6);
		setRotationAngle(legleft6, -0.2531F, 0.0F, 0.0F);
		legleft6.setTextureOffset(12, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		legleft6.setModelRendererName("legleft6");
		this.registerModelRenderer(legleft6);

		this.rootBones.add(root);
	}
}