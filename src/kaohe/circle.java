package kaohe;

public class circle extends shape{
    private double area;

    public circle() {
    }

    public circle(double r) {
        super(r);
    }

    @Override
    void getArea() {
        area=3.14*super.getR()*super.getR();
    }
}
