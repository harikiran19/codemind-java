import java.util.Scanner;
class Voc
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='A' ||ch=='e' || ch=='E' || ch=='i'
        || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}