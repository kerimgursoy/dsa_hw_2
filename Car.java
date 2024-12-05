public class Car implements Comparable<Car> {
    private String brand;
    private String modelname;
    private long modelyear;

    // Constructor
    public Car(String brand, String modelname, long modelyear) {
        this.brand = brand;
        this.modelname = modelname;
        this.modelyear = modelyear;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModelname() {
        return modelname;
    }

    public long getModelyear() {
        return modelyear;
    }

    // Implement compareTo method from Comparable interface
    @Override
    public int compareTo(Car other) {
        return Long.compare(this.modelyear, other.modelyear);
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modelname='" + modelname + '\'' +
                ", modelyear=" + modelyear +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2015);
        Car car2 = new Car("Honda", "Civic", 2018);
        Car car3 = new Car("Ford", "Mustang", 2012);
        Car car4 = new Car("BMW", "3 Series", 2020);
        Car car5 = new Car("Mercedes", "C-Class", 2017);
        Car car6 = new Car("Audi", "A4", 2019);
        Car car7 = new Car("Chevrolet", "Malibu", 2014);
        Car car8 = new Car("Nissan", "Altima", 2016);
        Car car9 = new Car("Hyundai", "Elantra", 2021);
        Car car10 = new Car("Kia", "Optima", 2013);

        Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

        Quick.sort(cars);

        System.out.println("Sorted cars by model year (ascending):");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
