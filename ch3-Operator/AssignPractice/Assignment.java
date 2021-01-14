package AssignPractice;

// 赋值的操作是对一个对象的引用
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 10;
        t2.level = 33;
        System.out.println("1: t1.level = " + t1.level + ", t2.level = " + t2.level);

        // solve the t1&t2 problem
        t1.level = t2.level;
        System.out.println("4: t1.level = " + t1.level + ", t2.level = " + t2.level);

        t1.level = 27;
        System.out.println("5: t1.level = " + t1.level + ", t2.level = " + t2.level);

        // t1 and t2 point to the same address
        t1 = t2;
        System.out.println("2: t1.level = " + t1.level + ", t2.level = " + t2.level);

        // t1 and t2 have pointed to the same address
        t1.level = 27;
        System.out.println("3: t1.level = " + t1.level + ", t2.level = " + t2.level);


    }
}
