package net.guavy.prehistoriceclipse.client.animation;

import com.google.gson.JsonObject;

import java.util.Map;

public class ParsedAnimation {
    public boolean loop;

    public float animation_length;
    public Map<String, JsonObject> bones;
}
