public class Isograms {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(isIsogram(s));

    }
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
