
public class StackOfChars
{
	//Make some instance variables 
	public char nextSlot; 
	
	
	private char theStack[];
	// other instance variable(s) go here

	public StackOfChars()
	{
		theStack = new char[1000]; // makes the stack hold a maximum of 1000 chars
		// initialize the other instance variable(s)
	}

	public void push(char thingToAdd)
	{
		theStack[nextSlot++] = thingToAdd; // increment AFTER use, because ++ in on the right (POST INCREMENT)
	}

	// assumes not empty
	public char pop()
	{
		return theStack[--nextSlot];
		
		/*
		int thingToRemove;
		thingToRemove = theStack[top-1];
		top--;
		return thingToRemove;
		*/
	}
	
	public boolean isEmpty()
	{
		return (nextSlot == 0);
	}
	
	public char peek()
	{
		return theStack[nextSlot-1];
	}
        
	

}