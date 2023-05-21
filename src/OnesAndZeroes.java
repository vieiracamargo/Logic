import java.util.List;

public class OnesAndZeroes {
    public static void main(String[] args) {
        List<Integer> integers = List.of(0, 0, 1, 0);
        System.out.println(ConvertBinaryArrayToInt(integers));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String reduce = binary.stream()
                .map(e -> e + "")
                .reduce("", (a, b) -> a + b);

        return Integer.parseInt(reduce, 2);


    }

}
