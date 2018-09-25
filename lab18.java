//program of changing common property
class lab18{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="BBDIT";
}
lab18(int r, String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
lab18 s1=new lab18(111,"karan");
lab18 s2=new lab18(111,"arjun");
lab18 s3=new lab18(111,"sonoo");

s1.display();
s2.display();
s3.display();
}
}