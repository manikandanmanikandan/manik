#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,j;
scanf("%d",&n);
for(i=0;i<=5;i++)
{
printf("\n");
for(j=i;j<=5;j++)
    printf("*");
}printf("\t");
for(i=0;i<=5;i++)
{
for(j=i;j<=5;j++)
    printf("*");
printf("\n");
}
}
