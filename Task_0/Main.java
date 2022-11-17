package Task_0;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
 
        GeneralShape[] sh = new GeneralShape[5];
         sh[0] = new Circle(3.5);
         sh[1] = new Circle(4);
         sh[2] = new Triangle(1.0,2.0,3, 5);
         sh[3] = new Triangle(1.0,2.0,3, 5);
         sh[4] = new Square(2);

        for (GeneralShape f: sh){
            RES(f.figureArea());
        }
        System.out.printf("%.2f", rs);
    }

    // The sum of the areas of the figures
    static double rs = 0;
    public static void RES(double r){
        rs+=r;
    }

}
