class SoapApp
{
 public static void main(String[] args)
 {
  Soap s1 = new Soap();
  s1.id=856789933;
  s1.category="Bathing soap";
  s1.price=40;
  System.out.println("id="+s1.id);
  System.out.println("category="+s1.category);
  System.out.println("price="+s1.price);
  s1.manufactured();
  s1.sold();
  s1.shipped();
  }
}


