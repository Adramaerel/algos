#include<stdlib.h>
#include<stdio.h>
int main()
{
	int caseNb, jump_number, tall_jump, low_jump, wall, wall_last;
	int i, j;
	scanf("%d", &caseNb);
	for (i = 1; i <= caseNb; i++)
	{
		scanf("%d", &jump_number);
		wall = 0; wall_last = 0; tall_jump = 0;low_jump = 0;
		while (jump_number--)
		{
			scanf("%d", &wall);
			if (wall_last == 0) { wall_last = wall; continue;}
			if (wall > wall_last) tall_jump++;
			if (wall < wall_last) low_jump++;
			wall_last = wall;
			
		}
		printf("Case %d: %d %d\n", i, tall_jump, low_jump);
	}
	return 0;
}
