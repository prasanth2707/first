import java.util.*;
class closest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int m=0;
        int l=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                m++;
            }
            if(arr[j]>0)
            {
                l++;
            }
        }
        int[] arr1=new int[m];
        int[] arr2=new int[l];
        int temp=0;
        int temp1=0;
        for(int k=0;k<n;)
        {
            if(arr[k]<0)
            {
                
                arr1[temp]=arr[k];
                k++;
                temp++;
            }
            if(arr[k]>0)
            {
                arr2[temp1]=arr[k];
                k++;
                temp1++;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1[arr1.length-1]);
        System.out.println(arr2[0]);
    }
}
