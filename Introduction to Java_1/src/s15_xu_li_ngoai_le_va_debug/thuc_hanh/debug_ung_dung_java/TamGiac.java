package s15_xu_li_ngoai_le_va_debug.thuc_hanh.debug_ung_dung_java;

public class TamGiac {
    private int a, b, c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void check(int a, int b, int c) throws TamGiascLoi {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TamGiascLoi("Tam giác không hợp lệ");
        }else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
