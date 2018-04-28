
public class LinkedList {
	
private Node head;
	
	public LinkedList()
	{
		head = null;
	}

	public boolean isEmpty()
	{
		// return true if head == null
		// return false otherwise
		return (head == null);
	}
	
	public int size()
	{
		int count = 0;
		
		Node temp = head;

		while (temp != null)
		{
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public void addToBeginning(TextBook tb)
	{
		Node addNode = new Node(tb);
		addNode.next = head;
		head = addNode;		
	}

	public void addToEnd(TextBook tb)
	{
		Node addNode = new Node(tb);
		
		if (isEmpty())
		{
			head = addNode;
		}
		else
		{
			Node temp = head;
	
			while (temp.next != null)
			{
				temp = temp.next;
			}
	
			// we want temp to be referring to the last node now
			// so that we can do:
			temp.next = addNode;
		}
	}

	public void insertBefore(TextBook toLookFor, TextBook toInsert) 
	{
		Node addNode = new Node(toInsert);
		
		Node temp = head;
		
		if (!isEmpty())
		{
			// handle the case if toLookFor is found at the head
			if (temp.getData().equals(toLookFor))
			{
				addNode.next = temp;
				head = addNode;
			}
			else
			{
				// if toLookFor is NOT at the head AND list is not empty
				
				while (temp.next != null && !temp.next.getData().equals(toLookFor))
				{
					temp = temp.next;
				}
				
				if (temp.next != null)
				{
					// 	what is the Node we found toLookFor at: it is temp.next
					addNode.next = temp.next;
					temp.next = addNode;
				}
			}
		}

	}
	
	// toInsert will NOT be inserted if toLookFor is NOT found
	public void insertAfter(TextBook toLookFor, TextBook toInsert) 
	{
		Node addNode = new Node(toInsert);
		Node temp = head;
		
		while (temp != null && !(temp.getData().equals(toLookFor))) 
		{
			temp = temp.next;			
		}
		
		if (temp != null)
		{
			// temp is the node with toLookFor in it
			addNode.next = temp.next;
			temp.next = addNode;
		}
	}
		
	//Method CLEAR that sets head to null and makes the list empty
	public void clear(TextBook tb){
		
		//make head null and the list empty
		head = null;		
		
	}
	
	
	
	
	
	
	
	
	public void delete(TextBook bad_tb){
		//
		//Deletes a specified node and connects the previous node to the one after the deleted node
		//
		
		Node temp = head;
		
		while ((temp != null) && (!temp.getData().equals(bad_tb)))
			{
				temp = temp.next;
			}
		if (temp != null)
		{
			// delete node 
			temp.next = temp.next.next;
		}
	}
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		String outStr = "";
		Node temp = head;

		while (temp != null)
		{
			outStr += temp.getData().toString() + "\n";
			temp = temp.next;
		}

		return outStr;
	}
}
