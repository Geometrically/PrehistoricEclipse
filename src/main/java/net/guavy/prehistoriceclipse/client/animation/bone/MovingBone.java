package net.guavy.prehistoriceclipse.client.animation.bone;

import java.util.List;
import java.util.Map;

public class MovingBone implements Bone{
    public Map<Float, List<Float>> keyframes;

    public MovingBone(Map<Float, List<Float>> keyframes) {
        this.keyframes = keyframes;
    }
}
