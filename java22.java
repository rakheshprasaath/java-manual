class java22
{
int id;
String name,city;
java22(int id,String name)
{
this.id=id;
this.name=name;
}
java22(int id,String name,String city)
{
this(id,name);
this.city=city;
}
void display()
{
System.out.println(id+" "+name+" "+city);
}
public static void main(String args[])
{
java22 j1=new java22(111,"karan");
java22 j2=new java22(222,"aryan","kumabakonam");
j1.display();
j2.display();
}
}
 