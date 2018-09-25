//abstract method
	abstract class Bike{  
	  abstract void run();  
	}  
	  
	class java46 extends Bike{  
        void run(){System.out.println("running safely..");}  
	  
	public static void main(String args[]){  
	 Bike obj = new java46();  
	 obj.run();  
	}  
	}  
