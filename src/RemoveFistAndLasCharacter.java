public class RemoveFistAndLasCharacter {
    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
    }

    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }

}
