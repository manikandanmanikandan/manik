#include<stdio.h>
#include<conio.h>
void main()
{
    int k,m,i=1;
    long int sum=1;
    printf("\nEnter a number: ");
    scanf("%d",&m);
    printf("\nEnter power: ");
    scanf("%d",&k);

    while(i<=k)
    {
        sum=sum*m;
        i++;
    }
    printf("\n%d to the power %d is: %ld",k,m,sum);
    getch();
}

