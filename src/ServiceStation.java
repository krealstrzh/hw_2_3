public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            transport.check();
        } else {
            System.out.println("Неверно указан транспорт!");
        }
    }
}
