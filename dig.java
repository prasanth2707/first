import java.util.*;
class dig
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int flag=0;
        char ch[]=num.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
         if(Character.isDigit(ch[i]))
         {
             flag++;
         }
        }
        System.out.print(flag);
    }
}
