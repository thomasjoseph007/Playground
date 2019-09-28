/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  int q = n/2;
  int s=0;
  for (int i=0;i<q;i++)
  {
  	s = s + a[i];
  }
  int ss = 0;
  for (int i = q;i<n;i++)
  {
  	ss = ss + a[i];	
  }
  if(s==ss)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}