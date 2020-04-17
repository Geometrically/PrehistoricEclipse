package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.guavy.prehistoriceclipse.entity.land.AllosaurusEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

public class AllosaurusModel extends AnimatedModel<AllosaurusEntity> {
    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart tailbase;
    private final ModelPart tail;
    private final ModelPart tail1;
    private final ModelPart tail2;
    private final ModelPart tail3;
    private final ModelPart tail4;
    private final ModelPart body2;
    private final ModelPart neckbase;
    private final ModelPart neck;
    private final ModelPart neckunder;
    private final ModelPart neckunder2;
    private final ModelPart neckunder3;
    private final ModelPart neckunder4;
    private final ModelPart neck1;
    private final ModelPart neck2;
    private final ModelPart neck3;
    private final ModelPart neck4;
    private final ModelPart head;
    private final ModelPart jawup;
    private final ModelPart jawup1;
    private final ModelPart jawup2;
    private final ModelPart jawup3;
    private final ModelPart Teeth2;
    private final ModelPart jawup4;
    private final ModelPart jawup5;
    private final ModelPart Teeth1;
    private final ModelPart jawdown1;
    private final ModelPart jawdown2;
    private final ModelPart jawdown3;
    private final ModelPart jawdownunder;
    private final ModelPart cheek1;
    private final ModelPart cheek2;
    private final ModelPart EyeRidgeLeft;
    private final ModelPart EyeRidgeRight;
    private final ModelPart rightarm1;
    private final ModelPart rightarm2;
    private final ModelPart rightarm3;
    private final ModelPart hand1;
    private final ModelPart hand6;
    private final ModelPart hand2;
    private final ModelPart hand5;
    private final ModelPart hand3;
    private final ModelPart hand4;
    private final ModelPart leftarm4;
    private final ModelPart leftarm5;
    private final ModelPart leftarm6;
    private final ModelPart hand7;
    private final ModelPart hand8;
    private final ModelPart hand9;
    private final ModelPart hand10;
    private final ModelPart hand11;
    private final ModelPart hand12;
    private final ModelPart l1;
    private final ModelPart l2;
    private final ModelPart l3;
    private final ModelPart l4;
    private final ModelPart r1;
    private final ModelPart r2;
    private final ModelPart r3;
    private final ModelPart r4;

