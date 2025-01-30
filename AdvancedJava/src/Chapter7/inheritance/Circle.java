package Chapter7.inheritance;

public class Circle extends Shape {

    double radii;

    public Circle(double L, double W, double R){
        super(L,W);
        this.radii = R;

    }
    @Override
    public double GetArea(){

        return Math.PI * Math.pow(radii, 2);
    }

    @Override
    public String display(){


        return("\nLength is:" + length + "\nRadius is:" + radii + "\nArea of Circle: "+ GetArea());
    }





}
