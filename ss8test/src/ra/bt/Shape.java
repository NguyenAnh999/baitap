package ra.bt;

public abstract class Shape {
    private String color;

  public abstract void getArea();
    public abstract void display();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
