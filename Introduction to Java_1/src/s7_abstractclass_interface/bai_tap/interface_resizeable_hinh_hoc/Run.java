package s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc;

public class Run {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random() * 100 + 1) / 100;
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(5.0);
        shapes[2] = new Rectangle(6.0, 7.0);

        for (Shapes s:shapes) {
            System.out.println(s.getArea());
        }

        for (Shapes s:
             shapes) {
            if (s instanceof Circle){
                ((Circle) s).resize(percent);
                System.out.println("newArea of Circle = " + s.getArea());
            }if (s instanceof Rectangle){
                ((Rectangle) s).resize(percent);
                System.out.println("newArea of Rectangle = " + s.getArea());
            }if (s instanceof Square){
                ((Square) s).resize(percent);
                System.out.println("newArea of Square = " + s.getArea());
            }
            System.out.println(s);
        }
    }
}
