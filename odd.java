import java.util.*;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int e=sc.nextInt();
        for(int j=i;j<e;j++)
        {
            if(j%2!=0)
            {
                System.out.print(j+" ");
            }
        }
    }
}
