#include <stdio.h>

int main() {

	long long n, m;
	while(scanf("%lld %lld\n",&n,&m)==2) {
		if(n < m)
			printf("%lld\n", m - n);
		else
			printf("%lld\n", n - m);
	}
	exit(0);
}

