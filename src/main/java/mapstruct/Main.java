package mapstruct;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = "id";
        person.address.street = "str";
        PersonDto dto = Converters.INST.map(person);
        System.out.println(dto);
    }
}
