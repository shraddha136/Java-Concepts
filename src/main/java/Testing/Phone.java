package Testing;

public class Phone {
    private String name;
    private int year;
    private int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int doubleCapacity(){
        return 2 * this.capacity;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }
}
