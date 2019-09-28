#include <stdio.h>
int great(int,int,int);
int main(){
	int x,y,z,q;
  scanf("%d%d%d",&x,&y,&z);
  printf("%d",great(x,y,z));
 
}
int great(int a,int b,int c)
{
  int q;
  if(a>b)
  {
    if(a>c)
    {
    	return  q = a;
    }
    else
    {
    	return q=c;
    }
  }
  else
  {
   return q= b;
  }
  printf("%d",q);
}