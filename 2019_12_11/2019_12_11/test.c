//1. 写一个函数打印arr数组的内容，不使用数组下标，使用指针。
#include<stdio.h>
#include<Windows.h>
#pragma warning(disable:4996)
#if 0
int main()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int *num = arr;
	int len = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d ", *num);
		num++;
	}
	printf("\n");
	system("pause");
	return 0;
}
#endif
//1. 不允许创建临时变量，交换两个整数的内容
#if 0
void changeNumber1(int* num1, int* num2)
{
	int temp = *num1;
	*num1 = *num2;
	*num2 = temp;
}
void changeNumber(int* num1, int* num2)
{
	*num1 = *num1^*num2;  
	*num2 = *num1^*num2;
	*num1 = *num1^*num2;
}
int main()
{
	int num1 = 10;
	int num2 = 20;
	printf("before: a = %d b = %d\n", num1, num2);
	changeNumber(&num1, &num2);
	printf("after: a = %d b = %d\n", num1, num2);
	system("pause");
	return 0;
}
#endif
//2. 写一个函数返回参数二进制中 1 的个数(牛客网的OJ链接)
//
//例如： 15    0000 1111    4 个 1
//
//程序原型：
//
//int count_one_bits(unsigned int value)
//{
//	// 返回 1的位数
//}
#if 0
int count_one_bit(int num)
{
	int count = 0;
	int i = 0;
	for (i = 0; i < 32; i++)
	{
		if ((num >> i) & 1)
		{
			count++;
		}
	

	}
	return count;
}
int main()
{
	int num = 15;
	int ret = count_one_bit(num);
	printf("%d\n", ret);
	system("pause");
	return 0;
}
#endif
//3. 获取一个整数二进制序列中所有的偶数位和奇数位。
//
//要求：分别打印出二进制序列
#if 0
void print_even_bit(int num)
{
	int i = 0;
	for (i = 31; i >= 0; i -= 2)
	{
		printf("%d ", (num >> i) & 1);
	}
	printf("\n");
}
void print_odd_bit(int num)
{
	int i = 0;
	for (i = 30; i >= 0; i -= 2)
	{
		printf("%d ", (num >> i) & 1);
	}
	printf("\n");

}
int main()
{
	int num = 3;
	print_even_bit(num);
	print_odd_bit(num);
	system("pause");
	return 0;
}
#endif

//4. 编程实现：牛客网的OJ链接
//
//两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//
//输入例子 :
//
//1999 2299
//
//输出例子 : 7
int compare_bit(int m, int n)
{
	int count = 0;
	int num = m^n;
	while (num)   
	{
		count++;
		num &= (num - 1);
	}
	return count;
}
int main()
{
	int m = 1999;
	int n = 2299;
	int ret = 0;
	ret = compare_bit(m, n);
	printf("%d\n", ret);
	system("pause");
	return 0;
}