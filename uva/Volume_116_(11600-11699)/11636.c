#include<stdlib.h>
#include<stdio.h>
int main()
{
	int cases_number;
	int number;
	int puissance_2 = 1;
	int i, j;
	scanf("%d", &cases_number);
	for(i = 1; i <= cases_number; i++)
	{
		scanf("%d", number);
		j = 0;
		while(puissance_2 < number)
		{
			puissance_2 *= 2;
			j++;
		}
		if(puissance_2 == number)
		{
			printf("Case %d : %d", i, j);
		} else
		{
			printf("Case %d : %d", i, j + 1);
		}
	}
	return 0;
}
