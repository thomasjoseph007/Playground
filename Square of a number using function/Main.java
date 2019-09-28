#include<stdio.h>
int square(int);
void main()
{
    int n,s;
    scanf("%d",&n);
    s = square(n);
  printf("%d",s);
    
 }
int square(int n)
{
  return n*n;
}