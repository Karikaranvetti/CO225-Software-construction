public class TestAccount {
    public static void main(String [] args) {
        String accNumber = "057-121-3234-4431";
        Account acc = new Account(accNumber);
        // create a new customer and associate this account with

        Customer cus = new
        Customer("Dhammika Elkaduwe", "1234", accNumber, acc);
        acc.setCustomer(cus); // set the customer of account
        acc.show();
        acc.deposit(5000);
        acc.show();
        acc.withdraw(6500);
    }
}