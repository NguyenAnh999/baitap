import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int num;
        String text;
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi ban nhap :");
        num = scanner.nextInt();
        switch (num){
            case 1 :
                System.out.println("mot");
                break;
            case 2 :
                System.out.println("hai");
                break;
            case 3 :
                System.out.println("ba");
                break;
            case 4 :
                System.out.println("bon");
                break;
            case 5 :
                System.out.println("nam");
                break;
            case 6 :
                System.out.println("sau");
                break;
            case 7 :
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9 :
                System.out.println("chin");
                break;
        }
    }
}
