import java.util.Arrays;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        String[] split = s.split("");

        return Arrays.stream(split).
                sorted().
                distinct().
                reduce("", (a, b) -> a + b);
    }
}
