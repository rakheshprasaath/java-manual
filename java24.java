class java24
{
void m(java24 j)
{
System.out.println("method is invoked");
}
void n()
{
m(this);
}

public static void main(String args[])
{
java24 j=new java24();
j.n();
}
}
