
public class ScoreProgram {

	public static <T extends Comparable<T>> void selectionSort(T[] list){
	
		//Loop through comparable list
		//find the largest element
		//Put the largest element in the last element of the list
		
		//Loop through the comparable list - the last element
		//find the largest element and replace the (length-i) element
		
		//Display Original List
		System.out.println("Original List: " + list);
		
		int maxIndex = 0; 
		
		for (int i=list.length-1; i>0; i--){
			maxIndex = 0; 
			for(int j=0; j<=i; j++){
			
				if (list[j].compareTo(list[maxIndex]) > 0)  
				{
					maxIndex = j; 
				}
			}
//SWITCH VALUES IN LIST
			T temp;
			temp = list[maxIndex];
			list[maxIndex] = list[i]; 
			list[i] = temp;
		}

		//Display Sorted List
		System.out.println("Sorted List: " );
		
	}
	
	//public static void displayList(int studentScores[]){
	//	System.out.println("Student Scores are: " + studentScores);
	//}
	
	
	
	
	public static void main(String[] args) {
		
		String[] words = {"cat","dog","bunny","pig"};
		selectionSort(words);
		for (int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	
		
		/*
		//declare array filled with comparables 
		Integer[] list = {3, 1, 10, 7, 8, 11, 201, 198, 43, 67, 55,54, 77,87,4,4545454,34,45454};
		//int[] studentScores = {5, 10, 15, 20, 25, 30, 35, 40};
		
		selectionSort(list);
		//displayList(studentScores);
		

   	System.out.println(" 1 Add a student and a test score to the list of students / scores.");
   	System.out.println(" 2 Find the score for a particular student.");
   	System.out.println(" 3 Find the student with the maximum score.");
   	System.out.println(" 4 Find the student with the minimum score.");
   	System.out.println(" 5 Display the students sorted by test score.");
   	System.out.println(" 6 Delete a student.");
  	System.out.println(" 7 Change a score for a particular student.");
  	System.out.println(" 8 Quit and Save to file.");
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
	}
	
}
