import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a,s=0,avg,c=0;
        a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
            s+=arr[i];
        }
        avg=s/a;
        for(int i=0;i<a;i++)
        {
            if(arr[i]<=(int)avg)
            c+=1;
        }
        System.out.println(c);
    }
}