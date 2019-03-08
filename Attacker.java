// I worked on the homework assignment alone, using only course materials.
/**
* This class represents an Attacker object, which extends the Unfriendly and Character classes.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Attacker extends Unfriendly {

    /**
    * Creates an Attacker object, then calls the Unfriendly constructor.
    * @param name the name of the Attacker
    */
    public Attacker(String name) {
        super(name);
    }

    /**
    * Defines the attack method of Attackers, based on the Friendly or Unfriendly status of the Character.
    * Can't attack people with zero health.
    * Prints statements based on the health of the character after an attack.
    * @param c the Character being attacked
    */
    public void attack(Character c) {
        if (c != this) {
            if (c.getHealth() == 0) {
                System.out.println(name + ": You show such weakness " + c.getName() + ".");
            } else if (c.getMaxHealth() == 10) {
                if (c.getHealth() <= 5) {
                    c.setHealth(0);
                    System.out.println(name + ": You were no match for me " + c.getName() + ".");
                } else {
                    c.setHealth(c.getHealth() - 5);
                    System.out.println(name + ": Now you're only at " + c.getHealth()
                        + "health. How does it feel " + c.getName() + "!?");
                }
            } else if (c.getMaxHealth() == 15) {
                if (c.getHealth() <= 3) {
                    c.setHealth(0);
                    System.out.println(name + ": You were no match for me " + c.getName() + ".");
                } else {
                    c.setHealth(c.getHealth() - 3);
                    System.out.println(name + ": Now you're only at " + c.getHealth()
                        + "health. How does it feel " + c.getName() + "!?");
                }

            }
        }
    }

    /**
    * Defines a Attacker interaction, then calls the Unfriendly interact method.
    * Attacks the Character being interacted with.
    * @param c the Character being interacted with.
    */
    public void interact(Character c) {
        super.interact(c);
        attack(c);
    }
}