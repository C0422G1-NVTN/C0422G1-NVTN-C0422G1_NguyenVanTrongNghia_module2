package s6_ke_thua.bai_tap.point_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){}

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        float [] arraySpeed = {this.xSpeed,this.ySpeed};
        return arraySpeed;
    }

    @Override
    public String toString() {
        return "\n(x,y) = " + "(" + super.getX() + "," + super.getY() + ")" +
                "\nspeed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MovablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint arraySpeed = new MovablePoint();
        arraySpeed.setXSpeed(6.0f);
        arraySpeed.setYSpeed(7.0f);
        System.out.println(arraySpeed.move());

    }
}
