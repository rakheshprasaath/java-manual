//aggregation
       class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
	}  
	  
	class java29{  
	 Operation op;//aggregation  
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new Operation();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	 public static void main(String args[]){  
	   java29 c=new java29();  
	   double result=c.area(5);  
	   System.out.println(result);  
	 }  
	}  
