public class AreaOrPerimeter {
    public static void main(String[] args) {
        int length = 3;
        int width = 3;

        System.out.println(areaOrPerimeter(length,width));

    }

    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }
}
