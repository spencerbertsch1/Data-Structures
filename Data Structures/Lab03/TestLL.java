
public class TestLL {
	

		public static void main(String[] args) {
			LinkedList ll = new LinkedList();
			System.out.println("The number of books in our list is " + ll.size());
			ll.addToEnd(new TextBook("Learning Java", "Smith", "Jane"));
			System.out.println("The number of books in our list is " + ll.size());
			ll.addToBeginning(new TextBook("Learning Java", "Smith", "Jane"));
			System.out.println("The number of books in our list is " + ll.size());
			TextBook tb1 = new TextBook("Java For Dummies", "Burd", "Barry", 6);
			ll.addToBeginning(tb1);
			System.out.println("The number of books in our list is " + ll.size());
			ll.addToBeginning(new TextBook("Data Structures & Problem Solving Using Java", "Weiss", "Mark", 4));
			System.out.println("The number of books in our list is " + ll.size());
			ll.addToBeginning(new TextBook("Data Structures & Problem Solving Using Java", "Weiss", "Mark", 2));
			System.out.println("The number of books in our list is " + ll.size());
			ll.addToBeginning(new TextBook("Concepts of Physics", "Gerbi", "Greg", 2));
			
			System.out.println(ll.toString());
			System.out.println("The number of books in our list is " + ll.size());

			TextBook tb2 = new TextBook("Pale Blue Dot", "Sagan", "Carl");
			ll.insertAfter(tb1, tb2);
			System.out.println(ll.toString());
		}

	}
	
	


