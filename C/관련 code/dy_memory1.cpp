#include <stdio.h>
#include <stdlib.h>  // ���� �޸� ��� ���� ���̺귯��

int main(void){
	int *pi; // Pointer Integer
	pi = (int *)malloc(sizeof(int)); // malloc : �޸𸮸� �Ҵ��϶�.
	// malloc(sizeof(int)) : int���� ũ�⸸ŭ �޸𸮸� �Ҵ��϶�. 
	// (int *) �����ͷ� ����ȯ
	if(pi ==NULL){
		printf("���� �޸� �Ҵ翡 �����߽��ϴ�.\n");
		exit(1); // ���α׷� ���� 
	} 
	
	*pi = 100;
	printf("%d\n", *pi);
	// ���� �޸� ��� ���Ŀ� ������ �޸𸮸� ��ȯ�Ѵ�.
	free(pi); 
	return 0;
} 

