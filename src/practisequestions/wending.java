package practisequestions;

import java.util.Scanner;

public class wending {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int customer_your_due = 10;

		System.out.println("one bottle is 10 Dollars and your due is " + customer_your_due);

		while (customer_your_due > 0) {

			System.out.println("customer please insert the 5 or 2 coin :");

			int coin = scanner.nextInt();

			if (coin != 5 && coin != 2) {

				System.out.println("customer please insert proper coin");

			}
			else {
				customer_your_due=customer_your_due-coin;
			}

		}
		
		int customer_you_will_recieve = - customer_your_due;
		System.out.println("customer please take coke bottale and balance you recieve is "+customer_you_will_recieve);

	}

}
