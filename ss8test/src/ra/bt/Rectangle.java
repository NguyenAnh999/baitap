package ra.bt;

public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
double s = width*height;
        System.out.println("dien tích hình chu nhat la: "+s);
    }

    @Override
    public void display() {
        System.out.println("màu của chu nhật là: "+super.getColor());

    }
}
