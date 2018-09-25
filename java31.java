//method overloading
        class Vehicle{  
	void run(){System.out.println("Vehicle is running");}  
	}  
	class java31 extends Vehicle{  
	void run(){System.out.println("Bike is running safely");}  
	  
	public static void main(String args[]){  
	java31 obj = new java31();  
	obj.run();  
	}  
        }