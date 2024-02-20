import java.util.Scanner;

public class btvn8 {
    public static void main(String[] args) {
        int a,b,c;
            Scanner scannera = new Scanner(System.in);
            System.out.println("moi ban nhap ngay a:");
            a=scannera.nextInt();
            Scanner scannerb = new Scanner(System.in);
            System.out.println("moi ban nhap thang b:");
            b=scannerb.nextInt();
            Scanner scannerc = new Scanner(System.in);
            System.out.println("moi ban nhap nam c:");
            c=scannerc.nextInt();
if(a>31||b>12){
    System.out.println("ngay ban nhap khong hop le");
}else {int year=c;
    int month=b;
    int day=0;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            day=31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            day=30;
            break;
        case 2:
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                day=29;
            } else {
              day=28;
            }
            break;
        default:
            System.out.println("Nhập tháng không hợp lệ.");
    }
    if (day>=a) {
        System.out.println("ngay ban nhap hop le");
    }else {
        System.out.println("ngay khong hop le");
    }
}
}
}
