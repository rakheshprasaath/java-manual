//multiple in heritance
	interface Printable{  
	void print();  
	}  
	interface Showable{  
	void print();  
	}  
	  
	class java49 implements Printable,Showable{  
	public void print(){System.out.println("Hello");}  
	public static void main(String args[]){  
	java49 obj = new java49();  
	obj.print();  
	 }  
	}  
