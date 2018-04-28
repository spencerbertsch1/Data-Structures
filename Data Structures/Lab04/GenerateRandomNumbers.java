//G. Turner helped me with this program. 

import java.io.*;
import java.util.*;

public class GenerateRandomNumbers {

	public static void writeFile(String outFileName, ArrayList<Integer> nums)
	{
		PrintWriter pw;

		try
		{
			pw = new PrintWriter(new FileOutputStream(outFileName, false));
			
			for(int i = 0; i < nums.size(); i++)
			{
				pw.println(nums.get(i));
			}
			pw.close();
		}
		catch (IOException ioe)
		{
			
		}
	}
	
	

	public static void main(String[] args) {

		//create 20,000 random integers between 1 and 1,000,000
		ArrayList<Integer> nums =  new ArrayList<Integer>(20000); //!!!change array size to 20000 once file writing is correct!!!
		
		// populate nums with random #s between 1 and one million 
		for (int i=0; i<20000; i++)
		{
			int x = (int)(Math.random()*1000000)+1; 
			nums.add(new Integer(x)); 
		}
	
		System.out.println(nums);
		
		//Export data to a file named: "randomNumbers.txt"
				writeFile(args[0], nums);
	
	
	}
	
		
	}
