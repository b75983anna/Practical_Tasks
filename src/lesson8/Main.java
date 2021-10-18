package lesson8;



public class Main {
    public static void main(String[] args) {


        // Create a myCar object
        Car myCar = new Car();

        // Call method of parent class by object of parent class
        myCar.parentHonk();

        //method of child class by object of child class
        myCar.PrintInfo();


       // System.out.println("Parent class object prints out " + myCar.brand + "  and Child class object prints out " + myCar.PrintInfo());
    }
}