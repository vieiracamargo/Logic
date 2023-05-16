public class GonnaSurvive {
//    each dragon takes 2 bullets to be defeated
//
//
    public static void main(String[] args) {
        System.out.println(hero(2004470019,1357713052));
    }

    public static boolean hero(int bullets, int dragons) {
        return bullets / 2 >= dragons;
    }

}
