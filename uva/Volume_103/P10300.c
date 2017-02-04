#include <stdio.h>
#include <stdlib.h>
int main()
{
	unsigned long long sum;
	unsigned long long test_case_number, farmers_number;
	unsigned long long i, j;
	unsigned long long size, animals_number, env_fact;

	scanf("%llu", &test_case_number);
	for (i = 0; i < test_case_number; i++)
	{
		sum = 0;
		scanf("%llu", &farmers_number);
		for (j = 0; j < farmers_number; j++)
		{
			scanf("%llu", &size);
			scanf("%llu", &animals_number);
			scanf("%llu", &env_fact);
			sum += size * env_fact;

		}
		printf("%llu\n", sum);
	}

	return 0;
}
