public class ServiceStation implements ServiceStationInterface {

    public void check (Bicycle bicycle) {
        checkBasic(bicycle);
    }
    public void check (Car car) {
        if (car != null) {
            checkBasic(car);
            car.checkEngine();
        }
    }
    public void check (Truck truck) {
        if (truck != null) {
            checkBasic(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    private void checkBasic(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
