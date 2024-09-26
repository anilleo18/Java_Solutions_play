package practisequestions;


import java.util.Scanner;

public class Coin_coke {

	

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int due = 10;
        Scanner scanner = new Scanner(System.in);
 
        while (due > 0) {
            System.out.println("Amount Due: " + due);
            System.out.print("Insert 2 Rupee or 5 rupee coin: ");
            int coin = scanner.nextInt();
 
            if (coin != 2 && coin != 5) {
                System.out.println("Invalid coin");
            } else {
                due -= coin;
            }
        }
 
        int change = -due;
       System.out.println("Change Owed: " + change);
       
       
       
       
       


	}
			
			
			
			
			
			
			
			
			
			
			
			
	
	

}
