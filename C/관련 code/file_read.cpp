#include <stdio.h>

int main(void){
	FILE *fp = NULL;
	int c;
	
	fp = fopen("output.txt","r");
	
	if(fp == NULL){
		printf("���� ���⿡ �����߽��ϴ�.\n");
	}else{
		printf("���� ���⿡ �����߽��ϴ�. \n");
	}
	
	while((c = fgetc(fp)) != EOF){  // EOF : end of file ������ ���� �ǹ��Ѵ�. 
		putchar(c); // �ܼ� â�� char ��� 
	}
	fclose(fp);
	return 0;
}
