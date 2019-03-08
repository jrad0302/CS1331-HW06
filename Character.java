// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Character object.
* @author Johnathan Radcliff
* @version 1.0
*/
public abstract class Character {

    private int health;
    private int maxHealth;
    protected String name;

    /**
    * Creates a Character object
    * @param name the name of the Character
    * @param mh the maximum health of the Character
    * @param h the actual health of the Character
    */
    public Character(String name, int mh, int h) {
        this.name = name;
        maxHealth = mh;
        health = h;
    }

    /**
    * Returns the health of the Character
    * @return the health of the Character
    */
    public int getHealth() {
        return health;
    }

    /**
    * Returns the maximum health of the Character
    * @return the maximum health of the Character
    */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
    * Returns the name of the Character
    * @return the name of the Character
    */
    public String getName() {
        return name;
    }

    /**
    * Sets the health of the Character
    * @param h the new health of the Character
    */
    public void setHealth(int h) {
        health = h;
    }

    // Feel free to add instance variables as you see fit - just don't remove what's there.
    /**
    * Defines the interaction type of the Character.
    * @param c the Character being interacted with
    */
    public abstract void interact(Character c);

    // Define any other abstract or concrete methods here to solve the homework problem.
    // Remember, anything you put here will be inherited by all subclasses and can be overridden!
    // Consider how you can use this to your advantage to store useful information or define useful behavior.


}