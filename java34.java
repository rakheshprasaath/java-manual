//super invoke parrent constructor
	class Vehicle{  
	  Vehicle(){System.out.println("Vehicle is created");}  
	}  
	  
	class java34 extends Vehicle{  
	  java34(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is created");  
	  }  
  public static void main(String args[]){  
	   java34 b=new java34();  
	        
	}  
	}  
