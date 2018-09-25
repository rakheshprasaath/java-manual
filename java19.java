class java19
{
int id;
String name;
java19(int id,String name)
{
id=id;
name =name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
java19 s1=new java19(111,"karan");
java19 s2=new java19(222,"aryan");
s1.display();
s2.display();
}
}
