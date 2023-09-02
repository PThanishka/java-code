class DisneyBakery
{
 static void makeChai()
 {
  System.out.println("Bill for normal Chai = 10");
  }
  static void makeChai(int quantity)
  {
   System.out.println("Bill for normal chai =" +(quantity*10));
   }
  static void makeChai(String flavour)
  {
  System.out.println("Bill for "+ flavour + "Chai=15");
  }
  static void makeChai(String flavour,int quantity)
  {
   System.out.println("Bill for "+flavour+" Chai = " +(quantity*15));
  }
  public static void main(String[] args)
  { 
   makeChai();
   makeChai("green",6);
   }
}