import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer information and the deposit amount (whole number): ");
        double rate = 0.055;
        String customerName = input.nextLine();
        int deposit = input.nextInt();

        double interest = deposit * rate;
        double total = deposit + interest;

        int truncatedTotal = (int) total;
        int roundedTotal = (int) Math.round(total);

        System.out.println("-- Report --");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Deposit: " + deposit);
        System.out.println("Interest (exact): " + interest);
        input.close();
    }
}
