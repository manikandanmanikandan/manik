#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter the values:");
scanf("%d %d%d",&a,&b,&c);
if(a>b&&a>c)
printf("greatest number a");
if(b>a&&b>c)
printf("greatest number b");
if(c>a&&c>b)
printf("greatest number c ");
}
