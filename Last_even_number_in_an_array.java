import java.util.Scanner;
class Last_odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--)
            if(arr[i]%2==0){
            System.out.print(arr[i]);
                break;
            }
    }
}