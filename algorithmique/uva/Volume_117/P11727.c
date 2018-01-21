#include <stdio.h>
#include <stdlib.h>




int main()
{
	int nbOfCases, i;
	int salaire1, salaire2, salaire3, salaire=0; 

	scanf("%d", &nbOfCases);

	for(i = 0; i < nbOfCases; i++)
	{
		scanf("%d", &salaire1);
		scanf("%d", &salaire2);
		scanf("%d", &salaire3);

		if(salaire1 <= salaire2 && salaire2 <= salaire3)
		{
			salaire = salaire2;
		}
		if(salaire1 <= salaire3 && salaire3 <= salaire2)
		{
			salaire = salaire3;
		}
		if(salaire2 <= salaire1 && salaire1 <= salaire3)
		{
			salaire = salaire1;
		}
		if(salaire2 <= salaire3 && salaire3 <= salaire1)
		{
			salaire = salaire3;
		}
		if(salaire3 <= salaire1 && salaire1 <= salaire2)
		{
			salaire = salaire1;
		}
		if(salaire3 <= salaire2 && salaire2 <= salaire1)
		{
			salaire = salaire2;
		}

		printf("Case %d: %d\n", i + 1, salaire);
	}
}

