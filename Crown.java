package part2;

/**
 * A crown is a piece of headgear which has the number of jewels as a property of interest.
 * The value of a crown is determined by its number of jewels multiplied by a fixed valueFactor of 200000.
 * 
 * @author Alfreda Carr-Abudu
 */

public class Crown implements Headgear {
    private int numberOfJewels;
    private static final double valueFactor = 200000.00;

    /**
    * Constructor
    * numberOfJewels must not be a negative integer
    * 
    * @param numberOfJewels the number of jewels in the crown
    * @throws IllegalAccessError if numberOfJewels is not positive
    */
    public Crown(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels must be a positive integer");
        }
        this.numberOfJewels = numberOfJewels;
    }

    /**
    * Returns the number of jewels in this Crown.
    *
    * @return the number of jewels as an int 
    */
    public int getNumberOfJewels() {
        return numberOfJewels;
    }


    /**
     * sets the number of jewels in this Crown.
     * 
     * @param numberOfJewels new number of jewels to set
     * @throws IllegalArgumentException if numberOfJewels is negative
     */
    public void setNumberOfJewels(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels must be a positive integer");
        }
        this.numberOfJewels = numberOfJewels;
    }

    /**
     * Calculation of the value of this Crown in GBP depending on its number of jewels and the fixed valuefactor.
     * @return the value of this Crown as a double in GBP
     */
    @Override
    public double getValue() {
        return numberOfJewels * valueFactor;
    }

    /**
     * Returns a string representation of this Crown.
     * The return includes the number of jewels and the value in GBP.
     * @return a string describing this Crown
     */
    @Override
    public String toString() {
        return "Crown containing " + numberOfJewels + " jewels, valued at " + getValue() + " GBP.";
    }
}

    
 

