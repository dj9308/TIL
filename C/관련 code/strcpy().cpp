#include <stdio.h>
#include <string.h>

int main(void){
	char input[11]="I Love You";
	char result[5]="Love";
	strcpy(result,input); // result ���� �ȿ� input ī�� ����
	// strcpy string pointer ���� ���� �Լ� 
	printf("���ڿ� ���� : %s\n",result);
	return 0; 
}
