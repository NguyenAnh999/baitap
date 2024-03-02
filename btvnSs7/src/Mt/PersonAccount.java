package Mt;

public class PersonAccount extends Account{
    private int fee,x;
    public PersonAccount() {
        super();
    }

    public PersonAccount(int accountNo, String customerName, int balance, int fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    public String withDraw(){
         x= super.getBalance()-fee;

        String s=super.toString()+"số tiền bạn vừa rút là: "+fee+"$, ban conf lại: "+x+"$";
        return s;
    }
    public String deposite(){
         x= super.getBalance()+fee;
        String s= super.toString()+"số tiền bạn vừa nạp vào là: "+fee+"$, ban có: "+x+"$";
        return s;
    }
//    public void load(){
//        super.setBalance(x);
//    }
}
