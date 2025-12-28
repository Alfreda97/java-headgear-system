package part2;


public class Main {
    public static void main(String[] args) {
        Crown crown = new Crown(6);
        ScooterHelmet withVisorC1 = new ScooterHelmet(1.5, true);
        ScooterHelmet noVisorC1 = new ScooterHelmet(0.9, false);
        BobbleHat bobbleHat = new BobbleHat(0.8, 150);

        System.out.println(crown);
        System.out.println(withVisorC1);
        System.out.println(noVisorC1);
        System.out.println(bobbleHat);

        // creating an array of Headgear
        Headgear[] headgearItems = {crown, withVisorC1, noVisorC1, bobbleHat};

        // calculating total value
        double totalValue = HeadgearCalculator.calculateTotalValue(headgearItems);
        System.out.println("Total value of all headgear items: " + totalValue + " GBP.");

        // exception handing for null array
        try {
            Headgear[] invalidArray = {null, crown, bobbleHat};
            HeadgearCalculator.calculateTotalValue(invalidArray);
        } catch(IllegalArgumentException e) {
            System.out.println("caught in main: " + e.getMessage());
    
        }

    }

}
