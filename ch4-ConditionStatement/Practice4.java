import java.util.*;

public class Practice4 {
    
    // Practice #1 print 1 to 100
    public static void p1() {
        System.out.println("Practice #1: ");
        for (int i=1; i<101; i++)
            System.out.print(i + " ");
        System.out.println(" ");
    }

    public static void p2() {
        System.out.println("Practice #2: ");
        for (int i=0; i<25; i++) {
            int rdm = (int)(Math.random() * 50);  // Math.random() * (max - min + 1) + min 
                                                  // 可以得到任意随机数区间，里面的+1是为了弥补random的区间是()而无法拿到最大值
                                                  // +1可以使最大值进入区间内，但是也会导致随机数里出现大于最大值的数(double)
                                                  // 若只是int的话，根据删减小数点后小数的设定，结果是准确的
            int indexNum = i+1;
            if (rdm < 25)
                System.out.println("#" + indexNum + ": " + rdm + " is less than 25.");
            else if (rdm > 25)
                System.out.println("#" + indexNum + ": " + rdm + " is larger than 25.");
            else 
                System.out.println("#" + indexNum + ": " + rdm + " is equal to 25.");
            }
    }

    public static void pForEach() {
        System.out.println("For Each Example: ");
        Random rand = new Random(47);
        float f[] = new float[10];
        for(int i=0; i<10; i++)
            f[i] = rand.nextFloat();
        for(float x : f)
            System.out.println(x);
    }


    public static void p7() {
        System.out.println("Practice #7: ");
        System.out.println("Using break: ");
        int i = 0;
        while (true) {
            i++;
            if (i == 99) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("Using return: ");
        int j = 0;
        while (true) {
            j++;
            if (j == 99) {
                System.out.println(j);
                return;
            }
            
            System.out.print(j + " ");
        }
    }

    public static void p9(int n) {
        int numb1 = 1;
        int numb2 = 0;
        int num;
        if (n < 1) System.out.println("Please enter a number larger than 0");

        if (n == 1) System.out.print(1 + " ");

        if (n >= 2) {
            System.out.print(1 + " ");
            for (int i = 2; i<n+1; i++) {
                num = numb1 + numb2;
                numb2 = numb1;
                numb1 = num;
                System.out.print(num + " ");
            }
        }
    }

    public static void p10() {
        System.out.println("Vampire numbers: ");
        for (int i=1000; i<10000; i+=2) {
            for (int j=10; j<100; j+=2) {
                if (i%j == 0 && i/j>10 && i/j<100 && i%100 != 0) {
                    System.out.print(i + ", ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // #1 print 1 to 100
        p1();

        // #2
        p2();

        // #extra for each example
        pForEach();

        // #7 return, break & continue
        p7();

        // label in the Java (replace goto)
        /* 
        label:
        outer-iteration {
            inner-iteration {
                //...
                break;
                //...
                continue;
                //...
                continue label; (stop the iteration and go back to the label location)
                //...
                break label; (stop the iteration and go back to the label location and stop)
            }
        }
        */

        // #9 Fibonacci
        p9(10);

        // #10 Vampire numbers
        // Looking for all the Vampire numbers with 4 digit numbers
        p10();
    }
}
