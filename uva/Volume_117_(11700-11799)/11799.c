#include<stdlib.h>
#include<stdio.h>
int main()
{
	int case_number, students_number, vitesse_of_current_student, max;
	int i, j;
	scanf("%d", &case_number);
	
	for(j = 1; j <= case_number; j++)
	{
		max = 0;
		scanf("%d", &students_number);
		for(i = 0; i < students_number; i++)
		{
			scanf("%d", &vitesse_of_current_student);
			if ( 0 == i) max = vitesse_of_current_student;
			if (vitesse_of_current_student > max) max = vitesse_of_current_student;
		}
		printf("Case %d: %d\n", j, max);
	}
		

	return 0;
}
