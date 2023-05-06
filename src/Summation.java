import java.util.stream.IntStream;

public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(10));
    }

    public static int summation(int n){
        return IntStream.rangeClosed(1, n).sum();
    }

}
