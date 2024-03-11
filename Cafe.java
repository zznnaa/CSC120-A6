public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 20;
        this.nSugarPackets = 10;
        this.nCreams = 10;
        this.nCups = 5;
    }

    //java desc
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        int restockCoffee = 0;
        int restockSugarPackets = 0;
        int restockCream = 0;
        int restockCups = 0;
        if ((this.nCoffeeOunces - size) < 0){
            System.out.println("There is not enough coffee to make that order.");
            restockCoffee = 20;
        }
        if ((this.nSugarPackets - nSugarPackets) < 0){
            System.out.println("There are not enough sugar packets to make that order.");
            restockSugarPackets = 3;
        }
        if ((this.nCreams - nCreams) < 0){
            System.out.println("There are not enough splashes of cream to make that order.");
            restockCream = 3;
        }
        if ((this.nCups - nCups) < 0){
            System.out.println("There are not enough cups to make this order.");
            restockCups = 5;
        }
        if ((restockCoffee != 0) || (restockSugarPackets != 0) || (restockCream != 0) || (restockCups != 0)){
            restock(restockCoffee, restockSugarPackets, restockCream, restockCups);
        }
        System.out.print("Making coffee...");
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Finished!");
        System.out.println("Order up! " + size + "oz coffee with " + nSugarPackets + " sugar(s) and " + nCreams + " cream(s).");
        
    }
    
    //java desc
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        System.out.print("Restocking...");
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Success!");
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe("Tatte", "Boston", 1);
        System.out.println(cafe);
        for (int i = 1; i < 6; i++){
            cafe.sellCoffee(12, 3, 2);
        }
    }
    
}
