public class End{
    public static void main(String[] args) {
        //1、递归求 N 的阶乘
        // int ret = factor(5);
        // System.out.println(ret);
        //2、递归求 1 + 2 + 3 + ... + 10
        // int ret = sum(10);
        // System.out.println(ret);
        //3、按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
        //print(1234);
        //4、写一个递归方法，输入一个非负整数，返回组成它的数字之和.
        // int ret = Sum(1234);
        // System.out.println(ret);
        //5、递归求斐波那契数列的第 N 项
        // int ret = fib(10);
        // System.out.println(ret);
        //6、递归求解汉诺塔问题
        //汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower），又称河内塔，源于印度
        //一个古老传说。 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小
        //顺序摞着64片黄金圆盘。 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上
        //。 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。 
        //问应该如何操作？
        //7、递归实现代码: 青蛙跳台阶问题
        //一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法
        //hanoi(3,'A','B','C');
        int ret = jumpFloor(3);
        System.out.println(ret);
    }
    public static int jumpFloor(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return jumpFloor(n -1) + jumpFloor(n -2);
    }
    public static void hanoi(int n, char A, char B, char C){
        if(n == 1){
            move(A,C);
        }else{
            hanoi(n -1, A, C, B);
            move(A,C);
            hanoi(n -1, B, A, C);
        }
    }
    public static void move(char A,char C){
        System.out.println("move:" + A + "--->" + C);
    }
    public static int fib(int n){
        if(n == 1 || n== 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static int Sum(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + Sum(n / 10);
    }
    public static void print(int n){
        if(n > 9){
            print(n/10);
        }
        System.out.printf("%d ",n % 10);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
    public static int factor(int n){
        if(n == 1){
            return 1;
        }
        return n * factor(n - 1);
    }
}