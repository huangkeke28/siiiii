//1. дһ��������ӡarr��������ݣ���ʹ�������±꣬ʹ��ָ�롣
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
//1. ����������ʱ������������������������
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
//2. дһ���������ز����������� 1 �ĸ���(ţ������OJ����)
//
//���磺 15    0000 1111    4 �� 1
//
//����ԭ�ͣ�
//
//int count_one_bits(unsigned int value)
//{
//	// ���� 1��λ��
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
//3. ��ȡһ���������������������е�ż��λ������λ��
//
//Ҫ�󣺷ֱ��ӡ������������
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

//4. ���ʵ�֣�ţ������OJ����
//
//����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//
//�������� :
//
//1999 2299
//
//������� : 7
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