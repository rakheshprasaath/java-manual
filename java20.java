class java20
{
int id;
String name;
java20(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
java20 j1=new java20(111,"karan");
java20 j2=new java20(222,"aryan");
j1.display();
j2.display();
}
}
 