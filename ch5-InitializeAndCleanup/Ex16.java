public class Ex16 {

    public static void main(String[] args) {
        String[] str = new String[3];

        str[0] = "a";
        str[1] = "b";
        str[2] = "c";

        String[] str2 = {"a", "b", "c"};

        for (int i=0; i<str.length; i++) {
            System.out.println(str[i]);
        }

        for (int i=0; i<str2.length; i++) {
            System.out.println(str2[i]);
        }
    }


}
