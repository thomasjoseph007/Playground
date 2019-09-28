#include <stdio.h>
int main()
{
    int i, j, n,c;
       scanf("%d", &n);
    c = n + 1;
    for(i=1; i<c; i++)
    {
        for(j=1; j<c; j++)
        {
            if((j==i) || (j==c - i ))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }

        printf("\n");
    }

    return 0;
}
