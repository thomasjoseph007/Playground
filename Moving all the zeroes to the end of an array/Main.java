#include <stdio.h>
void reorder(int A[], int n)
{
	int k = 0;
	for (int i = 0; i < n; i++)
	{
		if (A[i] != 0)
			A[k++] = A[i];
	}
	for (int i = k; i < n; i++)
		A[i] = 0;
}
int main(void)
{
	int n,i;
  scanf("%d ", &n);
  int arr[n];

  for(  i = 0; i < n; i++)
  { 
     scanf ("%d", &arr[i]);
  } 
	reorder(arr, n);

	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);

	return 0;
}