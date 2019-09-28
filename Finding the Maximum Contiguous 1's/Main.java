#include <stdio.h> 
int main()
{
  int n,i,j,t,sum=0,sum1=0;
scanf("%d",&n);

  int a[n] ;
  
for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }
  
  
  
  for(i=0;i<n-1;i++)
  {
      j=i+1;
      if(a[i]<=a[j])
      {
      sum=sum+a[j];
      
      }
  }
  
  printf("%d ",sum);
  return 0;
}