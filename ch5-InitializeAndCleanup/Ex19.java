public class Ex19 {

    public static void trailingFun(String... strs) {
        System.out.println("The list involves: ");
        for(String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        trailingFun("aaa", "bbb", "ccc");

        trailingFun(new String[]{"aaa", "bbb", "ccc"});
    }
}