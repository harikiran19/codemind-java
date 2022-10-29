import java.util.Scanner;
class spy_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sn=0,pn=1,ed;
        while(n!=0)
        {
            ed=n%10;
            sn+=ed;
            pn*=ed;
            n/=10;
        }
        if(sn==pn)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}