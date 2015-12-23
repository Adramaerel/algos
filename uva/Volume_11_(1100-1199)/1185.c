#include <stdio.h>
#include <math.h>

double calculate(double);

int main()
{
	int input, nb_input, compteur = 0, compteur2;
	double number_of_digits = 0;
	
	scanf("%d", &nb_input);

	for(compteur = 0; compteur < nb_input; compteur ++)
	{
		scanf("%d", &input);

		for (compteur2 = input; compteur2 > 1; compteur2--) {
       			number_of_digits += log10(compteur2);
      		}	
		printf("%d\n", (int)(number_of_digits + 1));
		number_of_digits = 0;
	}
}

double calculate(double n)
{
	if( 1 == n)
	{
		return log10(1);
	}
	else
	{
		return calculate(n - 1) + log10(n);
	}
}
