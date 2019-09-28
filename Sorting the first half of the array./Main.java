#include<stdio.h>
int main()
{
	int i,j,n;
  	scanf("%d",&n);
  	int a[n];
  	for(i=0;i<n;i++)
  	{
  		scanf("%d",&a[i]);
  	}
	int m = n/2;
  	for(i=0;i<m;i++)
    {
    	for(j=i+1;j<m;j++)
        {
        	if(a[i]>a[j])
            {
            	int t = a[j];
              a[j] = a[i];
              a[i] = t;
            }
        }
    }
  for(i=0;i<n;i++)
  	{
  		printf("%d ",a[i]);
  	}
	return 0;
}