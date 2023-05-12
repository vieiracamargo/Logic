public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }

    public static boolean getXO (String str) {
        long countX = str.toLowerCase().chars().filter(c -> c == 'x').count();
        long countO = str.toLowerCase().chars().filter(c -> c == 'o').count();


        return countX == countO;
    }

}
