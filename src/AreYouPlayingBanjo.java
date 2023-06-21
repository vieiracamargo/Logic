public class AreYouPlayingBanjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Bodrigo"));
    }

    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ?
                name + " plays banjo" :
                name + " does not play banjo";
    }
}
