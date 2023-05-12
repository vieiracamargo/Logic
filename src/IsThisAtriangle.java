import java.util.Arrays;

public class IsThisAtriangle {
//Implement a function that accepts 3 integer values a, b, c.
//The function should return true if a triangle can be built
//and false in any other case.
    public static void main(String[] args) {
        System.out.println(isTriangle(7,1,2));
    }

    public static boolean isTriangle(int a, int b, int c){
        int[] numbers = {a, b, c};
        int[] array = Arrays.stream(numbers).sorted().toArray();
        return array[0] + array[1] > array[2];
    }
}
