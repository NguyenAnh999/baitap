import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao so hang");
        int hang = sc.nextInt();
        System.out.println("so cot");
        int cot = sc.nextInt();
        int [][] maTRan = new int [hang][cot];

        while (true){
            System.out.println("===========MENU==========");
            System.out.println("1: Nhập vào giá trị các phần tử mảng");
            System.out.println("2: In ra các phần tử mảng");
            System.out.println("3: Hiển thị dưới dạng ma trận");
            System.out.println("4: In ra đường chéo chính");
            System.out.println("5: In ra Đường chéo phụ");
            System.out.println("6: In ra đường biên");
            System.out.println("7: thoat ");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("moi ban nhap vao gia tri phan tu mang");
                    for (int i = 0; i < maTRan.length; i++) {
                        for (int j = 0; j < maTRan[i].length; j++) {
                            maTRan[i][j]= sc.nextInt();
                        }
                    }
                case 2:
                    for (int i = 0; i < maTRan.length; i++) {
                        for (int j = 0; j < maTRan[i].length; j++) {
                            System.out.println(maTRan[i][j]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < maTRan.length; i++) {
                        for (int j = 0; j < maTRan.length; j++) {
                            System.out.print(maTRan[i][j]);
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    int a = 0;
                    for (int i = 0; i < maTRan.length; i++) {
                        for (int j = 0; j < maTRan[i].length; j++) {
                            if (a==j){
                                System.out.print(maTRan[i][j]);
                            }else {System.out.print(" ");}
                        }
                        a++;
                        System.out.println("");
                    }
                    break;
                case 5:
                    if(hang==cot){
                        int b = hang-1;
                        for (int i = 0; i < maTRan.length; i++) {
                            for (int j = 0; j < maTRan[i].length; j++) {
                                if (b==j){
                                    System.out.print(maTRan[i][j]);
                                }else {System.out.print(" ");}
                            }

                            System.out.println("");
                            b--;
                        }
                    }else {
                        System.out.println("ma tran nay ko co duong cheo phu");
                    }
                    break;
                case 6:
                    int c = 0;
                    for (int i = 0; i < maTRan.length; i++) {
                        for (int j = 0; j < maTRan[i].length; j++) {
                           if (i==0||i==maTRan.length-1){
                               System.out.print(maTRan[i][j]);
                           } else if (j==0||j==maTRan[i].length-1) {
                               System.out.print(maTRan[i][j]);
                           }else {
                               System.out.print(" ");
                           }
                        }
                        System.out.println("");
                    }
                    break;
                default:

            }
        }
    }
}
