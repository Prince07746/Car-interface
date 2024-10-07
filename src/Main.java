


//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>
//3- Create FourDoorToyota, FourDoorBMW,  FourDoorFord, FourDoorHyundai classes, inherited from FourDoorCar.
//
//Implement necessary functions and write constructor.




public class Main {
    public static void main(String[] args) {

        FourDoorToyota toyota = new FourDoorToyota("Camry", 25000, 20);
        FourDoorBMW bmw = new FourDoorBMW("X5", 50000, 20);
        FourDoorFord ford = new FourDoorFord("Focus", 20000, 20);
        FourDoorHyundai hyundai = new FourDoorHyundai("Electra", 15000, 20);

        toyota.start();
        toyota.accelerate();
        toyota.accelerate();
        toyota.accelerate();

        ford.start();
        ford.accelerate();
        ford.accelerate();
        ford.accelerate();


        System.out.println("\t ==========================================================");


        TwoDoorToyota toyota2 = new TwoDoorToyota("Camry 2", 25000, 20);
        TwoDoorBMW bmw2 = new TwoDoorBMW("X5 2", 50000, 20);
        TwoDoorFord ford2 = new TwoDoorFord("Focus 2", 20000, 20);
        TwoDoorHyundai hyundai2 = new TwoDoorHyundai("Electra 2", 15000, 20);

        toyota2.start();
        toyota2.accelerate();
        toyota2.accelerate();
        toyota2.accelerate();

        ford2.start();
        ford2.accelerate();
        ford2.accelerate();
        ford2.accelerate();


        System.out.println("\t 4door "+toyota.name+"  km covered: "+toyota.kmPerSpeed);
        System.out.println("\t 4door "+ford.name+" km covered: "+ford.kmPerSpeed);

        System.out.println("\t ==========================================================");

        System.out.println("\t 2door "+toyota2.name+"  km covered: "+toyota2.kmPerSpeed);
        System.out.println("\t 2door"+ford2.name+" km covered: "+ford2.kmPerSpeed);



    }
}


interface Car {
    public void start();

    public void stop();

    public void accelerate();

    public void brake();

}

abstract class FourDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    double kmPerSpeed;
    public FourDoorCar(String model, String name, double price,double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = 250;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
        kmPerSpeed = 0;
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
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}
abstract class TwoDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    double kmPerSpeed;
    public TwoDoorCar(String model, String name, double price,double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = 350;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
        kmPerSpeed = 0;
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
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}





class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String name, double price, double fuelCapacity) {
        super("Toyota", name, price,fuelCapacity);
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
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String name, double price,double fuelCapacity) {
        super("BMW", name, price,fuelCapacity);
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
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String name, double price,double fuelCapacity) {
        super("Ford", name, price,fuelCapacity);
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
}


class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String name, double price,double fuelCapacity) {
        super("Hyundai", name, price,fuelCapacity);
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
}










class TwoDoorToyota extends FourDoorCar {
    public TwoDoorToyota(String name, double price, double fuelCapacity) {
        super("Toyota", name, price,fuelCapacity);
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
}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String name, double price,double fuelCapacity) {
        super("BMW", name, price,fuelCapacity);
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
}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String name, double price,double fuelCapacity) {
        super("Ford", name, price,fuelCapacity);
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
}


class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String name, double price,double fuelCapacity) {
        super("Hyundai", name, price,fuelCapacity);
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
}



