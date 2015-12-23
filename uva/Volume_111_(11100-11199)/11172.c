#include <stdio.h>
#include <stdlib.h>
int main()
{

	int number_of_inputs, compteur, n, m;

	scanf("%d", &number_of_inputs);

	for(compteur = 0; compteur < number_of_inputs; compteur ++)
	{
		scanf("%d %d", &n, &m);
		if(n == m)
		{
			printf("=\n");
		} else if (n < m) {
			printf("<\n");
		} else {
			printf(">\n");
		}
	}
	exit(0);
}

