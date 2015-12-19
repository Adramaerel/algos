#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	int test_cases_number;
	int i, input;
	
	scanf("%d", &test_cases_number);
	for (i = 0; i < test_cases_number; i++)
	{
		scanf("%d", &input);
		input = (input * 567 /9 + 7492 ) * 235 / 47 - 498;
		input = input /10;
		printf("%d\n", abs(input % 10));
	}
	exit(0);
}

/*

“Multiply n by 567, then divide the result by 9, then add 7492, then multiply by 235, then divide
by 47, then subtract 498. What is the digit in the tens column?”

*/
