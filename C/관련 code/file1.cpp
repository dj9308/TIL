#include <stdio.h>

int main(void){
	FILE *fp = NULL;
	fp = fopen("output.txt","w");
	// w = ���� ��带 �ǹ��Ѵ�. r => �б� ��带 �ǹ� �Ѵ�. 
	if(fp ==NULL) {
		printf("���� ���⿡ �����߽��ϴ�\n");
	}else{
		printf("���� ���⿡ �����߽��ϴ�.\n");
	}
	fputc('H',fp);  //file�� �ѱ��ھ� ��� (fileputcaracter)
	fputc('E',fp);
	fputc('L',fp);
	fputc('L',fp);
	fputc('O',fp);
	fclose(fp);  // ����� �׻� fclose�� ����� ������ ���� ��. 
	return 0;
}
