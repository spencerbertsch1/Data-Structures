
	public class TextBook implements Comparable<TextBook>
	{
		// instance variable to store the data for an object of this type
		private String title;
		private String authorLastName;
		private String authorFirstName;
		private int edition;
		private static int count = 0;
		
		public TextBook(String t, String last, String first)
		{
			count++;
			setTitle(t);
			setAuthorLastName(last);
			setAuthorFirstName(first);
			edition = 1;
		}
		
		public TextBook(String t, String last, String first, int ed)
		{
			count++;
			setTitle(t);
			setAuthorLastName(last);
			setAuthorFirstName(first);
			setEdition(ed);
			
		}

		public void setTitle(String t)
		{
			if (t.equals(""))
			{
				title = "Undefined";
			}
			else
			{
				title = t;
			}
		}

		public void setAuthorFirstName(String f)
		{
			if (f.equals(""))
			{
				authorFirstName = "Undefined";
			}
			else
			{
				authorFirstName = f;
			}
		}

		public void setAuthorLastName(String l)
		{
			if (l.equals(""))
			{
				authorLastName = "Undefined";
			}
			else
			{
				authorLastName = l;
			}
		}
		
		public void setEdition(int e)
		{
			if (e <= 0)
			{
				edition = 1;
			}
			else
			{
				edition = e;
			}
		}

		public String getTitle()
		{
			return title;
		}
		
		public String getFirstName()
		{
			return authorFirstName;
		}

		public String getLastName()
		{
			return authorLastName;
		}

		public int getEdition()
		{
			return edition;
		}

		public String toString()
		{
			return title + " by " + authorLastName + ", " + authorFirstName + " edition: " + edition;
		}
		
		public boolean equals(TextBook parmTB)
		{
			// this refers to the text book who calls this method
			// parmTB is the other text book
			return (this.title.equals(parmTB.title) && 
					this.authorLastName.equals(parmTB.authorLastName) &&
					this.authorFirstName.equals(parmTB.authorFirstName) &&
					this.edition == parmTB.edition);
			
		}

		public int compareTo(TextBook parmTB)
		{
			if (this.authorLastName.compareTo(parmTB.authorLastName) != 0)
			{
				return this.authorLastName.compareTo(parmTB.authorLastName); 
			}
			else
			{
				if (this.authorFirstName.compareTo(parmTB.authorFirstName) != 0)
				{
					return this.authorFirstName.compareTo(parmTB.authorFirstName); 
				}
				else
				{
					if (this.title.compareTo(parmTB.title) != 0)
					{
						return this.title.compareTo(parmTB.title); 
					}
					else
					{
						// here we know author last name, first name and titles are the same
						return this.edition - parmTB.edition;
					}
				}
			}
		}
		public static int getCount()
		{
			// title = "Fred"; illegal b/c a static method cannot access non-static data member
			return count;
		}
	}
	

