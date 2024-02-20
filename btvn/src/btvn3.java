import java.util.Scanner;

public class btvn3 {

    public static void main(String[] args) {
        int a,b,tong=0,hieu=0,tich,thuong;
        Scanner x = new Scanner(System.in);
        System.out.println("moi ban nhap a:");
        a=x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("moi ban nhap b:");
        b=y.nextInt();
        tong=a+b;
        System.out.println("tong 2 so ban nhap la:"+tong);
        hieu=a-b;
        System.out.println("hieu 2 so ban nhap la:"+hieu);
        tich=a*b;
        System.out.println("tich 2 so ban nhap la:"+tich);
        thuong=a/b;
        System.out.println("thuong 2 so ban nhap la:"+thuong);
    }
}
