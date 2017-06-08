import java.util.*;
class leap
{
    public static void main(String args[])
    {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if((year%4)==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Non-leap year");
        }
    }
}
