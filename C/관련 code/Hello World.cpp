#include <stdio.h>

int main(void)
{
	int x = 50;
    float y = 123456789.12345678;
	// float = 4byte������ ��� ������
	double z = 123456789.12345678;
	// double = 8byte 
    printf("x = %d\n", x); // %d : int�� ���
	printf("y=%.2f\n", y) ; // �Ҽ� �Ѷ��ڸ� �Ǽ� ��� \n : �ٹٲ�  
}
