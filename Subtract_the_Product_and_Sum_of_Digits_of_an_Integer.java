import java.util.*;
class Product_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int s=0,p=1;
        while(n>0){
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        System.out.print(p-s);
    }
}