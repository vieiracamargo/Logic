import java.util.Arrays;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));

    }

    public static String smash(String... words) {
        return Arrays.stream(words).reduce("", (a, b) -> a + b+" ").strip();
    }

}
