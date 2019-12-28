import java.net.MalformedURLException;

public class Five{
    public static void main(String[] args) {
        //2、输出一个整数的每一位
        //int num = 1234;
        //3、编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
        //提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        //4、获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        //递归求n的阶乘
        // int n = 5;
        // int ret = factor(n);
        // System.out.println("ret = " + ret);
        //print(1234);
        // int ret = Fib(50);
        // System.out.println(ret);
        //print1(1234);
        //汉诺塔问题
        //hanoi( 4, 1, 2, 3);
        //求两个数的最小公倍数和最大公约数
        int max = 24;
        int min = 16;
        int ret = common(max,min);
        System.out.println("retsult:" + ret);
    }
    public static int common(int max,int min){
        int mul = max * min;
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        while(max % min != 0){
            int mid = min;
            min = max % min;
            max = mid;
        }
        return mul /min;

    }

    public static void hanoi(int n, int left,int mid,int right){
        if(n == 1){
            System.out.printf("将%d从%d -> %d\n",n,left,right);
        }
        hanoi(n - 1,left,right,mid);
        System.out.printf("将%d从%d -> %d\n",n,left,right);
        hanoi(n - 1,mid, left, right);

    }
    public static int Fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return Fib(n - 1) + Fib(n - 2);

    }
    public static void print1(int n){
        if(n > 9){
            print1(n / 10);
        }
        System.out.println(n % 10);
    }
    public static int sum(int num){
        if(num < 10){
            return num;
        }
        return num % 10 + sum(num / 10);
    }
    public static int sum1(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }
    public static void print(int num){
        if(num > 9){
            print(num / 10);
        }
        System.out.println(num % 10);
    }
    public static int factor1(int n){
        if(n == 1){
            return 1;
        }
        return n*factor(n - 1);
    }
    public static int factor(int n){
        System.out.println("函数开始， n = " + n);
        if(n == 1){
            System.out.println("函数结束， n = 1, ret = 1");
            return 1;
        }
        int ret = n*factor(n - 1);
        System.out.println("函数结束， n = " + n + "ret = " + ret);
        return ret;
    }

}