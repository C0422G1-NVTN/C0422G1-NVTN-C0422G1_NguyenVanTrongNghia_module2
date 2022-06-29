package s18_string_regex.bai_tap.bai_tap1;


public class NameClassExample {
    private static final String NAME_CLASS_REGEX = "^[CAP][\\d]{4}[GHIKLM]$";

    public static void main(String[] args) {
        String[] arr = {"C0318G","M0318G","P0323A"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+": "+arr[i].matches(NAME_CLASS_REGEX));
        }
    }


}
