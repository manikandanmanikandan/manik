#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,rem,num=0;
printf("enter the number:");
scanf("%d",&a);
b=a;
while(b!=0)
{
rem=b%10;
num=num+rem*rem*rem;
b=b/10;
}
if(num==a)
{
printf("ast0");
}
else
{
printf("not");
}
}
