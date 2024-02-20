import java.util.Scanner;

public class btvn10 {

    public static void main(String[] args) {
        int a,b,tongluong;
            Scanner scannera = new Scanner(System.in);
            System.out.println("moi ban nhap ngay cong:");
            a=scannera.nextInt();
            Scanner scannerb = new Scanner(System.in);
            System.out.println("moi ban nhap luong co ban");
            b=scannerb.nextInt();
        if (a<=26) {
            tongluong=b*(a/26);
        }else {
            tongluong=(b*(a/26)) + ((a-26)*(b/26)) + (((a-26)*(b/26))/2);
        }
        System.out.println("luong cua ban la:"+tongluong+"vnd");
    }
}
