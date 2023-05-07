public class TheFeastOfManyBeasts {
    public static void main(String[] args) {
        String beast = "chickadee";
        String dish = "chocolate cake";

        System.out.println(feast(beast, dish));

    }
    public static boolean feast(String beast, String dish) {
        String primeiraLetra = beast.substring(0, 1);
        String ultimaLetra = beast.substring(beast.length()-1);

        return dish.startsWith(primeiraLetra) || dish.endsWith(ultimaLetra);
    }

}
