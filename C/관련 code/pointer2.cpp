#include <stdio.h>

int main(void){
	int i =10;
	int *p;
	p = &i;  // ������ p�� ����Ű�°��� i�� ��.
	// i==p  ->1
	printf("*i= %d\n", *p);
	*p = 20; // ������ ���� �ش� ������ ���� ������ ����. 
	printf("*i= %d\n", p);
	return 0;
}
