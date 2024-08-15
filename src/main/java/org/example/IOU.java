import java.util.HashMap;
import java.util.Map;

public class IOU {
    // Map to store the amounts owed to each person
    private Map<String, Double> debts;

    // Constructor to create a new IOU instance
    public IOU() {
        // Initialize the debts map
        this.debts = new HashMap<>();
    }

    // Sets the amount owed to a specific person
    public void setSum(String toWhom, double amount) {
        // Put the person's name and the amount owed in the debts map
        this.debts.put(toWhom, amount);
    }

    // Returns the amount owed to a specific person
    public double howMuchDoIOweTo(String toWhom) {
        // Retrieve the amount owed to the person from the debts map
        // If the person is not found, return 0.0
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    // Main method for testing the IOU class
    public static void main(String[] args) {
        // Create a new IOU instance
        IOU mattsIOU = new IOU();

        // Set the amounts owed to Arthur and Michael
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        // Print the amounts owed to Arthur and Michael
        // Expected output: 51.5 for Arthur and 30 for Michael
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}