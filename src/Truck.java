public class Truck extends Transport {

    private String modelName;

    private int wheelsCount;

    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        if (this instanceof Truck) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        }
    }
}
