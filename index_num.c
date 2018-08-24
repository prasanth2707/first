#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
int main()
{
    int count,temp=0,count1,k=0;
    printf("Enter the number of elements");
    ret=scanf("%d",&count);
    if(ret!=1)
    {
        printf("Invalid count");
        exit(0);
    }
    count1=count;
    int list[count];
    int list1[count1];
    for(int i=0;i<count;i++)
    {
        scanf("%d",&list[i]);
    }
    for(int i=0;i<count;i++)
    {
        if(list[i]==i)
        {
            list1[k]=list[i];
            k++;
        }
    }
    for(int i=0;i<k;i++)
    {
        for(int j=i+1;j<k;j++)
        {
            if(list1[i]>list1[j])
            {
                temp=list1[i];
                list1[i]=list1[j];
                list1[j]=temp;
            }
        }
    }
    printf("The numbers to be printed are:\n");
    for(int i=0;i<k;i++)
    {
        printf("%d",list1[i]);
    }
    return 0;
}

