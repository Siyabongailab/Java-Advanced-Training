package Chapter8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {



    public static void main(String[] args) {

        int  num1 =0, num2=0, age;
        double sum, diff, qou, Prod;
        String Name;
   calculator objcalc = new calculator(num1,num2);
        Scanner sc = new Scanner(System.in);




        try{
            System.out.println("Please enter your name");
            Name = sc.next();

            System.out.println("enter your age");
            age = sc.nextInt();

            System.out.println("enter first number");
            num1 = sc.nextInt();

            System.out.println("enter second number");
            num2 = sc.nextInt();

            sum= objcalc.Sum(num1,num2);
            Prod = objcalc.Product(num1,num2);
            qou = objcalc.Qoutient(num1,num2);
            diff = objcalc.Difference(num1,num2);


            System.out.println("\nName: " + Name +
                    "\nAge: " + age +
                    "\nFirst number: " + num1 +
                    "\nSecond number: " + num2 +
                    "\nSum is " + sum +
                    "\nProd is " + Prod +
                    "\nQoutient is " + qou +
                    "\nDifference is " + diff
            );

        }catch(InputMismatchException ex){
            System.out.println(ex.getMessage());

        }





    }
}
