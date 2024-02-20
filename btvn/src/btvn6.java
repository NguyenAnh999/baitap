import java.util.Scanner;

public class btvn6 {
    public static void main(String[] args) {
        int a,b,sodien,money;
        Scanner scannera = new Scanner(System.in);
        System.out.println("moi ban nhap chi so dau thang:");
        a=scannera.nextInt();
        Scanner scannerb = new Scanner(System.in);
        System.out.println("moi ban nhap chi so cuoi thang:");
        b=scannerb.nextInt();
        sodien=b-a;
        if (sodien<50) {
            money= sodien*10;
            System.out.println("tien dien cua ban la:"+money+".000vnd");
        } else if (sodien<100) {
            money= sodien*15;
            System.out.println("tien dien cua ban la:"+money+".000vnd");
        }else if (sodien<150) {
            money= sodien*20;
            System.out.println("tien dien cua ban la:"+money+".000vnd");
        }else if (sodien<200) {
            money= sodien*25;
            System.out.println("tien dien cua ban la:"+money+".000vnd");
        } else {
            money= sodien*30;
            System.out.println("tien dien cua ban la:"+money+".000vnd");
        }
    }
}
