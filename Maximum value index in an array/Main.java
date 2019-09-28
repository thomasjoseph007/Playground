#include <stdio.h>
int main()
{
  
  int n,i,p;
  scanf("%d",&n);
  int a[n];
  for ( i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  int max=0;
  for( i=0;i<n;i++)
  {
    if(a[i]>max)
    {
     p = i;
    }
  }
  printf("%d",p);
   return 0;
}