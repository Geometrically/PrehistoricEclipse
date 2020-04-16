package net.guavy.prehistoriceclipse.client.animation.bone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovingBone implements Bone{
    public final Map<Double, List<Double>> keyframes = new HashMap<>();
}
