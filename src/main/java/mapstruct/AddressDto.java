package mapstruct;

public class AddressDto {
    public String street;
    public String streetNo;
    public String city;
    public String country;
    public String state;
    @Override
    public String toString() {
        return "AddressDto [street=" + street + ", streetNo=" + streetNo + ", city=" + city
            + ", country=" + country + ", state=" + state + "]";
    }
}
