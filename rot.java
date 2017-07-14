import java.util.*;
class rot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        Collections.rotate(al,k);
        System.out.print(Arrays.toString(al.toArray()));
    }
}
