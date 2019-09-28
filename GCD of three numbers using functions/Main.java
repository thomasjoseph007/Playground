#include<stdio.h>
int gcd(int,int);
int main() {
    int a,b,c,gcd1,gcd2;
    scanf("%d%d%d",&a,&b,&c);
    gcd1=gcd(a,b);
    gcd2=gcd(c,gcd1);
    printf("%d",gcd2);
    return 0;
}
int gcd(int x,int y)
{
    int rem;
	while(y!=0)
	{
		rem=x%y;
		x=y;
		y=rem;
	}
	return(x);
	
}