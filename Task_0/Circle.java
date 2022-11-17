package Task_0;

public class Circle implements GeneralShape {
     private double Pi =3.14;
     private double r =0;
     private double s = 0;

    public Circle(double R) {
         this.r = R;
    }

    public double getR() {
        return r;
    }

    public void setR(double R) {
        this.r = R;
    }

    @Override
    public double figureArea(){
        s = Pi*(getR()*getR());
        return s;
    }
}
