package Week7;

import java.io.*;
import java.util.*;



public class DataValidation
{
	
	
    public List<Double> Validate() throws FileNotFoundException,IOException,IllegalArgumentException
    {
       
    	ArrayList<Double> arr=new ArrayList<>();

      
            FileInputStream fis = new FileInputStream("W7P2.txt");
            Scanner sc = new Scanner(fis);
            
          
            
            while (sc.hasNext()) 
            {
                try
                {
                    double number = sc.nextDouble();
                    arr.add(number);
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Found Invalid data: "+sc.next());
                }
                
            }
            sc.close();
         

        //System.out.println("Valid data are: "+arr);
        return arr;
    }
    
   
}