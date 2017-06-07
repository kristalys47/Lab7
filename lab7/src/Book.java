
public class Book implements GameThing, Readable, Openable
{
	public boolean isOpen = false;    
	public boolean isClose = true; 
	//Start out closed

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
		if (isOpen)
		{
			System.out.println("As the book closes you hear; \"NOOOOOOOOOOOOOOOOOOO!\".");
			isOpen=!isOpen;
		}
		
		else
		{
			System.out.println("DUDE CAN'T YOU SEE THE BOOK IS CLOSED! -.-");
		}				
	}

	public void open() {
		if (isOpen)
			System.out.println("The books speaks and tells you: I am open pal.");
		else
		{
			System.out.println("The book opens and suddently BOOM! some fairy dust comes out.");
			isOpen=!isOpen;
		}
		
	}
	


}
