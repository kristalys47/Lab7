
public class Book implements GameThing, Readable, Openable
{

	public String getName()

	{
		return "A dusty old book";
	}
	
	public String getDescription()
	{
		return "This book appears to be old and dusty. It's also quite heavy.";
	}

	
	public void read() 
	{
		System.out.println("This book has germs. DON'T TOUCH IT!");
		
	}

	
	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void open() {
		// TODO Auto-generated method stub
		
	}


}