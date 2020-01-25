public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.getVehicle("Electric");
        vehicle.startEngine();
    }
}
