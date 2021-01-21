public class Ex9 {
    Ex9(int i) {
        this(1.1f);
        System.out.println("This is the first constructor");
    }

    Ex9(float f) {
        System.out.println("This is the second constructor");
    }

    public static void main(String[] args) {
        new Ex9(1);
    }
}
