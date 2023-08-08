public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle", 2);
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        bicycle.updateTyre();
        bicycle1.updateTyre();

        Car chevy = new Car("chevy", 5);
        Car dodge = new Car("dodge");

        System.out.println(chevy.getWheelsCount());
        System.out.println(dodge.getWheelsCount());

        chevy.checkEngine();
        dodge.checkEngine();

        Truck volvo = new Truck("volvo", 6);
        Truck cat = new Truck("cat", 6);
        volvo.checkTrailer();
        cat.checkTrailer();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(bicycle1);
        serviceStation.check(chevy);
        serviceStation.check(dodge);
        serviceStation.check(volvo);
        serviceStation.check(cat);
    }
}