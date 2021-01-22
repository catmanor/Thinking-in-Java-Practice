public class Ex22 {
    public enum Numb_Command {
        ONE, TWO, THREE
    }
    Numb_Command num;

    public Ex22(Numb_Command num) {
        this.num = num;
    }

    public void switchCommand() {
        switch(num) {
            case ONE:
                System.out.println("This is one");
                break;
            case TWO:
                System.out.println("this is two");
                break;
            case THREE: 
                System.out.println("this is three");
                break;
            default: 
                System.out.println("Nothing to print");
        }
    }

    public static void main(String[] args) {
        Ex22
            one = new Ex22(Numb_Command.ONE),
            two = new Ex22(Numb_Command.TWO),
            three = new Ex22(Numb_Command.THREE);

        one.switchCommand();
        two.switchCommand();
        three.switchCommand();

    }
}
