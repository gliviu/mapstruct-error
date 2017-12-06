package mapstruct;

public class PersonDto {
    public String id;
    //@Nullable
    public AddressDto address;
    @Override
    public String toString() {
        return "PersonDto [id=" + id + ", address=" + address + "]";
    }

}
