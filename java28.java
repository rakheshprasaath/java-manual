//multiple inheritance is no supported

	class A{ 
	void msg(){System.out.println("Hello");}  
	}  
	class B{  
	void msg(){System.out.println("Welcome");}  
	}  
       class java28 extends A,B
       {
        //suppose if it were  
	 Public Static void main(String args[]){  
	   java28 obj=new java28();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  
