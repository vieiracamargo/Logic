import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
    }

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();


        return String.format("%d %d", max, min);
    }

}
