import java.util.Scanner;

public class btvnp2b8 {

    public static void main(String[] args) {
        int a;
        Scanner scannera = new Scanner(System.in);
        System.out.println("moi ban nhap  a:");
        a=scannera.nextInt();
        System.out.println("***************practice*************");
        System.out.println("1.in day so chia het cho 2 va giam dan");
        System.out.println("2.in cac so nho hon n va tinh tong");
        System.out.println("3.in ra cac uoc so chan");
        System.out.println("4.in ra uoc le va so luong uoc le");
        System.out.println("5.in ra uoc le lon nhat");
        System.out.println("6.thoat");

        while (true){
            int num,tong=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("moi ban nhap :");
            num = scanner.nextInt();
            switch (num){
                case 1 :
                    for (int i = num; i >= 0; i--) {
                        if (i%2==0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 2 :
                    for (int i = 0; i < num; i++) {
                        tong+=i;
                    } System.out.println("tong ="+tong);
                    break;
                case 3 :
                    for (int i = 0; i < num; i++) {
                        if(num % i==0){
                            if(i%2==0){
                                tong+=i;
                            }
                        }
                    } System.out.println("tong cac uoc chan ="+tong);
                    break;
                case 4 :
                    for (int i = 0; i < num; i++) {
                        if(num%i==0){
                            if(i%2!=0){
                                System.out.println(i);
                                tong++;
                            }
                        }
                    } System.out.println("so uoc lẻ là ="+tong);
                    break;
                case 5 :
                    int x=0;
                    for (int i = 0; i < num; i++) {
                        if(num%i==0){
                            if(i%2!=0){
                               x=i;
                            }
                        }
                    }
                    System.out.println(x);
                    break;
                case 6 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        }
    }
}
