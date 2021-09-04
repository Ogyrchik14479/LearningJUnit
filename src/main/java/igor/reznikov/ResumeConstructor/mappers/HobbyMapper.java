package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.HobbyDto;
import igor.reznikov.ResumeConstructor.entities.Hobby;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HobbyMapper {

    HobbyMapper INSTANCE = Mappers.getMapper(HobbyMapper.class);

    HobbyDto toHobbyDto(Hobby hobby);

    Hobby toHobby(HobbyDto hobbyDto);
}
