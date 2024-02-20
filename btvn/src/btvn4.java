import java.util.Scanner;

public class btvn4 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so:");
        num = scanner.nextInt();
        if (num%3==0&&num%5==0){
            System.out.println("so ban nhap chia het cho 3 va 5");
        }else {System.out.println("so ban nhap khong chia het cho 3 va 5");}

    }
}
