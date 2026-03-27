package Week7;

import java.io.*;
import java.util.*;

public class DataProcessor
{
    public static void main(String[] args) 
    {
        double sum = 0;
        int count = 0;

        try 
        {
            FileInputStream fis = new FileInputStream("W7P1.txt");
            Scanner sc = new Scanner(fis);

            while (sc.hasNext()) 
            {
                try 
                {
                    double number = sc.nextDouble();
                    sum += number;
                    count++;
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Invalid data found in file. Skipping...");
                    sc.next();
                }
            }

            sc.close();
            fis.close();

            double average = sum / count;
            
            File fileout=new File("W7Out.txt");
        	if(!fileout.exists())
        		fileout.createNewFile();
        	
            FileOutputStream fos = new FileOutputStream(fileout);
            PrintWriter pw = new PrintWriter(fos);

            pw.println("Average = " + average);

            pw.close();
            fos.close();

            System.out.println("Average calculated and written to W7Out.txt");

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Input file not found.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error while handling file.");
        }

    }
}