import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumberOfPeopleInTheBus {
    //You are provided with a list (or array) of integer pairs
//The first item represent the number of people that get ON the bus
//The second item repesent the number of people that get OFF the bus
//return the number of people who are STILL on the bus after the LAST bus stop (after the last array).
//Vou receber uma lista de arrays de inteiros
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int getOnTheBus = 0;
        int getOffTheBus = 0;

        for(int[] e : stops){
            getOnTheBus += e[0];
            getOffTheBus += e[1];
        }

        return getOnTheBus - getOffTheBus;
    }

    public static int countPassengersBest(ArrayList<int[]> stops){
        return stops.stream()
                .mapToInt(stop -> stop[0] - stop[1])
                .sum();
    }
}
