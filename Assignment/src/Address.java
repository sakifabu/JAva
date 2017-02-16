/**
 * Created by sakif on 2/6/2017.
 */
public class Address {
    private int houseNumber;
    private String street;
    private int apartmentNumber;
    private String city;
    private String state;
    private int postalCode;

    public Address(int houseNumber,String street,int apartmentNumber,String city,String state,int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Address(int houseNumber,String street,String city,String state,int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void printaddress() {

        System.out.println(String.format("%d %s, APT : %d\n%s, %s, %d",houseNumber, street,(apartmentNumber != 0)? apartmentNumber: null, city,state, postalCode));
    }

    public boolean comesBefore(Address other) {
        return this.postalCode < other.postalCode;
    }
    public static void main(String[] args) {
        Address a = new Address(639,"South Broad St",10,"Lansdale", "PA",19446);
        a.printaddress();
        Address b = new Address(1600,"Woodland Rd","Abington", "PA",19001);
        b.printaddress();
        System.out.print(b.comesBefore(a));

    }
}
