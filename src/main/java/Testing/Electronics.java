package Testing;

public class Electronics {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("iPhone");
        phone.setCapacity(32);
        phone.setYear(2019);

        System.out.println(phone.doubleCapacity());
    }
}
