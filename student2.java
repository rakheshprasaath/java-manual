class student2
{
int rollno;
String name;
void insertrecord(int r,String n)
{
 rollno=r;
 name=n;
}

void displayinformation()
{
 System.out.println(rollno+" "+name);
}

public static void main(String args[])
{
 student2 s1=new student2();
 student2 s2=new student2();
 s1.insertrecord(111,"karan");
 s2.insertrecord(222,"aryan");
 s1.displayinformation();
 s2.displayinformation();
 }
}
