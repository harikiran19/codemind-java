import java.util.*;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        
    }
}