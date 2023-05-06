import java.util.function.Function;

public class WillYouMakeIt {
    public static void main(String[] args) {
        int milesPerGallon = 25;
        int distanceToPump = 50;
        int galonsLeft = 2;
        System.out.println(zeroFuel(milesPerGallon, distanceToPump, galonsLeft));
    }

    public static boolean zeroFuel(int milesPerGallon, int distanceToPump, int galonsLeft){
        return distanceToPump <= milesPerGallon * galonsLeft;
    }
}
