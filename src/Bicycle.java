public class Bicycle extends Transport {
    private String modelName;
    private int wheelsCount;

    public Bicycle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check() {
        if (this instanceof Bicycle) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
        }
}
