import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=new char[str.length()];
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
