#include <stdio.h>
 
int main() {
 
    int time;
    int vel;
    float distance;
    float liters;

    scanf("%i", &time);
    scanf("%i", &vel);

    distance = time * vel;
    liters = distance / 12;

    printf("%.3f\n", liters);
 
    return 0;
}