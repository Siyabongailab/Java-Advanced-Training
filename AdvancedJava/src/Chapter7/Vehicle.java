
package Chapter7;
public class Vehicle {

   private String color;
    private String Model;
    private String transmissionType;
    private String registrationNumber;
    private double Mileage;
    private  int year;


    //default constructor
    public Vehicle(){
      this.color = "White";
      this.transmissionType =" manual";
      this.Mileage = 23.44;
      this.registrationNumber = "ZXY 820 GP";
      this.year = 2019;
      this.Model = "VW";
    }

    /**
     * overloaded constructor with initial values
     * @param reg  vehicles registration number
     * @param color  car color
     * @param model model of the vehicle
     * @param transmissionType transmission type
     * @param mileage kilo meters that the car has
     * @param year year it was made
     */
    public Vehicle(String reg, String color, String model, String transmissionType, double mileage,
                   int year){

        this.registrationNumber = reg;
        this.color = color;
        this.Model = model;
        this.transmissionType = transmissionType;
        this.Mileage = mileage;
        this. year = year;

       // display();

    }

   /**
   method to display vehicle details
    */
   public void display(){

        System.out.println("Reg: " + registrationNumber);
        System.out.println("Color: " + color);
        System.out.println("Model: " + Model);
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Mileage: " + Mileage);
        System.out.println("Year: " + year);


    }

}
