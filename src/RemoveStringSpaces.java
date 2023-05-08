public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("8aaaaa dddd r     "));
    }

    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
