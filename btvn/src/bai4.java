import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int a,b,tong=0;
        Scanner x = new Scanner(System.in);
        System.out.println("moi ban nhap a:");
        a=x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("moi ban nhap b:");
        b=y.nextInt();
        for (int i = a; i <= b; i++) {
            if (i%2==0){
                tong+=i;
            }
        }
        System.out.println("tong cac so chan tu a den b la:"+tong);
    }
}
