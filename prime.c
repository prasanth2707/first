#include <stdio.h>
#include<stdlib.h>
int main()
{
    int n, i, flag = 0;
    scanf("%d",&n);
    if(n>1000)
    {
        exit(0);
    }
    for(i=2; i<=n/2; ++i)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }

    if (flag==0)
        printf("yes");
    else
        printf("no");
    
    return 0;
}
