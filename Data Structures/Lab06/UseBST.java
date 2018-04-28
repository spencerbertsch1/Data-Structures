
public class UseBST {

	public static void main(String[] args) 
	{
		BST mytree = new BST();
		
		mytree.insert(50);
		mytree.insert(25);
		mytree.insert(100);
		mytree.insert(75);
		mytree.insert(110);
		mytree.insert(70);
		
		//mytree.inOrderPrint();
		
		
		int max = mytree.findMaxValue(); 
		System.out.println("max value in the tree is: " + max);
		
		int min = mytree.findMinValue(); 
		System.out.println("min value in the tree is: " + min);
		
		
		/*
		if (mytree.search(5))
		{
			System.out.println("found 5");
		}
		else
		{
			System.out.println("didn't find 5");
		}
			
		if (mytree.search(50))
		{
			System.out.println("found 50");
		}
		else
		{
			System.out.println("didn't find 50");
		}

		if (mytree.search(70))
		{
			System.out.println("found 70");
		}
		else
		{
			System.out.println("didn't find 70");
		}*/
	}
	
	
}
