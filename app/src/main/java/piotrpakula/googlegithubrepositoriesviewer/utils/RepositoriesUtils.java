package piotrpakula.googlegithubrepositoriesviewer.utils;

import java.util.HashMap;
import java.util.Map;

import piotrpakula.googlegithubrepositoriesviewer.R;

public class RepositoriesUtils {

    public static Map<String, Integer> iconsId = null;

    public static void build() {
        buildIconsId();
    }

    public static void destroy() {
        destroyiconsId();
    }

    private static void buildIconsId(){
        iconsId = new HashMap<>();
        iconsId.put("Java", R.drawable.blue_circle);
        iconsId.put("C", R.drawable.green_circle);
        iconsId.put("JavaScript", R.drawable.orange_circle);
        iconsId.put("Python", R.drawable.pink_circle);
        iconsId.put("Go", R.drawable.purple_circle);
        iconsId.put("HTML", R.drawable.red_circle);
    }

    private static void destroyiconsId() {
        iconsId = null;
    }
}
