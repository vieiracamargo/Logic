public class ExesAndOhs {
// Check to see if a string has the same amount of 'x's and 'o's.
// The method must return a boolean and be case INSENSITIVE.
// The string can contain any char.
//when no 'x' and 'o' is present should return true
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }

    public static boolean getXO (String str) {
        long countX = str.toLowerCase().chars().filter(c -> c == 'x').count();
        long countO = str.toLowerCase().chars().filter(c -> c == 'o').count();


        return countX == countO;
    }

}
