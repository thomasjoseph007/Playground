#include <stdio.h>

void main()
 {
   int i,j,r,c,k;
    scanf("%d %d", &r, &c);
    int matrix[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &matrix[i][j]);
            
        }
    }
   for(i=0;i<r;i++)
     {
      for(j=0,k=i;k<c;j++,k++)
      {
             printf("%d ",matrix[j][k]);
      }
  }
}
