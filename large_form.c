#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
int main()
{
    int count,temp=0,ret=0;
    printf("Enter the number of elements to be entered");
    ret=scanf("%d",&count);
    if(ret!=1)
    {
        printf("Invalid Input");
        exit(0);
    }
    int list[count];
    for(int i=0;i<count;i++)
    {
        scanf("%d",&list[i]);
    }
    for(int i=0;i<count;i++)
    {
        for(int j=i+1;j<count;j++)
        {
            if(list[i]<list[j])
            {
                temp=list[i];
                list[i]=list[j];
                list[j]=temp;
            }
        }
    }
    for(int i=0;i<count;i++)
    {
        printf("%d",list[i]);
    }
}
