#include <stdio.h>

int main(void){
	int x = 50, y = 30;
	printf("x�� y����ũ�� y�� 40 �̸��Դϱ�? %d\n", (x>y) && (y<40) );
	printf("x�� y���� �۰ų� ȣ�� y�� 30�Դϱ�? %d\n", (x<y) || (y==30));
	printf("x�� 50�� �ƴմϱ�? %d", x!=50);
	return 0;
}

// 1 / 1 / 0  : ���� 1, ������ 0���� ��ȯ�ȴ�. 
