import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NeedleInTheHaystack {
//Write a function findNeedle() that takes an array full of junk but containing one "needle"
//After your function finds the needle it should return a message (as a string) that says:
//"found the needle at position " plus the index it found the needle, so:

//    escrever uma função que recebe um array de Strings.
//
    public static void main(String[] args) {

        Object[] haystack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack));
    }

    public static String findNeedle(Object[] haystack) {
        OptionalInt first = IntStream.range(0, haystack.length)
                .filter(i ->"needle".equals(haystack[i]))
                .findFirst();

        return first.isPresent() ? "found the needle at position " + first.getAsInt() : "";

    }
}
