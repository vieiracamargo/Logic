public class TransportationVacation {
//    Every day you rent the car costs $40.
//    If you rent the car for 7 or more days, you get $50 off your total.
//    if you rent the car for 3 or more days, you get $20 off your total.
    public static void main(String[] args) {
        int i = rentalCarCost(3);
    }

    public static int rentalCarCost(int days) {
        final int  CAR_COST = 40;
        final int  DISCOUNT_FOR_7_DAYS_OR_MORE = 50;
        final int  DISCOUNT_FOR_3_DAYS_OR_MORE = 20;


        if(days >= 7){return (days * CAR_COST) - DISCOUNT_FOR_7_DAYS_OR_MORE;}
        if(days >= 3){return (days * CAR_COST) - DISCOUNT_FOR_3_DAYS_OR_MORE;}
        return days * CAR_COST;
    }

}
