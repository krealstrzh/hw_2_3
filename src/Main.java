public class Main {
    public static void main(String[] args) {
        Car car = new Car("Москвич 412", 4);
        Car car2 = new Car("Ferrari F1-75", 3);

        Truck truck = new Truck("ЗИЛ", 6);
        Truck truck2 = new Truck("КамАЗ", 8);

        Bicycle bicycle = new Bicycle("Юность", 2);
        Bicycle bicycle2 = new Bicycle("Merida", 2);

        bicycle.check();
        bicycle2.check();
        car.check();
        car2.check();
        truck.check();
        truck2.check();
    }
}