    public AllosaurusModel() {
        textureWidth = 140;
        textureHeight = 130;

        root = new ModelPart(this);
        root.setPivot(0.0F, 13.2F, 4.3F);

        body = new ModelPart(this);
        body.setPivot(0.0F, -11.1F, -5.2F);
        setRotationAngle(body, -0.0412F, 0.0F, 0.0F);
        root.addChild(body);
        body.addCuboid("body", -3.5F, 0.0F, 0.0F, 8, 10, 9, 0.0F, 103, 109);

        tailbase = new ModelPart(this);
        tailbase.setPivot(0.0F, 4.0F, 8.5F);
        setRotationAngle(tailbase, 0.0248F, 0.0F, 0.0F);
        body.addChild(tailbase);
        tailbase.addCuboid("tailbase", -3.0F, -4.0F, 0.0F, 7, 7, 5, 0.0F, 0, 65);

        tail = new ModelPart(this);
        tail.setPivot(0.0F, -0.5F, 3.5F);
        setRotationAngle(tail, 0.0815F, 0.0F, 0.0F);
        tailbase.addChild(tail);
        tail.addCuboid("tail", -2.0F, -3.5F, 0.0F, 5, 6, 7, 0.0F, 0, 51);

        tail1 = new ModelPart(this);
        tail1.setPivot(0.0F, -0.5F, 5.7F);
        setRotationAngle(tail1, -0.0552F, 0.0F, 0.0F);
        tail.addChild(tail1);
        tail1.addCuboid("tail1", -1.5F, -3.0F, 0.0F, 4, 5, 6, 0.0F, 0, 39);

        tail2 = new ModelPart(this);
        tail2.setPivot(0.0F, -0.5F, 5.2F);
        setRotationAngle(tail2, -0.0314F, 0.0F, 0.0F);
        tail1.addChild(tail2);
        tail2.addCuboid("tail2", -1.0F, -2.5F, 0.0F, 3, 4, 7, 0.0F, 0, 27);

        tail3 = new ModelPart(this);
        tail3.setPivot(0.0F, -0.5F, 6.0F);
        setRotationAngle(tail3, -0.1133F, 0.0F, 0.0F);
        tail2.addChild(tail3);
        tail3.addCuboid("tail3", -0.5F, -2.0F, 0.0F, 2, 3, 8, 0.0F, 0, 13);

        tail4 = new ModelPart(this);
        tail4.setPivot(0.0F, -0.5F, 7.0F);
        setRotationAngle(tail4, -0.1492F, 0.0F, 0.0F);
        tail3.addChild(tail4);
        tail4.addCuboid("tail4", 0.0F, -1.5F, 0.0F, 1, 2, 8, 0.0F, 0, 0);

        body2 = new ModelPart(this);
        body2.setPivot(0.0F, 4.7F, 0.8F);
        setRotationAngle(body2, 0.1004F, 0.0F, 0.0F);
        body.addChild(body2);
        body2.addCuboid("body2", -3.0F, -4.5F, -7.0F, 7, 9, 7, 0.0F, 73, 112);

        neckbase = new ModelPart(this);
        neckbase.setPivot(0.0F, -0.2F, -6.7F);
        setRotationAngle(neckbase, 0.014F, 0.0F, 0.0F);
        body2.addChild(neckbase);
        neckbase.addCuboid("neckbase", -2.5F, -4.0F, -5.0F, 6, 8, 5, 0.0F, 23, 0);

        neck = new ModelPart(this);
        neck.setPivot(-0.5F, -1.0F, -3.5F);
        setRotationAngle(neck, -0.2724F, 0.0F, 0.0F);
        neckbase.addChild(neck);
        neck.addCuboid("neck", -1.0F, -2.5F, -4.0F, 4, 4, 4, 0.0F, 94, 32);

        neckunder = new ModelPart(this);
        neckunder.setPivot(0.5F, 1.6F, 2.2F);
        setRotationAngle(neckunder, -0.5772F, 0.0F, 0.0F);
        neck.addChild(neckunder);
        neckunder.addCuboid("neckunder", -1.0F, 0.0F, -8.0F, 3, 4, 8, 0.0F, 56, 9);

        neckunder2 = new ModelPart(this);
        neckunder2.setPivot(0.5F, 0.1F, -3.0F);
        setRotationAngle(neckunder2, 0.4048F, 0.0F, 0.0F);
        neckunder.addChild(neckunder2);
        neckunder2.addCuboid("neckunder2", -1.0F, 0.0F, -4.0F, 2, 4, 4, 0.0F, 60, 38);

        neckunder3 = new ModelPart(this);
        neckunder3.setPivot(0.0F, 0.0205F, -4.5773F);
        setRotationAngle(neckunder3, 0.2594F, 0.0F, 0.0F);
        neckunder2.addChild(neckunder3);
        neckunder3.addCuboid("neckunder3", -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.0F, 58, 22);

        neckunder4 = new ModelPart(this);
        neckunder4.setPivot(0.0F, 0.2F, -1.8F);
        setRotationAngle(neckunder4, -0.3007F, 0.0F, 0.0F);
        neckunder3.addChild(neckunder4);
        neckunder4.addCuboid("neckunder4", -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.0F, 58, 30);

        neck1 = new ModelPart(this);
        neck1.setPivot(0.0F, 0.1F, -3.5F);
        setRotationAngle(neck1, -0.3002F, 0.0F, 0.0F);
        neck.addChild(neck1);
        neck1.addCuboid("neck1", -1.0F, -2.5F, -3.0F, 4, 4, 3, 0.0F, 94, 16);

        neck2 = new ModelPart(this);
        neck2.setPivot(0.0F, -2.5F, -3.0F);
        setRotationAngle(neck2, 0.1459F, 0.0F, 0.0F);
        neck1.addChild(neck2);
        neck2.addCuboid("neck2", -1.0F, 0.0F, -2.5F, 4, 4, 3, 0.0F, 94, 24);

        neck3 = new ModelPart(this);
        neck3.setPivot(0.0F, 0.0F, -2.4F);
        setRotationAngle(neck3, 0.3067F, 0.0F, 0.0F);
        neck2.addChild(neck3);
        neck3.addCuboid("neck3", -1.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F, 80, 18);

        neck4 = new ModelPart(this);
        neck4.setPivot(0.0F, 0.0F, -2.0F);
        setRotationAngle(neck4, 0.5255F, 0.0F, 0.0F);
        neck3.addChild(neck4);
        neck4.addCuboid("neck4", -1.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F, 80, 25);

        head = new ModelPart(this);
        head.setPivot(0.5F, 2.8382F, -0.9337F);
        setRotationAngle(head, -0.2219F, 0.0F, 0.0F);
        neck4.addChild(head);
        head.addCuboid("head", -2.0F, -2.5F, -4.0F, 5, 4, 4, 0.0F, 100, 0);

        jawup = new ModelPart(this);
        jawup.setPivot(0.0F, -0.7F, -3.6F);
        setRotationAngle(jawup, 0.0911F, 0.0F, 0.0F);
        head.addChild(jawup);
        jawup.addCuboid("jawup", -1.5F, 0.2F, -3.0F, 4, 2, 3, 0.0F, 115, 46);

        jawup1 = new ModelPart(this);
        jawup1.setPivot(0.0F, -1.82F, -1.2F);
        setRotationAngle(jawup1, 0.1117F, 0.0F, 0.0F);
        jawup.addChild(jawup1);
        jawup1.addCuboid("jawup1", -1.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F, 115, 52);

        jawup2 = new ModelPart(this);
        jawup2.setPivot(0.5F, -1.5F, -4.1F);
        setRotationAngle(jawup2, 0.3513F, 0.0F, 0.0F);
        jawup.addChild(jawup2);
        jawup2.addCuboid("jawup2", -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, 115, 59);

        jawup3 = new ModelPart(this);
        jawup3.setPivot(0.0F, 0.2F, -3.0F);
        setRotationAngle(jawup3, -0.0927F, 0.0F, 0.0F);
        jawup.addChild(jawup3);
        jawup3.addCuboid("jawup3", -1.0F, 0.0F, -3.8F, 3, 2, 4, 0.0F, 115, 64);

        Teeth2 = new ModelPart(this);
        Teeth2.setPivot(0.0F, 2.4537F, 0.4188F);
        jawup3.addChild(Teeth2);
        Teeth2.addCuboid("Teeth2", -0.5F, -0.6935F, -3.9495F, 2, 1, 4, 0.0F, 126, 9);

        jawup4 = new ModelPart(this);
        jawup4.setPivot(0.0F, -1.8F, -0.2F);
        setRotationAngle(jawup4, -0.0145F, 0.0F, 0.0F);
        jawup.addChild(jawup4);
        jawup4.addCuboid("jawup4", -1.0F, 0.0F, -1.0F, 3, 3, 1, 0.0F, 115, 71);

        jawup5 = new ModelPart(this);
        jawup5.setPivot(0.5F, -0.8F, -6.0F);
        setRotationAngle(jawup5, 0.7154F, 0.0F, 0.0F);
        jawup.addChild(jawup5);
        jawup5.addCuboid("jawup5", -1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F, 115, 76);

        Teeth1 = new ModelPart(this);
        Teeth1.setPivot(0.0F, 2.7F, 0.0F);
        jawup.addChild(Teeth1);
        Teeth1.addCuboid("Teeth1", -1.0F, -0.9783F, -3.1457F, 3, 1, 3, 0.0F, 110, 9);

        jawdown1 = new ModelPart(this);
        jawdown1.setPivot(0.5F, 1.9F, 0.0F);
        setRotationAngle(jawdown1, 0.0121F, 0.0F, 0.0F);
        head.addChild(jawdown1);
        jawdown1.addCuboid("jawdown1", -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.03F, 110, 15);

        jawdown2 = new ModelPart(this);
        jawdown2.setPivot(0.0F, -0.5F, -3.5F);
        setRotationAngle(jawdown2, 6.4589F, 0.0F, 0.0F);
        jawdown1.addChild(jawdown2);
        jawdown2.addCuboid("jawdown2", -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.03F, 110, 25);

        jawdown3 = new ModelPart(this);
        jawdown3.setPivot(-0.5F, 0.0F, -3.0F);
        setRotationAngle(jawdown3, 6.1189F, 0.0F, 0.0F);
        jawdown2.addChild(jawdown3);
        jawdown3.addCuboid("jawdown3", -0.5F, -0.5F, -3.0F, 2, 1, 4, 0.03F, 112, 30);

        jawdownunder = new ModelPart(this);
        jawdownunder.setPivot(-0.5F, 1.0F, -0.1F);
        setRotationAngle(jawdownunder, 6.0371F, 0.0F, 0.0F);
        jawdown2.addChild(jawdownunder);
        jawdownunder.addCuboid("jawdownunder", -0.5F, -0.5F, -6.7F, 2, 1, 7, 0.03F, 113, 36);

        cheek1 = new ModelPart(this);
        cheek1.setPivot(1.5F, 0.1F, -0.1F);
        setRotationAngle(cheek1, -3.3402F, 0.0F, 0.0F);
        jawdown1.addChild(cheek1);
        cheek1.addCuboid("cheek1", 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, 87, 0);

        cheek2 = new ModelPart(this);
        cheek2.setPivot(-1.5F, 0.1F, -0.1F);
        setRotationAngle(cheek2, -3.3388F, 0.0F, 0.0F);
        jawdown1.addChild(cheek2);
        cheek2.addCuboid("cheek2", 0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F, 77, 0);

        EyeRidgeLeft = new ModelPart(this);
        EyeRidgeLeft.setPivot(2.7F, -2.4F, -2.1F);
        setRotationAngle(EyeRidgeLeft, 3.7924F, 0.3239F, 0.0F);
        head.addChild(EyeRidgeLeft);
        EyeRidgeLeft.addCuboid("EyeRidgeLeft", -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, 120, 0);

        EyeRidgeRight = new ModelPart(this);
        EyeRidgeRight.setPivot(-1.7F, -2.4F, -2.1F);
        setRotationAngle(EyeRidgeRight, 3.7924F, -0.3239F, 0.0F);
        head.addChild(EyeRidgeRight);
        EyeRidgeRight.addCuboid("EyeRidgeRight", -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, 130, 0);

        rightarm1 = new ModelPart(this);
        rightarm1.setPivot(-2.0F, 2.1955F, -3.1242F);
        setRotationAngle(rightarm1, 0.9809F, 0.0F, 0.4259F);
        neckbase.addChild(rightarm1);
        rightarm1.addCuboid("rightarm1", -1.5F, -0.5F, -1.5F, 3, 4, 3, 0.0F, 93, 60);

        rightarm2 = new ModelPart(this);
        rightarm2.setPivot(-0.2819F, 2.6195F, 0.9997F);
        setRotationAngle(rightarm2, -1.216F, -0.2793F, 0.2569F);
        rightarm1.addChild(rightarm2);
        rightarm2.addCuboid("rightarm2", -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, 96, 53);

        rightarm3 = new ModelPart(this);
        rightarm3.setPivot(-0.55F, 3.75F, 0.0F);
        setRotationAngle(rightarm3, 0.3491F, 1.6581F, -0.2618F);
        rightarm2.addChild(rightarm3);
        rightarm3.addCuboid("rightarm3", -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, 90, 70);

        hand1 = new ModelPart(this);
        hand1.setPivot(-0.3F, 1.5F, 0.6F);
        setRotationAngle(hand1, 0.1367F, 0.0F, -0.4098F);
        rightarm3.addChild(hand1);
        hand1.addCuboid("hand1", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 97, 84);

        hand6 = new ModelPart(this);
        hand6.setPivot(0.0F, 1.7F, 0.0F);
        setRotationAngle(hand6, 0.2998F, 0.0F, 0.0F);
        hand1.addChild(hand6);
        hand6.addCuboid("hand6", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 102, 84);

        hand2 = new ModelPart(this);
        hand2.setPivot(0.3F, 1.5F, 0.6F);
        setRotationAngle(hand2, 0.0178F, 0.0F, 0.4098F);
        rightarm3.addChild(hand2);
        hand2.addCuboid("hand2", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 107, 84);

        hand5 = new ModelPart(this);
        hand5.setPivot(0.0F, 1.7F, 0.0F);
        setRotationAngle(hand5, 0.2983F, 0.0F, 0.0F);
        hand2.addChild(hand5);
        hand5.addCuboid("hand5", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 97, 88);

        hand3 = new ModelPart(this);
        hand3.setPivot(0.0F, 2.2F, 0.5F);
        setRotationAngle(hand3, -0.0087F, 0.0F, 0.0F);
        rightarm3.addChild(hand3);
        hand3.addCuboid("hand3", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 108, 88);

        hand4 = new ModelPart(this);
        hand4.setPivot(0.0F, 1.6F, 0.0F);
        setRotationAngle(hand4, 0.3824F, 0.0F, 0.0F);
        hand3.addChild(hand4);
        hand4.addCuboid("hand4", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 102, 84);

        leftarm4 = new ModelPart(this);
        leftarm4.setPivot(3.0F, 2.1955F, -3.1242F);
        setRotationAngle(leftarm4, 0.9809F, 0.0F, -0.4259F);
        neckbase.addChild(leftarm4);
        leftarm4.addCuboid("leftarm4", -1.5F, -0.5F, -1.5F, 3, 4, 3, 0.0F, 93, 60);

        leftarm5 = new ModelPart(this);
        leftarm5.setPivot(0.2819F, 2.6195F, 0.9997F);
        setRotationAngle(leftarm5, -1.216F, 0.2793F, -0.2569F);
        leftarm4.addChild(leftarm5);
        leftarm5.addCuboid("leftarm5", -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, 96, 53);

        leftarm6 = new ModelPart(this);
        leftarm6.setPivot(0.55F, 3.75F, 0.0F);
        setRotationAngle(leftarm6, 0.3491F, -1.6581F, 0.2618F);
        leftarm5.addChild(leftarm6);
        leftarm6.addCuboid("leftarm6", -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, 90, 70);

        hand7 = new ModelPart(this);
        hand7.setPivot(0.3F, 1.5F, 0.6F);
        setRotationAngle(hand7, 0.1367F, 0.0F, 0.4098F);
        leftarm6.addChild(hand7);
        hand7.addCuboid("hand7", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 97, 84);

        hand8 = new ModelPart(this);
        hand8.setPivot(0.0F, 1.7F, 0.0F);
        setRotationAngle(hand8, 0.2998F, 0.0F, 0.0F);
        hand7.addChild(hand8);
        hand8.addCuboid("hand8", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 102, 84);

        hand9 = new ModelPart(this);
        hand9.setPivot(-0.3F, 1.5F, 0.6F);
        setRotationAngle(hand9, 0.0178F, 0.0F, -0.4098F);
        leftarm6.addChild(hand9);
        hand9.addCuboid("hand9", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 107, 84);

        hand10 = new ModelPart(this);
        hand10.setPivot(0.0F, 1.7F, 0.0F);
        setRotationAngle(hand10, 0.2983F, 0.0F, 0.0F);
        hand9.addChild(hand10);
        hand10.addCuboid("hand10", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 97, 88);

        hand11 = new ModelPart(this);
        hand11.setPivot(0.0F, 2.2F, 0.5F);
        setRotationAngle(hand11, -0.0087F, 0.0F, 0.0F);
        leftarm6.addChild(hand11);
        hand11.addCuboid("hand11", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 108, 88);

        hand12 = new ModelPart(this);
        hand12.setPivot(0.0F, 1.6F, 0.0F);
        setRotationAngle(hand12, 0.3824F, 0.0F, 0.0F);
        hand11.addChild(hand12);
        hand12.addCuboid("hand12", -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 102, 84);

        l1 = new ModelPart(this);
        l1.setPivot(5.6F, 4.3F, 6.0F);
        setRotationAngle(l1, -0.39F, 0.0F, 0.0F);
        body.addChild(l1);
        l1.addCuboid("l1", -3.0F, -0.5244F, -3.459F, 3, 9, 7, 0.0F, 0, 98);

        l2 = new ModelPart(this);
        l2.setPivot(-0.5F, 6.5756F, -0.559F);
        setRotationAngle(l2, 1.0718F, 0.0F, 0.0F);
        l1.addChild(l2);
        l2.addCuboid("l2", -2.0F, -1.7807F, -2.7927F, 2, 9, 5, 0.0F, 29, 82);

        l3 = new ModelPart(this);
        l3.setPivot(0.0F, 6.0193F, 0.3073F);
        setRotationAngle(l3, -0.8875F, 0.0F, 0.0F);
        l2.addChild(l3);
        l3.addCuboid("l3", -2.02F, -0.0308F, -1.7802F, 2, 7, 3, 0.0F, 2, 86);

        l4 = new ModelPart(this);
        l4.setPivot(-1.0F, 6.2692F, -0.4802F);
        setRotationAngle(l4, 0.2583F, 0.0F, 0.0F);
        l3.addChild(l4);
        l4.addCuboid("l4", -1.5F, -0.8226F, -3.0243F, 3, 2, 5, 0.0F, 0, 117);

        r1 = new ModelPart(this);
        r1.setPivot(-4.6F, 5.1F, 5.7F);
        setRotationAngle(r1, -0.3899F, 0.0F, 0.0F);
        body.addChild(r1);
        r1.addCuboid("r1", 0.0F, -1.3786F, -3.4856F, 3, 9, 7, 0.0F, 21, 98);

        r2 = new ModelPart(this);
        r2.setPivot(0.5F, 6.4214F, -0.4856F);
        setRotationAngle(r2, 1.0718F, 0.0F, 0.0F);
        r1.addChild(r2);
        r2.addCuboid("r2", 0.0F, -2.2035F, -2.2259F, 2, 9, 5, 0.0F, 44, 82);

        r3 = new ModelPart(this);
        r3.setPivot(0.02F, 5.2965F, 0.7741F);
        setRotationAngle(r3, -0.8875F, 0.0F, 0.0F);
        r2.addChild(r3);
        r3.addCuboid("r3", 0.0F, 0.081F, -1.4844F, 2, 7, 3, 0.0F, 13, 86);

        r4 = new ModelPart(this);
        r4.setPivot(1.0F, 6.281F, 0.1156F);
        setRotationAngle(r4, 0.2583F, 0.0F, 0.0F);
        r3.addChild(r4);
        r4.addCuboid("r4", -1.5F, -0.8026F, -3.3399F, 3, 2, 5, 0.0F, 20, 117);
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
