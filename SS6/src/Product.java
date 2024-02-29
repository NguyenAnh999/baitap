import java.util.Scanner;

public class Product {
    private int salePrice,byePrice,total=0;
    private String msp,name;
    public Product (){

    }
   public Product (String name,String msp,int salePrice,int byePrice){
       this.msp=msp;
       this.byePrice=byePrice;
       this.salePrice=salePrice;
       this.name=name;
   }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getByePrice() {
        return byePrice;
    }

    public void setByePrice(int byePrice) {
        this.byePrice = byePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 public void input(){
     Scanner sc = new Scanner(System.in);
     System.out.println("moi ban nhap ten sp");
     this.name= sc.nextLine();
     System.out.println("moi ban nhap ma");
     this.msp= sc.nextLine();
     System.out.println("moi ban nhap gia mua hang");
     this.byePrice= Integer.parseInt(sc.nextLine());
     System.out.println("moi ban nhap vao gia ban ra");
     this.salePrice= Integer.parseInt(sc.nextLine());
 }
 public void show (){
     System.out.printf("ten san pham la: %s . co gia mua vao la: %d . co gia ban ra la: %d . ma san pham: %s",
             this.name,this.byePrice,this.salePrice,this.msp);
     System.out.println("");
 }
public void showInterest(){
        total=this.salePrice-this.byePrice;
    System.out.printf("lai xuat của san pham '%s' la: %d",this.name,this.total);
    System.out.println("");
}
}
