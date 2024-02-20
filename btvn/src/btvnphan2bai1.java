import java.util.Scanner;

public class btvnphan2bai1 {
    public static void main(String[] args) {
            int num=10;
            int total=0;
            for (int i = 1; i <= num; i++) {
                if (i%2==0){
                    total+=i;
                }
            }
            System.out.println("tổng tất cả số chẵn trong khoảng từ 0 la:"+total);
    }
}
