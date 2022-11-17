package Task_0;

public class Square implements GeneralShape {
    private double Side = 0;
    private double  s = 0;

    public Square() {
    }

    public Square(double side) {
        Side = side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    @Override
    public double figureArea() {
        return getSide()*getSide();
    }

}
