#include <stdio.h>
#include <stdlib.h>

int main(void){
	char *pc = NULL;
	int i =0;
	pc = (char *)malloc(100 * sizeof(char));
	//100���� char�� �������ִ� ���ڿ� ������ �޸� ����
	
	if(pc == NULL){
		printf("���� �޸� �Ҵ翡 �����߽��ϴ�.");
		exit(1);
	} 
	//pc�� ����Ű�� �����͸� 1�� ������Ű�� ���ĺ� �ҹ��ڸ� �����Ѵ�.
	for(i=0;i<26;i++){  // �� ���ĺ��� ���� : 26 
		*(pc+i) = 'a'+i; // pc(�迭)�� �޸𸮰� �ö󰥶����� ���ĺ� ����. 
	} 
	*(pc+i)=0;  // z �ٷ� ���� ���ڿ� 0 ����
	// �ƽ�Ű Ŀ�ǵ忡�� 0�� NULL�� ���Ѵ�.
	
	printf("%s\n",pc);
	// a���� ����� NULL���� ���������� ���ڿ� ���
	free(pc); 
	return 0;
}
