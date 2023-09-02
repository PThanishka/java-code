class PenApp
{
 public static void main(String[] args)
 {
  Pen s1 = new Pen();
  s1.id=678443210;
  s1.category="Blue pen";
  s1.price="5Rs/per pen";
  System.out.println("id="+s1.id);
  System.out.println("category="+s1.category);
  System.out.println("price="+s1.price);
  s1.manufactured();
  s1.brought();
  s1.shipped();
  }
}

