#include<stdio.h>
int fact(int);
int main()
{
	int n;
  	scanf("%d",&n);
  	printf("%d",fact(n));
	 //return n*fact(n-1);
}
int fact(int n )
{
  if(n > 0)
     {
     	 return n*fact(n-1);
     }
     else
     {
    	return 1;
     }
}