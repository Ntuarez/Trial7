public class Shoe {
    // Instance Variables
    private String shoeColor = "Black";
    private String shoeBrand = "Nike";
    private String shoeType = "Sneakers";
    private int shoeSize = 42;
    private boolean isClean = true;/*Boolean expression....if the shoe is clean it will be worn by the
    user else it should be cleaned before wearing*/ 
    

    // Method to wear the shoe
    public void wear() {
        if (isClean) {
            System.out.println("The user can wear the shoe.");
        } else {
            System.out.println("The user should clean the shoe before wearing it.");
        }
    }


    // Method to check if the shoe size matches the user's size
    public void checkSize(int userSize) {
        if (userSize == shoeSize) {
            System.out.println("The shoe fits your size.");
        } else {
            System.out.println("The shoe doesn't fit.");
        }
    }

    //Method to check the shoe color
    public void shoeColor() {
        System.out.println("The shoe color is black");
    }
    
    //Method to show the shoe brand
    public void shoeBrand() {
        System.out.println("The shoe brand is Nike");
    }

    // Method to check the shoe type
    public void shoeType() {
        System.out.println("These shoe type is sneakers.");
    }


    // Main method to test the Shoe class
    public static void main(String[] args) {
        Shoe myShoe = new Shoe();
        myShoe.wear();
        myShoe.checkSize(42);
        System.out.println("The shoe color is " + myShoe.shoeColor);
        System.out.println("The shoe brand is " + myShoe.shoeBrand);
        System.out.println("The shoe type is " + myShoe.shoeType);
    }
}
