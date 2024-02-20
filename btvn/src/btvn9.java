import java.util.Scanner;

public class btvn9 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scannera = new Scanner(System.in);
        System.out.println("moi ban nhap a:");
        a=scannera.nextInt();
        Scanner scannerb = new Scanner(System.in);
        System.out.println("moi ban nhap b:");
        b=scannerb.nextInt();
        Scanner scannerc = new Scanner(System.in);
        System.out.println("moi ban nhap c:");
        c=scannerc.nextInt();
        if (a>b&&b>c) {
            System.out.println(a+","+b+","+c);
        } else if (b>a&&a>c){
            System.out.println(b+","+a+","+c);
        }else if (c>a&&a>b){
            System.out.println(c+","+a+","+b);
        } else if (c>b&&b>a) {
            System.out.println(c+","+b+","+a);
        }else if (b>c&&c>a){
            System.out.println(b+","+c+","+a);
        }else
        { System.out.println(a+","+c+","+b);}
    }
}
