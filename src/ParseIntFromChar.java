public class ParseIntFromChar {
    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }

    public static int howOld(String herOld) {
        return Integer.parseInt(herOld.substring(0,1));
    }
}
