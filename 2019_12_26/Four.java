import java.net.MalformedURLException;
import java.util.Scanner;

public class Four{
    public static void main(String[] args) {
        // //求最大公约数和最小公倍数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入两个整数：");
        // int max = sc.nextInt();
        // int min = sc.nextInt();
        // int mul = max * min;
        // if(min > max){
        //     int tmp = min;
        //     min = max;
        //     max = tmp;
        // }
        // //辗转相除法 求最大公约数
        // while(max % min != 0){
        //     int temp = min;
        //     min = max % min;
        //     max = temp;
        // }
        // System.out.println(min);//最大公约数
        // System.out.println(mul / min);//最小公倍数
        //1.求最大公约数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入两个整数");
        // int max = sc.nextInt();
        // int min = sc.nextInt();
        // int i = 0;
        // if(min > max){
        //     int temp = min;
        //     min = max;
        //     max = temp;
        // }
        // for(i = min; i >= 1; i--){
        //     if(max % i == 0 && min % i == 0){
        //         System.out.println("最大公约数为："+i);
        //         break;
        //     }
        // }
        //2.求最小公倍数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入两个整数：");
        // int max = sc.nextInt();
        // int min = sc.nextInt();
        // int i = 1;
        // while((min * i) % max != 0){
        //     i++;
        // }
        // System.out.println("最小公倍数为：" + min * i);
        // Scanner sc = new Scanner(System.in);
        // double  sum = 0.0;
        // int num = 0;
        // while(sc.hasNextDouble()){
        //     double tmp = sc.nextDouble();
        //     sum += tmp;
        //     num++;
        // }
        // System.out.println("sum = " + sum);
        // System.out.println("avg = " + sum / num);
        // int a = 20;
        // int b = 10;
        // int ret = add(a,b);
        // System.out.println(ret);
        //计算1 - 5 的阶乘
        // int sum = 0;
        // for(int i = 1; i <= 5; i++){
        //     sum += factor(i);
        // }
        // System.out.println(sum);
        //调换两个函数 传值调用 它是形参的拷贝 不能完成
        //解决办法 传引用类型参数（例：用数组来解决）
        // int[] arr = {10, 20};
        // swap(arr);
        // System.out.println("a = " + arr[0] + "b = " + arr[1]);
        // int a = 10;
        // int b = 20;
        // int ret = add(a,b);
        // System.out.println("ret = " + ret);

        // double a2 = 10.5;
        // double b2 = 20.5;
        // double ret2 = add(a2,b2);
        // System.out.println("ret2 = " + ret2);
        //递归：函数调用自身的过程
        //递归求n的阶乘5;
        // int n = 5;
        // int ret = factor(n);
        // System.out.println("ret = " + ret);
        //按顺序打印数字的每一位
        //递归求1到10的和
        //递归 输入一个非负数 返回他们组成数字之和
        //求斐波那契额数列的第N项
        // int n = 1234;
        // print(n);
        // int ret = sum(10);
        // System.out.println(ret);
        // int n = 1234;
        // int ret =sum(n);
        // System.out.println(ret);
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n -1) + fib(n -2);
    }
    public static int sum(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sum(n / 10);
    }
    public static int sum1(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n -1);
    }
    public static void print(int num){
        if(num > 9){
            print(num / 10);
        }
        System.out.println(num % 10);
    }

    public static int factor(int n){
        if(n == 1){
            return 1;
        }
        return n*factor(n - 1);

    }
    public static int add(int x,int y){
        return x + y;
    }
    public static double add(double x,double y){
        return x + y;
    }
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static int factor1(int n){
        int result = 1;
        for(int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }
    public static int add1(int a, int b){
        return a + b;
    }
}