#include <stdio.h>

int main(void){
	char input[1001];
	gets(input); // input�̶�� char �迭�ȿ� ����ڰ� �Է��ϴ� ���ڿ��� enter�� ĥ�� ���� �� 
	int count = 0;
	while(input[count]!='\0'){ // null
		count++;
	}
	printf("%d\n",count);
	printf("%s",input);
	return 0;
}
