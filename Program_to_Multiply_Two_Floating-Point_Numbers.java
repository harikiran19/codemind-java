import java.util.Scanner;
class ptm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,v;
        a=sc.nextFloat();
        b=sc.nextFloat();
        v=a*b;
        System.out.format("%.2f",v);
    }
}