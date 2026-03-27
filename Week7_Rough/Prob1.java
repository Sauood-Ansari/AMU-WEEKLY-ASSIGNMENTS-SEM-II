package Week7;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Prob1 {

	public static void main(String[] args) {
		File read = new File("W7P1.txt");
		File write = new File("W7Out.txt");
		PrintWriter print = null;
		Scanner sc = null;
		
		if (!read.exists()) {
			System.out.println("File no found!!");
			System.exit(0);
		}
		
		try {
			int sum = 0, count = 0;

			print = new PrintWriter(write);
			sc = new Scanner(read);
			String command = sc.next();
			if (command.equals("Average")) {
				while (sc.hasNext()) {
					sum += sc.nextInt();
					count++;
				}
			}
			double avg = (double) sum / count;
			print.println("================================================");
			print.println("Problem 1");
			print.println("Average is: " + avg);
		} catch (Exception e) {
			System.out.println("Some error occured: \n" + e);
		}
		print.flush();
		print.close();
		sc.close();

	}

}
