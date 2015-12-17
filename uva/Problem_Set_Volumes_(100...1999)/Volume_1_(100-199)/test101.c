#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define N 25

struct pile {
	int donnee;
	struct pile * suivant;
};

typedef struct pile* Pile;

void afficher_tableau_pile(Pile[]);

int main() {
	Pile tableau [N];
	int i;

	for(i = 0; i < N; i ++) {
		tableau[i] = malloc(sizeof(tableau[i]));
		tableau[i]->donnee = i;
		tableau[i]->suivant = NULL;
	}
	
	//tableau[1]->suivant = tableau[0];
//	tableau[0] = NULL;

	afficher_tableau_pile(tableau); 

	return 0;
}

void afficher_tableau_pile(Pile pile[])
{
	int i;
	Pile courant;
	for(i = 0; i < N; i++)
	{
		printf("koukou");
		printf("%d:", i);
		printf("koukou");
		courant = pile[i];
		do {
			printf("%d ", courant->donnee);
			courant = courant->suivant;
		}
		while(courant-> suivant != NULL);
		printf("\n");
	}
}
