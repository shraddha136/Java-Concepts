package Factory;


class Auto {
    public static void main(String[] args) {
        Car car = new Factory().getInstance("Audi");
        car.display();
    }
}

class Factory{
    public Car getInstance(String type){
        if(type.equals("Honda")){
            return new Honda();
        }else{
            return new Audi();
        }
    }
}

public interface Car {

    String type = "car";

    void display();
}


class Honda implements Car {
    String name;

    @Override
    public void display() {
        System.out.println("in Honda");
    }
}

class Audi implements Car {
    String name;

    @Override
    public void display() {
        System.out.println("in Audi");
    }
}