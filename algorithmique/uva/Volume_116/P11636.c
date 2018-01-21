#include<stdlib.h>
#include<stdio.h>
int main()
{

	int number;
	int puissance_2;
	int i = 0, j;

	while(1)
	{
		i++;
		scanf("%d", &number);
		if(number < 0) break;
		j = 0;
		puissance_2 = 1;
		while(puissance_2 < number)
		{
			puissance_2 *= 2;
			j++;
		}
		if (number == 0 || number == 1) printf("Case %d: %d\n", i, 0);
		else printf("Case %d: %d\n", i, j);
	}
	return 0;
}
