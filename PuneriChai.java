class PuneriChai
{
 static void makeChai()
 {
  System.out.println("Bill for masala Chai=10");
 }
 static void makeChai(int quantity)
 { 
 System.out.println("Bill for masala Chai=" +(quantity*10)); 
 }
 public static void main(String[] args)
 {
  makeChai();
  makeChai(2);
 }
}