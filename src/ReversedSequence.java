import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedSequence {
//    Build a function that returns an array of integers from n to 1 where n>0.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));

    }

    public static int[] reverse(int n){

        return IntStream.rangeClosed(1, n)
                .map(i -> n - i + 1)
                .toArray();
    }

}
