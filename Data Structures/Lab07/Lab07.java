
public class Lab07 {

	
	public static boolean atLeastOneNegative(int [] nums, int stIdx){
		
		// this is base case 1 which will only happen once (if there are no negatives) 
		//if we go through the whole list and find no negatives, we want to return false:
		if(stIdx == nums.length)
		{
			return false;
		}
		else 
		{
			//base case two, if there is a negative number in the list, so the result is true 
			if (stIdx < 0){
				return true; 
			}
			else{
				return atLeastOneNegative(nums, stIdx +1);
			}
		}
	}
	
	public static boolean atLeastOneNegative(int [] nums){
		return atLeastOneNegative(nums, 0); 
		
	}
	
	public static void main(String [] args)
	{

		int list[] = { 3, 8, -5, 6, 9, 1 };
		int list2[] = { 1, 8, 6, 2, 27, 50 };

		if (atLeastOneNegative(list))
		{
			System.out.println("there is at least one negative in the list");
		}
		else
		{
			System.out.println("there are no negatives in the list");
		}

		
		if (atLeastOneNegative(list2))
		{
			System.out.println("there is at least one negative in the list");
		}
		else
		{
			System.out.println("there are no negatives in the list");
		}

	}

}
