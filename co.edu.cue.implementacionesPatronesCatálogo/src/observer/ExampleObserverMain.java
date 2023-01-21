package observer;

public class ExampleObserverMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        BankExpense bankExpense1 = new BankExpense("commission", 0.11d);
        BankExpense bankExpense2 = new BankExpense("expense", 0.22d);
        BankExpense bankExpense3 = new BankExpense("compensation", 0.33d);

        bankAccount.addObserver(bankExpense1);
        bankAccount.addObserver(bankExpense2);
        bankAccount.addObserver(bankExpense3);

        bankAccount.addAmount(1000d);

        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());
    }
}
