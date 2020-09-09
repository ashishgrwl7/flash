package test;

import java.io.*;
class Parent{
	  static int v=0;
	  int r=0;
	  String msg(){ 
		  v= 10;
		  r= 13;
		  System.out.println("parent msg" +v);
		  System.out.println("parent msgr "+r);
		  return null;
  }
	  Parent(){
		  System.out.println("parent constructor");
	  }
	  static{

		  v=80;
		  System.out.println("static block "+v);
	  }
	  static{

		  v=70;
		  System.out.println("another static block "+v);
	  }
	 {

		  v=100;
		  r = 1000;
		  System.out.println("instance block "+v+" "+r);
	  }
	 {

		  v=110;
		  r=455;
		  System.out.println("instance block "+v+" "+r);
	  }
	  static void msgr(){
	  v= 20;
	  //r=23;
	  System.out.println("parent msgr "+v);
	  //System.out.println("parent msgr "+r);
  }
}

class TestExceptionChild extends Parent{
	 {
		 r = 67;
		  v=100;
		  System.out.println("instance block child "+v+" "+r);
	  }
	 {
		 r=88;
		  v=20;
		  System.out.println("another instance block child "+v+" "+r);
	  }
	  static{

		  v=770;
		  System.out.println("static block "+v);
	  }
	TestExceptionChild(){
		System.out.println("child cpnstructor");
	}
  String msg()throws ArrayIndexOutOfBoundsException{
    System.out.println("TestExceptionChild");
	return null;
  }
  void b(){
	  System.out.println("i am in b");
  }
  public static void main(String args[]){
   Parent p=new TestExceptionChild();
   p.msg();
   p.msgr();
   //p.b();
  }
}

