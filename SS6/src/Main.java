import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=1,a;
        Product[] arrproduct;
        System.out.println("moi ban nhap số lượng mặt hàng");
        x = Integer.parseInt(sc.nextLine());
        arrproduct= new Product[x];
        for (int i = 0; i < arrproduct.length; i++) {
            Product call = new Product();
            call.input();
            arrproduct[i]=call;
        }
        do{
            System.out.println("**********Menu****************");
            System.out.println("1. nhap thong tin san pham");
            System.out.println("2. hien thong tin san pham");
            System.out.println("3. lai xuat ");
            System.out.println("moi ban nhap lenh");
            a = Integer.parseInt(sc.nextLine());
            switch (a) {
                case 1:
                    System.out.println("moi ban nhap số lượng mặt hàng");
                    x = Integer.parseInt(sc.nextLine());
                    arrproduct= new Product[x];
                    for (int i = 0; i < arrproduct.length; i++) {
                        Product call = new Product();
                        call.input();
                        arrproduct[i]=call;
                    }
                case 2:
                    for (Product pr :arrproduct){
                        pr.show();
                    }
                case 3:
                    for (Product pr :arrproduct){
                        pr.showInterest();
                    }
            }
        }while (true);



    }
}