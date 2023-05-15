import java.util.stream.IntStream;

public class IntegersBetween {
    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));
    }

    public static int GetSum(int a, int b) {
        return IntStream.rangeClosed(Math.min(a,b), Math.max(a,b)).reduce(0, (x, y) -> x + y);
    }
}
