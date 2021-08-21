package Project;

import java.util.Scanner;

public class mainFlow implements encNdDec {

	static int range = (20 - 5) + 1; 				// range = (max - min) + 1
	static int random = (int) ((Math.random() * range) + 5);		// random no = (random * range) + min value

	public void haveKey() {			// For existing users

		Scanner input = new Scanner(System.in);

		System.out.print("\nPlease enter your secret Key: ");
		int userKey = input.nextInt();

		while (true) {

			System.out.print("\nPress 1 for Encoding, 2 for Decoding or 0 to Exit: ");

			String check = input.next();

			if (check.equals("0")) {
				System.out.println("\n***Program terminated***");
				break;
			}

			while (!(check.equals("1") || check.equals("2") || check.equals("0"))) {
				System.out.print("Invalid response => Please Press 1 for Encoding, 2 for Decoding or 0 to Exit: ");
				check = input.next();
			}

			if (check.equals("0")) {
				System.out.println("\n***Program terminated***");
				break;
			}

			input.nextLine();
			System.out.print("\nEnter your message: ");
			String message = input.nextLine();
			System.out.println();

			if (check.equals("1"))
				encodeMessageUsingKey(message, userKey);

			else if (check.equals("2"))
				decodeMessageUsingKey(message, userKey);
		}
		input.close();
	}

	public void noKey() {			// For new users

		Scanner input = new Scanner(System.in);

		System.out.println(
				"\nYour secret Key is: " + random + "\nWARNING: Please always remember your secret Key for future!");

		while (true) {

			System.out.print("\nPress 1 for Encoding, 2 for Decoding or 0 to Exit: ");
			String check = input.next();

			if (check.equals("0")) {
				System.out.println("\n***Program terminated***");
				break;
			}

			while (!(check.equals("1") || check.equals("2") || check.equals("0"))) {
				System.out.print("Invalid response => Please Press 1 for Encoding, 2 for Decoding or 0 to Exit: ");
				check = input.next();
			}

			if (check.equals("0")) {
				System.out.println("\n***Program terminated***");
				break;
			}

			input.nextLine();
			System.out.print("\nEnter your message: ");
			String message = input.nextLine();
			System.out.println();

			if (check.equals("1"))
				encodeMessage(message);

			else if (check.equals("2"))
				decodeMessage(message);
		}

		input.close();
	}

	private void encodeMessage(String message) {

		System.out.print("Your Encrypted message is: ");
		for (int i = 0; i < message.length(); i++) {
			char msg = message.charAt(i);
			System.out.print((char) (msg - random));
		}
		System.out.println("\n___________________________________\n\n");
	}

	private void decodeMessage(String message) {

		System.out.print("Your Decrypted message is: ");
		for (int i = 0; i < message.length(); i++) {
			char msg = message.charAt(i);
			System.out.print((char) (msg + random));
		}
		System.out.println("\n___________________________________\n\n");
	}

	private void encodeMessageUsingKey(String message, int userKey) {

		System.out.print("Your Encrypted message is: ");
		for (int i = 0; i < message.length(); i++) {
			char msg = message.charAt(i);
			System.out.print((char) (msg - userKey));
		}
		System.out.println("\n___________________________________\n\n");
	}

	private void decodeMessageUsingKey(String message, int userKey) {

		System.out.print("Your Decrypted message is: ");
		for (int i = 0; i < message.length(); i++) {
			char msg = message.charAt(i);
			System.out.print((char) (msg + userKey));
		}
		System.out.println("\n___________________________________\n\n");
	}

}