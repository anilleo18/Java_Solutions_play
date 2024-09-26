package practisequestions;

public class multidimarray {

	static int[][] arr = { { 1, 2, 3 }, { 8, 9 }, { 4, 34, 56, 78 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {

					System.out.println("postion on matix are i: " + i + "=====j:" + j + "and values are :" + arr[i][j]);

				}

			}
		}

	}

}
