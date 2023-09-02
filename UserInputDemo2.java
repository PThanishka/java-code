import java.util.Scanner;
class UserInputDemo2
{
 public static void main(String[] args)
 {
  Scanner scan =new Scanner (System.in);
  System.out.print("enter a number for add=");
  int a=scan.nextInt();
  System.out.print("enter another number for add=");
  int b=scan.nextInt();
  System.out.println("add="+(a+b));

  System.out.print("enter a number for add of real number=");
  float d=scan.nextFloat();
  System.out.print("enter another number for add of real number=");
  float e=scan.nextFloat();
  System.out.println("add of real number="+(d+e));
 
  System.out.print("enter your age=");
  int age=scan.nextInt();
  System.out.println("age="+age);

  System.out.print("enter your name=");
  //String name =scan.next();
  scan.nextLine();
  String name=scan.nextLine();
  System.out.println("your name="+name);
  }
}