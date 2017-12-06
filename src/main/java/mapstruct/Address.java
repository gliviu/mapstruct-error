package mapstruct;

public class Address {
    @Nullable
    public String street;
    @Nullable
    public String streetNo;
    @Nullable
    public String city;
    @Nullable
    public String state;
    @Nullable
    public String country;
    @Override
    public String toString() {
        return "Address [street=" + street + ", streetNo=" + streetNo + ", city=" + city
            + ", state=" + state + ", country=" + country + "]";
    }
    
}
