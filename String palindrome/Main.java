#include<stdio.h>
#include<string.h>
void main()
{
    char string[10];
    int i,l,flag=0;
    scanf("%s",string);
    l = strlen(string);
    for(i=0;i<l;i++)
    {
        if(string[i]!=string[l-i-1])
        
        {
            flag=1;
        }
    }
    if(flag==0)
    {
        printf("%s is a palindrome",string);
    }
    else
    {
        printf("%s is not a palindrome",string);
    }
}