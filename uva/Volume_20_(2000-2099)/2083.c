#include<stdio.h>
#include<stdlib.h>

int f(int);
double s(int);

int main()
{
	int n = 0;
	printf("n e\n");
	printf("- -----------\n");
	for (; n< 10; n++)
	{	
		if (2 < n) printf("%d %2.9lf\n", n, s(n));
		if (2 == n) printf("%d 2.5\n", n);
		if (1 == n) printf("%d 2\n", n);
		if (0 == n) printf("%d 1\n", n);

		
		
	}
	return 0;
}

double s(int n)
{

	return 0 == n ? 1 : 1.0 / f(n) + s(--n);
	
}

int f(int n)
{
	return 1 ==n || 0 == n ? 1 : n * f(n-1);
}
