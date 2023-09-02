class PostDecrementDemo
{
 public static void main(String[] args)
 {
  {
  int a=10;
  a--;
  System.out.println(a);
  }
   {
    int a=10,b;
    b= a-- + a--;
    System.out.println(a);
    System.out.println(b);
    b= a-- + a-- + a-- + a--;
    }
 }
}
