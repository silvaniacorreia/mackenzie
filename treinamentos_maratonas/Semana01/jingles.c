#include <stdio.h>
#include <string.h>

int main()
{
    char composition[200] = {'\0'};
    int j = 0;
    int k = 0;
    char notes[] = "WHQESTX";
    int notes_value[] = {64, 32, 16, 8, 4, 2, 1};
    int sum_notes = 0;
    int sum_compass = 0;

    scanf("%s", composition);

    while (strcmp(composition, "*") != 0)
    {
        k = 0;
        while (composition[k] != '\0')
        {
            if (composition[k] != '/')
            {
                if (composition[k] == notes[j])
                {
                    sum_notes = sum_notes + notes_value[j];
                    k++;
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                if (sum_notes == 64)
                {
                    sum_compass = sum_compass + 1;
                }
                if (composition[k] == '/')
                {
                    k++;
                }
                sum_notes = 0;
            }
        }
        printf("%i\n", sum_compass);
        sum_compass = 0;
        scanf("%s", composition);
    }
    return 0;
}