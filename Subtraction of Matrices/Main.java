#include<stdio.h>
int main()
{ 
  int r;
  int c;
  scanf("%d", &r);
  scanf("%d", &c);
  int m1[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &m1[i][j]);
   }
  }
  int m2[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &m2[i][j]);
   }
  }
  int sub[c][r];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    sub[j][i] = m1[i][j] - m2[i][j]; 
   }
  }
  for(int i = 0; i < c; i++)
  {
   for(int j = 0; j < r; j++)
   {
    printf("%d ", sub[j][i]);
   }
   printf("\n");
  }
}