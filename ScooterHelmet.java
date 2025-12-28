package part2;


/**
 * Scooter helmets are protective headgear. A relevant property of scooter helmets iswhether they have a visor.
 * The value of a scooter helmet is determined by value = c1 + p · c2,
 * where c1 is 80 for helmets without a visor and 160 for helmets with a visor, p is the protection factor of the scooter helmet, and c2 is 400.
 * 
 * @author Alfreda Carr-Abudu
 */

public class ScooterHelmet extends ProtectiveHeadgear {
    private boolean hasVisor;
    private static final double noVisorC1 = 80.00;
    private static final double withVisorC1 = 160.00;
    private static final double c2 = 400.00;

    /**
     * Constructor
     * 
     * Constructs a ScooterHelmet which has an identified protection factor and also a visor presence.
     * 
     * @param protectionFactor the protection factor of the ScooterHelmet
     * @param hasVisor isTrue if the scooterHelmet has Visor otherwise isFalse
     */
    public ScooterHelmet(double protectionFactor, boolean hasVisor) {
        super(protectionFactor);
        this.hasVisor = hasVisor;
    }

    /**
     * returns if the ScooterHelmet has a Visor
     * 
     * @return true if ScooterHelmet has Visor and false if otherwise
     */
    public boolean hasVisor() {
        return hasVisor;
    }

    /**
     * sets if the ScooterHelmet has Visor 
     * 
     * @param true if the ScooterHelmet hasVisor otherwise false
     */
    public void setHasVisor(boolean hasVisor) {
        this.hasVisor = hasVisor;
    }

    /**
     * To calculate the value of the ScooterHelmet depending on if it has a visor or not and protection factor.
     * 
     * @return the value in GBP
     */
    @Override
    public double getValue() {
        double c1 = hasVisor ? withVisorC1 : noVisorC1;
        double p = getProtectionFactor();
        return c1 + p * c2;
    }

    /**
     * Returns a string representation of the ScooterHelmet 
     * Together with the status of the Visor,protection factor and value computed
     * 
     * @return a string describing the ScooterHelmet
     */
    @Override
    public String toString() {
        return "ScooterHelmet which has Visor: " + hasVisor + ", " + " protection factor: " + getProtectionFactor() + ", and valued at: " + getValue() + " GBP.";
    }
}

