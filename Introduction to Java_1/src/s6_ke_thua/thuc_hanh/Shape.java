package s6_ke_thua.thuc_hanh;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
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

    public String filled() {
        if (isFilled()) {
        return "filled";
        }else
        {
            return "not filled";}
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled() +
                '}';
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setFilled(false);
        System.out.println(shape);
    }
}
