class CarApp
{
 public static void main(String[] args)
 {
  Car c1=new Car();
  c1.price=1000000;
  c1.manufacture="Ford";
  c1.model="Maruti";
  System.out.println("price="+ c1.price);
  System.out.println("manufacture="+ c1.manufacture);
  System.out.println("model="+ c1.model);
  c1.drive();
  c1.hork();
  }
}