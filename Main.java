import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // --- Setup ---
        HardwareRepository repo = new HardwareRepository();
        repo.fetchData();
        ArrayList<Hardware> list = repo.getHardwareList();

        // --- Menu ---
        Scanner scanner = new Scanner(System.in);


        System.out.println("HARDWARE LOGIC INTERPRETER");

        System.out.println("1. Print Hardware Masterlist");
        System.out.println("2. Print Laptop and Phone Inventory");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.println();

        // --- Option 1: Hardware Masterlist ---
        if (choice == 1) {

            System.out.println("HARDWARE MASTERLIST");

            for (Hardware hw : list) {
                System.out.println(hw);
            }

        // --- Option 2: Laptop and Phone Inventory ---
        } else if (choice == 2) {

            // Laptop counters
            int count4GBLaptop  = 0;
            int count8GBLaptop  = 0;
            int count16GBLaptop = 0;
            int count32GBLaptop = 0;
            int count64GBLaptop = 0;

            // Phone counters
            int count4MPPhone   = 0;
            int count8MPPhone   = 0;
            int count16MPPhone  = 0;
            int count48MPPhone  = 0;
            int count50MPPhone  = 0;
            int count108MPPhone = 0;

            // Single loop with instanceof
            for (Hardware hw : list) {
                if (hw instanceof Laptop) {
                    if (hw.getSpec() == 4)  count4GBLaptop++;
                    else if (hw.getSpec() == 8)  count8GBLaptop++;
                    else if (hw.getSpec() == 16) count16GBLaptop++;
                    else if (hw.getSpec() == 32) count32GBLaptop++;
                    else if (hw.getSpec() == 64) count64GBLaptop++;
                } else if (hw instanceof Phone) {
                    if (hw.getSpec() == 4)   count4MPPhone++;
                    else if (hw.getSpec() == 8)   count8MPPhone++;
                    else if (hw.getSpec() == 16)  count16MPPhone++;
                    else if (hw.getSpec() == 48)  count48MPPhone++;
                    else if (hw.getSpec() == 50)  count50MPPhone++;
                    else if (hw.getSpec() == 108) count108MPPhone++;
                }
            }

            System.out.println("LAPTOP AND PHONE INVENTORY");


            System.out.println("\Laptop Inventory");
            if (count4GBLaptop > 0) System.out.println("4GB RAM Laptops: " + count4GBLaptop);
            if (count8GBLaptop > 0) System.out.println("8GB RAM Laptops: " + count8GBLaptop);
            if (count16GBLaptop > 0) System.out.println("16GB RAM Laptops: " + count16GBLaptop);
            if (count32GBLaptop > 0) System.out.println("32GB RAM Laptops: " + count32GBLaptop);
            if (count64GBLaptop > 0) System.out.println("64GB RAM Laptops: " + count64GBLaptop);

            System.out.println("\nPhone Inventory");
            if (count4MPPhone > 0) System.out.println("4MP Phones: " + count4MPPhone);
            if (count8MPPhone > 0) System.out.println("8MP Phones: " + count8MPPhone);
            if (count16MPPhone > 0) System.out.println("16MP Phones: " + count16MPPhone);
            if (count48MPPhone > 0) System.out.println("48MP Phones: " + count48MPPhone);
            if (count50MPPhone > 0) System.out.println("50MP Phones: " + count50MPPhone);
            if (count108MPPhone > 0) System.out.println("108MP Phones: " + count108MPPhone);

        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        System.out.println("\n========================================");
        scanner.close();
    }
}
