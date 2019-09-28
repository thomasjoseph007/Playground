#include<stdio.h>
int main()
{
	int n,m=3;
    scanf("%d",&n);
    for(int num = 1 ; num <= n ; num++) 
      {
		printf("%d",num);
      if(( num % m == 0)&& (n !=m))
         {
        printf(",");
	  }
    }
	return 0;
}