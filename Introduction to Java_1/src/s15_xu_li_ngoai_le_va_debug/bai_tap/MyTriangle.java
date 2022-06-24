package s15_xu_li_ngoai_le_va_debug.bai_tap;

public class MyTriangle {
    private int a;
    private int b;
    private int c;

    public MyTriangle() {
    }

    public MyTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void check(int a, int b, int c)throws  IllegalTriangleException{
        if (a+b<=c || b+c<=a || a+c<=b ){
            throw new IllegalTriangleException("Tam giác ko hợp lệ");
        }else{
            System.out.println("Tam giác hợp lệ");
        }
    }
}
