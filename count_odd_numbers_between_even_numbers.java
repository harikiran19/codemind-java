import java.util.Scanner;
class Even_btw_even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]%2!=0 && arr[i-1]%2==0 && arr[i+1]%2==0)
                c++;
        }
        System.out.print(c);
    }
}