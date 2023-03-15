#include <stdio.h>

int main() {

    float prices[2];
    float rate;

    scanf("%f %f", &prices[0], &prices[1]);

    rate = (prices[1] * 100 / prices[0]) - 100;
    printf("%.2f%%\n", rate);

    return 0;
}