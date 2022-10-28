import java.util.Scanner;
class Amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ns=0,ms=0;
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<(m/2)+1;i++)
        {
            if(m%i==0)
            {
               ns+=i;
            }
        }
        for(int j=1;j<(n/2)+1;j++)
        {
            if(n%j==0)
            {
               ms+=j;
            }
        }
        if(ns==n & ms==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}