import java.util.Scanner;

public class bai8 {
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
                int chuvi=a+b+c;
                System.out.println("chu vi hinh tam giac la:"+chuvi);
                float p=chuvi/2;
                float s=p*(p-a)*(p-b)*(p-c);
                System.out.println("dien hinh tam giac la:"+Math.sqrt(s)+"cm vuong");
                check=false;
            }
        }
    }
}
