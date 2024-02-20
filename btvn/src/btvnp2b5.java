import java.util.Scanner;

public class btvnp2b5 {
    public static void main(String[] args) {
        int a, tich;
        Scanner scanner= new Scanner(System.in);
        System.out.println("moi ban nhap bang cuu chuong muon in");
        a=scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            tich=a*i;
            System.out.println(a+"x"+i+"="+tich);
        }
        System.out.println("*********bang cu truong tu 1-9*************");
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=10; j++) {
                tich=j*i;
                System.out.println(i+"x"+j+"="+tich);
            }
        }
    }

}
