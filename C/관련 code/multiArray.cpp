#include <stdio.h>
#define NUMBER 5 

int main(void){
	int t, max, min ,index;
	int array[5];
	for(int i=0; i<NUMBER;i++){
		scanf("%d", &array[i]);
		if(max < array[i]){
			max = array[i];
			index = i;
		}
	}
	printf("���� ū ���� %d�Դϴ�. �׸��� %d��°�� �ִ�.",max, index);
	return 0;
}
