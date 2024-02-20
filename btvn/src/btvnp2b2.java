import java.util.Scanner;

public class btvnp2b2 {
    public static void main(String[] args) {
        System.out.println("*********menu***********");
        System.out.println("1. pho tom hum");
        System.out.println("2. pho bo kobe");
        System.out.println("3. pho ga VN");
        System.out.println("4. pho xoi trung thit");
        System.out.println("5. banh mi");
        System.out.println("6. mi tom");
        System.out.println("7. thoat");
        while (true){
            int num;
            Scanner scanner=new Scanner(System.in);
            System.out.println("moi ban nhap :");
            num = scanner.nextInt();
            switch (num){
                case 1 :
                    System.out.println("ban vua goi pho tom hum vui long doi giay lat ");
                    break;
                case 2 :
                    System.out.println("ban vua goi pho bo kobe vui long doi giay lat ");
                    break;
                case 3 :
                    System.out.println("ban vua goi pho ga VN vui long doi giay lat ");
                    break;
                case 4 :
                    System.out.println("ban vua goi pho xoi trung thit vui long doi giay lat ");
                    break;
                case 5 :
                    System.out.println("ban vua goi banh mi vui long doi giay lat ");
                    break;
                case 6 :
                    System.out.println("ban vua goi mi tom vui long doi giay lat ");
                    break;
                case 7 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        }
    }
    }

