package Mt;

public class SavingAccount extends Account{
    private int period;

    private double rate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(int accountNo, String customerName, int balance, int period) {
        super(accountNo, customerName, balance);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double checkInterest(){
        switch (period){
            case 1:
                return 5;
            case 3:
                return 5.5;
            case 6:
                return 6;
            case 12:
                return 7;
            case 24:
                return 7.5;
            case 36:
                return 8;
            default:
                return 1.8;
        }
    }

    public String toString (){
        double b = super.getBalance()/100f*this.checkInterest();
        return super.toString()+"neu ban gủi trong "+period+"tháng thì lãi xuất sẽ là: "+this.checkInterest()+"% " +
                "tương đương "+b ;
    }
}
