import java.util.Scanner;
class alphabet
{
  public static void main(String[] args) 
 {
    Scanner s=new Scanner(System.in);
   char a;
   a=s.next().charAt(0);
   System.out.println();
   if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
    {
  System.out.println("ALPHABET");
    }
   else
     {
      System.out.println("NO");

     }
  }
}
