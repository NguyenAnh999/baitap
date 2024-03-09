import ra.bt.Circle;
import ra.bt.Rectangle;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
do {
    System.out.println("_________menu_________");
    System.out.println("1. hình tròn");
    System.out.println("2. hcn");
    System.out.println("moi bạn chọn hình");
    int x = Integer.parseInt(scanner.nextLine());
    switch (x){
        case 1:
            System.out.println("mời bạn nhập bán kính");
            float r = Integer.parseInt(scanner.nextLine());
            Circle s = new Circle(r);
            System.out.println("mời bạn nhập vào màu của hình");
            String cl = scanner.nextLine();
            s.setColor(cl);
            s.display();
            s.getArea();
            break;

        case 2:
            System.out.println("mời bạn nhập chiều dài");
            float w = Integer.parseInt(scanner.nextLine());
            System.out.println("mời bạn nhập chiều rộng");
            float h = Integer.parseInt(scanner.nextLine());
            Rectangle S = new Rectangle(w,h);
            System.out.println("mời bạn nhập vào màu của hình");
            String clx = scanner.nextLine();
            S.setColor(clx);
            S.display();
            S.getArea();
            break;

    }

}while (true);
    }
}