//sper to invoke parent method
	class Person{  
	void message(){System.out.println("welcome");}  
	}  
	  
	class java35 extends Person{  
	void message(){System.out.println("welcome to java");}  
	  
	void display(){  
	message();//will invoke current class message() method  
super.message();//will invoke parent class message() method  
	}  
	  
	public static void main(String args[]){  
	java35 s=new java35();  
	s.display();  
	}  
	}  
