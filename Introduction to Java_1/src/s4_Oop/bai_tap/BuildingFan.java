package s4_Oop.bai_tap;

public class BuildingFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public BuildingFan(){
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn()) {
            return "Tốc độ quạt: " + this.speed + ", quạt có màu: " + this.color
                    + ", có bán kính: " + this.radius + ", và quạt đang chạy";
        } else {
            return "Quạt có màu: " + this.color
                    + ", có bán kính: " + this.radius + ", và quạt đang tắt";
        }

    }

    public static void main(String[] args) {
        BuildingFan fan1 = new BuildingFan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        BuildingFan fan2 = new BuildingFan();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }

}
