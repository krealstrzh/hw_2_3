public class Car extends Bicycle {
    private String modelName;
    private int wheelsCount;

    public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
