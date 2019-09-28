#include<stdio.h>

int main() 
{
    int i,j,n;
  	scanf("%d",&n);
  	int arr[n];
  	for(i=0;i<n;i++)
  	{
  		scanf("%d",&arr[i]);
  	}
  	int f = 0,c = 0;
    for (int i = 0; i < n; i++) 
    {
        int t = 0;
        for (int j = 0; j < n; j++) 
        {
            if (arr[i] == arr[j]) 
            {
                t++;
            }
        }
        if(t > c) 
        {
            f = arr[i];
            c = t;
        }
    }
  	printf("%d",f);
    return 0;
}