#include<stdio.h>
#include<limits.h>

int main(){
	int x = INT_MAX;
	printf("int���� �ִ� x�� %d�Դϴ�.\n",x);
	printf("x+1�� %d�Դϴ�.\n", x+1);
	//x+1�� -2147483648�Դϴ�. 
	//�ѹ����� �ǳ� �پ� �ּڰ����� ���ư�����.
	// �̰��� overflow��� ���� 
}
