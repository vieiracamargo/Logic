public class NumberFun {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
    }
    public static long findNextSquare(long sq) {
        if(Math.sqrt(sq) % 1 != 0){
            return -1;
        }

        sq++;

        while( Math.sqrt(sq) % 1 != 0){
            sq++;
        }

        return sq;
    }

}