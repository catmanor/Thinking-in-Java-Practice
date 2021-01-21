public class Ex4 {
    String name;

    Ex4(String s) {
        name = s;
    }

    public static void main(String[] args) {
        Ex4 e4 = new Ex4("Overloading");
        System.out.println("This is created by " + e4.name);
    }
}
