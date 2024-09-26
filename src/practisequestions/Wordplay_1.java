package practisequestions;

public class Wordplay_1 {

	static String word = "how are you";// woh are you

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = word.split(" ");

		String new_word = "";

		for (int i = 0; i < arr.length; i++) {

			String alpha = arr[i];

			for (int j = alpha.length() - 1; j >= 0; j--) {

				new_word = new_word + alpha.charAt(j);

			}

			new_word = new_word + " ";

		}

		System.out.print(new_word);

	}

}

//stringbuilder build = new stringbuilder(alpha);
//bulid.reverse();
