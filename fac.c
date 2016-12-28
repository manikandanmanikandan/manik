#include<stdio.h>
#include<conio.h>
void main()
{
int f,fa=1,m;
printf("enter the factorial number:");
scanf("%d",&f);
for(m=1;m<=f;m++)
{
fa=fa*m;
}
printf("the factorial is %d",fa);
}
