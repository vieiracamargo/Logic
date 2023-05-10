public class CalculateBmi {

    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }

    public static String bmi(double weight, double height) {
        double value = weight / (height * 2);

        if(value <= 18.5) return "Underweight";

        if(value <= 25.0) return "Normal";

        if(value <= 30.0) return "Overweight";

        return "Obese";
    }
}
