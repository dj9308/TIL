#include <stdio.h>
#include <string.h>

int main(void){
	char inputOne[5] = "B";
	char inputTwo[5] = "B";
	
	printf("���ڿ� �� : %d\n", strcmp(inputOne,inputTwo));
	// ���������� ���Ͻ� 0, one�� �տ������� -1, Two�� �տ� ������ 1�� ��ȯ�ȴ�.
	// ��������, ���ܾ� �ϱ��� ������ ���� ����. 
	return 0;
}

