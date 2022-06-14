package s6_ke_thua.bai_tap.point_moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y){
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
        Point arrayXY = new Point();
        arrayXY.setX(4.0f);
        arrayXY.setY(5.0f);
        System.out.println(arrayXY);
    }
}
