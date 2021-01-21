public class Ex2 {
    String s1 = "Defined at the initializing";
    String s2;

    public Ex2(String construction) {
        s2 = construction;
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2("Desined at the construction");

        System.out.println("The s1 display: " + ex2.s1);
        System.out.println("The s2 display: " + ex2.s2);
    }
}
