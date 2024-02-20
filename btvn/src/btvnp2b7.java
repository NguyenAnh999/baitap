import java.util.Scanner;

public class btvnp2b7 {
    public static void main(String[] args) {
        int a,b,c;
            Scanner scannera = new Scanner(System.in);
            System.out.println("moi ban nhap  a:");
            a=scannera.nextInt();
            Scanner scannerb = new Scanner(System.in);
            System.out.println("moi ban nhap  b:");
            b=scannerb.nextInt();
            Scanner scannerc = new Scanner(System.in);
            System.out.println("moi ban nhap  c:");
            c=scannerc.nextInt();
        System.out.println("*********menu***********");
        System.out.println("1. tong 3 so");
        System.out.println("2. trung binh 3 so");
        System.out.println("3. so lon nhat ,so nho nhat");
        System.out.println("4. thoat");
        while (true){
            int num,tong;
            Scanner scanner=new Scanner(System.in);
            System.out.println("moi ban nhap :");
            num = scanner.nextInt();
            switch (num){
                case 1 :
                    tong = a+b+c;
                    System.out.println("tong 3 so la: "+tong);
                    break;
                case 2 :
                    tong=(a+b+c)/3;
                    System.out.println("trung binh 3 so la;"+tong);
                    break;
                case 3 :
                    if (a>b&&a>c){
                        System.out.println(a+"la so lon nhat");
                    } else if (b>a&&b>c) {
                        System.out.println(b+"la so lon nhat");
                    } else{
                        System.out.println(c+"la so lon nhat");
                    }
                    if (a<b&&a<c){
                        System.out.println(a+"la so nho nhat");
                    } else if (b<a&&b<c) {
                        System.out.println(b+"la so nho nhat");
                    } else{
                        System.out.println(c+"la so nho nhat");
                    }
                        break;
                case 4 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        }
    }
}
