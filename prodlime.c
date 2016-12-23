#include<stdio.h>
#include<conio.h>
void main()
{
    int n,reverse=0,rem,temp;
    printf("\nEnter a number: ");
    scanf("%d",&n);
    temp=n;
    while(temp!=0)
    {
    rem=temp%10;
    reverse=reverse*10+rem;
    rem=temp/10;
    }
    if(reverse==n)
    {
    printf( "the padro");
    }
    else
    {
    printf("not predime");
    }}
