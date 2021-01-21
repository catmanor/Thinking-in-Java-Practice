public class Ex5Dog {
    public void bark(int i) {
        System.out.println("Barking");
    }

    public void bark(char c) {
        System.out.println("Howling");
    }

    public void bark(double d) {
        System.out.println("Aaaaaaa");
    }

    public static void main(String[] args) {
        Ex5Dog ed = new Ex5Dog();

        ed.bark(1);
        ed.bark('x');
        ed.bark(1.1);
    }
}
