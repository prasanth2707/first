import java.util.*;
class natural
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long sum=0;
        for(int i=1;i<99999;i++)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
}
