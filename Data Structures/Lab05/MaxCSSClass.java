
public class MaxCSSClass {
	
	public static int count = 0;
	public static int maxCSS_start = 0; 
	public static int maxCSS2count_start = 0; 
	public static int maxCSS3count_start = 0; 
	public static int maxCSS_end = 0; 
	public static int maxCSS2count_end = 0; 
	public static int maxCSS3count_end = 0; 
	
	
	// big O of n-cubed (n*(n+1)*(n+2))/6
	public static int maxCSS(int []seq)
	{
		count = 0;
		int maxSum = 0;
		for (int sIdx = 0; sIdx < seq.length; sIdx++)
		{  
			for (int eIdx = sIdx; eIdx < seq.length; eIdx++)
			{ 
				int sum = 0;
				for (int i=sIdx; i <= eIdx; i++)
				{
					sum += seq[i];
					count++;
					
				}
				
				if (sum > maxSum)
				{
					maxCSS_end = seq[eIdx];
					maxSum = sum;
				}
			}
		}
		
		return maxSum;
	}

	// improved algorithm big O n-squared, (n*(n+1))/2
	public static int maxCSS2(int []seq)
	{
		count = 0;
		int maxSum = 0;
		for (int sIdx = 0; sIdx < seq.length; sIdx++)
		{
			int sum = 0;
			for (int eIdx = sIdx; eIdx < seq.length; eIdx++)
			{
				count++;
				sum += seq[eIdx];

				if (sum > maxSum)
				{
					maxSum = sum;
					maxCSS2count_end = seq[eIdx];
				}
			}
			
		}
		
		return maxSum;
	}
	
	// improved algorithm 
	public static int maxCSS3(int []seq)
	{
		count = 0; 
		int maxSum = 0;
		int sum = 0;
		for (int i = 0; i < seq.length; i++)
		{
			count++;
			sum += seq[i];

			if (sum > maxSum)
			{
				maxSum = sum;
				maxCSS3count_end = seq[i]; 
			}
			
			// if sum ever becomes negative, we start considering
			// sequences only starting at the next element
			if (sum < 0)
			{
				sum = 0;
			}
		}
			
		
		return maxSum;
	}
	
	public static void displaySubsequence( int []seq, int first_index, int end_index ){

		//input is array, first index of subsequence, and last index of subsequence
		for (int i=first_index; i<= end_index; i++){
			System.out.println(seq[i]+" "); // should be indices becasue there could be repeats (use "i" not seq[i]. 
		}
	}
	
	public static void main(String[] args) {
		int [] list = { -2, 11, -4, 13, -50, 10, 20, 60, -70, -5, 2, 5, 6, -3, 9};
		
		int maxCSSValue = maxCSS(list);
		
		System.out.println("The maximum sum of a css is " + maxCSSValue);
		System.out.println("The count = " + count);
		System.out.println("The starting index of the sequence is: " + maxCSS_start);
		System.out.println("The ending index of the sequence is: " + maxCSS_end);
		
		int maxCSSValue2 = maxCSS2(list);
		
		System.out.println("The maximum sum of a css is " + maxCSSValue2);
		System.out.println("The count = " + count);
		System.out.println("The starting index of the sequence is: " + maxCSS2count_start);
		System.out.println("The ending index of the sequence is: " + maxCSS2count_end);

		int maxCSSValue3 = maxCSS3(list);
		
		System.out.println("The maximum sum of a css is " + maxCSSValue3);
		System.out.println("The count = " + count);
		System.out.println("The starting index of the sequence is: " + maxCSS3count_start);
		System.out.println("The ending index of the sequence is: " + maxCSS3count_end);
		
		//call method to display subsequence
		displaySubsequence(list, maxCSS3count_start, maxCSS3count_end);
		
	}

}
