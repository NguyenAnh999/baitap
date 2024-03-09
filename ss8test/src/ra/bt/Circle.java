package ra.bt;

public class Circle extends Shape{
    private float banKinh;

    public Circle() {
    }

    public Circle(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void getArea() {
        double v = banKinh * banKinh * 3.14;
        System.out.println("diẹn tích hình tròng là: "+v);
    }

    @Override
    public void display() {
        System.out.println("màu của hinhf tròn là: "+super.getColor());
    }
}
