package s5_access_modifier_static_method_static_property.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void display(){
        System.out.println("Name is : " + getName() +"\n" +" Class is : " + getClasses());
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Tommy");
        student1.setClasses("C07");
        student1.display();
    }
}
