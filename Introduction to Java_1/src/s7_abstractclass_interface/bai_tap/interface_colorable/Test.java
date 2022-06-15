package s7_abstractclass_interface.bai_tap.interface_colorable;

import s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc.Circle;
import s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc.Rectangle;
import s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc.Shapes;
import s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc.Square;

public class Test {
    public static void main(String[] args) {
        Shapes[] array = new Shapes[4];
        array[0] = new Circle();
        array[1] = new Rectangle();
        array[2] = new Square(6.0);
        array[3] = new Square(3.0);

        for (Shapes s : array) {
            if (s instanceof Square){
                System.out.println(s.getArea());
                ((Square) s).howToColor();
            }
        }
    }
}
