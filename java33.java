//with superkeyword
	class Vehicle{  
	  int speed=50;  
	}  
	  
	class java33 extends Vehicle{  
	  int speed=100;  
	      
void display(){  
  System.out.println(super.speed);//will print speed of Vehicle now  
	  }  
	  public static void main(String args[]){  
	   java33 b=new java33();  
	   b.display();  
	     
	}  
	}  
