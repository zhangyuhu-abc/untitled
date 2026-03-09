package kaohe;

public abstract class shape {
    private double r;

    public shape() {
    }

    public shape(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    abstract void getArea();
}
