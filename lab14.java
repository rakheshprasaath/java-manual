class lab14
{
int id;
String name;
int age;
lab14(int i,String n)
{
 id =i;
 name=n;
}
lab14(int i,String n, int a)
{
 id =i;
 name=n;
 age=a;
}

void display(){System.out.println(id+" "+name+" "+age);}
public static void main(String args[])
{
lab14 a=new lab14(111,"karan");
 lab14 b=new lab14(222,"aryan",25);
 a.display();
 b.display();
}
}