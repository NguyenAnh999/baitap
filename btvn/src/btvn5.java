import java.util.Scanner;

public class btvn5 {
    public static void main(String[] args) {
        boolean check=true;
        int a,b,c;
        int canhhuyen,canh1,canh2;
        while (check==true){
            Scanner scannera = new Scanner(System.in);
            System.out.println("moi ban nhap canh a:");
            a=scannera.nextInt();
            Scanner scannerb = new Scanner(System.in);
            System.out.println("moi ban nhap canh b:");
            b=scannerb.nextInt();
            Scanner scannerc = new Scanner(System.in);
            System.out.println("moi ban nhap canh c:");
            c=scannerc.nextInt();
            if (a>=b&&a>=c){
                canhhuyen=a;
                canh2=b;
                canh1=c;
            } else if (b>=c && b>=a) {
                canhhuyen=b;
                canh2=a;
                canh1=c;
            }else {
                canhhuyen=c;
                canh2=b;
                canh1=a;
            }
            if(canh2+canh1<=canhhuyen){
                System.out.println("ban nhap khong dung");
                check=true;
            }else {
               if (a==b&&a==c){
                   System.out.println("day la tam giac deu");
               } else if (canh1==canh2) {
                   System.out.println("day la tam giac can");
               } else if (a*a==b*b+c*c  ||b*b==a*a+c*c || c*c==a*a+b*b) {
                   System.out.println("day la tam giac vuong");
               } else if (a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) {
                   System.out.println("day la tam giac tu");
               } else {
                  System.out.println("day la tam giac nhon");
               }
                check=false;
            }
        }
    }
}





