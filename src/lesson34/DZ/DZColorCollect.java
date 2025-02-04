package lesson34.DZ;

import java.awt.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static java.awt.Color.RED;
import static java.awt.Color.getColor;


public class DZColorCollect {
    public static void main(String[] args) {
        String[] arrColor = {"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};

        HashMap<String, Color> colorHashCollect = new HashMap<>();

        for (int i = 0; i < arrColor.length; i++) {
            colorHashCollect.put(arrColor[i], new Color(arrColor[i].toUpperCase()));
        }

        for (Map.Entry s : colorHashCollect.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue());
        }
    }
}
 class Color {
        private String name;

        public Color(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }


