package part2;

/**
 * An abstract class that represents protective headgear.
 * There are several kinds of protective headgear. 
 * A commonality among them is that they have a “protection factor”, expressed as a double value.
 * This abstract class encapsulates this commonality.
 * 
 * @author Alfreda Carr-Abudu
 */

public abstract class ProtectiveHeadgear implements Headgear {
    private double protectionFactor;

    public ProtectiveHeadgear(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor must be a positive value");
        }
        this.protectionFactor = protectionFactor;
    }

    /**
     * Returns the protection factor of this ProtectiveHeadgear.
     * @return the protection factor as a double
     */
    
    public double getProtectionFactor() {
        return protectionFactor;
    }
    /**
     * Sets the protection factor of this ProtectiveHeadgear.
     * Must be a positive value.
     * @param protectionFactor the new protection factor as a double
     * @throws IllegalArgumentException if protectionFactor is negative
     */

    public void setProtectionFactor(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor must be a positive value");
        }
        this.protectionFactor = protectionFactor;
    }
    
    /**
     * @override toString() method to include protection factor
     */

     @Override
        public String toString() {
            return "Protection Factor: " + protectionFactor;
        }
}
