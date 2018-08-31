class lab15
{
int id;
String name;
lab15(int i,String n)
{
 id = i;
 name= n;
}
lab15(lab15 a)
{
 id = a.id;
 name= a.name;
}

void display(){System.out.println(id+" "+name);}
public static void main(String args[])
{
 lab15 a=new lab15(111,"karan");
 lab15 b=new lab15(a);
 a.display();
 b.display();

}

}