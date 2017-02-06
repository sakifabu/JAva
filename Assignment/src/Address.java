/**
 * Created by sakif on 2/6/2017.
 */
public class Address {
    private int houseNumber;
    private String street;
    private int apartmentNumber;
    private String city;
    private int postalCode;

    public Address(int houseNumber, String street, int apartmentNumber, String city, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(int houseNumber, String street, String city, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void print() {
        System.out.println(String.format("%s, %s\n%s, %s, %d", street,
                (apartmentNumber != 0)? apartmentNumber : houseNumber, city, postalCode));
    }

    public boolean comesBefore(Address other) {
        return this.postalCode > other.postalCode;
    }
}
