package myfirstproject;

public class VehicleRegst {

    // Private variables
    private String vehicleNumber;
    private String vehicleType;
    private String ownerName;

    // Setter methods
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Owner Name: " + getOwnerName());
    }

    public static void main(String[] args) {

        VehicleRegst v = new VehicleRegst();

        v.setVehicleNumber("AP39AB1234");
        v.setVehicleType("Car");
        v.setOwnerName("Ravi Kumar");

        v.displayDetails();
    }
}