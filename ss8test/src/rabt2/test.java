package rabt2;

public class test {
    public static void main(String[] args) {
        FullTimeEmployee ain = new FullTimeEmployee("anh",50);
        System.out.println(ain.getName()+ "luong 1 ngay la" +ain.calculateSalary());
        PartTimeEmployee ain2 = new PartTimeEmployee("anh",50,5);
        System.out.println(ain2.getName()+ "luong "+ain2.getWorkingHours()+"gio cua ban  la" +ain2.calculateSalary());
    }
}
