class lab13
{
int id;
String name;
lab13(int i,String n)
{
 id = i;
 name= n;
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[])
{
 lab13 a=new lab13(111,"karan");
 lab13 b=new lab13(222,"aryan");
 a.display();
 b.display();

}

}