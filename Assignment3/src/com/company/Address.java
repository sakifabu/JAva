package com.company;

/**
 * Created by Sakif on 4/23/2017.
 */
public class Address {
    private String StName;
    private String State;
    private String City;
    private String ZipCode;

    private Address() {}

    public static final class AddressBuilder {
        private Address AddressToBuild;

        AddressBuilder(final Address AddressToBuild) {
            this.AddressToBuild = AddressToBuild;
        }

        public static AddressBuilder build() {
            return new AddressBuilder(new Address());
        }
        public AddressBuilder StName(String StName) {
            this.AddressToBuild.StName = StName;
            return this;
        }

        public AddressBuilder State(String State) {
            this.AddressToBuild.State = State;
            return this;
        }

        public AddressBuilder City(String City) {
            this.AddressToBuild.City = City;
            return this;
        }

        public AddressBuilder ZipCode(String ZipCode) {
            this.AddressToBuild.ZipCode = ZipCode;
            return this;
        }

        public Address getAddress() {
            final Address retaddress = new Address();
            retaddress.StName = AddressToBuild.StName;
            retaddress.City = AddressToBuild.City;
            retaddress.State = AddressToBuild.State;
            retaddress.ZipCode = AddressToBuild.ZipCode;
            return retaddress;
        }

    }
    public String getStName() {
        return StName;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZipcode() {
        return ZipCode;
    }

    @Override
    public String toString() {
        return String.format(
                "St Name : %s \nCity :  %s\nState :  %s\nZipcode :  %s\n",StName, City, State, ZipCode);
    }

}
