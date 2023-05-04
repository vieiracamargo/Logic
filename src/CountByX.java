import java.util.Arrays;

public class CountByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2, 5)));
    }

    public static int[] countBy(int x, int y) {
        int[] result = new int[y];
        int count = 0;

        for (int i = 0; i < y; i++) {
            count += x;
            result[i] = count;
        }

        return result;

    }
}
