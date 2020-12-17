public class Customer{
    private String name;
    private String pin;
    private String accountNum;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public boolean check_pin(String pin) {
        return this.pin.equals(pin);
    }
    public boolean check_name(String name) {
        return this.name.equals(name);
    }
    public Customer(String name, String pin,String accountNum, Account account) {  // call the constuctor 
        this.name = name;
        this.pin = pin;
        this.accountNum = accountNum; 
        this.account = account;
    }

    



}