package practisequestions;

public class backcustomer {

	public static void main(String[] args) {
		banckaccount_encap b=new banckaccount_encap("Abcd1234",9000);
		double balancerecieved=b.getbalance();
		System.out.println(balancerecieved);
		
		b.withdrawamount(2000);
		
		double balancerecieved_2=b.getbalance();
		System.out.println(balancerecieved_2);
		
		b.depositammount(3000);
		
		double balancerecieved_3=b.getbalance();
		
		System.out.println(balancerecieved_3);
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}
