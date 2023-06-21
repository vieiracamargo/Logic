public class BreakCamelCase {
    public static void main(String[] args) {
        String input = "camelCasing";
        System.out.println(camelCase(input));

    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
