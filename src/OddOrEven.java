import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        int[] array = {0, -1, -5};
        System.out.println(oddOrEven(array));
    }

    public static String oddOrEven (int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }


}
