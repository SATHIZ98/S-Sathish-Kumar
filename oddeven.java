import java.util.Scanner;
class oddeven
{
  public static void main(String[] args)
   {
   Scanner s=new Scanner(System.in);
   int a;
    a=s.nextInt();
   if(a%2==0)
   {
    System.out.println("even");
   }
    else if(a<0)
    {
      System.out.println("invalid");
    }
    else{
      System.out.println("odd");
    }
  }
  }
