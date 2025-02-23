package OOP;
/**
 * 
 */
public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "White";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar(){
        System.out.println(
            "make: " + make + " doors: " + doors + " model: " + model + " color: " + color + " convrtible: " + convertible
        );
    }

    /*
     * What are getters and setters
     * A getter is a method on a class that retrieve the value of private field and returns it.
     * A setter is a method on class that sets the value of private field.
     * The purpose of these methods is to control and protect access to private fields
     */

     public String getMake(){
        return make;
     }

     public String getModel(){
        return model;
     }

     public int getDoors(){
        return doors;
     }

     public boolean isConvertible(){
        return convertible;
     }

     public String getColor(){
        return color;
     }

     public void setMake(String make){
        this.make = make;
     }

     public void setModel(String model){
        this.model = model;
     }

     public void setDoors(int doors){
        this.doors = doors;
     }

     public void setConvertible(boolean convertible){
        this.convertible = convertible;
     }

     public void setColor(String color){
        this.color = color;
     }

}
