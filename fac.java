
import java.util.Scanner;
public class fac 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String num=sc.nextLine();
    String[] str=new String[num.length()];
    int fa=1;
    int i;
    for(i=0;i<num.length();i++)
    {
        int temp=Integer.parseInt(str[i]);
        fa=fa*temp;
    }
    System.out.print(fa);
    }
}
