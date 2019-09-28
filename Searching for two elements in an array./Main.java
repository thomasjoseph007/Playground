 
#include<stdio.h>
 int main()
 {
  int n;
  scanf("%d \n", &n);
  int arr[n];
  for(int i = 0; i < n; i++)
   {
    scanf("%d",&arr[i]);
   }
  int s,f,g=0,h=0;
  scanf("%d%d", &s,&f);
   
  for(int i = 0; i < n ; i++)
   {
    if(s== arr[i])
    {
       printf("%d\n",i);
       g=1;
    }
    if(f== arr[i])
    {
      printf("%d\n",i);
       h=1;
    }
   }
   if(g==0)
     printf("-1");
   if(h==0)
     printf("-1");

 }
