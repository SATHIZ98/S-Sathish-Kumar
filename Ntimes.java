import java.util.Scanner;
class Ntimes {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a,i,b=0;
    a=s.nextInt();
    for(i=0;i<=a;i++)
    {
      b=b+i;
    }
    System.out.println(b);
  }
}