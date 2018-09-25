//with out super keyword
	class Vehicle{  
	  int speed=50;  
	}  
	class java32 extends Vehicle{  
	  int speed=100;  
	  void display(){  
	   System.out.println(speed);//will print speed of Bike   
  }  
	  public static void main(String args[]){  
	   java32 b=new java32();  
	   b.display();  
	}  
	}  
