package net.guavy.prehistoriceclipse.util;

public class Util {
    public static float[] getInBetweenNumbers(float number, Float[] list) {
        for (int i = 0; i < list.length; i++) {
            if(list[i] >= number) {
                if(i == 0 || i >= list.length - 1)
                    return new float[] {list[i]};
                else
                    return new float[] {list[i - 1], list[i]};
            }
        }
        return null;
    }
}
