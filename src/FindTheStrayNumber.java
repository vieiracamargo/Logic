import java.util.Arrays;

public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(grow(numbers));
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }

}