public class Heap 
{
	private double [] theHeap;
	private int lastFilledSlot;
	
	public Heap()
	{
		theHeap = new double[200_000_000];
		lastFilledSlot = -1;
	}

	// add
	public int add(double data)
	{
		
		theHeap[++lastFilledSlot] = data;
		
		int compares = upwardReheapify();
		
		return compares; 
		
	}
	
	private int leftChild(int i)
	{
		return 2*i + 1;
	}
	
	private int rightChild(int i)
	{
		return 2*i + 2;
	}
	
	private int parent(int i)
	{
		return (i-1)/2;
	}
	
	private int upwardReheapify()
	{
		int idxToCheck = lastFilledSlot;
		
		int count = 0; 
		while (idxToCheck != 0 && theHeap[idxToCheck] > theHeap[parent(idxToCheck)])
		{
			// swap
			double temp = theHeap[idxToCheck];
			theHeap[idxToCheck] = theHeap[parent(idxToCheck)];
			theHeap[parent(idxToCheck)] = temp;
			count++; 
			
			// update idx to be his parent
			idxToCheck = parent(idxToCheck);
		}
		return count; 
		
	}
	
}