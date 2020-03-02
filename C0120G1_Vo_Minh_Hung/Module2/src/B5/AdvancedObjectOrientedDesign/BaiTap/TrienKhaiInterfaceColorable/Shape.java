package B5.AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceColorable;

public class Shape implements Colorable{
    String color="green";
    boolean filled=true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
