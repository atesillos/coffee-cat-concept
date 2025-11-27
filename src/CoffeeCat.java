import com.ProbTable;
import java.util.Scanner;

public class CoffeeCat {
    /*
    This is the class that will run the "main". Everything will be built here

    TODO:
    > Make a system that works, bare bones
    > Make classes for 
        < > monster 
        < > customers
        < > player
        < > drinks
     */
    public static void main(String[] args) {
        // Start of code
        System.out.println("Hello, cat!");
        int DAY_COUNT = 0;

        ProbTable customerProbTable = new ProbTable();

        // User I/O Scanner 
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        Boolean input = false;
        String userIO;
        while(!input) {
            input = false;
            System.out.println(
                "Current day: " + DAY_COUNT + "\n" +
                "Enter 'Order' to receive order \n"+
                "Enter 'N' to advance next day"
            );
            userIO = scan.nextLine();
            
            switch (userIO) {
                case "N":
                    System.out.println("Next Day: " + DAY_COUNT);
                    System.out.println("Difficulty: " + customerProbTable.getPercent(DAY_COUNT));
                    DAY_COUNT++;
                    break;
                case "Order":
                    System.out.println("Get order");
                    break;
                default:
                    System.out.println("ERROR: Input not recognized, try again.");
                    break;
            } // Switch
        } // While
    } // Main

    void orderEvent() {
        @SuppressWarnings("resource")
        Scanner scanOrder = new Scanner(System.in);
        System.out.println("Make the order");
        String orderInput = scanOrder.nextLine();
        if(orderInput.equals("PERFECT"))
            System.out.println("ORDER MADE");
    }
} // Class
