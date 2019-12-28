import java.util.Scanner;
import java.util.Random;
public class Six{
    
    public static void main(String[] args) {
        // //1、根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入你的年龄");
        // int age = sc.nextInt;
        // if(age <= 18){
        //     System.out.println("少年");
        // }else if(age > 18 && age <= 28){
        //     System.out.println("青年");
        // }else if(age > 28 && age <= 55){
        //     System.out.println("中年");
        // }else{
        //     System.out.println("老年");
        // }
        // //2、判定一个数字是否是素数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入一个数：");
        // int num = sc.nextInt();
        // int i = 0;
        // boolean flag = true;
        // for(i = 2; i <= (num / 2); i++){
        //     if(num % i == 0){
        //         flag = false;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("是素数");
        // }else{
        //     System.out.println("不是素数");
        // }
        // 3、打印 1 - 100 之间所有的素数
        // int i = 0;
        // for(i = 1; i <= 100; i++){
        //     int n = 1;
        //     for(n = 2; n <= i; n++){
        //         if(i % n == 0){
        //             break;
        //         }
        //     }
        //     if(i == n){
        //         System.out.print(i + " ");
        //     }
        // }
        // 4、输出 1000 - 2000 之间所有的闰年
        // int year = 0;
        // for(year = 1000; year <= 2000; year++)
        // {
        //     if(year % 100 == 0){
        //         if(year % 400 == 0){
        //             System.out.println(year);
        //          }
        //     }else{
        //         if(year % 4 == 0){
        //             System.out.println(year);
        //         }
        //     }
        // }
        // //5、编写程序数一下 1到 100 的所有整数中出现多少个数字9
        // int num = 0;
        // int count = 0;
        // for(num = 1; num <= 100; num++){
        //     if(num % 10 == 9){
        //         count++;
        //     }else if(num / 10 == 9){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        //1、求一个整数，在内存当中存储时，二进制1的个数。
        // int num = 10;
        // int count = 0;
        // for(int i = 0; i < 32; i++){
        //      if(((num >> i) & 1) == 1){
        //         count++;
        //      }
        // }
        // System.out.println(count);
        // }
        // //2、求两个正整数的最大公约数和最小公倍数
        // Scanner sc = new Scanner(System.in);
        // int max = sc.nextInt();
        // int min = sc.nextInt();
        // int mul = max * min;
        // if(min > max){
        //     int temp = min;
        //     min = max;
        //     max = temp;
        // }
        // while(max % min != 0){
        //     int mid = min;
        //     min = max % min;
        //     max = mid;
        // }
        // System.out.println("最大公约数为：" + min);
        // System.out.println("最小公倍数为：" + mul / min);
        // //最小公倍数
        // int max = 16;
        // int min = 24;
        // int i = 1;
        // while(i <= max){
        //     if((min * i) % max == 0){
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("最小公倍数为：" + min * i);
        // //最大公约数；
        // int max = 24;
        // int min = 16;
        // int temp = 0;
        // for(temp = min; temp >= 1; temp--){
        //     if((max % temp == 0) && (min % temp == 0)){
        //         System.out.println("最大公约数为：" +temp);
        //         break;
        //     }
        // }
        // //4、求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的
        // //立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
        // int num = 0;
        // while(num >= 0 && num <= 999){
        //     int i = num % 10;
        //     int j = (num % 100) / 10;
        //     int k = num / 100;
        //     if(num == i * i * i + j * j * j + k * k * k){
        //         System.out.println(num);
        //     }
        //     num++;
        // }
        // //5、完成猜数字游戏
        // Random random =new Random();
        // Scanner sc = new Scanner(System.in);
        // int toGuess = random.nextInt(100) + 1;
        // System.out.println("toGuess = "+ toGuess);
        // System.out.println("请输入你要猜的数字：(1-100)");
        // while(true){
        //     int num = sc.nextInt();
        //     if(num > toGuess){
        //         System.out.println("大了");
        //     }else if(num < toGuess){
        //         System.out.println("小了");
        //     }else{
        //         System.out.println("猜对了");
        //         break;
        //     }
        // }
        // //3、计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
        // double i = 1.0;
        // double n = 1.0;
        // double sum = 0.0;
        // for(i = 1; i <= 100; i++){
        //     sum += n / i;
        //     n = -n;
        // }
        // System.out.println(sum);
        // 1、输出乘法口诀表
        // int n = 9;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.printf("%d * %d = %d ",i,j,i*j);
        //     }
        //     System.out.println();
        // }
        //2、输出一个整数的每一位
        // int n = 1234;
        // print(n);
        // //3、编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
        // //密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        // int password = 1314521;
        // Scanner sc = new Scanner(System.in);
        // int i = 0;
        // for( i = 3; i > 0; i--){
        //     System.out.println("请输入你的密码:");
        //     int num = sc.nextInt();
        //     if(password == num){
        //         System.out.println("登陆成功！");
        //         break;
        //     }else{
        //         System.out.println("登录错误，你还有"+(i-1)+"机会");
        //     }
        // }
        // if(i == 0){
        //     System.out.println("退出程序");
        // }
        //4、获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        // int num = 34;
        // oddnum(num);
        // evennum(num);
        // allnum(num);
        //1、创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算。
        // int ret = twoSum(10,20);
        // int ret2 =threeSum(100,40,50);
        // System.out.println(ret);
        // System.out.println(ret2);
        //2、调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        // int arr[] = {1 , 2, 3, 4, 5, 45, 70, 100};
        // print(arr);
        // adjustArr(arr);
        // print(arr);
        //3、求 N 的阶乘 
        // int ret = factor(5);
        // System.out.println(ret);
        //3、求1！+2！+3！+4！+........+n!的和
        // int ret = factorContinue(5);
        // System.out.println(ret);
        //4、求斐波那契数列的第n项。(迭代实现)
        // int ret = fib(10);
        // System.out.println(ret);
        //5、有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
        // int arr[] = {1,1,3,3,34,4,4,5,5,7,7,9,9};
        // int i = 0;
        // for(i = 0; i < 13; i++){
        //     int count = 0;
        //     int j = 0;
        //     for(j = 0; j < 13; j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         System.out.println(arr[i]);
        //     }
        // }

        // int arr[] = {1,1,3,3,34,4,4,5,5,7,7,9,9};
        // int i = 0;
        // int ret = arr[0];
        // for(i = 1; i < 13; i++){
        //     ret ^= arr[i];
        // }
        // System.out.println(ret);

        //1、 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果。
        // int ret = sum(10,20);
        // double ret2 = sum(12.4,12.6,20.5);
        // System.out.println(ret);
        // System.out.println(ret2);
        //2、在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
        //还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。
        int number = compare(10,20);
        double decimal = compare(10.2,20.3);
        compare(10,20,88.8);
        


    }
    public static void compare(int m, int n, double k){
        double ret = compare(m,n) > k ? compare(m,n) : k;
        if(ret == k){
            System.out.println("整数大");
        } else{
            System.out.println("小数大");
        }
    }
    public static int compare(int m,int n){
        return m > n ? m : n;
    }
    public static double compare(double m,double n){
        return m > n ? m : n;
    }
    public static int sum(int m,int n){
        return m + n;
    }
    public static double sum(double m,double n,double k){
        return m + n + k;
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int back1 =1;
        int back2 =1;
        int ret = 0;
        int i = 0;
        for(i = 3; i <= n; i++){
            ret = back1 + back2;
            back2 = back1;
            back1 = ret;
        }
        return ret;
    }
    public static int factorContinue(int n){
        int i = 0;
        int sum = 0;
        for(i = 1; i <= n; i++){
            sum +=factor(i);
        }
        return sum;
    }
    public static int factor(int n){
        if(n == 1){
            return 1;
        }
        return n*factor(n - 1);
    }
    public static void print(int arr[]){
        int i = 0;
        for(i = 0; i < 8; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }
    public static void adjustArr(int arr[]){
        int left = 1;
        int right = 7;
        while(left < right){
            if(arr[left] % 2 != 0){//奇数
                left++;
            }
            if(arr[right] % 2 == 0){//偶数
                right--;
            }
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static int threeSum(int m,int n,int k){
        return twoSum(m,n) > k ? twoSum(m,n) : k;
    }
    public static int twoSum(int m,int n){
        return m > n ? m : n;
    }
    public static void oddnum(int n){
        for(int i = 30; i >= 0; i -= 2){
         System.out.printf("%d ",(n >> i) & 1 );
        }
        System.out.println();
    }
    public static void evennum(int n){
        for(int i = 31; i >= 0; i -= 2){
            System.out.printf("%d ",(n >> i) & 1 );
        }
        System.out.println();
    }
    public static void allnum(int n){
        for(int i = 31; i >= 0; i--){
        System.out.printf("%d ",(n >> i) & 1 );
        }
    }
    public static void print(int n){
        if(n > 9){
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
}
