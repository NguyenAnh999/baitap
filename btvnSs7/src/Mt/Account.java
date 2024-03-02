package Mt;

public class Account {
    private int accountNo;
    private String customerName;
    private int balance;

    public Account() {
    }

    public Account(int accountNo, String customerName, int balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "xin chao: "+customerName+",ID của bạn là: "+accountNo+",số dư tài khoản: "+balance;
    }
}
