public class YouAreSquare {
//    Given an integral number, determine if it's a square number:
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }

    public static boolean isSquare(int number) {
        return Math.sqrt(number) % 1 == 0;
    }
}
