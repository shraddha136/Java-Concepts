package Builder;

public class Car {
    String name;
    int power;
    int wheels;
    int year;

    Car(String name, int power, int wheels,int year){
        this.name = name;
        this.power = power;
        this.wheels = wheels;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", wheels=" + wheels +
                ", year=" + year +
                '}';
    }
}

class Auto{
    public static void main(String[] args) {
        Car car = new Car("Honda",300,4,2020); // need to know all constructor variables and in order
        System.out.println(car.toString());
        //with builder
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setName("New Honda");
        carBuilder.setWheels(6);
        System.out.println(carBuilder.getCar().toString());
    }
}

class CarBuilder {
    String name;
    int power;
    int wheels;
    int year;

    public CarBuilder setName(String name){
        this.name = name;
        return this;
    }
    public CarBuilder setPower(int power){
        this.power = power;
        return this;
    }
    public CarBuilder setWheels(int wheels){
        this.wheels = wheels;
        return this;
    }
    public CarBuilder setYear(int year){
        this.year = year;
        return this;
    }

    public Car getCar(){
        return new Car(name,power,wheels,year);
    }
}