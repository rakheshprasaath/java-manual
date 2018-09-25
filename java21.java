class java21
{
int id;
String name;
java21()
{
System.out.println("default constructor");
}

java21(int id,String name)
{
this();
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
java21 j1=new java21(111,"karan");
java21 j2=new java21(222,"aryan");
j1.display();
j2.display();
}
}
 