#include<stdio.h>
int prime(int);
int main(){
    int n;
  scanf("%d",&n);
    for(int i=2;i<=n;i++)
  {
    int t ;
    t = prime(i);
    if(t == 1 )
    {
      printf("%d\n",i);
    }
  }
    return 0;
}
int prime(int n)
{
  int j,t=1;
  for(j=2;j<=n/2;j++)
  {
    if(n%j==0)
    {
    t=0;
      break;
  }
}
  return t;
}
