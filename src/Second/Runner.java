package Second;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car kia = new Car("kia");
        Car bmw = new Car("bmw");
        System.out.println("Кол-во машин: " + Car.countCars);
        Car.printBrands();
    }
}
