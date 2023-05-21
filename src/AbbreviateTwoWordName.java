import java.util.Arrays;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));
    }

    public static String abbrevName(String name) {
        name = name.replace(" ", ".");
        String first = String.valueOf(name.charAt(0)).toUpperCase();
        String second = name.substring(name.indexOf("."), name.indexOf(".") + 2).toUpperCase();
        return first + second;
    }
}
