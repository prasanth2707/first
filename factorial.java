import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int res=1;
        int num=sc.nextInt();
        while(num>0)
        {
            res=res*num;
            num--;
        }
        System.out.print(res);
    }
}
