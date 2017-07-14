import java.util.*;
class work
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        boolean res=Working(day);
        System.out.print(res);
    }
    public static boolean Working(String str)
    {
        if(str=="Sunday"||str=="Saturday")
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
