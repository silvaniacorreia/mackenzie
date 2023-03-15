#include <stdio.h>
 
int main() {
 
    long long number;
    
    scanf("%lld", &number);

    while (number >= 0.1)
    {
        printf("%lld", (number % 10));
        number = number / 10;
    }

    printf("\n");
    return 0;
}