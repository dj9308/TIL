#include <stdio.h>

int main(void){
	char o;
	int x,y;
	while(1){
		printf("������ �Է��ϼ���!: ");
		scanf("%d %c %d", &x, &o, &y);
		if(o=='+'){
			printf("%d %c %d = %d\n", x,o,y,x+y);
		} 
	}
}
