import java.util.Scanner;
class aoc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double a;
        r=sc.nextInt();
        a=3.14*r*r;
        System.out.format("%.2f",a);
    }
}