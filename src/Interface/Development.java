package Interface;

public class Development implements BankClient,Client{
	
	public static void main(String[]args){
Development d= new Development();
d.creditcard();
d.checkBalance();
d.transferAmount();
	
//we can also create object of Bankclient also
	BankClient b= new Development();
	b.showbalance();
	
	Client c=new Development();
	c.investment();
	
}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("creditcard implementation done");
		
	}

	@Override
	public void transferAmount() {
		// TODO Auto-generated method stub
		System.out.println("transferAmount implementation done");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("checkBalance implementation done");
		
	}
	//we can add extra method by own but have to create method in parent class
	public void showbalance(){
		System.out.println("showbalance implementation done");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment implimentation done");
		
	}

	
		
	}
	


