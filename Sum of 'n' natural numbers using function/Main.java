#include<stdio.h>
int sum(int);
void main()
{
    int n,s;
    scanf("%d",&n);
    s = sum(n);
  printf("%d",s);
    
 }
int sum(int n)
{
  if( n!=0)
  {
    return n + sum (n-1);
  }
}