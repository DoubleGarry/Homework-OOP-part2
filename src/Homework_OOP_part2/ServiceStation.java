package Homework_OOP_part2;

public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }

        }
    }
}
