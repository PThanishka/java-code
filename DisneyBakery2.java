class DisneyBakery2
{
 static void makechai()
 {
  System.out.println("bill for normal chai = 10");
  System.out.println("bil for any flavour chai = 15");
  }
    static void makechai(int quantity)
  {
   System.out.println("bill for normal chai =" +(quantity*10));
   }
   static void makechai(String flavour)
   {
    System.out.println("bill for "+ flavour + "chai=15");
    }
   static void makechai(String flavour,int quantity)
   {
    System.out.println("bill for "+ flavour +" chai = "+(quantity*15));
   }
   public static void main(String[] args)
   {
    makechai();
    makechai("normal",3);
    makechai("green",2);
    makechai("choco",5);
    makechai("lemon",6);
    makechai("ginger",1);
    makechai("elachi",3);
    }
}