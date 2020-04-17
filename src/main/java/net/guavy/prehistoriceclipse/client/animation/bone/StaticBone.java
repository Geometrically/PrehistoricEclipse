package net.guavy.prehistoriceclipse.client.animation.bone;

import java.util.List;

public class StaticBone implements Bone{
    public List<Float> rotation;
    public List<Float> position;

    public StaticBone(List<Float> rotation, List<Float> position) {
        this.rotation = rotation;
        this.position = position;
    }
}
