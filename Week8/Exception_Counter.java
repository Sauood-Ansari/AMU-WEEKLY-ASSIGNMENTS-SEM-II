package Week8;
import java.io.FileInputStream;
import java.util.Scanner;

public class Exception_Counter {
	public static int temp = 0;

	public static void main(String[] args) {

		try {
			String path="F:\\25CAMSA151\\Java\\src\\Week7\\DataProcessor.java";
			FileInputStream fis = new FileInputStream(path);
			Scanner sc = new Scanner(fis);
			while(sc.hasNext())
			{
				String s=sc.next();
				if(s.equals("catch")|| s.equals("throw"))
				{
					temp++;
				}
			}

			System.out.println("Total Exception: " + temp);
			sc.close();
			fis.close();
			

		} catch (Exception e) {
			System.out.println("Some Exception Occured: "+e.getMessage());
		}

	}

}
