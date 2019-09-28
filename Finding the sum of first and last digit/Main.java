#include <stdio.h>
int main() {
  int Number, FirstDigit, LastDigit, Sum = 0;  
   scanf("%d", &Number); 
    FirstDigit = Number;
  	while(FirstDigit >= 10)
  	{
  		FirstDigit = FirstDigit / 10;
	}
  	
  	LastDigit = Number % 10;
  	
  	Sum = FirstDigit + LastDigit;
    printf("%d",Sum);
	return 0;
}