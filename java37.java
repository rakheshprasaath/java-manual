//final method
	class Bike{  
	  final void run(){System.out.println("running");}  
	}  
     
	class java37 extends Bike{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   java37 honda= new java37();  
	   honda.run();  
	   }  
	}  
