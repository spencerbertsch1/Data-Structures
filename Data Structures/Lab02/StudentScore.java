public class StudentScore implements Comparable<StudentScore>{
	
	private String name;
	private int score;

	public StudentScore(String name, int score)
	{
		setName(name);
		setScore(score);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setScore(int s)
	{
		score = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return "Student: " + name + "; Score: " + score;
	}
	
	public int compareTo(StudentScore parmSS)
	{
		if (this.score != parmSS.score)
			{
			return this.score - parmSS.score; 
			}
		else
			{
			return this.name.compareTo(parmSS.name); 
			}
	}
}