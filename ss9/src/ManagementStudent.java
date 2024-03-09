import entity.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("____________MENU____________");
            System.out.println("1: Nhập thông tin n sinh viên");
            System.out.println("2: Tính điểm trung bình sinh viên");
            System.out.println("3: Xét điểm qua cho sinh viên");
            System.out.println("4: Hiển thị thông tin sinh viên");
            System.out.println("5: Thoát");
            System.out.println("mời bạn chọn");
            int x = Integer.parseInt(sc.nextLine());
            switch (x){
                case 1:
                    System.out.println("mời bạn nhập số lượng sinh viên");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputData();
                        std.diemTD();
                        std.check();
                        list.add(std);
                    }
                    break;
                case 2:
                    for (Student std :list){
                        System.out.println("Tên sinh viên:"+std.getStudentName());
                        System.out.println("Điểm trung bình:"+std.getDiemTB());
                    }
                    break;
                case 3:
                    String a;
                    for (Student std :list){
                        if (std.isStatus()){
                            a=" Đạt";
                        }else {
                            a=" Không đạt";
                        }
                        System.out.println("Sinh viên:"+std.getStudentName()+"Có điểm trung bình là:"+std.getDiemTB()+a);
                    }
                    break;
                case 4:
                    for (Student std :list){
                       std.displayData();
                    }

                    break;
                case 5 :
                    System.exit(0);
            }
        }while (true);
    }
}
