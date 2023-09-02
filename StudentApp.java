class StudentApp
{
 public static void main(String[] args)
 {
 Student s1=new Student();
 s1.id=1234;
 s1.name="thani";
 s1.branch="ECE";
 System.out.println("id="+s1.id);
 System.out.println("name="+s1.name);
 System.out.println("branch="+s1.branch);
 s1.eat();
 s1.sleep();
 s1.study(); 
 }
}