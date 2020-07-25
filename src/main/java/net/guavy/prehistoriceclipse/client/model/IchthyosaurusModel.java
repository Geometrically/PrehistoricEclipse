package net.guavy.prehistoriceclipse.client.model;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class IchthyosaurusModel extends DinosaurModel<DinosaurEntity> {

    private final AnimatedModelRenderer Body2;
    private final AnimatedModelRenderer Body3;
    private final AnimatedModelRenderer Body4;
    private final AnimatedModelRenderer Neck1;
    private final AnimatedModelRenderer Head;
    private final AnimatedModelRenderer UpperJawPart1;
    private final AnimatedModelRenderer UpperJawPart2;
    private final AnimatedModelRenderer UpperJawPart3;
    private final AnimatedModelRenderer TeethUpperPart1Left;
    private final AnimatedModelRenderer TeethUpperPart2Left;
    private final AnimatedModelRenderer TeethUpperPart3Left;
    private final AnimatedModelRenderer LowerJawBase;
    private final AnimatedModelRenderer UnderJawPart1;
    private final AnimatedModelRenderer UnderJawPart2;
    private final AnimatedModelRenderer UnderJawPart3;
    private final AnimatedModelRenderer TeethUnderPart1Left;
    private final AnimatedModelRenderer TeethUnderPart2Left;
    private final AnimatedModelRenderer TeethUnderPart3Left;
    private final AnimatedModelRenderer RightCheek;
    private final AnimatedModelRenderer RightCheek2;
    private final AnimatedModelRenderer SnoutPart4;
    private final AnimatedModelRenderer SnoutPart3;
    private final AnimatedModelRenderer SnoutPart1;
    private final AnimatedModelRenderer under6;
    private final AnimatedModelRenderer FrontFinLeft1;
    private final AnimatedModelRenderer FrontFinLeft2;
    private final AnimatedModelRenderer FrontFinLeft3;
    private final AnimatedModelRenderer FrontFinLeft4;
    private final AnimatedModelRenderer FrontFinLeft5;
    private final AnimatedModelRenderer FrontFinLeft6;
    private final AnimatedModelRenderer under4;
    private final AnimatedModelRenderer SmallFinPart1;
    private final AnimatedModelRenderer SmallFinPart2;
    private final AnimatedModelRenderer SmallFinPart5;
    private final AnimatedModelRenderer SmallFinPart3;
    private final AnimatedModelRenderer under2;
    private final AnimatedModelRenderer Tail1;
    private final AnimatedModelRenderer BackFinLeft1;
    private final AnimatedModelRenderer BackFinLeft2;
    private final AnimatedModelRenderer BackFinLeft3;
    private final AnimatedModelRenderer BackFinLeft4;
    private final AnimatedModelRenderer Tail3;
    private final AnimatedModelRenderer Tail4;
    private final AnimatedModelRenderer Tail5;
    private final AnimatedModelRenderer Tail6;
    private final AnimatedModelRenderer Tailsailpart1;
    private final AnimatedModelRenderer Tailsailpart2;
    private final AnimatedModelRenderer Tailsailpart3;
    private final AnimatedModelRenderer Tailsailpart6;
    private final AnimatedModelRenderer Tailsailpart7;
    private final AnimatedModelRenderer Tailsailpart8;
    private final AnimatedModelRenderer under7;
    private final AnimatedModelRenderer under5;
    private final AnimatedModelRenderer under3;

    public IchthyosaurusModel()
    {
        textureWidth = 112;
        textureHeight = 112;
        Body2 = new AnimatedModelRenderer(this);
        Body2.setRotationPoint(0.0F, 13.4F, 0.3F);
        setRotationAngle(Body2, -0.0461F, 0.0F, 0.0F);
        Body2.setTextureOffset(0, 24).addBox(-5.5F, -7.2479F, -5.6398F, 11.0F, 15.0F, 9.0F, 0.0F, false);
        Body2.setModelRendererName("Body2");
        this.registerModelRenderer(Body2);

        Body3 = new AnimatedModelRenderer(this);
        Body3.setRotationPoint(0.0F, -0.2479F, -3.5398F);
        Body2.addChild(Body3);
        setRotationAngle(Body3, 0.0983F, 0.0F, 0.0F);
        Body3.setTextureOffset(0, 0).addBox(-5.0F, -7.1723F, -11.4031F, 10.0F, 14.0F, 10.0F, 0.0F, false);
        Body3.setModelRendererName("Body3");
        this.registerModelRenderer(Body3);

        Body4 = new AnimatedModelRenderer(this);
        Body4.setRotationPoint(0.0F, -1.0723F, -10.3031F);
        Body3.addChild(Body4);
        setRotationAngle(Body4, 0.263F, 0.0F, 0.0F);
        Body4.setTextureOffset(40, 0).addBox(-4.5F, -5.9831F, -6.5282F, 9.0F, 12.0F, 7.0F, 0.0F, false);
        Body4.setModelRendererName("Body4");
        this.registerModelRenderer(Body4);

        Neck1 = new AnimatedModelRenderer(this);
        Neck1.setRotationPoint(0.0F, -0.7831F, -5.5282F);
        Body4.addChild(Neck1);
        setRotationAngle(Neck1, 0.0726F, 0.0F, 0.0F);
        Neck1.setTextureOffset(24, 78).addBox(-3.5F, -4.9596F, -3.6419F, 7.0F, 10.0F, 3.0F, 0.0F, false);
        Neck1.setModelRendererName("Neck1");
        this.registerModelRenderer(Neck1);

        Head = new AnimatedModelRenderer(this);
        Head.setRotationPoint(0.0F, -3.3596F, 1.2481F);
        Neck1.addChild(Head);
        setRotationAngle(Head, -0.3705F, 0.0F, 0.0F);
        Head.setTextureOffset(79, 79).addBox(-3.0F, 0.3F, -5.1F, 6.0F, 5.0F, 5.0F, 0.0F, false);
        Head.setModelRendererName("Head");
        this.registerModelRenderer(Head);

        UpperJawPart1 = new AnimatedModelRenderer(this);
        UpperJawPart1.setRotationPoint(0.0F, 5.0F, -5.0F);
        Head.addChild(UpperJawPart1);
        UpperJawPart1.setTextureOffset(72, 0).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 2.0F, 7.0F, 0.0F, false);
        UpperJawPart1.setModelRendererName("UpperJawPart1");
        this.registerModelRenderer(UpperJawPart1);

        UpperJawPart2 = new AnimatedModelRenderer(this);
        UpperJawPart2.setRotationPoint(0.0F, 0.0F, -4.0F);
        UpperJawPart1.addChild(UpperJawPart2);
        UpperJawPart2.setTextureOffset(83, 40).addBox(-2.5F, 0.0F, -5.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
        UpperJawPart2.setModelRendererName("UpperJawPart2");
        this.registerModelRenderer(UpperJawPart2);

        UpperJawPart3 = new AnimatedModelRenderer(this);
        UpperJawPart3.setRotationPoint(0.0F, 0.0F, -5.0F);
        UpperJawPart2.addChild(UpperJawPart3);
        UpperJawPart3.setTextureOffset(83, 63).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        UpperJawPart3.setModelRendererName("UpperJawPart3");
        this.registerModelRenderer(UpperJawPart3);

        TeethUpperPart1Left = new AnimatedModelRenderer(this);
        TeethUpperPart1Left.setRotationPoint(0.5F, 1.7F, 0.3F);
        UpperJawPart1.addChild(TeethUpperPart1Left);
        TeethUpperPart1Left.setTextureOffset(86, 89).addBox(-3.0F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
        TeethUpperPart1Left.setModelRendererName("TeethUpperPart1Left");
        this.registerModelRenderer(TeethUpperPart1Left);

        TeethUpperPart2Left = new AnimatedModelRenderer(this);
        TeethUpperPart2Left.setRotationPoint(-2.0F, 0.0F, -3.8F);
        TeethUpperPart1Left.addChild(TeethUpperPart2Left);
        TeethUpperPart2Left.setTextureOffset(57, 89).addBox(-0.5F, 0.0F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
        TeethUpperPart2Left.setModelRendererName("TeethUpperPart2Left");
        this.registerModelRenderer(TeethUpperPart2Left);

        TeethUpperPart3Left = new AnimatedModelRenderer(this);
        TeethUpperPart3Left.setRotationPoint(0.3F, -0.2F, -4.9F);
        TeethUpperPart2Left.addChild(TeethUpperPart3Left);
        TeethUpperPart3Left.setTextureOffset(89, 24).addBox(-0.3F, 0.0F, -5.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);
        TeethUpperPart3Left.setModelRendererName("TeethUpperPart3Left");
        this.registerModelRenderer(TeethUpperPart3Left);

        LowerJawBase = new AnimatedModelRenderer(this);
        LowerJawBase.setRotationPoint(0.0F, 7.2F, -1.5F);
        Head.addChild(LowerJawBase);
        setRotationAngle(LowerJawBase, 0.0175F, 0.0F, 0.0F);
        LowerJawBase.setTextureOffset(40, 33).addBox(-3.0F, -1.1085F, -4.4755F, 6.0F, 2.0F, 5.0F, 0.01F, false);
        LowerJawBase.setModelRendererName("LowerJawBase");
        this.registerModelRenderer(LowerJawBase);

        UnderJawPart1 = new AnimatedModelRenderer(this);
        UnderJawPart1.setRotationPoint(0.0F, -0.5985F, -3.3255F);
        LowerJawBase.addChild(UnderJawPart1);
        UnderJawPart1.setTextureOffset(72, 9).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.01F, false);
        UnderJawPart1.setModelRendererName("UnderJawPart1");
        this.registerModelRenderer(UnderJawPart1);

        UnderJawPart2 = new AnimatedModelRenderer(this);
        UnderJawPart2.setRotationPoint(0.0F, 1.0F, -3.8F);
        UnderJawPart1.addChild(UnderJawPart2);
        setRotationAngle(UnderJawPart2, -0.0154F, 0.0F, 0.0F);
        UnderJawPart2.setTextureOffset(86, 9).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, 0.01F, false);
        UnderJawPart2.setModelRendererName("UnderJawPart2");
        this.registerModelRenderer(UnderJawPart2);

        UnderJawPart3 = new AnimatedModelRenderer(this);
        UnderJawPart3.setRotationPoint(0.0F, 0.0F, -5.0F);
        UnderJawPart2.addChild(UnderJawPart3);
        setRotationAngle(UnderJawPart3, -0.0251F, 0.0F, 0.0F);
        UnderJawPart3.setTextureOffset(40, 60).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 5.0F, 0.01F, false);
        UnderJawPart3.setModelRendererName("UnderJawPart3");
        this.registerModelRenderer(UnderJawPart3);

        TeethUnderPart1Left = new AnimatedModelRenderer(this);
        TeethUnderPart1Left.setRotationPoint(-2.0F, -1.0F, 0.3F);
        UnderJawPart1.addChild(TeethUnderPart1Left);
        TeethUnderPart1Left.setTextureOffset(90, 47).addBox(0.0F, 0.1F, -4.0F, 4.0F, 1.0F, 4.0F, 0.01F, false);
        TeethUnderPart1Left.setModelRendererName("TeethUnderPart1Left");
        this.registerModelRenderer(TeethUnderPart1Left);

        TeethUnderPart2Left = new AnimatedModelRenderer(this);
        TeethUnderPart2Left.setRotationPoint(0.4F, 1.0F, -3.8F);
        TeethUnderPart1Left.addChild(TeethUnderPart2Left);
        setRotationAngle(TeethUnderPart2Left, -0.0524F, 0.0F, 0.0F);
        TeethUnderPart2Left.setTextureOffset(30, 0).addBox(0.1F, -0.8F, -5.0F, 3.0F, 1.0F, 5.0F, 0.01F, false);
        TeethUnderPart2Left.setModelRendererName("TeethUnderPart2Left");
        this.registerModelRenderer(TeethUnderPart2Left);

        TeethUnderPart3Left = new AnimatedModelRenderer(this);
        TeethUnderPart3Left.setRotationPoint(0.4F, 0.0F, -5.0F);
        TeethUnderPart2Left.addChild(TeethUnderPart3Left);
        setRotationAngle(TeethUnderPart3Left, -0.0175F, 0.0F, 0.0F);
        TeethUnderPart3Left.setTextureOffset(65, 0).addBox(0.2F, -0.7F, -5.0F, 2.0F, 1.0F, 5.0F, 0.01F, false);
        TeethUnderPart3Left.setModelRendererName("TeethUnderPart3Left");
        this.registerModelRenderer(TeethUnderPart3Left);

        RightCheek = new AnimatedModelRenderer(this);
        RightCheek.setRotationPoint(2.8F, -1.1085F, -3.4755F);
        LowerJawBase.addChild(RightCheek);
        setRotationAngle(RightCheek, -0.3142F, 0.0F, 0.0F);
        RightCheek.setTextureOffset(4, 4).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.01F, false);
        RightCheek.setModelRendererName("RightCheek");
        this.registerModelRenderer(RightCheek);

        RightCheek2 = new AnimatedModelRenderer(this);
        RightCheek2.setRotationPoint(-2.8F, -1.1085F, -3.4755F);
        LowerJawBase.addChild(RightCheek2);
        setRotationAngle(RightCheek2, -0.3142F, 0.0F, 0.0F);
        RightCheek2.setTextureOffset(0, 3).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.01F, false);
        RightCheek2.setModelRendererName("RightCheek2");
        this.registerModelRenderer(RightCheek2);

        SnoutPart4 = new AnimatedModelRenderer(this);
        SnoutPart4.setRotationPoint(0.0F, 0.7F, -4.8F);
        Head.addChild(SnoutPart4);
        setRotationAngle(SnoutPart4, 0.6953F, 0.0F, 0.0F);
        SnoutPart4.setTextureOffset(76, 53).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);
        SnoutPart4.setModelRendererName("SnoutPart4");
        this.registerModelRenderer(SnoutPart4);

        SnoutPart3 = new AnimatedModelRenderer(this);
        SnoutPart3.setRotationPoint(0.0F, 0.1F, -3.2F);
        SnoutPart4.addChild(SnoutPart3);
        setRotationAngle(SnoutPart3, -0.5206F, 0.0F, 0.0F);
        SnoutPart3.setTextureOffset(60, 72).addBox(-1.5F, 0.0F, -9.0F, 3.0F, 2.0F, 9.0F, 0.0F, false);
        SnoutPart3.setModelRendererName("SnoutPart3");
        this.registerModelRenderer(SnoutPart3);

        SnoutPart1 = new AnimatedModelRenderer(this);
        SnoutPart1.setRotationPoint(0.0F, 0.0F, -10.0F);
        SnoutPart3.addChild(SnoutPart1);
        setRotationAngle(SnoutPart1, 0.0447F, 0.0F, 0.0F);
        SnoutPart1.setTextureOffset(91, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        SnoutPart1.setModelRendererName("SnoutPart1");
        this.registerModelRenderer(SnoutPart1);

        under6 = new AnimatedModelRenderer(this);
        under6.setRotationPoint(0.0F, 2.2404F, -6.6419F);
        Neck1.addChild(under6);
        setRotationAngle(under6, -0.6981F, 0.0F, 0.0F);
        under6.setTextureOffset(64, 44).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 7.0F, -0.01F, false);
        under6.setModelRendererName("under6");
        this.registerModelRenderer(under6);

        FrontFinLeft1 = new AnimatedModelRenderer(this);
        FrontFinLeft1.setRotationPoint(-4.0F, 5.7169F, -1.1282F);
        Body4.addChild(FrontFinLeft1);
        setRotationAngle(FrontFinLeft1, 0.0F, -0.0476F, -0.8812F);
        FrontFinLeft1.setTextureOffset(56, 44).addBox(-3.0667F, -1.0F, -1.3984F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        FrontFinLeft1.setModelRendererName("FrontFinLeft1");
        this.registerModelRenderer(FrontFinLeft1);

        FrontFinLeft2 = new AnimatedModelRenderer(this);
        FrontFinLeft2.setRotationPoint(-2.8667F, 0.0F, -2.5984F);
        FrontFinLeft1.addChild(FrontFinLeft2);
        setRotationAngle(FrontFinLeft2, 0.0F, 0.2011F, 0.0F);
        FrontFinLeft2.setTextureOffset(75, 72).addBox(-7.0F, -1.0F, 0.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
        FrontFinLeft2.setModelRendererName("FrontFinLeft2");
        this.registerModelRenderer(FrontFinLeft2);

        FrontFinLeft3 = new AnimatedModelRenderer(this);
        FrontFinLeft3.setRotationPoint(-6.6F, 0.0F, 0.9F);
        FrontFinLeft2.addChild(FrontFinLeft3);
        setRotationAngle(FrontFinLeft3, 0.0F, 0.2513F, 0.0F);
        FrontFinLeft3.setTextureOffset(89, 30).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        FrontFinLeft3.setModelRendererName("FrontFinLeft3");
        this.registerModelRenderer(FrontFinLeft3);

        FrontFinLeft4 = new AnimatedModelRenderer(this);
        FrontFinLeft4.setRotationPoint(4.0F, 5.7169F, -1.1282F);
        Body4.addChild(FrontFinLeft4);
        setRotationAngle(FrontFinLeft4, 0.0F, 0.0476F, 0.8812F);
        FrontFinLeft4.setTextureOffset(56, 44).addBox(0.0667F, -1.0F, -1.3984F, 3.0F, 1.0F, 3.0F, 0.0F, true);
        FrontFinLeft4.setModelRendererName("FrontFinLeft4");
        this.registerModelRenderer(FrontFinLeft4);

        FrontFinLeft5 = new AnimatedModelRenderer(this);
        FrontFinLeft5.setRotationPoint(2.8667F, 0.0F, -2.5984F);
        FrontFinLeft4.addChild(FrontFinLeft5);
        setRotationAngle(FrontFinLeft5, 0.0F, -0.2011F, 0.0F);
        FrontFinLeft5.setTextureOffset(75, 72).addBox(0.0F, -1.0F, 0.0F, 7.0F, 1.0F, 6.0F, 0.0F, true);
        FrontFinLeft5.setModelRendererName("FrontFinLeft5");
        this.registerModelRenderer(FrontFinLeft5);

        FrontFinLeft6 = new AnimatedModelRenderer(this);
        FrontFinLeft6.setRotationPoint(6.6F, 0.0F, 0.9F);
        FrontFinLeft5.addChild(FrontFinLeft6);
        setRotationAngle(FrontFinLeft6, 0.0F, -0.2513F, 0.0F);
        FrontFinLeft6.setTextureOffset(89, 30).addBox(0.0F, -1.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
        FrontFinLeft6.setModelRendererName("FrontFinLeft6");
        this.registerModelRenderer(FrontFinLeft6);

        under4 = new AnimatedModelRenderer(this);
        under4.setRotationPoint(0.0F, 6.0169F, -6.4282F);
        Body4.addChild(under4);
        setRotationAngle(under4, -0.5585F, 0.0F, 0.0F);
        under4.setTextureOffset(43, 72).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 5.0F, 0.0F, false);
        under4.setModelRendererName("under4");
        this.registerModelRenderer(under4);

        SmallFinPart1 = new AnimatedModelRenderer(this);
        SmallFinPart1.setRotationPoint(0.0F, -5.7723F, 0.7969F);
        Body3.addChild(SmallFinPart1);
        setRotationAngle(SmallFinPart1, -0.5906F, 0.0F, 0.0F);
        SmallFinPart1.setTextureOffset(79, 29).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
        SmallFinPart1.setModelRendererName("SmallFinPart1");
        this.registerModelRenderer(SmallFinPart1);

        SmallFinPart2 = new AnimatedModelRenderer(this);
        SmallFinPart2.setRotationPoint(0.0F, -2.4F, -0.2F);
        SmallFinPart1.addChild(SmallFinPart2);
        setRotationAngle(SmallFinPart2, -0.0679F, 0.0F, 0.0F);
        SmallFinPart2.setTextureOffset(15, 60).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 2.0F, 6.0F, -0.01F, false);
        SmallFinPart2.setModelRendererName("SmallFinPart2");
        this.registerModelRenderer(SmallFinPart2);

        SmallFinPart5 = new AnimatedModelRenderer(this);
        SmallFinPart5.setRotationPoint(0.0F, -1.5F, -0.3F);
        SmallFinPart2.addChild(SmallFinPart5);
        setRotationAngle(SmallFinPart5, 0.0082F, 0.0F, 0.0F);
        SmallFinPart5.setTextureOffset(31, 91).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 2.0F, 5.0F, -0.02F, false);
        SmallFinPart5.setModelRendererName("SmallFinPart5");
        this.registerModelRenderer(SmallFinPart5);

        SmallFinPart3 = new AnimatedModelRenderer(this);
        SmallFinPart3.setRotationPoint(0.0F, -1.8F, 0.0F);
        SmallFinPart5.addChild(SmallFinPart3);
        setRotationAngle(SmallFinPart3, -0.114F, 0.0F, 0.0F);
        SmallFinPart3.setTextureOffset(0, 0).addBox(-0.5F, -2.2F, 0.5F, 1.0F, 2.0F, 3.0F, -0.02F, false);
        SmallFinPart3.setModelRendererName("SmallFinPart3");
        this.registerModelRenderer(SmallFinPart3);

        under2 = new AnimatedModelRenderer(this);
        under2.setRotationPoint(0.0F, 7.8277F, -11.3031F);
        Body3.addChild(under2);
        setRotationAngle(under2, -0.1745F, 0.0F, 0.0F);
        under2.setTextureOffset(31, 19).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 10.0F, 0.0F, false);
        under2.setModelRendererName("under2");
        this.registerModelRenderer(under2);

        Tail1 = new AnimatedModelRenderer(this);
        Tail1.setRotationPoint(0.0F, -0.1479F, 3.0602F);
        Body2.addChild(Tail1);
        setRotationAngle(Tail1, -0.093F, 0.0F, 0.0F);
        Tail1.setTextureOffset(32, 40).addBox(-4.0F, -6.8702F, -0.641F, 8.0F, 12.0F, 8.0F, 0.0F, false);
        Tail1.setModelRendererName("Tail1");
        this.registerModelRenderer(Tail1);

        BackFinLeft1 = new AnimatedModelRenderer(this);
        BackFinLeft1.setRotationPoint(-4.0F, 2.2298F, 3.359F);
        Tail1.addChild(BackFinLeft1);
        setRotationAngle(BackFinLeft1, 0.0F, 0.4491F, -0.8118F);
        BackFinLeft1.setTextureOffset(51, 60).addBox(-2.7195F, -0.5182F, -1.7519F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        BackFinLeft1.setModelRendererName("BackFinLeft1");
        this.registerModelRenderer(BackFinLeft1);

        BackFinLeft2 = new AnimatedModelRenderer(this);
        BackFinLeft2.setRotationPoint(-2.2195F, 0.3818F, -1.4519F);
        BackFinLeft1.addChild(BackFinLeft2);
        setRotationAngle(BackFinLeft2, 0.0126F, 0.3925F, -0.196F);
        BackFinLeft2.setTextureOffset(54, 83).addBox(-6.0F, -1.0F, -1.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);
        BackFinLeft2.setModelRendererName("BackFinLeft2");
        this.registerModelRenderer(BackFinLeft2);

        BackFinLeft3 = new AnimatedModelRenderer(this);
        BackFinLeft3.setRotationPoint(4.0F, 2.2298F, 3.359F);
        Tail1.addChild(BackFinLeft3);
        setRotationAngle(BackFinLeft3, 0.0F, -0.4491F, 0.8118F);
        BackFinLeft3.setTextureOffset(51, 60).addBox(-0.2805F, -0.5182F, -1.7519F, 3.0F, 1.0F, 3.0F, 0.0F, true);
        BackFinLeft3.setModelRendererName("BackFinLeft3");
        this.registerModelRenderer(BackFinLeft3);

        BackFinLeft4 = new AnimatedModelRenderer(this);
        BackFinLeft4.setRotationPoint(2.2195F, 0.3818F, -1.4519F);
        BackFinLeft3.addChild(BackFinLeft4);
        setRotationAngle(BackFinLeft4, 0.0126F, -0.3925F, 0.196F);
        BackFinLeft4.setTextureOffset(54, 83).addBox(0.0F, -1.0F, -1.5F, 6.0F, 1.0F, 5.0F, 0.0F, true);
        BackFinLeft4.setModelRendererName("BackFinLeft4");
        this.registerModelRenderer(BackFinLeft4);

        Tail3 = new AnimatedModelRenderer(this);
        Tail3.setRotationPoint(0.0F, -1.3702F, 6.559F);
        Tail1.addChild(Tail3);
        setRotationAngle(Tail3, 0.0801F, 0.0F, 0.0F);
        Tail3.setTextureOffset(67, 14).addBox(-3.5F, -4.4856F, 0.3601F, 7.0F, 10.0F, 5.0F, 0.0F, false);
        Tail3.setModelRendererName("Tail3");
        this.registerModelRenderer(Tail3);

        Tail4 = new AnimatedModelRenderer(this);
        Tail4.setRotationPoint(0.0F, 0.0144F, 5.1601F);
        Tail3.addChild(Tail4);
        setRotationAngle(Tail4, 0.066F, 0.0F, 0.0F);
        Tail4.setTextureOffset(57, 57).addBox(-3.0F, -3.9104F, -1.5456F, 6.0F, 8.0F, 7.0F, 0.0F, false);
        Tail4.setModelRendererName("Tail4");
        this.registerModelRenderer(Tail4);

        Tail5 = new AnimatedModelRenderer(this);
        Tail5.setRotationPoint(0.0F, 0.2896F, 4.9544F);
        Tail4.addChild(Tail5);
        setRotationAngle(Tail5, 0.0534F, 0.0F, 0.0F);
        Tail5.setTextureOffset(24, 60).addBox(-2.0F, -3.7481F, -0.7011F, 4.0F, 7.0F, 8.0F, 0.0F, false);
        Tail5.setModelRendererName("Tail5");
        this.registerModelRenderer(Tail5);

        Tail6 = new AnimatedModelRenderer(this);
        Tail6.setRotationPoint(0.0F, -0.3175F, 6.8008F);
        Tail5.addChild(Tail6);
        setRotationAngle(Tail6, 0.0471F, 0.0F, 0.0F);
        Tail6.setTextureOffset(0, 60).addBox(-1.5F, -2.9791F, -0.9593F, 3.0F, 6.0F, 9.0F, 0.0F, false);
        Tail6.setModelRendererName("Tail6");
        this.registerModelRenderer(Tail6);

        Tailsailpart1 = new AnimatedModelRenderer(this);
        Tailsailpart1.setRotationPoint(0.0F, -0.5485F, 6.5425F);
        Tail6.addChild(Tailsailpart1);
        setRotationAngle(Tailsailpart1, 1.1732F, 0.0F, 0.0F);
        Tailsailpart1.setTextureOffset(0, 85).addBox(-0.5F, -2.8306F, -0.0019F, 1.0F, 7.0F, 5.0F, 0.01F, false);
        Tailsailpart1.setModelRendererName("Tailsailpart1");
        this.registerModelRenderer(Tailsailpart1);

        Tailsailpart2 = new AnimatedModelRenderer(this);
        Tailsailpart2.setRotationPoint(0.0F, -0.1F, 4.0F);
        Tailsailpart1.addChild(Tailsailpart2);
        setRotationAngle(Tailsailpart2, -0.1836F, 0.0F, 0.0F);
        Tailsailpart2.setTextureOffset(79, 89).addBox(-0.5F, -2.4306F, -0.0019F, 1.0F, 6.0F, 5.0F, -0.01F, false);
        Tailsailpart2.setModelRendererName("Tailsailpart2");
        this.registerModelRenderer(Tailsailpart2);

        Tailsailpart3 = new AnimatedModelRenderer(this);
        Tailsailpart3.setRotationPoint(0.0F, 0.0F, 4.0F);
        Tailsailpart2.addChild(Tailsailpart3);
        setRotationAngle(Tailsailpart3, -0.1271F, 0.0F, 0.0F);
        Tailsailpart3.setTextureOffset(19, 91).addBox(-0.5F, -1.6306F, -0.0019F, 1.0F, 4.0F, 5.0F, -0.02F, false);
        Tailsailpart3.setModelRendererName("Tailsailpart3");
        this.registerModelRenderer(Tailsailpart3);

        Tailsailpart6 = new AnimatedModelRenderer(this);
        Tailsailpart6.setRotationPoint(0.0F, -0.1485F, 6.5425F);
        Tail6.addChild(Tailsailpart6);
        setRotationAngle(Tailsailpart6, -1.435F, 0.0F, 0.0F);
        Tailsailpart6.setTextureOffset(12, 85).addBox(-0.5F, -3.8306F, -0.0019F, 1.0F, 6.0F, 5.0F, 0.0F, false);
        Tailsailpart6.setModelRendererName("Tailsailpart6");
        this.registerModelRenderer(Tailsailpart6);

        Tailsailpart7 = new AnimatedModelRenderer(this);
        Tailsailpart7.setRotationPoint(0.0F, -0.1F, 3.0F);
        Tailsailpart6.addChild(Tailsailpart7);
        setRotationAngle(Tailsailpart7, 0.1367F, 0.0F, 0.0F);
        Tailsailpart7.setTextureOffset(70, 83).addBox(-0.5F, -3.4306F, -0.0019F, 1.0F, 5.0F, 6.0F, -0.01F, false);
        Tailsailpart7.setModelRendererName("Tailsailpart7");
        this.registerModelRenderer(Tailsailpart7);

        Tailsailpart8 = new AnimatedModelRenderer(this);
        Tailsailpart8.setRotationPoint(0.0F, -0.1F, 3.0F);
        Tailsailpart7.addChild(Tailsailpart8);
        setRotationAngle(Tailsailpart8, 0.1367F, 0.0F, 0.0F);
        Tailsailpart8.setTextureOffset(44, 81).addBox(-0.5F, -2.9306F, -0.0019F, 1.0F, 4.0F, 8.0F, -0.02F, false);
        Tailsailpart8.setModelRendererName("Tailsailpart8");
        this.registerModelRenderer(Tailsailpart8);

        under7 = new AnimatedModelRenderer(this);
        under7.setRotationPoint(0.0F, 9.9144F, -5.0399F);
        Tail3.addChild(under7);
        setRotationAngle(under7, 0.5411F, 0.0F, 0.0F);
        under7.setTextureOffset(0, 75).addBox(-3.0F, -4.0F, 6.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
        under7.setModelRendererName("under7");
        this.registerModelRenderer(under7);

        under5 = new AnimatedModelRenderer(this);
        under5.setRotationPoint(0.0F, 8.9548F, 0.959F);
        Tail1.addChild(under5);
        setRotationAngle(under5, 0.5236F, 0.0F, 0.0F);
        under5.setTextureOffset(56, 33).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 7.0F, -0.01F, false);
        under5.setModelRendererName("under5");
        this.registerModelRenderer(under5);

        under3 = new AnimatedModelRenderer(this);
        under3.setRotationPoint(0.0F, 9.4521F, -4.3398F);
        Body2.addChild(under3);
        setRotationAngle(under3, 0.0873F, 0.0F, 0.0F);
        under3.setTextureOffset(0, 48).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
        under3.setModelRendererName("under3");
        this.registerModelRenderer(under3);

        this.rootBones.add(Body2);
    }
}