package part2;

/**
 * Bobble hats are protective headgear whose discerning attribute is the diameter of their bobble (in millimetres). 
 * The value of a bobble hat is the diameter of its bobble (in millimetres) multiplied by 4 and by its protection factor.
 */
public class BobbleHat extends ProtectiveHeadgear {
    private int bobbleHatDiameterInMillimetres;
    private static final int valueToMultiplyBy = 4;

    /**
     * Constructor
     * 
     * constructs a bobbleHat with a specified protection factor and the diameter of its bobble in millimetres.
     * 
     * @param protectionFactor the protection factor of the BobbleHat
     * @param bobbleHatDiameterInMillimetres Diameter of the bobbleHat in Millimetres.
     */
    public BobbleHat(double protectionFactor, int bobbleHatDiameterInMillimetres) {
        super(protectionFactor);
        this.bobbleHatDiameterInMillimetres = bobbleHatDiameterInMillimetres;
    }

    /**
     * Returns the diameter of the BobbleHat in Millimetres.
     * 
     * @return bobbleHatDiameterInMillimetres Diameter in Millimetres.
     */
    public int getBobbleHatDiameterInMillimetres() {
        return bobbleHatDiameterInMillimetres;
    }
    
    /**
     * sets the diameter of the BobbleHat in Millimetres.
     * 
     * @param bobbleHatDiameterInMillimetres Diameter in Millimetres.
     */
    public void setBobbleHatDiameterInMillimetres(int bobbleHatDiameterInMillimetres) {
        this.bobbleHatDiameterInMillimetres = bobbleHatDiameterInMillimetres;
    }

    /**
     * Calculation of the value of the BobbleHat depending on its bobble diameter and protection factor in GBP
     * 
     * @return the value in GBP
     */
    @Override
    public double getValue() {
        double protection_factor = getProtectionFactor();
        return bobbleHatDiameterInMillimetres * valueToMultiplyBy * protection_factor;
    }

    /**
     * Returns a string representation of the Bobblehat 
     * Together with the bobble diameter,protection factor and value computed
     * 
     * @return a string describing the BobbleHat
     */
    @Override
    public String toString() {
        return "BobbleHat with bobble diameter: " + bobbleHatDiameterInMillimetres + " mm, " + " protection factor: " + getProtectionFactor() + ", and valued at: " + getValue() + " GBP.";
    }
    
}
