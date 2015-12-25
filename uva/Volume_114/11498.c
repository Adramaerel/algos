#include<stdlib.h>
#include<stdio.h>
int main()
{
	int case_number;
	int div_x, div_y, x, y;
	
	while(1) {
		scanf("%d", &case_number);
		if (!case_number) break;
		scanf("%d %d", &div_x, &div_y);
		while(case_number--)
		{
			scanf("%d %d", &x, &y);	
			if(x == div_x || y == div_y) {
					printf("divisa\n");
			continue;
			}
			if (div_y < y)
				printf("N");
			else
				printf("S");
			if (div_x < x)
				printf("E\n");
			else
				printf("O\n");	
		}
	}
	return 0;
}
