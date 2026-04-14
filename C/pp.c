#include <stdio.h>


int main (void) {

		int Num;
		printf("enter you number: ");
		scanf("%d", &Num);

		if ( Num > 0 || Num < 10 ) {
		 	if (Num < 5) {
					printf("fail\n");
			} else if (Num >= 5 && Num < 7) {
					printf("aprobado\n");
			} else if (Num >= 7 && Num < 9) {
					printf("notable\n");
			} else if (Num >= 9 && Num < 10 ) {
					printf("sobresaliente\n");
		    } else {
					printf("MH\n");
			}
		} else {
				printf("dumbass\n");
		}

		return 0;
}
