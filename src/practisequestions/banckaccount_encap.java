package practisequestions;

public class banckaccount_encap {

	private String account_num;

	private double balance;

	public banckaccount_encap(String account_num, double balance) {

		this.account_num = account_num;
		this.balance = balance;

	}

	public String getaccount_num() {

		return this.account_num;

	}

	public void setaccount_num(String Account_number_by_customer) {

		this.account_num = Account_number_by_customer;

	}

	public double getbalance() {

		return this.balance;

	}

	public void depositammount(double depositingamount) {

		balance = balance + depositingamount;

	}

	public void withdrawamount(double withdrawamount) {

		// int counter = 0;

		System.out.println("please check your balance with getbalance method  ");

		for (int counter = 0; counter <= 3; counter++) {

			if (balance >=withdrawamount) {

				balance = balance - withdrawamount;
				break;

			} else {

				System.out.println("hey you dont have proper balance please depsoit via set balance method");
				
				counter++;

				if (counter > 3) {

					System.out.println("Maximum trails done for the day ");
					break;
				}

			}
		}

	}

}