public class Ex1 {
    public static void main(String args[]) {
        Second second = new Second("Init String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second); // toString() call
        second.setSimple("New String");
        System.out.println(second);
        }
}
