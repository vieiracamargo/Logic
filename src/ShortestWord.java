import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
//    Simple, given a string of words, return the length of the shortest word(s).

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int findShort(String s) {
        String[] split = s.split(" ");
        return Arrays.stream(split).map(String::length)
                .min(Comparator.naturalOrder())
                .orElse(0);

    }
}
