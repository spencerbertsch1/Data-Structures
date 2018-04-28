
public class balance {

	public string testBraces(int y){
		
		String braces = braces.toCharArray(); 
		
		
			for (int i = 0; braces.length ;i++ ) {
			    
				 if (braces(i) == "{") {
				       push "{"; // if element is left curley brace, push it to stack
				    } else {
				    	if(isEmpty(braces) == true)){
				    		return 2; 
				    		break;
				    	}
				    	else{
				    		pop "{"; // if element is right curley brace, pop a brace from the stack 
				    	}
				   } 		 
			}
		
			
			
		if (isEmpty(braces) == true) {
	        return 0; 
	    } else {
	    	return 1; 
	    }
	    
		//returns 0 if everything is balanced!
		//returns 1 if unbalanced because missing left brace
		//returns 2 if unbalanced because too many left braces
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String braces = "{}{}{}{}{{{{{}}}}}"; //this should be balanced and testBraces should return 0 
		
		int y = testBraces(braces); 
		if (y == 0)
		{
			System.out.println("curly braces are balanced");
			
		}else if (y ==1) {
			System.out.println("curly braces are unbalanced (because too many left curly braces)");
		}
			else 
		{
			System.out.println("curly braces are unbalanced (because missing a left curly brace)");
		}
	}
}
