package part2;


/**
 * A class used to calculate arrays of headgear objects
 * 
 * @author Alfreda Carr-Abudu
 */
public class HeadgearCalculator {
    

    /**
     * calculates the total value of a given array which contains headgear items.
     * 
     * if the array contains null element or is null, this method throws IllegalArgumentException.
     * 
     * @param items an array of headgear items
     * @return the total value of all headgear items in GBP.
     */
    public static double calculateTotalValue(Headgear[] items) {
        if (items == null) {
            throw new IllegalArgumentException("The array of headgear items cannot be null.");
        }
        double totalValue = 0.00;
        for (Headgear item : items) {
            if (item == null) {
                throw new IllegalArgumentException("The array of headgear items cannot contain null elements.");
            } else {
                totalValue += item.getValue();
            }
        }
        return totalValue;
    }
}
