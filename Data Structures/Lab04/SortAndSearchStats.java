import java.io.*;
import java.util.*;

public class SortAndSearchStats {

	//create a static variable "count" outside of all methods 
	static int count; 
	
	public static void sort(int list[])
	{ count = 0; 
		for ( int pass = 1; pass < list.length; pass++ )
		{  
			for ( int i = 0; i < (list.length - pass); i++ )
			{count++;
				if ( list[ i ] > list[ i + 1 ] )  
				{     
					swap( list, i, i + 1 );
				} // end if
			} // end inner for loop (i)
		}  // end outer for loop (pass)
		System.out.println("The sort did " + count + " compares for a list of size of 20,000.");
	}
	
	public static void swap( int nums[], int first, int second )
	{
		int hold;
		hold           = nums[ first ];
		nums[ first ]  = nums[ second ];
		nums[ second ] = hold;
	}
	
	public static int linearSearch(int list[], int key)
	{ count = 0; 
	ArrayList<Integer> total_lin_count =  new ArrayList<Integer>();

		for (int i = 0; i < list.length; i++)
		{ count++; 
			if (key == list[i])
			{
				return i;
			}
			
		}
		total_lin_count.add(new Integer(count));
		//System.out.println(total_lin_count);
		
		return -1;
	}

	public static int binarySearch(int list[], int key)
	{ count =0; 
		int startIdx, endIdx, midIdx;
		ArrayList<Integer> total_bin_count =  new ArrayList<Integer>();
		
		startIdx = 0;
		endIdx = list.length - 1;
		
		while (startIdx <= endIdx)
		{count++; 
			midIdx = (startIdx + endIdx) / 2;
			if (key < list[midIdx])
			{
				endIdx = midIdx - 1;
				// don't change startIdx
			}
			else
			{
				if (key > list[midIdx])
				{
					startIdx = midIdx + 1;
					// don't change endIdx
				}
				else
				{
					// found it here
					return midIdx;
				}
			}
		}
		
		total_bin_count.add(new Integer(count));
		System.out.println(total_bin_count);
		
		//find average
		int sum = 0;
		for(int i=0; i<1000; i++){
		    sum += total_bin_count.get(i);
		}
		
		int binary_avg = sum/1000; 
		System.out.println(binary_avg);
		
		return -1;
	}
	

	
	
	
	public static void main(String[] args) {

		int[] list_a = new int[20000];
		int[] list_b = new int[20000]; 
		
		BufferedReader br;
		String line;
		int i = 0;
		//StringTokenizer st; Don't think we need this 
		
                /*
                   A BufferedReader can take in a FileReader object and you
                   end up with an opened file ready to be read by using
                   methods like readLine()
                */
		try
		{
			br = new BufferedReader(new FileReader(args[0]));
			
			while (true)
			{
				line = br.readLine();
				if (line == null) 
					break;
		
				list_a[i] = Integer.parseInt(line);
				list_b[i] = Integer.parseInt(line);
				i++;
			}			
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("File not found");
		}
		catch (IOException ioe)
		{
			System.out.println("we read the whole file by now");
		}
		
		
		//Sort list_a from lowest to highest: 
		sort(list_a); 
		//System.out.println(list_a);
		
		for (int j=0; j<1000; j++)
		{
			int x = (int)(Math.random()*1000000)+1; 
			linearSearch(list_b, x);
			binarySearch(list_a, x);
			
		}
	
		System.out.println("Linear search on average did " + count + " iterations for a list of size of 20,000.");
		//System.out.println("Binary search on average did " + binary_avg + " iterations for a list of size of 20,000.");
	
	}

}
