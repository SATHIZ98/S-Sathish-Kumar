 import java.util.Scanner;
 class leapyear
 {
  public static void main(String[] args) {
             Scanner s=new Scanner(System.in);
             int a;
              a=s.nextInt();
             if(a%4==0)
              {
               System.out.println("leap year");
              }
         else
      {
      System.out.println("not");  
      }  
  }
}