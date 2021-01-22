public class Ex21 {
    public enum Money {
        ONE, TWO, THREE, FOUR, FIVE, SIX
    }

    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + " " + m.ordinal());
        }
    }
}
