package Chapter7.Abstraction;

public class Square extends Shape{

    private double side;

    public  Square(double s){
        this.side = s;

    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return side + side + side + side;
    }
}
