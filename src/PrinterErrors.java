public class PrinterErrors {
//    You have to write a function printer_error which given a string
//    will return the error rate of the printer as a string
//    String represeentado uma fração :
//    primeiro digito é o número de erro 3/10  segundo é o tamanho da string
    public static void main(String[] args) {
        String s = "aaaxbbbbyyhwawiwjjjwwm";
        System.out.println(printerError(s));
    }

    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
