import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
            if(arr[i]==s){
            System.out.print("True");
                return;
            }
        System.out.print("False");
    }
}