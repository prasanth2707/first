#include<stdio.h>
#include<stdlib.h>
int main()
{
    int count,temp=0;
    printf("Enter the count:");
    scanf("%d",&count);
    int list[count];
    printf("\nThe input numbers are:");
    for(int i=0;i<count;i++)
    {
        scanf("%d",&list[i]);
    }
    for(int i=0;i<count;i++)
    {
        for(int j=i+1;j<count;j++)
        {
            if(list[i]>list[j])
            {
                temp=list[i];
                list[i]=list[j];
                list[j]=temp;
            }
        }
    }
    for(int i=0;i<count;i++)
    {
        for(int j=i+1;j<count;j++)
        {
            if(list[i]==list[j])
            {
                printf("%d",list[j]);
                list[j]=0;
            }
        }
    }
}

