package Project;

import java.util.Scanner;

public class mainProgram {

	public static void main(String[] args) {

		mainFlow run = new mainFlow();

		Scanner input = new Scanner(System.in);

		System.out.print("Do you have the secret Key? (Y/N): ");

		String key = input.next();

		while (!(key.equalsIgnoreCase("Y") || key.equalsIgnoreCase("N"))) {
			System.out.print("Invalid input! Please use Y for YES or N for NO: ");
			key = input.next();
		}

		if (key.equalsIgnoreCase("Y")) {
			run.haveKey();
		}

		else if (key.equalsIgnoreCase("N")) {

			run.noKey();
		}
		input.close();

	}

}
