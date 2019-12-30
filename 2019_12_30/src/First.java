import javax.lang.model.util.AbstractElementVisitor8;
import java.util.Arrays;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        //1.编写代码: 创建一个 int 类型的数组, 元素个数
        // 为 100, 并把每个元素依次设置为 1 - 100
//        int[] arr = new int[100];
//        int[] arr2 = new int[]{1, 2, 3};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        for(int x:arr){
//            System.out.print(x + " ");
//        }
        //2.编写代码: 实现一个方法 printArray, 以数组为参数, 循环访
        // 问数组中的每个元素, 打印每个元素的值.
//        int[] arr = {1, 2, 31, 4, 5, 6, 7, 8};
//        printArray(arr);
        //3.编写代码: 实现一个方法 transform, 以数组为参数, 循环将数组
        // 中的每个元素 乘以 2 , 并设置到对应的数组元素上.
        // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//        int[] arr = {1 ,2 ,3};
//        transform(arr);
//        printArray(arr);
        //4.编写代码: 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
//        int[] arr = {1 , 2, 3, 4, 5, 6,};
//        int ret = sum(arr);
//        System.out.println(ret);
        //5.编写代码: 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
//        int[] arr = {1 ,2 ,3 ,4 ,4};
//        double ret = avg(arr);
//        System.out.println(ret);
        //1.实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字
        // 符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
//        int[] arr = {1 , 2, 3};
//        System.out.println(toString(arr));
        //2.实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//        int[] arr = {1, 23, 3, 4};
//        int[] arr2 = new int[arr.length];
//        copyOf(arr2,arr);
//        System.out.println(toString(arr2));
        //3.给定一个有序整型数组, 实现二分查找
//        int[] arr = {1 , 2, 3, 4, 5, 66, 77, 88, 99 ,100};
//        int toFind = 88;
//        int ret = binarySearch(arr,toFind);
//        if(ret == -1){
//            System.out.println("没找到！");
//        }else {
//            System.out.println("找到了，下标为：" + ret);
//        }
        //4.给定一个整型数组, 判定数组是否有序
//        int[] arr = {1 , 2, 3, 4, 5, 10, 6, 10};
//        int ret = ifSort(arr);
//        if(ret == -1){
//            System.out.println("无序");
//        }else{
//            System.out.println("有序");
//        }
        //5.给定一个整型数组, 实现冒泡排序(升序排序)
//        int[] arr = {1, 34, 5, 3, 56, 67, 23, 134};
//        bubbleSort(arr);
//        System.out.println(toString(arr));
//        int[] arr = new int[]{1 ,2 ,3 , 4};
//        int[] arr2 = {1, 2, 3, 4};
//        int[] arr3 = new int[23];
//        System.out.println("length:" + arr3.length);
        //遍历数组
//        int[] arr = {1 , 2, 3, 4, 5};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        //for-each 遍历数组
//        for(int x:arr){
//            System.out.println(x);
//        }
//        int num = 0;
//        func(num);
//        System.out.println("num = " + num);
//        int[] arr = {1, 2, 3};
//        func(arr);
//        System.out.println("arr[0] = " + arr[0]);
//        int[] arr = {1, 2, 3};
//        transform(arr);
//        printArray(arr);
        //int[] arr = {1, 2, 3, 4};
        //System.out.println(Arrays.toString(arr));
        //System.out.println(toString(arr));
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] newArr = Arrays.copyOf(arr, arr.length);
//        System.out.println("newArr = " + Arrays.toString(newArr));
//        arr[0] = 10;
//        System.out.println("arr: " + Arrays.toString(arr));
//        System.out.println("newArr: "+ Arrays.toString(newArr));
//        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
//        System.out.println("newArr2: " + Arrays.toString(newArr2));
//        int[] arr = {1 , 2, 3, 3};
//        int[] arr2 = copyOf(arr);
//        System.out.println(Arrays.toString(arr2));
        //找到数组总的最大元素
//        int[] arr = {122, 2, 3, 4, 5, 6};
//        System.out.println(maxArr(arr));
        //求数组中元素的平均值
//        int[] arr = {1 ,2 ,3 ,4 ,5 ,6};
//        System.out.println(avg(arr));
        //查找数组中指定元素(顺序查找)
//        int[] arr = {1, 2, 3, 10, 5, 6};
//        System.out.println(find(arr,10));
        //二分查找（折半查找）
//        int[] arr = {11, 22, 33, 44, 55, 77, 99, 100};
//        System.out.println(binarySearch(arr,77));
        //检查数组的有序性
//        int[] arr = {1, 2, 3, 10, 5, 6};
//        System.out.println(isSorted(arr));
        //冒泡排序
//        int[] arr = {9, 5, 2, 7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        //冒泡排序的性能较低，java中内置了更高效的排序算法
//        int[] arr= {9, 5, 2, 7};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //数组逆序
//        int[] arr = {1, 2, 3, 4, 5};
//        reverseArr(arr);
//        System.out.println(Arrays.toString(arr));
        //数组数字排列 前面偶数 后面奇数
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//        int[][] arr = {
//                {1, 2, 3, 4, 4},
//                {2, 3, 4,},
//                {9, 10, 11, 12}
//        };
//        for(int row = 0; row <arr.length; row++){
//            for(int col = 0; col <arr[row].length; col++){
//                System.out.printf("%d\t", arr[row][col]);
//            }
//            System.out.println();
//        }
        //内置类型(四类大种)
        //引用类型
        //所谓的“引用”本质上只是存一个地址。java将数组设定成引用类型。这样的话后续进行数组参数传参，其实只是
        //将数组的地址传入到函数形参种，这样可以避免对整个数组的拷贝(数组可能比较长，那么拷贝开销就会很大)
        //int[] arr = null;
