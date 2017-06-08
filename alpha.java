import java.util.*;
import java.util.Scanner;
class alpha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.next().charAt(0);
        if(Character.isLetter(c))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
