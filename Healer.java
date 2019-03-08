// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Healer object, which extends the Friendly and Character classes.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Healer extends Friendly {

    /**
    * Creates a Healer object, then calls the Friendly constructor
    * @param name the name of the Healer
    */
    public Healer(String name) {
        super(name);
    }

    /**
    * Defines the heal methodology for Healers
    * If the Character c is Friendly, then increase their health by 5.
    * If Unfriendly, increase the health by 3.
    * The heal cannot increase the health above maxHealth.
    * The heal does not work on people with 0 health and max health
    * Once healed, the Healer says a statement.
    * @param c the Character to be healed
    */
    public void heal(Character c) {
        if (c != this) {
            if (c.getHealth() == 0) {
                System.out.println(name + ": I'm sorry " + c.getName() + ". Nothing is working!");
            } else if (c.getHealth() == c.getMaxHealth()) {
                System.out.println(name + ": Hey " + c.getName() + ". You look perfectly fine to me!");
            } else if (c.getMaxHealth() == 10) {
                if (c.getHealth() >= 6) {
                    c.setHealth(10);
                } else {
                    c.setHealth(c.getHealth() + 4);
                }
            } else if (c.getMaxHealth() == 15) {
                if (c.getHealth() >= 13) {
                    c.setHealth(15);
                } else {
                    c.setHealth(c.getHealth() + 2);
                }
            }
        }
        System.out.println(name + ": Got you up to " + c.getHealth()
            + " health. Hope you feel better " + c.getName() + "!");
    }

    /**
    * Defines a Healer interaction, then calls the Friendly interact method.
    * Heals the Character c that the Healer interacts with.
    * @param c the Character being interacted with.
    */
    public void interact(Character c) {
        super.interact(c);
        heal(c);
    }
}