
public class Node {
		
		private TextBook data;
		public Node next;
		
		public Node(TextBook tb)
		{
			data = tb;
			next = null;
		}

		public TextBook getData()
		{
			return data;
		}
}

