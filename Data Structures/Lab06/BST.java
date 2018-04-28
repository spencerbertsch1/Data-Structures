
public class BST {

	private int [] tree;
	private static final int SIZE = 100000;
	private static final int EMPTY_VALUE = -1;
	//private static int MaxValue = 0; 
	
	public BST()
	{
		tree = new int[SIZE];
		for (int i=0; i<tree.length; i++)
		{
			tree[i] = EMPTY_VALUE;
		}
	}

	public boolean isEmpty()
	{
		if (tree[0] == EMPTY_VALUE)
			return true;
		else
			return false;
	}
	
	private int leftChild(int i)
	{
		return 2*i + 1;
	}
	
	private int rightChild(int i)
	{
		return 2*i + 2;
	}
	
	// this will search the entire tree and tell us whether key is in it or not
	public boolean search(int key)
	{
		return search(key, 0);
	}
	
	// this will tell us if key is found in the subtree with stRootIdx as the s t root index
	private boolean search(int key, int stRootIdx)
	{
		if (tree[stRootIdx] == EMPTY_VALUE)
		{
			return false;
		}
		else
		{
			if (tree[stRootIdx] == key)
			{
				return true;
			}
			else
			{
				// look left OR right
				if (tree[stRootIdx] > key)
				{
					// go left
					boolean result =  search(key, leftChild(stRootIdx));
					return result;
				}
				else
				{
					// go right
					boolean result =  search(key, rightChild(stRootIdx));
					return result;
				}
			}
		}
	}
	
	// assume key is unique (among all keys in the tree)
	public void insert(int key)
	{
		if (isEmpty())
		{
			tree[0] = key;
		}
		else
		{
			int stRootIdx = 0;
			while (true)
			{
				if (key > tree[stRootIdx])
				{
					if (tree[rightChild(stRootIdx)] == EMPTY_VALUE)
					{
						tree[rightChild(stRootIdx)] = key;
						break;
					}
					else
					{
						stRootIdx = rightChild(stRootIdx);
					}
				}
				else
				{
					if (tree[leftChild(stRootIdx)] == EMPTY_VALUE)
					{
						tree[leftChild(stRootIdx)] = key;
						break;
					}
					else
					{
						stRootIdx = leftChild(stRootIdx);
					}
				}
				
			}
			
		}
	} // end of insert method		

	public void inOrderPrint()
	{
		inOrderPrint(0);
	}
	
	private void inOrderPrint(int stRootIdx)
	{
		if (tree[stRootIdx] != EMPTY_VALUE)
		{
			// LEFT
			inOrderPrint(leftChild(stRootIdx));
			// ROOT
			System.out.println(tree[stRootIdx]);
			// RIGHT
			inOrderPrint(rightChild(stRootIdx));
		}
	}
	
	//returns 0 if tree is empty
	public int findMaxValue(){
		
		if (tree[0] == EMPTY_VALUE) //check for empty tree
		{
			return 0;
		}
		else
		{
			int stRootIdx = 0;
			while(tree[rightChild(stRootIdx)] != EMPTY_VALUE){
		
				stRootIdx = rightChild(stRootIdx);

			}//end of while loop
			
			return tree[stRootIdx]; 
	
		}// ends "else" 
	}// ends method 
	
	/*
	public int height()
	   {
		height(root);
	   }

	   // have this method return the height of the subtree with stRoot as its root
	   private int height(BSTNode stRoot)
	   {


	   }
	*/
	
	
	
	
	//returns 0 if tree is empty
		public int findMinValue(){
			
			if (tree[0] == EMPTY_VALUE) //check for empty tree
			{
				return 0;
			}
			else
			{
				int stRootIdx = 0;
				while(tree[leftChild(stRootIdx)] != EMPTY_VALUE){
			
					stRootIdx = leftChild(stRootIdx);

				}//end of while loop
				
				return tree[stRootIdx]; 
		
			}// ends "else" 
		}// ends method  
	
} //end of class 
