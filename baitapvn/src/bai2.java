import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
       int[] num = new int[5];
       int a,tong=0,x=1;
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("mời bạn nhập số thứ "+x);
            a=scaner.nextInt();
            num[i]=a;
            x++;
        }
        for (int i = 0; i < num.length; i++) {
            tong+=num[i];
        }
        System.out.println("tong 5 so ban vua nhap la:"+tong);
    }

}