//        int i = 10;
//        int j = 20;
//        int k = 3;
//        System.out.println(k *= i + j);
        //正整数A和正整数B的最小公倍数
        //倒置字符串
        //将一句话的单词进行倒置，标点不倒置。
        //比如 I like beijing.
        //变成 beijing. like I
//        int A = 20;
//        int B = 30;
//        int i = 1;
//        while((i * B) % A != 0){
//            i++;
//        }
//        System.out.println(i*B);
//        Scanner sc = new Scanner(System.in);
//        int A = 30;
//        int B = 15;
//        if (A > B) {
//            int tmp = A;
//            A = B;
//            B = tmp;
//        }
//        int mid = 0;
//        for(mid = A; mid >= 0; mid--){
//            if((A % mid) == 0 && (B % mid) == 0){
//                break;
//            }
//        }
//        System.out.println(mid);
//        int A = 16;
//        int B = 24;
//        int mul = A * B;
//        while(A % B != 0){
//            int tmp = B;
//            B = A % B;
//            A = tmp;
//        }
//        System.out.println(B);
//        System.out.println(mul / B);
//        int a = 10;
//        int b = 20;
//        int k = 3;
//        System.out.println(k *= a + b);
    }
    public static void transform(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void reverseArr(int[] arr){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur] > arr[cur - 1]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[cur - 1];
                    arr[cur - 1] = tmp;
                }
            }
        }
//    public static boolean isSorted(int[] arr){
//        //是否升序
//        for(int i = 0; i < arr.length - 1; i++){
//            if(arr[i] >arr[i + 1]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static int binarySearch(int[] arr, int toFind){
//        int left = 0;
//        int right = arr.length -1;
//        while(left <= right){
//            int mid = left + (right -left) / 2;
//            if(arr[mid] > toFind){
//                right = mid - 1;
//            }else if(arr[mid] < toFind){
//                left = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public static int find(int[] arr, int x){
//        for(int i = 0; i < arr.length; i++){
//            if(x == arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static double avg(int[] arr){
//        double sum = 0;
////        for(int i = 0; i < arr.length; i++){
////            sum += arr[i];
////        }
//        for(int x: arr){
//            sum += x;
//        }
//        return sum / arr.length;
//    }
//    public static int maxArr(int[] arr){
//        int tmp = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] > tmp) {
//                tmp = arr[i];
//            }
//        }
//        return tmp;
//    }
//    public static int[] copyOf(int[] arr){
//        int[] ret= new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            ret[i] = arr[i];
//        }
//        return ret;
//    }
//    public static String toString(int[] arr){
//        String ret = "[";
//        for(int i = 0; i < arr.length; i++){
//            ret += arr[i];
//            if(i != arr.length - 1){
//                ret += ", ";
//            }
//        }
//        ret += "]";
//        return ret;
//    }
//    public static void printArray(int[] arr){
//        for(int x: arr){
//            System.out.println(x);
//        }
//    }
//    public static void transform(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = arr[i] * 2;
//        }
//    }
//    public static void func(int[] a){
//        a[0] = 10;
//        System.out.println("a[0] = " + a[0]);
//    }
//    public static void func1(int x){
//        x = 10;
//        System.out.println("x = " + x);
//    }
//    public static void bubbleSort(int[] arr){
//        for(int i = 0; i < arr.length ; i++){
//            for(int j = arr.length - 1; j > i; j--){
//                if(arr[j -1] > arr[j]){
//                    int tmp = arr[j -1];
//                    arr[j -1]= arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//    }
//    public static void bubbleSort(int[] arr){
//        for(int bound = 0; bound < arr.length - 1; bound++){
//            for(int cur = arr.length - 1; cur >bound; cur--){
//                if(arr[cur -1] > arr[cur]){
//                    int tmp = arr[cur - 1];
//                    arr[cur - 1] = arr[cur];
//                    arr[cur] = tmp;
//                }
//            }
//        }
//    }
//    public static int ifSort(int[] arr){//是否升序
//        for(int i = 0; i <arr.length - 1; i++){
//            if(arr[i] > arr[i + 1]){
//                return -1;
//            }
//        }
//        return 1;
//    }
//    public static int binarySearch(int[] arr,int toFind){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid] > toFind){
//                right = mid - 1;
//            }else if(arr[mid] < toFind){
//                left = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public static void copyOf(int[] arr2, int[] arr){
//        for(int i = 0; i < arr2.length; i++){
//            arr2[i] = arr[i];
//        }
//    }
//    public static String toString(int[] arr){
//        String array = "[";
//        for(int i = 0; i < arr.length; i++){
//            array += arr[i];
//            if(i < arr.length - 1){
//                array += ", ";
//            }
//        }
//        array += "]";
//        return array;
//    }
//    public static double avg(int[] arr){
//        double sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        return sum / arr.length;
//    }
//    public static int sum(int[] arr){
//        int ret = 0;
//        for(int i = 0; i < arr.length;i++){
//            ret += arr[i];
//        }
//        return ret;
//    }
//    public static void transform(int[] arr){
//        for(int i = 0; i < arr.length;i++){
//            arr[i] *= 2;
//        }
//    }
//    public static void printArray(int[] arr){
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//    }
    }
}