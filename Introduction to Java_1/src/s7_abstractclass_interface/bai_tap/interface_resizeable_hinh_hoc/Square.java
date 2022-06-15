package s7_abstractclass_interface.bai_tap.interface_resizeable_hinh_hoc;


import s7_abstractclass_interface.bai_tap.interface_colorable.IColorable;

public class Square extends Rectangle implements IResizeable, IColorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
