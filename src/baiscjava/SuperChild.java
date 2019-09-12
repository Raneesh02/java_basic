package baiscjava;

public class SuperChild extends SuperParent {
	
	String s="kishan";
	
	public SuperChild()
	{
	super();                      //when super is used will be in the first line of the child constructor 
	System.out.println("child constructor");
	}
	public void getStringdata()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
		//public void getData()
		{
	   // super.getData();
		System.out.println("over rided in child");////overrided
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc=new SuperChild();
     	sc.getStringdata();
     	sc.getData();
		
	}

}
