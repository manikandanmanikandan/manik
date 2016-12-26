#include<stdio.h>
#include<conio.h>
void main()
{
int n,reverse=0,i;
printf("enter the factorial number:");
scanf("%d",&n);
while(n!=0)
{
i=n%10;
reverse=reverse*10+i;
n=n/10;
}
printf("enter the reverse %d",reverse);
}
