import java.util.Arrays;
import java.util.stream.IntStream;

public class SumWithoutHighestAndLowest {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 11, 2, 3 };
        System.out.println(SumWithoutHighestAndLowestValues(null));
    }

    private static int SumWithoutHighestAndLowestValues(int[] numbers) {

        if(numbers == null || numbers.length == 0){
            return 0;
        }

        Arrays.sort(numbers);
        return IntStream.range(1, numbers.length - 1).map(i -> numbers[i]).sum();
    }
}
