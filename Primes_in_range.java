import java.util.Scanner;
class Prime
{
    public static boolean isprime(int n)
    {
        int flag=0;
        for(int i=2;i*i<=n;i++)
        {
           if(n%i==0)
           {
               flag=1;
               break;
           }
        }
        if (flag==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,c=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for (int i=m;i<=n;i++)
        {
            if(isprime(i) & i!=1 & i!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}