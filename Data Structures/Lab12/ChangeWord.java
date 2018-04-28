import java.util.*; 

public class ChangeWord {

	
public static ArrayList<String> oneShorter(String word){
		
		ArrayList<String> input_shorter_list = new ArrayList<String>(); 
	
	
         for(int i=0; i<word.length(); i++){
           
        	String shorterWord = word.substring(0,i) + word.substring(i+1, word.length()); 
        	input_shorter_list.add(shorterWord);
        	 
           System.out.println("New String is: " + shorterWord);   
         }
	
	return input_shorter_list; 
	}
	


public static ArrayList<String> oneLonger(String word){
		ArrayList<String> input_longer_list = new ArrayList<String>(); 
		
		for (int i=0; i<word.length(); i++){
			
			for(char newLetter='a'; newLetter <= 'z'; newLetter++ ){
				
			String longerWord = word.substring(0,i) + newLetter + word.substring(i,word.length());	
			input_longer_list.add(longerWord); 
			System.out.println("New String is: " + longerWord);  
			
			} 
		}

		return input_longer_list; 
	
}


public static ArrayList<String> twoSwitched(String word){
	ArrayList<String> input_letters_switched = new ArrayList<String>(); 
	
	for (int i=0; i<(word.length()-1); i++){
			
		// "abcdefg" => ab + d + c + efg    in this case, i=2
		String switched_letter_word =  word.substring(0,i) + word.charAt(i+1) + word.charAt(i) + word.substring(i+2,word.length());	
		
		input_letters_switched.add(switched_letter_word); 
		System.out.println("New String is: " + switched_letter_word);  
		
	}

	return input_letters_switched; 

}


	
	
	
	public static void main(String[] args) {
		
		//take in a word from the user 
		System.out.println("Please enter a word: ");
		 Scanner input = new Scanner(System.in);
		 String word = input.nextLine();
		 
		 //remove all upper case letters from that word 
		 word = word.toLowerCase(); 
		 //System.out.println("All smaller permutations of the word with one latter removed: ");
		 
		 //call "oneshorter" method on our input word
		 ArrayList<String> shorter_word = oneShorter(word); 
		 
		//call "onelonger" method on our input word
		 ArrayList<String> longer_word = oneLonger(word);
		
		//call "onelonger" method on our input word
		 ArrayList<String> switched_letters = twoSwitched(word);
		 
		 
		 
		 
	}

}



