#include<stdio.h>
#include<string.h>

void main()
{
	char str[100],sp[100];
	int i, len,j=0,k,c;
    scanf("%[^\n]s",str);
    len=strlen(str);
	for(i=0; str[i]!='\0'; i++)
	{
	    
		if(str[i]==' ')
		{
	       sp[j++]=i;
		}
	}
	for(i=j-1;i>=0 ; i--)
	{
	    c=0;
	    for( k=sp[i]+1;k<len;k++)
	{
	    printf("%c",str[k]);
	    c++;
	}
	   printf(" ") ;
	   len=len-c-1;
	}
	for(i=0;i<len;i++)
	{
	    printf("%c",str[i]);
	}
}

