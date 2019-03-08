// I worked on the homework assignment alone, using only course materials.
/**
* This class represents an Unfriendly object, which extends the Character class.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Unfriendly extends Character {

    /**
    * Creates an Unfriendly object and prints an unfriendly statement.
    * @param name the name of the Unfriendly
    */
    public Unfriendly(String name) {
        super(name, 15, 15);
        System.out.println("The name's " + name + ". I'm not friendly.");
    }

    /**
    * Defines the interaction that an Unfriendly does, then prints an unfriendly statement.
    * Unfriendly objects cannot interact with themselves.
    * @param c the Character being interacted with.
    */
    public void interact(Character c) {
        if (c != this) {
            System.out.println(name + ": What are you looking at " + c.getName() + "!?");
        }
    }
}