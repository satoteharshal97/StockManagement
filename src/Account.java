import java.util.Scanner;

public class Account {

    public static final double BALANCE = 5000;

    public static void main(String[] args) {
        System.out.println("Account Balance:5000");
        Account.debit();
    }

    public static void debit() {
        System.out.println("How much money do you want  to withdraw from account");
        Scanner scanner = new Scanner(System.in);
        double withdrawAmount = scanner.nextInt();
        if (withdrawAmount < BALANCE) {
            double amountLeft = BALANCE - withdrawAmount;
            System.out.println("Amount left after withdraw: " + amountLeft);
        } else {
            System.out.println("Debit Amount exceeded account balance");
        }
    }
}
