// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Friendly object, which extends the Character class.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Friendly extends Character {

    /**
    * Creates a Friendly object and prints a friendly statement.
    * Instantiates Friendly with the Character.
    * @param name the Friendly's name
    */
    public Friendly(String name) {
        super(name, 10, 10);
        System.out.println("Hi my name is " + name + "! I am friendly!");
    }

    /**
    * This method takes a Character and allows the Friendly to interact with it.
    * Prints a friendly statement.
    * Friendly objects cannot interact with itself.
    * @param c the Character object being interacted with.
    */
    public void interact(Character c) {
        if (c != this) {
            System.out.println(name + ": Hi " + c.getName() + "!");
        }
    }


}