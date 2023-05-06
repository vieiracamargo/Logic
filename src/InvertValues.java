import java.util.Arrays;

public class InvertValues {
//Given a set of numbers, return the additive inverse of each.
// Each positive becomes negatives, and the negatives become positives.
public static void main(String[] args) {
    int[] numbers = {};
    System.out.println(Arrays.toString(invert(numbers)));
}

public static int[] invert(int[] numbers) {
    return Arrays.stream(numbers).map(number -> number * (-1)).toArray();
}

// receber um array de numeros
//    percorrer esse array  multiplicando cada valor por -1
// reatribuir o valor no proprio array
}
