import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainx {


    public static void quanLy() {
        System.out.println("➢ ===== QUẢN LÝ THƯ VIỆN ===== \n" +
                "1. Quản lý Thể loại \n" +
                "2. Quản lý Sách \n" +
                "3. Thoát ");
        System.out.println("mời bạn chọn");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                do {
                    System.out.println("➢ ===== QUẢN LÝ THỂ LOẠI ===== \n" +
                            "1. Thêm mới thể loại \n" +
                            "2. Hiển thị danh sách theo tên A – Z \n" +
                            "3. Thống kê thể loại và số sách có trong mỗi thể loại \n" +
                            "4. Cập nhật thể loại \n" +
                            "5. Xóa thể loại \n" +
                            "6. Quay lại ");
                    System.out.println("mời bạn chọn");
                    int y = sc.nextInt();
                    switch (y) {
                        case 1:
                            Category khoiTao = new Category();
                            khoiTao.input();
                        case 2:
                            System.out.println();
                        case 6:
                            mainx.quanLy();
                            break;
                    }
                } while (true);
            case 2:
                do {
                    System.out.println(" ➢ ===== QUẢN LÝ SÁCH ===== \n" +
                            "1. Thêm mới sách \n" +
                            "2. Cập nhật thông tin sách \n" +
                            "3. Xóa sách \n" +
                            "4. Tìm kiếm sách  \n" +
                            "5. Hiển thị danh sách sách theo nhóm thể loại \n" +
                            "6. Quay lại ");
                    System.out.println("mời bạn chọn");
                    int z = sc.nextInt();
                    switch (z) {
                        case 6:
                            mainx.quanLy();
                            break;
                    }
                } while (true);
        }
    }
}
