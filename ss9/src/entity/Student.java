package entity;

import ra.ift.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String StudentId;
    private String StudentName;

    private int age;
    private float  DiemToan;
    private float DiemLy;
    private float DiemHoa;
    private float DiemTB;
    private boolean Status;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB, boolean status) {
        StudentId = studentId;
        StudentName = studentName;
        this.age = age;
        DiemToan = diemToan;
        DiemLy = diemLy;
        DiemHoa = diemHoa;
        DiemTB = diemTB;
        Status = status;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(float diemToan) {
        DiemToan = diemToan;
    }

    public float getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(float diemLy) {
        DiemLy = diemLy;
    }

    public float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        DiemHoa = diemHoa;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float diemTB) {
        DiemTB = diemTB;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public void inputData() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập vào: mã sinh viên ");
        StudentId = sc.nextLine();
        System.out.println("Mời bạn nhập vào: Tên  ");
        StudentName = sc.nextLine();
        System.out.println("Mời bạn nhập vào Tuổi");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập vào điểm toán ");
        DiemToan=Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập vào điểm lý");
        DiemLy =Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập vào điểm hóa ");
        DiemHoa =Integer.parseInt(sc.nextLine());


    }

    @Override
    public void displayData() {
        System.out.println("Mã sinh viên:"+StudentId);
        System.out.println("Tên sinh viên:"+StudentName);
        System.out.println("Tuổi sinh viên:"+age);
        System.out.println("Diểm toán:"+DiemToan);
        System.out.println("Điểm lý viên:"+DiemLy);
        System.out.println("Điểm hóa:"+DiemHoa);
        System.out.println("Điểm trung bình :"+DiemTB);

    }
public void diemTD(){
    DiemTB=(DiemToan+DiemLy+DiemHoa)/3;
}
public void check(){
    if (DiemTB>MARK_PASS ){
        Status=true;
    }else {
        Status=false;
    }
}
}
