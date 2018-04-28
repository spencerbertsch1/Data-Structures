//
// Spencer Bertsch
// Feb.9 2017
//


public class TestList {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList (); 
	
		//MAKE SOME TEXTBOOKS
		TextBook textbook1 = new TextBook ("General Relativity", "Evan", "Halstead", 3);
		TextBook textbook2 = new TextBook ("Optics", "Javier", "Peredes");
		TextBook textbook3 = new TextBook ("Fluid Mechanics", "Greg", "Gerbi");
		TextBook textbook4 = new TextBook ("Systems", "Stuart", "Trembly", 3);
		TextBook textbook5 = new TextBook ("Engineering Statistics", "Mary", "Odekon");
		
		/*
		
		//Test each of the methods from LinkedList Class 
		//
			System.out.println("The number of elements in the list is: " + list.size());
		list.addToEnd(new TextBook("Electricity anbd Magnetism", "Evan", "Halstead", 2)); //ADD TO END
			System.out.println(list.toString());
		list.addToBeginning(new TextBook("Thermodynamics", "Javier", "Peredes")); //ADD TO BEGINNING
			System.out.println(list.toString());
		list.addToEnd(textbook1); //ADD TO END
			System.out.println(list.toString());
		list.insertBefore(textbook1, textbook2); //INSERT BEFORE
			System.out.println(list.toString());
		list.insertAfter(textbook2, textbook3); //INSERT AFTER
			System.out.println(list.toString());
		list.clear(textbook1); //CLEAR LIST 
			System.out.println(list.toString());
		
			
			
			
			
		
			//
			// ********* TEST EACH METHOD ON THE EMPTY LIST ********* (we know add to end already works from above)
			//
			
			//Test Add to Beginning
			list.addToBeginning(new TextBook("Thermodynamics", "Javier", "Peredes")); //ADD TO BEGINNING
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert Before 
			list.insertBefore(null, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert After
			list.insertAfter(null, textbook1);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			
			
			
			
			
			//
			// ************ TEST EACH METHOD ON A LIST OF SIZE ONE ************
			//
			
			//Test Add to beginning 
			list.addToBeginning(new TextBook("Electricity and Magnetism", "Evan", "Halstead", 2));
				list.addToBeginning(new TextBook("Thermodynamics", "Javier", "Peredes"));
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Add to End
			list.addToBeginning(new TextBook("Electricity and Magnetism", "Evan", "Halstead", 2));
				list.addToEnd(new TextBook("Thermodynamics", "Javier", "Peredes"));
			System.out.println(list.toString());
			list.clear(textbook1);
	
			//Test Insert Before when textbook in the list is found
			list.addToBeginning(textbook1);
				list.insertBefore(textbook1, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert After when textbook in the list is found 
			list.addToBeginning(textbook1);
				list.insertAfter(textbook1, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert Before when textbook in the list is NOT found
			list.addToBeginning(textbook3);
				list.insertBefore(textbook1, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert After when textbook in the list is NOT found 
			list.addToBeginning(textbook3);
				list.insertAfter(textbook1, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			
			
			
			
			
			//
			// ************ TEST EACH METHOD ON A LIST OF SIZE FIVE ************
			//
			
			
			//Test Insert After when textbook at the beginning, the, or in the middle of the list
			list.addToBeginning(textbook1);
			list.addToBeginning(textbook2);
			list.addToBeginning(textbook3);
			list.addToBeginning(textbook4);
			list.addToBeginning(textbook5);
			list.insertAfter(textbook1, textbook2);
			list.insertAfter(textbook5, textbook2);
			list.insertAfter(textbook3, textbook2);
			System.out.println(list.toString());
			list.clear(textbook1);
			
			//Test Insert Before when textbook at the beginning, the, or in the middle of the list
			list.addToBeginning(textbook1);
			list.addToBeginning(textbook2);
			list.addToBeginning(textbook3);
			list.addToBeginning(textbook4);
			list.addToBeginning(textbook5);
			list.insertBefore(textbook1, textbook2);
			list.insertBefore(textbook5, textbook2);
			list.insertBefore(textbook3, textbook2);
			System.out.println(list.toString());
			
			
			
		list.addToBeginning(textbook1);
		list.addToBeginning(textbook2);
		list.addToBeginning(textbook3);
		list.addToBeginning(textbook4);
		list.addToBeginning(textbook5);
		System.out.println(list.toString());
		list.clear(textbook1);
		*/
		
		list.addToBeginning(textbook1);
		list.addToBeginning(textbook2);
		list.addToBeginning(textbook3);
		list.addToBeginning(textbook4);
		list.addToBeginning(textbook5);
		list.delete(textbook5);
		System.out.println(list.toString());
		
		
		
		//list.clear(textbook1);
		//list.delete(textbook2);
		//System.out.println(list.toString());
		
	}
	
}
