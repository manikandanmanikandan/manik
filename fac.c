#include<stdio.h>
#include<conio.h>
void main()
{
int n,fact=1,i;
printf("enter the factorial number:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
fact=fact*i;
}
printf("the factorial is %d",fact);
}
