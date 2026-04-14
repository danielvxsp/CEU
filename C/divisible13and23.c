#include <stdio.h>

int main() {
    int lim = 1000;
    int a = 0;
    printf("Números divisibles entre 13 y 23 hasta %d:\n", lim);
    
    for ( a = 1 ; a <= lim ; a++) {
        if (a % 13 == 0 || a % 23 == 0) {
            printf("%d ", a);
        }
    }

    return 0;
}
