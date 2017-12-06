package mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Converters {
    Converters INST = Mappers.getMapper(Converters.class);

    PersonDto map(Person person);

}
