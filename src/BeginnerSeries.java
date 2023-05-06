public class BeginnerSeries {
//    Clock shows h hours, m minutes and s seconds after midnight.
//    Your task is to write a function which returns the time since midnight in milliseconds.
    public static void main(String[] args) {
        int hours = 24;
        int minutes = 60;
        int seconds = 30;

        System.out.println(horaEmMilisegundos(hours,minutes,seconds));

    }



    public static int horaEmMilisegundos(int hours, int minutes, int seconds) {
        return (hours * 3600000) + (minutes * 60000) + (seconds * 1000);
    }


}
