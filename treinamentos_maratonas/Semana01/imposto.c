#include <stdio.h>
 
int main() 
{
    float income;
    float tax = 0;
 
    scanf("%f", &income);
    
    if (income <= 2000.00)
    {
        printf("Isento\n");        
    }  
    else
    {
        if (income <= 3000.00)
        {
            tax = 0.08 * (income - 2000);
        }
        else if (income <= 4500.00)
        {
            tax = 80.00 + 0.18 * (income - 3000.00);
        }
        else 
        {
            tax = 350.00 + 0.28 * (income - 4500.00);
        }
        printf("R$ %.2f\n", tax);
    }

    return 0;
}