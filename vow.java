import java.util.*;
import java.util.Scanner;
class vow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.next().charAt(0);
        if(Character.isLetter(c))
        {
            if((c=='a'||c=='A')||(c=='e'||c=='E')||(c=='i'||c=='I')||(c=='o'||c=='O')||(c=='u'||c=='U'))
            {
            System.out.println("Vowel");
            }
            else
            {
            System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
