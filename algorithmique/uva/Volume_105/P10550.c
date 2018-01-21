#include<stdlib.h>
#include<stdio.h>
int main()
{
	int input [4];
	int i = 0;
	int result;
	while(1)
	{
		for(i = 0; i < 4; i++)
		{
			scanf("%d", &input[i]);
		}
		
		if( input[0] == 0 && input[1] == 0 && input[2] == 0 && input[3] == 0) break;

		result = 1080;

		result += (input[0] - input[1]) > 0 ? (input[0] - input[1]) * 9 : (input[0] - input[1] + 40) * 9;
		result += (input[2] - input[1]) > 0 ? (input[2] - input[1]) * 9 : (input[2] - input[1] + 40) * 9;
		result += (input[2] - input[3]) > 0 ? (input[2] - input[3]) * 9 : (input[2] - input[3] + 40) * 9;



		printf("%d\n", result);

	}
	

	return 0;
}
