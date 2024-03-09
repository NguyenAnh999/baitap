import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category implements IEntity{
    private ArrayList<Category> List;
    private int id;
    private String name;
    private boolean status;

    public Category() {}

    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    // Getter and Setter methods

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("mời bạn nhập Id thể loại: ");
        this.id = scanner.nextInt();

        scanner.nextLine(); // Consume newline character

        System.out.print("mời bạn nhập tên (6-30 kí tự): ");
        this.name = scanner.nextLine();
        while (this.name.length() < 6 || this.name.length() > 30) {
            System.out.println("Tên thể loại phải có từ 6-30 kí tự");
            System.out.print("mời bạn nhâp lại tên thể loại");
            this.name = scanner.nextLine();
        }

        System.out.print("mời bạn nhập trạng thái (true/false): ");
        this.status = scanner.nextBoolean();
        Category danhMuc = new Category(id,name,status);
        this.List = new ArrayList<>();
        List.add(danhMuc);

    }

    @Override
    public void output() {
        System.out.println("ID thể loại: " + id);
        System.out.println("Tên thể loại: " + name);
        System.out.println("Trạng thái thể loại: " + (status ? "Active" : "Inactive"));
    }

    public ArrayList<Category> getList() {
        return List;
    }

    public void setList(ArrayList<Category> list) {
        List = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
