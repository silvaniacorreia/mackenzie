#include <stdio.h>
#include <math.h>
 
int main() 
{
    float A;
    float B;
    float C;
    
    scanf("%f %f %f", &A, &B, &C);

    float side1 = A;
    float side2 = B;
    float side3 = C;    

    if (side1 > side2 && side1 > side3)
    {
        A = side1;
        if (side2 > side3)
        {
            B = side2;
            C = side3;
        }
        else
        {
            B = side3;
            C = side2;
        }
    }
    else if (side2 > side1 && side2 > side3)
    {
        A = side2;
        if (side1 > side3)
        {
            B = side1;
            C = side3;
        }
        else
        {
            B = side3;
            C = side1;
        }
    }
    else
    {
        A = side3;
        if (side1 > side2)
        {
            B = side1;
            C = side2;
        }
        else
        {
            B = side2;
            C = side1;
        }
    }
    
    if (A >= (B + C))
    {
        printf("NAO FORMA TRIANGULO\n");
        return 0;
    }
    if (pow(A,2) == pow(B,2) + pow(C,2))
    {
        printf("TRIANGULO RETANGULO\n");
    }
    if (pow(A,2) > pow(B,2) + pow(C,2))
    {
        printf("TRIANGULO OBTUSANGULO\n");
    }
    if (pow(A,2) < pow(B,2) + pow(C,2))
    {
        printf("TRIANGULO ACUTANGULO\n");
    }
    if (A == B && A == C && C == B)
    {
        printf("TRIANGULO EQUILATERO\n");
    }
    else if (A == B || A == C || C == B)
    {
        printf("TRIANGULO ISOSCELES\n");
    }
 
    return 0;
}