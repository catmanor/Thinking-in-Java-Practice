public class Practice {
    public static void main(String[] args) {

        // #1 Print operator
        System.out.println("This is the print operator");

        // #2 Tank
        // In AssignPractice file
        // 赋值的操作是对一个对象的引用

        // #3 Algorithm 
        // +, -, *, /, %(整数除法会直接去除掉结果的小数位，而不是四舍五入)
        // ??? random & seed, 47

        // #4 AutoInc
        int i = 0;
        System.out.println("Original integer is " + i);
        System.out.println("++i returns the i = " + ++i);
        System.out.println("");

        i = 0;
        System.out.println("Original integer is " + i);
        System.out.println("i++ returns the i = " + i++);
        System.out.println("");

        i = 0;
        System.out.println("Original integer is " + i);
        System.out.println("--i returns the i = " + --i);
        System.out.println("");

        i = 0;
        System.out.println("Original integer is " + i);
        System.out.println("i-- returns the i = " + i--);
        System.out.println("");

        // #5 EqualsMethod
        // 直接用new创建的variable指向的是reference/address，即使里面存储的value相同，使用==或者!=时仍然是不相同的

        // #6 位操作符
        // & 与
        // ｜ 或
        // ^ 异或 输入的里有1，但是不全是1，则输出1；若全是0或1，输出0
        // ~ 非
        // &=, |=, ^= 均是合法的，~是一元操作符，不能连用

        // #7 三元操作符 if-else
        // boolean-exp ? value0 : value1


    }
}