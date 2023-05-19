public class Grasshoppper {
    public static void main(String[] args) {
        String daniel = greet("Daniel", "Daniel");
    }

    static String greet(String name, String owner) {
        return name.equals(owner)? "Hello boss" : "Hello guest";
    }
}
