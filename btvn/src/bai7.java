import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        while (true) {
            int a;
            Scanner x = new Scanner(System.in);
            System.out.println("moi ban nhap a:");
            a=x.nextInt();
            String text;
            Scanner scanner = new Scanner(System.in);
            System.out.println("moi ban nhap lenh");
            text=scanner.nextLine();
            switch (text){
                case "chan le":
                   if (a%2==0){
                       System.out.println("so ban nhap la so chan");
                   }else {
                       System.out.println("so ban nhap la so le");
                   }
                    break;
                case "snt":
                    boolean flag = true;
                    for (int i = 2; i < a ; i++) {
                        if(a%i==0){
                            flag=false;
                        }
                    }
                    if(a<2){
                        flag=false;
                    }
                    if (!flag){
                        System.out.println("đây không là số nguyên tố");
                    }else{
                        System.out.println("đây là số nguyên tố");
                    }
                    break;
                case "thuong":

                    if (a%3==0){
                        System.out.println("dau la so chia het cho 3");
                    }else {
                        System.out.println("dau la so khong chia het cho 3");
                    }
                    break;
                case "thoat":
                    System.exit(0);
                default:
                    System.out.println("ban nhap sai");
                    break;
            }
        }
    }
}
