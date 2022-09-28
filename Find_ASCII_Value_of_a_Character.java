import java.util.Scanner;
class AlphabetASCIIValue 
{
   public static void main(String[] args) 
   {
      char ch ;
      int value ;
      Scanner scan = new Scanner(System.in);
      ch = scan.next().charAt(0);
      value = ch;
      System.out.println(value);
      scan.close();
     }
 }