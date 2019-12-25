import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Third{
    public static void main(String[] args) {
        // int msg = 520;
        // System.out.println(msg);
        // System.out.print(msg);
        //System.out.printf();//格式化输出 语法和C语言的printf基本一致
        // System.out.println("hello world");
        // int x = 10;
        // System.out.println(x);
        // try{
        //     System.out.print("Enter a char:");
        //     char i = (char)System.in.read();
        //     System.out.println("your char is :" + i);
        // }catch(IOException e){
        //     System.out.println("exception");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入你的名字：");
        // String name = sc.nextLine();
        // System.out.println("请输入你的年龄：");
        // int age = sc.nextInt();
        // System.out.println("请输入你的工资：");
        // double salary = sc.nextDouble();
        // System.out.println("您的信息如下：");
        // System.out.println("姓名："+name + "\n" + "年龄：" + age + "\n" +"工资：" + salary);
        // Scanner sc = new Scanner(System.in);
        // double sum = 0.0;
        // int num = 0;
        // while(sc.hasNextDouble()){
        //     double tmp = sc.nextDouble();
        //     sum += tmp;
        //     num++;
        // }
        // System.out.println("sum = " + sum);
        // System.out.println("avg = " + sum / num);
        // Random random = new Random();//默认随机种子是系统时间
        // Scanner sc = new Scanner(System.in);
        // int toGuess = random.nextInt(100) + 1;
        // System.out.println("toGuess:" + toGuess);
        // while(true){
        //     System.out.println("请输入要输入的数字：(1 - 100)");
        //     int num = sc.nextInt();
        //     if(num < toGuess){
        //         System.out.println("低了");
        //     }else if(num > toGuess){
        //         System.out.println("高了");
        //     }else{
        //         System.out.println("猜对了");
        //         break;
        //     }
        // }
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // Random random = new Random();
        // int toGuess = random.nextInt(100) + 1;
        // System.out.println("toGuess:" + toGuess);
        // System.out.println(num);
        //猜数字游戏
        // Random random = new Random();
        // int toGuess = random.nextInt(100) + 1;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("toGuess：" + toGuess);
        // while(true){
        //     System.out.println("请输入想要猜的数字：(1 - 100)");
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
        // short a = 128;
        // byte b = (byte)a;
        // System.out.println(a);
        // System.out.println(b);
        // double x = 2.0;
        // int y = 4;
        // System.out.println(x / ++y);
        // byte a = 10; 
        // float b=(float)3.5;
        //1、根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter your age:");
        // int age = sc.nextInt();
        // if(age<=18){
        //     System.out.println("少年");
        // }else if(age > 18 && age <= 28){
        //     System.out.println("青年");
        // }else if(age > 28 && age <= 55){
        //     System.out.println("中年");
        // }else{
        //     System.out.println("老年");
        // }
        //2、判定一个数字是否是素数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a number：");
        // int num = sc.nextInt();
        // int i = 0;
        // boolean flag = true;
        // for(i = 2; i <= (num/2); i++){
        //     if(num % i == 0){
        //         System.out.println("不是素数");
        //         flag = false;
        //         break;
        //     } 
        // }
        // if(flag){
        //     System.out.println("是素数");
        // }
        //3、打印 1 - 100 之间所有的素数
        // int num = 1;
        // while(num >= 1 && num <= 100){
        //     boolean flag = true;
        //     int i = 0;
        //     for(i = 2; i <= (num / 2); i++){
        //         if(num % 2 == 0){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         System.out.println(num);
        //     }
        //     num++;
        // }
        //4、输出 1000 - 2000 之间所有的闰年
        // int year = 1000;
        // while(year >= 1000 && year <= 2000){
        //     if(year % 100 == 0){
        //         if(year % 400 == 0){
        //             System.out.println(year);
        //         }
        //     }else{
        //         if(year % 4 == 0){
        //             System.out.println(year);
        //         }
        //     }
        //     year++;
        // }
        //5、编写程序数一下 1到 100 的所有整数中出现多少个数字9
        // int num = 1;
        // int count = 0;
        // while(num >= 1 && num <= 100){
        //     if(num % 10 == 9){
        //         count++;
        //     }if(num / 10 == 9){
        //         count++;
        //     }
        //     num++;
        // }
        // System.out.println(count);
        //1、求一个整数，在内存当中存储时，二进制1的个数。
        // int num = -1;
        // int i = 0;
        // int count = 0;
        // for(i = 0; i < 32; i++){
        //     if(((num >> i) & 1) == 1){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        //2、求两个正整数的最大公约数
        // int a = 10;
        // int b = 20;
        // int n = a;
        // int i = 0;
        // if(a > b){
        //     n = b;
        // }
        // for(i = n; i >= 1; i--){
        //     if(a % i == 0 && b % i == 0){
        //         System.out.println("a,b的最大公约数为：" + n);
        //         break;
        //     }
        // }
        //最小公倍数
        // Scanner input = new Scanner(System.in);
        // int max = input.nextInt();
        // int min = input.nextInt();
        // int i = 1;
        // while(((max * i) % min) != 0){
        //     i++;
        // } 
        // System.out.println("最小公倍数为；" + (max * i));
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入两个正整数");
        // int max = sc.nextInt();
        // int min = sc.nextInt();
        // int nul = max * min;
        // int tmp = 0;
        // if(min > max){
        //     int temp = min;
        //     min = max;
        //     max = temp;

        // }
        // while(max % min != 0){
        //     tmp = min;
        //     min = max % min;
        //     max = tmp;
        // }
        // System.out.println("最大公约数为：" + min);
        // System.out.println("最小公倍数为：" + (nul / min));
        //3、计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 
        // int odd = 1;
        // int even = 2;
        // double oddSum = 0;
        // double evenSum = 0;
        // double sum = 0;
        // for(odd = 1; odd < 100; odd += 2){
        //     oddSum += (1 / odd);
        // }
        // for(even = 2; even <= 100; even += 2){
        //     evenSum += (1 / even);
        // }
        // sum = oddSum - evenSum;
        // System.out.println(sum);
        // double i,n = 1.0;
        // double sum = 0.0;
        // for(i = 0.0; i <= 100.0; i++){
        //     sum += (n / i);
        //     n = -n;
        // }
        // System.out.println(sum);
        //4、求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身
        //，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
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
        //5、完成猜数字游戏
        // Scanner sc = new Scanner(System.in);
        // Random random = new Random();
        // int toGuess = random.nextInt(100) + 1;
        // //System.out.println("toGuess:" + toGuess);
        // System.out.println("请输入你想要猜的数字：");
        // while(true){
        //     int num = sc.nextInt();
        //     if(num < toGuess){
        //         System.out.println("小了");
        //     }else if(num > toGuess){
        //         System.out.println("大了");
        //     }else{
        //         System.out.println("猜对了");
        //         break;
        //     }
        // }
        //1、输出乘法口诀表
        // int n = 9;
        // int i = 0;
        // int j = 0;
        // for(i = 1; i <= n; i++){
        //     for(j = 1; j <= i; j++){
        //         System.out.printf("%d * %d = %d",i,j,i * j);
        //         System.out.printf(" ");
        //     }
        //     System.out.println();
        // }
        //2、输出一个整数的每一位
        // int num = 6879;
        // prints(num);
        //3、编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
        //密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        //4、获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        
    }
}
// public void prints(int num){
//     if(num < 9){
//         System.out.print(num);
//     }
//     return prints(num/10);
//     System.out.print(num%10);
// }