public class Main {
    public static void main(String args[]){
        Vehicle vehicle=VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }
    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fue; Tank capacity: " + vehicle.getSeatingCapacity());
    }
}
