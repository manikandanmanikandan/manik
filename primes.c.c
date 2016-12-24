#include<stdio.h>
#include<conio.h>
void main()
{
int a,k,flag=0;
printf("enter the values:");
scanf("%d",&a);
for(k=2;k<=a/2;k++)
{
if(a%k==0)
{
flag=1;
break;
}
}
if(flag==0)
printf("prime");
else
printf("not prime");
}
