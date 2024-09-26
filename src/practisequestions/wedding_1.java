package practisequestions;

import java.util.Scanner;

public class wedding_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int balance = 10;

		Scanner scan = new Scanner(System.in);

		while (balance > 0) {
			
			System.out.println("Hey please drop exact coins which are 5 or 2 rupees : ");


			int amount_dropped = scan.nextInt();

			if (amount_dropped != 5 && amount_dropped != 2) {

				System.out.println("wrong coin dropped ,please drop 5 or 2 rupees : ");

			} else {

				balance = balance - amount_dropped;
				 
				System.out.println(" remaning amount to get the coke  " + balance);


			}


		}
		
		System.out.println("please take the coke and balance you recieve from machine is : " + (-balance));


	}

}
