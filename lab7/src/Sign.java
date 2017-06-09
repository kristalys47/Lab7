public class Sign implements GameThing, Readable, Edible

{

      public String getName()

      {
            return "A chocolate wooden sign";
      }

      public String getDescription()

      {
                return "This is a small chocolate wooden sign. There seems to be some partially faded \nwriting in it, but forget it; IT IS CHOCOLATE! Try eating it.";
      }

      public void read()

      {
            System.out.println("You can read the following message: \"Eat me :)!\"");
      }

	@Override
	public void eat() {
		System.out.println("This is better than Godiva's Chocolate. Very creamy! I think it has almonds.");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
	}

}