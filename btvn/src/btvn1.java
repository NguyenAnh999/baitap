import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so:");
        num = scanner.nextInt();
        if (num%2==0){
            System.out.println("so ban nhap chan");
        }else {System.out.println("so ban nhap le");}
    }
}
