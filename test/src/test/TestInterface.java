package test;


//A simple program to Test Interface default 
//methods in java 
interface TestInterface 
{ 
 // abstract method 
 public void square(int a); 

 // default method 
 default void show() 
 { 
   System.out.println("Default Method Executed"); 
 } 
} 

class TestClass1 implements TestInterface
{ 
 // implementation of square abstract method 
/* public void square(int a) 
 { 
     System.out.println(a*a); 
 } */
	@Override
	public void show() //default change to public// default giving error
	 { 
	   System.out.println("Default Method of Testclass1 Executed"); 
	 }
	@Override
    public void square(int a){
   	 a = a*a;
		 System.out.println(a);
    }

 public static void main(String args[]) 
 { 
     TestClasses d = new TestClasses(); 
     //anonymous inner class
     /*TestInterface testInterface = new TestInterface(){
    		//@Override
    		public void square(int a){
    			 a = a*a;
    			 System.out.println(a);
    		 }
    		 public void show() 
    		 { 
    		   System.out.println("Default Method of Testclass1 Executed"); 
    		 } 
    	 };*/
     //lambda expression
     //TestInterface testInterface = (k)->{System.out.println(k*k);};
  
     //testInterface.square(4); 

     // default method executed 
     //testInterface.show(); 

 } 
}