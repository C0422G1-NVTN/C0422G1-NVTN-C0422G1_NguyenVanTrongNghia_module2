package s18_string_regex.bai_tap.bai_tap2;

public class TelephoneExample {
    private static final String TELEPHONE_REGEX = "^\\([\\d]{2}\\)-\\(0[\\d]{9}\\)$";

    public static void main(String[] args) {
        String arr[]= {"(84)-(0978489648)","(a8)-(22222222)"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println( arr[i].matches(TELEPHONE_REGEX));
        }
    }
}
