#include <stdio.h>

// �ݺ��Լ��� �׿��ؼ� ���� �Ƕ�̵带 ����Ѵ�.

int print(int a){
	int i,j;
	for(int i=0;i<a;i++){
		for(int j=0;j<=i;j++){
			printf("%d ", j+1);
		}
		printf("\n");
	}
}

int main(void){
	int a;
	scanf("%d",&a);
	print(a);
	return 0;
} 
