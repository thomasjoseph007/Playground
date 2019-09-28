#include <stdio.h>
int main() {
	int num, last ;  
    scanf("%d", &num); 
    while(num>=10)
    {
     last = num%10;  
      num = num/10;    
    }
 
    printf("%d",last);
}