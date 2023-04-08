package Assignment;

class CommonBank {
    static double amount;
}

class Account extends CommonBank {
    int AccountNumber;
    int AccountAmount;

    Account(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    void deposit(double amt) {
        AccountAmount += amt;
        amount += amt;
    }

    void withdrawal(double amt) {
        if (amt > amount) {
            System.out.println("Not Enough Bank Balance");
        } else if (amt > AccountAmount) {
            System.out.println("Not Enough Account Balance");
        }
        AccountAmount -= amt;
        amount -= amt;
    }

    void printAmount() {
        System.out.println("Current Balance: " + amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account person = new Account(34);
        person.deposit(5200);
        person.printAmount();
        person.withdrawal(2004);
        person.printAmount();
        System.out.println("Bank Balance: " + CommonBank.amount);

    }
}
