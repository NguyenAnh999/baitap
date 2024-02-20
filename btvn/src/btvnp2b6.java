import java.util.Scanner;

public class btvnp2b6 {
    public static void main(String[] args) {
        while (true) {
            int a,b,tong=0,hieu=0,tich,thuong;
            Scanner x = new Scanner(System.in);
            System.out.println("moi ban nhap a:");
            a=x.nextInt();
            Scanner y = new Scanner(System.in);
            System.out.println("moi ban nhap b:");
            b=y.nextInt();
            String text;
            Scanner scanner = new Scanner(System.in);
            System.out.println("moi ban nhap lenh");
            text=scanner.nextLine();
            switch (text){
                case "tong":
                    tong=a+b;
                    System.out.println("tong 2 so ban nhap la:"+tong);
                    break;
                case "hieu":
                    hieu=a-b;
                    System.out.println("hieu 2 so ban nhap la:"+hieu);
                    break;
                case "tich":
                    tich=a*b;
                    System.out.println("tich 2 so ban nhap la:"+tich);
                    break;
                case "thuong":
                    thuong=a/b;
                    System.out.println("thuong 2 so ban nhap la:"+thuong);
                    break;
                case "thuong co du":
                    thuong=a%b;
                    System.out.println("thuong 2 so ban nhap co so du la la:"+thuong);
                    break;
                case "uoc chung":
                    int gcd = 1;
                    for(int i = 1; i <= a && i <= b; i++)
                    {
                        if(a%i==0 && b%i==0)
                            gcd = i;
                    }
                    System.out.printf("Ước chung lớn nhất của %d và %d là: %d", a, b, gcd);
                    System.out.println("");
                    break;
                case "boi chung":
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
                case "thoat":
                    System.exit(0);
                default:
                    System.out.println("ban nhap sai");
            }
        }
    }
}
