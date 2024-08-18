public class Main {

    public static void main(String[] args) {
        Engine engine = EngineFactory.createEngine("Petrol");

        Car car = new Car(engine);
        car.drive();
        car.stop();

    }
    
}
