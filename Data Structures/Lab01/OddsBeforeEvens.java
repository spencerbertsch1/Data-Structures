
public class OddsBeforeEvens {

	public static void oddsBeforeEvens(int nums[])
	{
		// you have an array named nums which already has number in it
		  int new_list[] = new int[nums.length];
		  
		  int count = 0; 
		  int index = 1; 
		  //Display original list
			System.out.println("Original list:");
			for (int i=0; i < nums.length; i++)
			{
				System.out.print(nums[i]+" ");
			}
		  
			// this loop goes through 'list' and takes all of the odd values out to put them in a new array
			for (int i=1; i < nums.length; i++)
			{
				if ((nums[i] % 2) == 1 )
				{
					new_list[count] = nums[i];//add this value to next index of new array
				count++;
				} 
			}
		  
			for (int i=1; i < nums.length; i++)
			{
				if ((nums[i] % 2) == 0 )
				{
					new_list[nums.length - index] = nums[i];//add this value to next index of new array
				index++;
				} 
			}
			//Display New List- Hopefully with odds first!
			System.out.println("\nNew List:");
			for (int i=0; i < new_list.length; i++)
			{
				System.out.print(new_list[i]+" ");
			}  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int list[] = {5, 6, 3, 1, 10, 7, 8, 11, 201, 198, 43, 67, 55,54};
		  
		  oddsBeforeEvens(list);

		  
		//  int list2[] = {3, 1, 10, 7, 8, 11, 201, 198, 43, 67, 55,54, 77,87,4,4545454,34,45454};
		  
		 // oddsBeforeEvens(list2);

		//   moveOddsBeforeEvens(list);

		//   System.out.println("\nOdds before evens list:");
		   
	}

}
