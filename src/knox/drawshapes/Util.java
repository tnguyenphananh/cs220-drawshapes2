package knox.drawshapes;

import java.awt.Color;

public class Util
{
    public static String colorToString(Color color) {
        if (color == Color.RED) {
            return "RED";
        } else if (color == Color.BLUE) {
            return "BLUE";
        }else if (color == Color.GREEN){
            return "GREEN";
        }else if (color == new Color(237, 173, 197)){
            return "PASTEL PINK";
        }
        throw new UnsupportedOperationException("Unexpected color: "+color);
    }
    
    public static Color stringToColor(String color) {
        if (color.equals("RED")) {
            return Color.RED;
        } else if (color.equals("BLUE")) {
            return Color.BLUE;
        }else if (color.equals("GREEN")){
            return Color.GREEN;
        }else if (color.equals("PASTEL PINK")){
            return (new Color(237, 173, 197));
        }
        throw new UnsupportedOperationException("Unexpected color: "+color);
    }
}
