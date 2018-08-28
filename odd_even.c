#include<stdio.h>
#include<stdlib.h>
int main()
{
    int count;
    printf("Enter the number of elements");
    scanf("%d",&count);
    int array[count];
    printf("Enter the elements");
    for(int lp=0;lp<count;lp++)
    {
        scanf("%d",&array[lp]);
    }
    printf("The result is:");
    for(int lp=0;lp<count;lp++)
    {
        if((lp%2)==0)
        {
            if((array[lp]%2)!=0)
            {
                printf("%d\t",array[lp]);
            }
            else
                continue;
        }
        if((lp%2)!=0)
        {
            if((array[lp]%2)==0)
            {
                printf("%d\t",array[lp]);
            }
            else
                continue;
        }
    }
    return 0;
}

