package Week8;
import java.util.Scanner;
public class NullPointerExceptionHandling {
	public void verOne(String str) {
		System.out.println(str.length());
	}
	public void verTwo(String str) {
		if (str != null)
			System.out.println("Lnegth is:" + str.length());
		else
			System.out.println("No Output(No Exception)");
	}
	public void verThree(String str) {
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Caught Null Pointer Exception");
		}
	}
	public static void main(String[] args) {
		NullPointerExceptionHandling obj = new NullPointerExceptionHandling();
		Scanner sc = new Scanner(System.in);
		System.out.println("======Program starts here======");
		String str = null;
		try {
			obj.verOne(str);
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			obj.verTwo(str);
			obj.verThree(str);
		}
		sc.close();
	}
}
