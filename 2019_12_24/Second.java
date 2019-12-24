public class Second{
    public static void main(String[] args) {
       // System.out.println(Integer.MAX_VALUE);
       //long num = 10L;
       //double a = 1.0;
       //System.out.println(a);
       //int a = 1;
       //int b = 2;
       //System.out.println(a/b);
       //double a = 1.0;
       //double b = 2.0;
       //System.out.println(a/b);
        // double num = 1.1;
        // System.out.println(num*num);
        // char ch = '哈';
        // System.out.println(ch);
        //   boolean value = true;
        //   System.out.println(value);  
        //String name = "My name is \"zhangsan\"";
        //System.out.println(name);
        // String a = "hell0";
        // String b = "world";
        // String c = a + b;
        // System.out.println(c);   
        // String str = "result = ";
        // int a = 10;
        // int b = 20;
        // String result = str + a +b;
        // System.out.println(result);
        // int a = 10;
        // int b = 20;
        // System.out.println("a = " + a + " b = " + b);
        // int maxValue = 100;
        // String studentValue = "张三";
        // int a = 0;
        // double b = 10.5d;
        // a =(int)b;
        // System.out.println(a);
        // int a = 10;
        // long b = 20L;
        // int xc = a + (int)b;
        // long c = a + b;
        // byte a = 10;
        // byte b = 20;
        // byte c = (byte)(a + b);
        // System.out.println(c);
        // int num = 10;
        // String str1 = num + "";
        // String str2 = String.valueOf(num);
        // String str = "100";
        // int num11 = Integer.parseInt(str);
        //判定一个数字是奇数还是偶数
        // int num = 10;
        // if(num % 2 == 0){
        //     System.out.println("偶数");
        // }else{
        //     System.out.println("奇数");
        // }
        //判定一个数字是整数还是负数
        // int num = 0;
        // if(num > 0){
        //     System.out.println("正数");
        // }else if(num < 0){
        //     System.out.println("负数");
        // }else{
        //     System.out.println("num是0");
        // }
        //判断某一年份是否是闰年
        // int year = 2200;
        // if(year % 100 == 0){
        //     if(year %400 == 0){
        //         System.out.println(year+"是闰年");
        //     }else{
        //         System.out.println(year+"不是闰年");
        //     }
        // }else{
        //     if(year % 4 == 0){
        //         System.out.println(year+"是闰年");
        //     }else{
        //         System.out.println(year+"不是闰年");
        //     }
        // }
        //根据day的值输出星期几
        // int day = 5;
        // switch(day){
        //     case 1:{
        //     System.out.println("星期一");
        //     break;
        //     }
        //     case 2:{
        //         System.out.println("星期二");
        //         break;
        //     }
        //     case 3:{
        //         System.out.println("星期三");
        //         break;
        //     }
        //     case 4:{
        //         System.out.println("星期四");
        //         break;
        //     }
        //     case 5:{
        //         System.out.println("星期五");
        //         break;
        //     }
        //     case 6:{
        //         System.out.println("星期六");
        //         break;
        //     }
        //     case 7:{
        //         System.out.println("星期天");
        //     }
        //     default:
        //     {
        //         System.out.println("输入错误！");
        //         break;
        //     }
        // }
        //打印1 - 10的数字
        // int num = 1;
        // while(num <= 10)
        // {
        //     System.out.println(num);
        //     num++;
        // }
        //计算1 - 100 的和
        // int sum = 0;
        // int i = 1;
        // while(i <= 100)
        // {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);
        //计算5的阶乘
        // int n = 1;
        // int result = 1;
        // while(n <= 5){
        //     result *= n;
        //     n++;
        // }
        // System.out.println(result);
        // int num = 1;
        // //int result = 1;
        // int sum = 0;
        // while(num <= 5){
        //     int n = 1;
        //     int result = 1;
        //     while(n <= num){
        //         result *= n;
        //         n++;
        //     }
        //     num++;
        //     sum +=result;
        // }
        // System.out.println(sum);
        //找到100 - 200中第一个3的倍数
        // int num = 100;
        // while(num <= 200){
        //     if(num % 3 == 0){
        //         System.out.println("找到了 3 的倍数，为 " + num);
        //         break;
        //     }
        //     num++;
        // }
        //找到100 - 200 所有3的倍数
        // int num = 100;
        // while(num <= 200){
        //     if(num % 3 != 0)
        //     {
        //         num++;
        //         continue;
        //     }
        //     System.out.println("找到了3的倍数为，为："+num);
        //     num++;
        // }
        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }
        // int sum = 0;
        // for(int i = 1; i <= 100; i++){
        //     sum += i;
        // }
        // System.out.println("sum = " + sum);
        // int result = 1;
        // int n = 1;
        // for(n = 1; n <= 5; n++){
        //     result *=n;
        // }
        int sum = 0;
        int n = 1;
        for(n = 1; n <= 5; n++){
            int num = 1;
            int result = 1;
            for(num = 1; num <= n; num++){
                result *=num;
            }
            sum += result;
        }
        System.out.println("sum = " + sum);

    }
}