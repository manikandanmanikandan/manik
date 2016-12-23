#include<stdio.h>
#include<conio.h>
void main()
{
int n ,count=0;
printf("enter the string ");
scanf("%d",&n);
while(n)
{
    n=n/10;
    count++;
}
printf("count :%d",count);
}
