import java.util.Scanner;
class pasitive
 {
  public static void main(String[] args)
  {
    int a;
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   if(a>0)
  {
    System.out.println("Positive");

  }
  else if(a==0)
  {
    System.out.println("zero");
  }
  else 
  {
System.out.println(" Negative");
  }
  
  }
}