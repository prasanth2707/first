import java.util.*;
class large
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        if((i>j)&&(i>k))
        {
            System.out.println("first num is greatest");
        }
        else if(j>k)
        {
            System.out.println("second num is greater");
        }
        else
        {
            System.out.println("third num is greater");
        }
    }
}
