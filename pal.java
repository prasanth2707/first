import java.util.*;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        char[] num2=num1.toCharArray();
        char[] num3=new char[num1.length()];int p=0;
        for(int i=num2.length-1;i>=0;i--)
        {
            for(int j=p;j<num2.length;j++)
            {
                num3[j]=num2[i];
                break;
            }
            p+=1;
        }
        for(int i=0;i<num1.length();i++)
        {
            if(num2[i]!=num3[i])
            {
            System.exit(0);
            }
        }
        System.out.print("palindrome");
        /*if(num1.equals(str))
        System.out.print("true");
        else
        System.out.print("false");*/
    }
}
