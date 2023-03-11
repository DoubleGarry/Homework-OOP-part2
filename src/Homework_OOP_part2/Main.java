package Homework_OOP_part2;

public class Main {
    public static void main(String[] args) {
        Definitiable car = new Car("car1", 4);
        Definitiable car2 = new Car("car2", 4);

        Definitiable truck = new Truck("truck1", 6);
        Definitiable truck2 = new Truck("truck2", 8);

        Definitiable bicycle = new Bicycle("bicycle1", 2);
        Definitiable bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
