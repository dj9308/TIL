#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct student{
	int number;
	char name[10];
	double grade;
};

int main(void){
	struct student s;
	printf("�й��� �Է��ϼ���! ");
	scanf("%d",&s.number);
	printf("�̸��� �Է��ϼ���! ");
	scanf("%s",s.name);  // array�� ��� �� ��ü�� pointer�̱� ������ &�� ���� �ʿ䰡 ����. 
	printf("������ �Է��ϼ���! ");
	scanf("%lf",&s.grade); // double�� ��� lf�� ���ָ�ȴ�.
	//float�� ��� f. 
	
	printf("�й� : %d\n",s.number);
	printf("�̸� : %s\n",s.name);
	printf("���� : %0.1f\n",s.grade);
	return 0;
}
