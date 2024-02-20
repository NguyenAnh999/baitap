import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        float a,b,c,Dtb;
            Scanner scannera = new Scanner(System.in);
            System.out.println("moi ban diem html:");
            a=scannera.nextFloat();
            Scanner scannerb = new Scanner(System.in);
            System.out.println("moi ban nhap diem css:");
            b=scannerb.nextFloat();
            Scanner scannerc = new Scanner(System.in);
            System.out.println("moi ban nhap diem js:");
            c=scannerc.nextFloat();
            Dtb=(a+b+c)/3;
        if (Dtb>=9){
            System.out.println("hoc sinh xuat sac");
        }else if (Dtb>=8){
            System.out.println("hoc sinh gioi");
        }else if (Dtb>=7){
            System.out.println("hoc sinh  kha");
        } else if (Dtb>=5) {
            System.out.println("hoc sinh trung binh");
        } else{
            System.out.println("hoc sinh yeu");
        }
    }
}
