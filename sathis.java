import java.util.Scanner;
class Main {
  public static void main(String[] args) {

Scanner se=new Scanner(System.in);
System.out.println("Enter A value: ");
int A=se.nextInt();
System.out.println("Enter B value: ");
int B=se.nextInt();
int C;
System.out.println("Enter operator  (+, -, *, /): ");
char operator=se.next().charAt(0);


switch(operator)
{
 case '+':
 C = A + B;
  System.out.println("output+: "+C);
break;

  case '-':
  C = A - B;
  System.out.println("output+: "+C);
  break;
  case '*':
  C = A * B;
  System.out.println("output+: "+C);
  break;
  default:
  if(B==0)
  {
   System.out.println("infinity");
  }
  else
    {
    C=A / B;
            System.out.println("output+: "+C);
          } 
     }
    }
    }