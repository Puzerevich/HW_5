package Task_0;

public class Triangle implements GeneralShape {

    private double SideA = 0;
    private double SideB = 0;
    private double SideC = 0;
    private double Radius= 0;
    private double  s = 0;

    public Triangle(double v, double v1, double v2) {
    }
    public Triangle(double sideA, double sideB, double sideC, double radius) {
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
        Radius = radius;
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        this.SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        this.SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        this.SideC = sideC;
    }

    public double getRadius() {
        return this.Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    // Formula: three sides and radius
    @Override
    public double figureArea(){
        s =  ((getSideA()+getSideB()+getSideC())/2)*Radius;
        return s;
    }
}
