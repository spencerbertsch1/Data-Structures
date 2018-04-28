
public class MoreRecursion {
	
	//tell whether or not there is at least one odd number in the array nums, starting at index stIdx
		public static boolean atLeastOneOdd(int [] nums, int stIdx)
		{
			// base case 1, we are at the end of the list and
			// we never found an odd, so we return false
			if (stIdx == nums.length)
			{
				return false;
			}
			else
			{
				// base case 2, we found an odd
				if (nums[stIdx] % 2 == 1)
				{
					return true;
				}
				else
				{
					//we only do this if nums[stIdx] is even
					return atLeastOneOdd(nums, stIdx + 1);
				}
			}
		}


		// tell whether or not there is at least one odd number in the whole array nums
		public static boolean atLeastOneOdd(int [] nums)
		{
			// tell whether or not there is at least one odd number in the array nums, starting at index 0
			return atLeastOneOdd(nums, 0);
		}

		public static void main(String [] args)
		{

			int list[] = { 4, 8, 7, 6, 2, 12 };
			int list2[] = { 4, 8, 6, 2, 12, 24 };

			if (atLeastOneOdd(list))
			{
				System.out.println("there is at least one odd in the list");
			}
			else
			{
				System.out.println("there are no odds in the list");
			}

			if (atLeastOneOdd(list2))
			{
				System.out.println("there is at least one odd in the list");
			}
			else
			{
				System.out.println("there are no odds in the list");
			}

		}

}
