import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FourDoorToyota toyota = new FourDoorToyota("Camry", 25000, 20, 2020, 15000, 200);
        FourDoorBMW bmw = new FourDoorBMW("X5", 50000, 20, 2020, 15000, 200);
        FourDoorFord ford = new FourDoorFord("Focus", 20000, 20, 2020, 15000, 200);
        FourDoorHyundai hyundai = new FourDoorHyundai("Electra", 15000, 20, 2020, 15000, 200);


        TwoDoorToyota toyota2 = new TwoDoorToyota("Camry 2", 25000, 20, 2020, 15000, 200);
        TwoDoorBMW bmw2 = new TwoDoorBMW("X5 2", 50000, 20, 2020, 15000, 200);
        TwoDoorFord ford2 = new TwoDoorFord("Focus 2", 20000, 20, 2020, 15000, 200);
        TwoDoorHyundai hyundai2 = new TwoDoorHyundai("Electra 2", 15000, 20, 2020, 15000, 200);


        Dealer hana = new Dealer("hana","kampala");
        hana.dealerMenu();




    }
}


interface Car {
    public void start();

    public void stop();

    public void accelerate();

    public void brake();

    public double sell();
    public double getPrice();
    public String getName();

}

// 4door ca

abstract class FourDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    double kmPerSpeed;
    int year;
    double mileage;
    double power;

    public FourDoorCar(String model, String name, double price,double fuelCapacity,int year, double mileage, double power) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = 250;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
        kmPerSpeed = 0;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 10;
            kmPerSpeed += 0.1;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0 && speed <= maxSpeed) {
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }

}

/// two door car

abstract class TwoDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    double kmPerSpeed;
    int year;
    double mileage;
    double power;
    public TwoDoorCar(String model, String name, double price,double fuelCapacity, int year, double mileage, double power) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = 350;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
        kmPerSpeed = 0;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 10;
            kmPerSpeed += 0.1;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public void brake() {
        if(speed > 0 && speed <= maxSpeed){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }

}





class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String name, double price, double fuelCapacity, int year, double mileage, double power) {
        super("Toyota", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 280;
    }

    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 15;
            kmPerSpeed += 0.1;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024; //
        int carAge = currentYear - year;
        return price - (carAge / 700.0) - (mileage / 700.0) + (power / 700.0);
    }
    @Override
    public String toString() {
        return "FourDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("BMW", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 300;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 30;
            kmPerSpeed += 0.3;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024; //
        int carAge = currentYear - year;
        return price - (carAge / 700.0) - (mileage / 700.0) + (power / 700.0);
    }

    @Override
    public String toString() {
        return "FourDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("Ford", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 320;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 35;
            kmPerSpeed += 0.45;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024; //
        int carAge = currentYear - year;
        return price - (carAge / 700.0) - (mileage / 700.0) + (power / 700.0);
    }

    @Override
    public String toString() {
        return "FourDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("Hyundai", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 280;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 15;
            kmPerSpeed += 0.12;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024; //
        int carAge = currentYear - year;
        return price - (carAge / 700.0) - (mileage / 700.0) + (power / 700.0);
    }

    @Override
    public String toString() {
        return "FourDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}




class TwoDoorToyota extends FourDoorCar {
    public TwoDoorToyota(String name, double price, double fuelCapacity, int year, double mileage, double power) {
        super("Toyota", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 300;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 35;
            kmPerSpeed += 0.25;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024;
        int carAge = currentYear - year;
        return price - (carAge / 500.0) - (mileage / 500.0) + (power / 500.0);
    }

    @Override
    public String toString() {
        return "TwoDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("BMW", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 340;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 35;
            kmPerSpeed += 0.44;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024;
        int carAge = currentYear - year;
        return price - (carAge / 500.0) - (mileage / 500.0) + (power / 500.0);
    }

    @Override
    public String toString() {
        return "TwoDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("Ford", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 380;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 45;
            kmPerSpeed += 0.55;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024;
        int carAge = currentYear - year;
        return price - (carAge / 500.0) - (mileage / 500.0) + (power / 500.0);
    }

    @Override
    public String toString() {
        return "TwoDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String name, double price,double fuelCapacity, int year, double mileage, double power) {
        super("Hyundai", name, price,fuelCapacity, year, mileage, power);
        this.maxSpeed = 300;
    }
    @Override
    public void accelerate() {
        if(speed < maxSpeed) {
            speed += 20;
            kmPerSpeed += 0.22;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println(name+" Accelerating "+ speed+" speed");
    }
    @Override
    public double sell(){
        int currentYear = 2024;
        int carAge = currentYear - year;
        return price - (carAge / 500.0) - (mileage / 500.0) + (power / 500.0);
    }

    @Override
    public String toString() {
        return "TwoDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", kmPerSpeed=" + kmPerSpeed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}





class Dealer{
    private ArrayList<Car> cars;
    String name;
    String location;
    double accountBalance;
    double profit;

    public Dealer(String name, String location) {
        this.name = name;
        this.location = location;
        this.cars = new ArrayList<>();
        this.accountBalance = 0;
        this.profit = 0;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public void sellCar(Car car) {
        cars.remove(car);
        accountBalance += car.sell();
        profit += (car.sell() - car.getPrice());
        System.out.println("Car sold successfully!");
        System.out.println(car.toString());
        System.out.println("Account balance: " + accountBalance);
        System.out.println("Profit: " + profit);
    }

    public void dealerMenu(){
        System.out.println("\t Welcome to the Dealer Menu");
        System.out.println("\t 1. Display all cars");
        System.out.println("\t 2. Sell a car");
        System.out.println("\t 3. Exit");
        System.out.println("\t 4. add car");
        System.out.print("\t Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                displayCars();
                if(cars.isEmpty()) {
                    System.out.println("\t No cars in the garage");
                }
                dealerMenu();
                break;
            case "2":
                System.out.println("\t Enter the name of the car you want to sell: ");
                String carName = scanner.nextLine();
                boolean checking = false;
                for (Car car : cars) {
                    if (car.getName().equals(carName)) {
                        sellCar(car);
                        checking = true;
                        break;
                    }
                }
                if(!checking){
                    System.out.println("\t did not find a car with that name");
                }
                dealerMenu();
                break;
            case "3":
                System.out.println("\t Exiting Dealer Menu");
                System.exit(0);
                break;
                case "4":
                    System.out.print("\t Enter the name of the car you want to add: ");
                    String carName2 = scanner.nextLine();
                    boolean checking2 = false;
                    for (Car car : cars) {
                        if (car.getName().equals(carName2)) {
                            System.out.println("\t Car already");
                            checking2 = true;
                            break;
                        }
                    }
                    if(checking2) {
                        dealerMenu();
                    }else{
                        System.out.print("\t Enter the price of the car: ");
                        double price = scanner.nextDouble();
                        System.out.print("\t Enter the fuel capacity of the car: ");
                        double fuelCapacity = scanner.nextDouble();
                        System.out.print("\t Enter the year of the car: ");
                        int year = scanner.nextInt();
                        System.out.print("\t Enter the mileage of the car: ");
                        double mileage = scanner.nextDouble();
                        System.out.print("\t Enter the power of the car: ");
                        double power = scanner.nextDouble();
                        Car car = new TwoDoorHyundai(carName2, price, fuelCapacity, year, mileage, power);
                        addCar(car);
                        System.out.println("\t Car added successfully");
                        dealerMenu();
                    }
                    break;
            default:
                System.out.println("\t Invalid choice");
                dealerMenu();
                break;
        }
    }


}




