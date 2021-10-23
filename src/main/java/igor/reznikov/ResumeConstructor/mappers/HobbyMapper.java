package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.HobbyPost;
import igor.reznikov.ResumeConstructor.dtos.response.HobbyView;
import igor.reznikov.ResumeConstructor.entities.Hobby;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HobbyMapper {

    HobbyMapper INSTANCE = Mappers.getMapper(HobbyMapper.class);

    HobbyView toHobbyDto(Hobby hobby);

    Hobby toHobby(HobbyView hobbyView);

    @Mapping(target = "resume.id", source = "resumeId")
    Hobby toHobby(HobbyPost hobbyPost);
}
