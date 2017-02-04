#include<stdlib.h>
#include<stdio.h>
int main()
{
	int case_number, n, m;
	scanf("%d", &case_number);
	while(case_number--)
	{
		scanf("%d %d", &n, &m);
		
		printf("%d\n", ((n - 2)/3 + ((n - 2)%3 != 0)) *((m - 2)/3 + ((m - 2)%3 != 0)));
	}
}
