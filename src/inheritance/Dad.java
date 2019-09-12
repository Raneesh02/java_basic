package inheritance;

import java.util.concurrent.SynchronousQueue;

public class Dad extends Base{
	
	public void Display(){
		System.out.println("Parent");
		
	}
	
	public static void main (String args[]){
		Try d=new Try();
		d.Display();
		d.Display("fewi");
		Dad d1=new Dad();
		d1.fun();
		
	}
		public void city()
		{
		System.out.println("mulund");
		}
		public void state()
		{
		System.out.println("mumbai");
		
		
		
	}

}

//An abstract class without any abstract method 
abstract class Base {    
 void fun() { System.out.println("Base fun() called"); } 
} 


class Try extends Dad{
	
	
	public void Display(String s){
		System.out.println("Child");
	}
	
	public void Done(){
		System.out.println("Done");
	}
	
}
