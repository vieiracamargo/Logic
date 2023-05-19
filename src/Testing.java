import java.util.List;
import java.util.stream.IntStream;

public class Testing {
    public static void main(String[] args) {
        List<String> number = number(List.of("a", "b", "c"));
    }

    public static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size()).mapToObj(i -> (i+1) + ": " + lines.get(i)).toList();
    }
}
