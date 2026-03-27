package Week7;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Prob2 {

	public static void main(String[] args) {
		File read = new File("W7P2.txt");
		File write = new File("W7Out.txt");
		PrintWriter print = null;
		Scanner sc = null;

		if (!read.exists()) {
			System.out.println("File no found!!");
			System.exit(0);
		}
		ArrayList<Double> valid = new ArrayList<>();

		try {
			print = new PrintWriter(write);
			sc = new Scanner(read);

			print.println("================================================");
			print.println("Problem 2");

			String command = sc.next();
			if (command.equals("Validation")) {
				while (sc.hasNext()) {
					try {
						double num=Double.parseDouble(sc.next());
						valid.add(num);
					}
					catch(NumberFormatException e){
						print.println("Exception: "+e.getMessage());
						
					}

				}

			}
			print.println("\nValid values: " + valid);
		} catch (Exception e) {
			System.out.println("Some error occured: \n" + e.getMessage());
		}
		print.flush();
		print.close();
		sc.close();

	}

}
