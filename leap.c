#include<stdio.h>
#include<conio.h>
void main()
{
int a;
printf("enter the values:");
scanf("%d",&a);
if(a%4==0||a%100==0||a%400)
{
printf("is a leap");
}
else
{
printf("is a not leap");
}
}

