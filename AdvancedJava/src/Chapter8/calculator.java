package Chapter8;

public class calculator {


    int num1, num2;
    public calculator(int num1, int num2){


        this.num1 = num1;
        this.num2 = num2;

    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public static double Sum(int num1, int num2)throws ArithmeticException{



        return num1 + num2;
    }

    public static double Product(int num1, int num2) throws ArithmeticException{


        return num1 * num2;

    }
    public static double Qoutient(int _num1, int _num2) throws  ArithmeticException{

        double total =0;
        try{
            total =_num1/_num2;

        }
        catch(IllegalArgumentException iae){
            if(_num2 ==0) System.err.println("impossible to divide by zero");
        }


    return total;
    }
    public static double Difference(int num1, int num2) throws  ArithmeticException{

        return num1 - num2;

    }



}
