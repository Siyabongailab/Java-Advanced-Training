package Chapter7.inheritance;

public class Shape {

    protected double length;
    protected double width;

    public Shape() {
        length = 5;
        width = 7;


    }

    public Shape(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public double getLength() {

        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double GetArea() {
        return length * width;
    }

    public double getParameter(){
        double param;
        param = ( length *2) + (width *2);

        return param;
    }

    public String display(){

        return ("\nthe length is:" + length +
                "\nThe width is:" + width +
                "\n the Area is:"+ GetArea() +
                "\nThe parameter is: "+ getParameter()
        );


    }


}
