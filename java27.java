//IS-A relationship
	class Employee{  
	 float salary=40000;  
	}  
	class java27 extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   java27 p=new java27();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  
