import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

            int a,b,tong=0,hieu=0,tich,thuong;
            Scanner x = new Scanner(System.in);
            System.out.println("moi ban nhap a:");
            a=x.nextInt();
            Scanner y = new Scanner(System.in);
            System.out.println("moi ban nhap b:");
            b=y.nextInt();
        while (true) {
            int text;
            Scanner scanner = new Scanner(System.in);
            System.out.println("*********CACULATOR*********** ");
            System.out.println("1: Tổng 2 số");
            System.out.println("2: Hiệu 2 số");
            System.out.println("3: tich 2 số");
            System.out.println("4: Thương 2 số");
            System.out.println("5: Số dư trong phép chia 2 số");
            System.out.println("6: Ước chung lớn nhất");
            System.out.println("7: Bội chung nhỏ nhất");
            System.out.println("8: thoat");
            System.out.println("moi ban nhap lenh");
            text=scanner.nextInt();
            switch (text){
                case 1:
                    tong=a+b;
                    System.out.println("tong 2 so ban nhap la:"+tong);
                    break;
                case 2:
                    hieu=a-b;
                    System.out.println("hieu 2 so ban nhap la:"+hieu);
                    break;
                case 3:
                    tich=a*b;
                    System.out.println("tich 2 so ban nhap la:"+tich);
                    break;
                case 4:
                    thuong=a/b;
                    System.out.println("thuong 2 so ban nhap la:"+thuong);
                    break;
                case 5:
                    thuong=a%b;
                    System.out.println("thuong 2 so ban nhap co so du la la:"+thuong);
                    break;
                case 6:
                    int gcd = 1;
                    for(int i = 1; i <= a && i <= b; i++)
                    {
                        if(a%i==0 && b%i==0)
                            gcd = i;
                    }
                    System.out.printf("Ước chung lớn nhất của %d và %d là: %d", a, b, gcd);
                    System.out.println("");
                    break;
                case 7:
                    int lcm,gdc=1;
                    for(int i = 1; i <= a && i <= b; i++)
                    {
                        if(a%i==0 && b%i==0)
                            gdc = i;
                    }
                    lcm = (a * b) / gdc;
                    System.out.printf("Bội chung nhỏ nhất của %d và %d là: %d", a, b, lcm);
                    System.out.println("");
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("ban nhap sai");
            }
        }
    }
}
