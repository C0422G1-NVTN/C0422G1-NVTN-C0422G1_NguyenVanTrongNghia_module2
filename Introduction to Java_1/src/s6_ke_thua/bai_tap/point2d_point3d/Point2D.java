package s6_ke_thua.bai_tap.point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        float [] array = {this.x,this.y};
                return array;
    }

    public String toString(){
        return "Array2D= {" + this.x + "," + this.y + "}";
    }

    public static void main(String[] args) {
        Point2D array = new Point2D(1,2);
        System.out.println(array);
        Point2D array2 = new Point2D(3,4);
        System.out.println(array2);
    }
}
