public class DnaToRna {
    public static void main(String[] args) {
        String dna = "GCAT";
        System.out.println(dnaToRna(dna));
    }

    public static String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
