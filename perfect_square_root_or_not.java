import java.util.Scanner;
class square_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(i*i==n)
            {
                System.out.println("True");
                n=-1;
                break;
            }
        }
        if(n!=-1)
        {
            System.out.println("False");
        }
    }
}