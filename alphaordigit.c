#include<stdio.h>
#include<conio.h>
void main()
{
char n;
printf("enter the values:");
scanf("%c",&n);
if(isalpha(n)>0)
printf( "the alphates");
if(isdigit(n)>0)
printf("the digits");
}
