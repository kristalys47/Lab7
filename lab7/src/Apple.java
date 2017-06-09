
public class Apple implements GameThing, Edible
{
	
	public String getName()

	{
		return "Big red apple.";
	}
	
	public String getDescription()
	{
		return "A very red, tasty, mouth watering apple.";
	}

	@Override
	public void eat() {
		System.out.println("I saw this coming, lol. So tasty it is worth everything...\n OH MY LORD! Is this a worm?\n *throws it away* ");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
	}
}
