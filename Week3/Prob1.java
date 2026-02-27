package Week3;
import java.util.Scanner;

public class Prob1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        int first = 0, second = 1;
        int count = 1;

        if (m <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            do {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;

                count++;
            } while (count <= m);
        }

        sc.close();
    }
}