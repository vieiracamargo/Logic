import java.io.Serializable;

public class GetTheMiddleChar {
    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
    }

    public static Serializable getMiddle(String word) {
        return word.length() % 2 != 0 ?
                "" + word.charAt(word.length() / 2) :
                word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
    }

}
