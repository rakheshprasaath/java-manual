//this keyword can be passed as argument in the constructor call	
class B{  
java25 obj;  
 B(java25 obj){  
 this.obj=obj;  
	  }  
     void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  
	  
     class java25{  
	  int data=10;  
	  java25(){  
	   B b=new B(this);  
	   b.display();  
          }  
	  public static void main(String args[]){  
	   java25 a=new java25();  
	  }  
	}  
