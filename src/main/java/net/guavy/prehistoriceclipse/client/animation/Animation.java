package net.guavy.prehistoriceclipse.client.animation;

import net.guavy.prehistoriceclipse.client.animation.bone.Bone;

import java.util.HashMap;
import java.util.Map;

public class Animation {
    public boolean loop;

    public float length;
    public final Map<String, Bone> bones = new HashMap<>();
}
