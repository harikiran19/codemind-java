import java.util.Scanner;
class Dc
{
    public static void main(String args[])
    {
        int t,s,b,c;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=(t*s*b*512*2);
        System.out.println(c);
    }
}