import java.util.Scanner;
class vowle
{
  public static void main(String[] args)
   {
   Scanner s=new Scanner(System.in);
   char a;
    a=s.next().charAt(0);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    {
    System.out.println("vowle");
    }
    else if((a>='a'&& a<='z')||(a>='A'&& a<='Z'))
    {
     System.out.println("no");
    }
    else
    {
      System.out.println("invalid");
    }
   }
}