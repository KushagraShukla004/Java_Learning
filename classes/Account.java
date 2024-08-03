import java.util.Scanner;

class HolderDetails {
    int holder_no;
    String holder_name;
    int holder_balance;

    // getter
    HolderDetails(int num, String name, int balance) {
        holder_no = num;
        holder_name = name;
        holder_balance = balance;
    }

    // setter
    int Acc_number() {
        return holder_no;
    }

    String Acc_name() {
        return holder_name;
    }

    int Acc_balance() {
        return holder_balance;
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of account holder: ");
        String name = scan.nextLine();
        System.out.println("Enter the account number: ");
        int num = scan.nextInt();
        System.out.println("Enter the account balance:");
        int balance = scan.nextInt();
        HolderDetails details = new HolderDetails(num, name, balance);
        System.out.println("Account number: " + details.Acc_number());
        System.out.println("Account name: " + details.Acc_name());
        System.out.println("Account balance: " + details.Acc_balance());
        scan.close();
    }
}