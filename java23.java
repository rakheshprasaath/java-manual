class java23
{
void m()
{
System.out.println("method is invoked");
}
void n()
{
this.m();
}
void p()
{
n();
}
public static void main(String args[])
{
java23 j=new java23();
j.n();
j.p();
}
}
