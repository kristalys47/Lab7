
public class Book implements GameThing, Readable, Openable
{
	public boolean isOpen = false;    
	//Start out closed

	public String getName()

	{
		return "A dusty old book";
	}
	
	public String getDescription()
	{
		if (isOpen)
			System.out.println("Look! An open book!");
		else 
			System.out.println("Why is this book close?");
		return "It appears to be old and dusty. It's also quite heavy.";
		
	}

	
	public void read() 
	{
		if (isOpen)
			System.out.println("This book has germs. DON'T TOUCH IT!");
		else
			System.out.println("Are you aware of the fact that to read a book it needs to be open? \nYou should read more often.");
	}
	
	public void close() {
		if (isOpen)
		{
			System.out.println("As the book closes you hear; \"NOOOOOOOOOOOOOOOOOOO!\".");
			isOpen=!isOpen;
		}
		
		else
		{
			System.out.println("DUDE CAN'T YOU SEE I AM CLOSED! -.-");
		}				
	}

	public void open() {
		if (isOpen)
			System.out.println("The books speaks and tells you: I am already open pal.");
		else
		{
			System.out.println("The book opens and suddently BOOM! some fairy dust comes out.");
			isOpen=!isOpen;
		}
		
	}

}
