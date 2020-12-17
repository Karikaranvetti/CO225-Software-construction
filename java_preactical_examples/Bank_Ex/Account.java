public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
    }
    public void deposit(float amount) {
        balance += amount;
    }
    
    public void withdraw(float amount) {
        if(getBalance() > amount) balance -= amount;
        else System.out.println("This cannot happen");
    }
    public Account(String accountNumber) {
            this.balance = 0;
            this.accountNumber = accountNumber;
            this.customer = null;
    }
    public void show() {
        System.out.println(customer.getName()+" have blance as "+balance+" in accountNumber "+accountNumber);
       
        
    }
}