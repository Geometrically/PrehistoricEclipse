package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.guavy.prehistoriceclipse.entity.land.AustroraptorEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

public class AustroraptorModel extends AnimatedModel<AustroraptorEntity> {
    private final ModelPart root;
    private final ModelPart tailbase;
    private final ModelPart tail1;
    private final ModelPart tail2;
    private final ModelPart tail3;
    private final ModelPart tail4;
    private final ModelPart tail5;
    private final ModelPart tail6;
    private final ModelPart tailfluff;
    private final ModelPart tailfluff2;
    private final ModelPart mainbody;
    private final ModelPart neckbase;
    private final ModelPart leftarm1;
    private final ModelPart leftarm2;
    private final ModelPart leftarm3;
    private final ModelPart hand4;
    private final ModelPart hand5;
    private final ModelPart hand6;
    private final ModelPart feathers3;
    private final ModelPart feathers4;
    private final ModelPart rightarm1;
    private final ModelPart rightarm2;
    private final ModelPart rightarm3;
    private final ModelPart hand1;
    private final ModelPart hand2;
    private final ModelPart hand3;
    private final ModelPart feathers5;
    private final ModelPart feathers6;
    private final ModelPart Neck;
    private final ModelPart neckunder;
    private final ModelPart neckunder2;
    private final ModelPart neckunder3;
    private final ModelPart neckunder4;
    private final ModelPart Neck1;
    private final ModelPart Neck2;
    private final ModelPart Neck3;
    private final ModelPart Neck4;
    private final ModelPart head;
    private final ModelPart jawup1;
    private final ModelPart snout;
    private final ModelPart snout3;
    private final ModelPart snout2;
    private final ModelPart jawup2;
    private final ModelPart jawdown1;
    private final ModelPart jawdown2;
    private final ModelPart jawdown3;
    private final ModelPart jawdown4;
    private final ModelPart cheek1;
    private final ModelPart cheek2;
    private final ModelPart l1;
    private final ModelPart l2;
    private final ModelPart l3;
    private final ModelPart l4;
    private final ModelPart leftfoot1;
    private final ModelPart leftfoot2;
    private final ModelPart r1;
    private final ModelPart r2;
    private final ModelPart r3;
    private final ModelPart r4;
    private final ModelPart rightfoot1;
    private final ModelPart rightfoot2;

