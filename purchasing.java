
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        System.out.println("enter amount betwen 0 to 50000 =");
        int a =s.nextInt();
        if(5000>=a)
        System.out.println("collect money even for cover by give");
         else if(a>5000)
        System.out.println("free backpck");
         else if(a>=10000)
        System.out.println("free travel bag");
         else if(a>=20000)
        System.out.println("free backpck");
         else
        System.out.println("worng amount");
  }
}