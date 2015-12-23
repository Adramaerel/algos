#include <stdio.h>

int next_value(int); /* calcule la prochaine valeur de la suite de syracuse */
int cycle_length(int); /* calcul la longueur du cycle d'un entier*/

int main()
{
	int n, m, N, M; /* n premier input, N memoire du premier input, m deuxieme input, M mémoire du 2eme input */
	int c = 0, maxC = 0; /* cycle length */
	int compteur;
	while (scanf("%d %d\n",&n,&m)==2) 
	{
		N = n;M = m;
		if( n > m)
		{
			c = n;
			n = m;
			m = c;
			c = 0;
		}
		for(compteur = n; compteur <= m; compteur ++)
		{
			c = cycle_length(compteur);
			if(c > maxC) maxC = c;
		}
		printf("%d %d %d\n", N, M, maxC);
		maxC = 0;
	}
	return 0;
}

int cycle_length(int n)
{
	int c = 0;
	while( 1 != n)
	{
		c++;
		n = next_value(n);	
	}
	return c + 1;
}

int next_value(int n)
{
	if( 0 == n % 2)
	{
		return n / 2;
	}
	return 3 * n + 1;

}