    public AustroraptorModel() {
        textureWidth = 200;
        textureHeight = 200;

        root = new ModelPart(this);
        root.setPivot(0.0F, 0.0F, 0.0F);

        tailbase = new ModelPart(this);
        tailbase.setPivot(0.0F, -8.8F, 0.0F);
        setRotationAngle(tailbase, -0.1355F, 0.0F, 0.0F);
        root.addChild(tailbase);
        tailbase.addCuboid("tailbase", -5.0F, 0.0F, 0.0F, 10, 14, 13, 0.0F, 0, 85);

        tail1 = new ModelPart(this);
        tail1.setPivot(0.0F, 5.4F, 11.3F);
        setRotationAngle(tail1, 0.1471F, 0.0F, 0.0F);
        tailbase.addChild(tail1);
        tail1.addCuboid("tail1", -4.0F, -5.0F, 0.0F, 8, 11, 10, 0.0F, 120, 0);

        tail2 = new ModelPart(this);
        tail2.setPivot(0.0F, -2.0F, 8.9F);
        setRotationAngle(tail2, 0.0371F, 0.0F, 0.0F);
        tail1.addChild(tail2);
        tail2.addCuboid("tail2", -3.0F, -3.0F, 0.0F, 6, 8, 11, 0.0F, 136, 24);

        tail3 = new ModelPart(this);
        tail3.setPivot(0.0F, -0.5F, 10.2F);
        setRotationAngle(tail3, -0.0723F, 0.0F, 0.0F);
        tail2.addChild(tail3);
        tail3.addCuboid("tail3", -2.5F, -2.5F, 0.0F, 5, 6, 12, 0.0F, 150, 150);

        tail4 = new ModelPart(this);
        tail4.setPivot(0.0F, -0.4F, 11.1F);
        setRotationAngle(tail4, 0.0041F, 0.0F, 0.0F);
        tail3.addChild(tail4);
        tail4.addCuboid("tail4", -2.0F, -2.0F, 0.0F, 4, 4, 11, 0.0F, 136, 59);

        tail5 = new ModelPart(this);
        tail5.setPivot(0.0F, -0.4F, 10.7F);
        setRotationAngle(tail5, -0.1621F, 0.0F, 0.0F);
        tail4.addChild(tail5);
        tail5.addCuboid("tail5", -1.5F, -1.5F, 0.0F, 3, 3, 11, 0.0F, 160, 100);

        tail6 = new ModelPart(this);
        tail6.setPivot(0.0F, -0.5F, 10.2F);
        setRotationAngle(tail6, -0.1087F, 0.0F, 0.0F);
        tail5.addChild(tail6);
        tail6.addCuboid("tail6", -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, 121, 84);

        tailfluff = new ModelPart(this);
        tailfluff.setPivot(0.0F, -0.1F, 0.6F);
        tail6.addChild(tailfluff);
        tailfluff.addCuboid("tailfluff", -6.0F, 0.0F, 0.0F, 12, 0, 22, 0.0F, 103, 106);

        tailfluff2 = new ModelPart(this);
        tailfluff2.setPivot(0.0F, -0.3F, 0.3F);
        setRotationAngle(tailfluff2, 0.0194F, 0.0F, 0.0F);
        tail5.addChild(tailfluff2);
        tailfluff2.addCuboid("tailfluff2", -5.0F, 0.0F, 0.0F, 10, 0, 11, 0.0F, 20, 160);

        mainbody = new ModelPart(this);
        mainbody.setPivot(0.0F, 2.2F, 0.8F);
        setRotationAngle(mainbody, 0.1428F, 0.0F, 0.0F);
        tailbase.addChild(mainbody);
        mainbody.addCuboid("mainbody", -4.5F, -2.0F, -11.0F, 9, 13, 13, 0.0F, 2, 121);

        neckbase = new ModelPart(this);
        neckbase.setPivot(0.0F, 0.4F, -10.5F);
        setRotationAngle(neckbase, 0.0005F, 0.0F, 0.0F);
        mainbody.addChild(neckbase);
        neckbase.addCuboid("neckbase", -4.0F, -2.0F, -7.0F, 8, 11, 8, 0.0F, 60, 59);

        leftarm1 = new ModelPart(this);
        leftarm1.setPivot(4.0F, 5.5F, -5.0F);
        setRotationAngle(leftarm1, 0.968F, 0.2988F, -0.0478F);
        neckbase.addChild(leftarm1);
        leftarm1.addCuboid("leftarm1", -1.5F, -0.5F, -1.5F, 3, 6, 4, 0.0F, 100, 86);

        leftarm2 = new ModelPart(this);
        leftarm2.setPivot(0.3F, 4.1F, 0.7F);
        setRotationAngle(leftarm2, -1.2074F, 0.1047F, -0.2569F);
        leftarm1.addChild(leftarm2);
        leftarm2.addCuboid("leftarm2", -1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F, 96, 116);

        leftarm3 = new ModelPart(this);
        leftarm3.setPivot(0.55F, 5.65F, 0.0F);
        setRotationAngle(leftarm3, 1.482F, -1.3335F, -0.9153F);
        leftarm2.addChild(leftarm3);
        leftarm3.addCuboid("leftarm3", -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, 169, 180);

        hand4 = new ModelPart(this);
        hand4.setPivot(0.0F, 1.6F, 0.5F);
        leftarm3.addChild(hand4);
        hand4.addCuboid("hand4", -0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F, 100, 160);

        hand5 = new ModelPart(this);
        hand5.setPivot(-0.3F, 1.5F, 0.6F);
        setRotationAngle(hand5, 0.1367F, 0.0F, -0.4098F);
        leftarm3.addChild(hand5);
        hand5.addCuboid("hand5", -0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F, 100, 170);

        hand6 = new ModelPart(this);
        hand6.setPivot(0.3F, 1.5F, 0.6F);
        setRotationAngle(hand6, 0.1367F, 0.0F, 0.4098F);
        leftarm3.addChild(hand6);
        hand6.addCuboid("hand6", -0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F, 100, 177);

        feathers3 = new ModelPart(this);
        feathers3.setPivot(0.2F, -1.0F, 0.5F);
        setRotationAngle(feathers3, 0.0387F, -0.1138F, 0.0F);
        leftarm2.addChild(feathers3);
        feathers3.addCuboid("feathers3", 0.0F, 0.0F, 0.0F, 0, 12, 8, 0.0F, 10, 48);

        feathers4 = new ModelPart(this);
        feathers4.setPivot(0.7F, 0.4F, 0.0F);
        setRotationAngle(feathers4, 0.0387F, 0.0934F, 0.0F);
        leftarm1.addChild(feathers4);
        feathers4.addCuboid("feathers4", 0.0F, 0.0F, 0.0F, 0, 12, 6, 0.0F, 30, 50);

        rightarm1 = new ModelPart(this);
        rightarm1.setPivot(-4.0F, 5.5F, -5.0F);
        setRotationAngle(rightarm1, 0.968F, -0.2988F, 0.0478F);
        neckbase.addChild(rightarm1);
        rightarm1.addCuboid("rightarm1", -1.5F, -0.5F, -1.5F, 3, 6, 4, 0.0F, 100, 86);

        rightarm2 = new ModelPart(this);
        rightarm2.setPivot(-0.3F, 4.1F, 0.7F);
        setRotationAngle(rightarm2, -1.2074F, -0.1047F, 0.2569F);
        rightarm1.addChild(rightarm2);
        rightarm2.addCuboid("rightarm2", -1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F, 96, 116);

        rightarm3 = new ModelPart(this);
        rightarm3.setPivot(-0.55F, 5.65F, 0.0F);
        setRotationAngle(rightarm3, 1.482F, 1.3335F, 0.9153F);
        rightarm2.addChild(rightarm3);
        rightarm3.addCuboid("rightarm3", -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, 169, 180);

        hand1 = new ModelPart(this);
        hand1.setPivot(0.0F, 1.6F, 0.5F);
        rightarm3.addChild(hand1);
        hand1.addCuboid("hand1", -0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F, 100, 160);

        hand2 = new ModelPart(this);
        hand2.setPivot(0.3F, 1.5F, 0.6F);
        setRotationAngle(hand2, 0.1367F, 0.0F, 0.4098F);
        rightarm3.addChild(hand2);
        hand2.addCuboid("hand2", -0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F, 100, 170);

        hand3 = new ModelPart(this);
        hand3.setPivot(-0.3F, 1.5F, 0.6F);
        setRotationAngle(hand3, 0.1367F, 0.0F, -0.4098F);
        rightarm3.addChild(hand3);
        hand3.addCuboid("hand3", -0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F, 100, 177);

        feathers5 = new ModelPart(this);
        feathers5.setPivot(-0.2F, -1.0F, 0.5F);
        setRotationAngle(feathers5, 0.0387F, 0.1138F, 0.0F);
        rightarm2.addChild(feathers5);
        feathers5.addCuboid("feathers5", 0.0F, 0.0F, 0.0F, 0, 12, 8, 0.0F, 10, 48);

        feathers6 = new ModelPart(this);
        feathers6.setPivot(-0.7F, 0.4F, 0.0F);
        setRotationAngle(feathers6, 0.0387F, -0.0934F, 0.0F);
        rightarm1.addChild(feathers6);
        feathers6.addCuboid("feathers6", 0.0F, 0.0F, 0.0F, 0, 12, 6, 0.0F, 30, 50);

        Neck = new ModelPart(this);
        Neck.setPivot(-0.5F, 0.6F, -4.5F);
        setRotationAngle(Neck, -0.3709F, 0.0F, 0.0F);
        neckbase.addChild(Neck);
        Neck.addCuboid("Neck", -2.0F, -2.0F, -5.1F, 5, 5, 5, 0.0F, 96, 14);

        neckunder = new ModelPart(this);
        neckunder.setPivot(0.5F, 4.8F, 0.0F);
        setRotationAngle(neckunder, -0.2618F, 0.0F, 0.0F);
        Neck.addChild(neckunder);
        neckunder.addCuboid("neckunder", -1.5F, -2.0F, -5.6F, 3, 4, 6, 0.0F, 120, 69);

        neckunder2 = new ModelPart(this);
        neckunder2.setPivot(0.0F, -0.2F, -6.2F);
        setRotationAngle(neckunder2, -0.1792F, 0.0F, 0.0F);
        neckunder.addChild(neckunder2);
        neckunder2.addCuboid("neckunder2", -1.5F, -2.0F, -3.9F, 3, 4, 5, 0.0F, 124, 59);

        neckunder3 = new ModelPart(this);
        neckunder3.setPivot(0.0F, 0.0F, -3.9F);
        setRotationAngle(neckunder3, 0.1394F, 0.0F, 0.0F);
        neckunder2.addChild(neckunder3);
        neckunder3.addCuboid("neckunder3", -1.5F, -2.0F, -3.0F, 3, 4, 3, 0.0F, 125, 50);

        neckunder4 = new ModelPart(this);
        neckunder4.setPivot(0.0F, 0.0F, -2.5F);
        setRotationAngle(neckunder4, 0.2182F, 0.0F, 0.0F);
        neckunder3.addChild(neckunder4);
        neckunder4.addCuboid("neckunder4", -1.5F, -2.0F, -5.0F, 3, 4, 5, 0.0F, 118, 38);

        Neck1 = new ModelPart(this);
        Neck1.setPivot(0.0F, -0.42F, -4.3F);
        setRotationAngle(Neck1, -0.3107F, 0.0F, 0.0F);
        Neck.addChild(Neck1);
        Neck1.addCuboid("Neck1", -2.0F, -1.5F, -3.5F, 5, 5, 4, 0.0F, 94, 0);

        Neck2 = new ModelPart(this);
        Neck2.setPivot(0.0F, -0.1F, -3.5F);
        setRotationAngle(Neck2, -0.1936F, 0.0F, 0.0F);
        Neck1.addChild(Neck2);
        Neck2.addCuboid("Neck2", -2.0F, -1.5F, -4.0F, 5, 5, 5, 0.0F, 96, 26);

        Neck3 = new ModelPart(this);
        Neck3.setPivot(0.0F, -0.1F, -3.25F);
        setRotationAngle(Neck3, 0.2798F, 0.0F, 0.0F);
        Neck2.addChild(Neck3);
        Neck3.addCuboid("Neck3", -2.0F, -1.5F, -3.0F, 5, 5, 3, 0.0F, 96, 39);

        Neck4 = new ModelPart(this);
        Neck4.setPivot(0.0F, -0.1F, -2.3F);
        setRotationAngle(Neck4, 0.3591F, 0.0F, 0.0F);
        Neck3.addChild(Neck4);
        Neck4.addCuboid("Neck4", -2.0F, -1.5F, -3.0F, 5, 5, 3, 0.0F, 96, 39);

        head = new ModelPart(this);
        head.setPivot(0.5F, 0.9F, -2.1F);
        setRotationAngle(head, 3.6137F, 0.0F, 0.0F);
        Neck4.addChild(head);
        head.addCuboid("head", -3.0F, -2.5F, 0.0F, 6, 5, 5, 0.0F, 60, 30);

        jawup1 = new ModelPart(this);
        jawup1.setPivot(0.0F, -2.5F, 4.2F);
        setRotationAngle(jawup1, 0.084F, 0.0F, 0.0F);
        head.addChild(jawup1);
        jawup1.addCuboid("jawup1", -2.5F, 0.0F, 0.0F, 5, 3, 5, 0.0F, 85, 138);

        snout = new ModelPart(this);
        snout.setPivot(0.0F, 3.1F, -0.3F);
        setRotationAngle(snout, 0.1414F, 0.0F, 0.0F);
        jawup1.addChild(snout);
        snout.addCuboid("snout", -2.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, 125, 185);

        snout3 = new ModelPart(this);
        snout3.setPivot(0.0F, 0.0F, 5.0F);
        setRotationAngle(snout3, -0.0942F, 0.0F, 0.0F);
        snout.addChild(snout3);
        snout3.addCuboid("snout3", -2.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, 125, 174);

        snout2 = new ModelPart(this);
        snout2.setPivot(0.0F, 1.15F, 5.5F);
        setRotationAngle(snout2, 0.5199F, 0.0F, 0.0F);
        snout3.addChild(snout2);
        snout2.addCuboid("snout2", -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 118, 185);

        jawup2 = new ModelPart(this);
        jawup2.setPivot(0.0F, 0.0F, 4.8F);
        setRotationAngle(jawup2, -0.0815F, 0.0F, 0.0F);
        jawup1.addChild(jawup2);
        jawup2.addCuboid("jawup2", -2.0F, 0.0F, 0.0F, 4, 3, 7, 0.0F, 113, 131);

        jawdown1 = new ModelPart(this);
        jawdown1.setPivot(0.0F, -3.2F, 0.4F);
        setRotationAngle(jawdown1, 0.0F, 0.0F, 0.0F);
        head.addChild(jawdown1);
        jawdown1.addCuboid("jawdown1", -2.5F, -1.0F, -0.4F, 5, 2, 5, 0.0F, 72, 0);

        jawdown2 = new ModelPart(this);
        jawdown2.setPivot(0.0F, 0.5F, 4.1F);
        setRotationAngle(jawdown2, 0.1208F, 0.0F, 0.0F);
        jawdown1.addChild(jawdown2);
        jawdown2.addCuboid("jawdown2", -2.0F, -0.5F, -0.3F, 4, 1, 5, 0.0F, 39, 10);

        jawdown3 = new ModelPart(this);
        jawdown3.setPivot(0.0F, -0.2F, 3.3F);
        setRotationAngle(jawdown3, -0.1578F, 0.0F, 0.0F);
        jawdown2.addChild(jawdown3);
        jawdown3.addCuboid("jawdown3", -1.5F, -0.5F, 0.0F, 3, 1, 8, 0.0F, 60, 10);

        jawdown4 = new ModelPart(this);
        jawdown4.setPivot(0.0F, -0.5F, 3.3F);
        setRotationAngle(jawdown4, -0.0571F, 0.0F, 0.0F);
        jawdown1.addChild(jawdown4);
        jawdown4.addCuboid("jawdown4", -1.5F, -0.5F, 0.0F, 3, 1, 12, 0.0F, 30, 18);

        cheek1 = new ModelPart(this);
        cheek1.setPivot(2.0F, 3.2F, -0.4F);
        setRotationAngle(cheek1, 1.1442F, 0.0F, 0.0F);
        jawdown1.addChild(cheek1);
        cheek1.addCuboid("cheek1", 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, 11, 0);

        cheek2 = new ModelPart(this);
        cheek2.setPivot(-2.0F, 3.2F, -0.4F);
        setRotationAngle(cheek2, 1.1442F, 0.0F, 0.0F);
        jawdown1.addChild(cheek2);
        cheek2.addCuboid("cheek2", 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, 0, 0);

        l1 = new ModelPart(this);
        l1.setPivot(3.5F, 8.5F, 5.4F);
        setRotationAngle(l1, -0.2276F, 0.0F, 0.0F);
        tailbase.addChild(l1);
        l1.addCuboid("l1", 0.0F, -3.0F, -2.6F, 4, 12, 9, 0.0F, 64, 83);

        l2 = new ModelPart(this);
        l2.setPivot(2.0F, 7.3F, -1.2F);
        setRotationAngle(l2, 0.8052F, 0.0F, 0.0F);
        l1.addChild(l2);
        l2.addCuboid("l2", -1.5F, 0.0F, -2.0F, 3, 10, 6, 0.0F, 64, 129);

        l3 = new ModelPart(this);
        l3.setPivot(0.0F, 7.7F, 2.0F);
        setRotationAngle(l3, -0.6172F, 0.0F, 0.0F);
        l2.addChild(l3);
        l3.addCuboid("l3", -1.0F, 0.0F, -2.0F, 2, 10, 4, 0.0F, 60, 175);

        l4 = new ModelPart(this);
        l4.setPivot(1.5F, 9.0F, -0.9F);
        setRotationAngle(l4, -1.3744F, 0.0F, 0.0F);
        l3.addChild(l4);
        l4.addCuboid("l4", -3.0F, -3.0F, 0.0F, 3, 8, 2, 0.0F, 125, 150);

        leftfoot1 = new ModelPart(this);
        leftfoot1.setPivot(-3.0F, 1.7F, 1.4F);
        setRotationAngle(leftfoot1, -1.3214F, 0.0F, 0.0F);
        l4.addChild(leftfoot1);
        leftfoot1.addCuboid("leftfoot1", -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, 107, 129);

        leftfoot2 = new ModelPart(this);
        leftfoot2.setPivot(0.0F, 4.1F, -1.1F);
        setRotationAngle(leftfoot2, 1.0261F, 0.0F, 0.0F);
        leftfoot1.addChild(leftfoot2);
        leftfoot2.addCuboid("leftfoot2", -0.5F, 0.0F, 0.0F, 1, 3, 2, 0.0F, 93, 129);

        r1 = new ModelPart(this);
        r1.setPivot(-3.5F, 8.5F, 5.4F);
        setRotationAngle(r1, -0.2276F, 0.0F, 0.0F);
        tailbase.addChild(r1);
        r1.addCuboid("r1", -4.0F, -3.0F, -2.6F, 4, 12, 9, 0.0F, 64, 106);

        r2 = new ModelPart(this);
        r2.setPivot(-2.0F, 7.3F, -1.2F);
        setRotationAngle(r2, 0.8053F, 0.0F, 0.0F);
        r1.addChild(r2);
        r2.addCuboid("r2", -1.5F, 0.0F, -2.0F, 3, 10, 6, 0.0F, 64, 147);

        r3 = new ModelPart(this);
        r3.setPivot(0.0F, 7.7F, 2.0F);
        setRotationAngle(r3, -0.6171F, 0.0F, 0.0F);
        r2.addChild(r3);
        r3.addCuboid("r3", -1.0F, 0.0F, -2.0F, 2, 10, 4, 0.0F, 75, 175);

        r4 = new ModelPart(this);
        r4.setPivot(0.0F, 9.0F, -0.9F);
        setRotationAngle(r4, -1.3744F, 0.0F, 0.0F);
        r3.addChild(r4);
        r4.addCuboid("r4", -1.5F, -3.0F, 0.0F, 3, 8, 2, 0.0F, 125, 163);

        rightfoot1 = new ModelPart(this);
        rightfoot1.setPivot(2.0F, 1.7F, 1.4F);
        setRotationAngle(rightfoot1, -1.3214F, 0.0F, 0.0F);
        r4.addChild(rightfoot1);
        rightfoot1.addCuboid("rightfoot1", -1.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F, 100, 129);

        rightfoot2 = new ModelPart(this);
        rightfoot2.setPivot(0.0F, 4.1F, -1.1F);
        setRotationAngle(rightfoot2, 1.0261F, 0.0F, 0.0F);
        rightfoot1.addChild(rightfoot2);
        rightfoot2.addCuboid("rightfoot2", -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, 86, 129);
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}
