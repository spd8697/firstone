class Student
{
int sno;
String sname;
void display()
{
System.out.println("Student Details:-");
}
}
class StudentDemo
{
public static void main(String[] args)
{
Student s=new Student();
s.display();
s.sno=8;
s.sname="Spandana Nannapaneni";
System.out.println(s.sno);
System.out.println(s.sname);
}
}
