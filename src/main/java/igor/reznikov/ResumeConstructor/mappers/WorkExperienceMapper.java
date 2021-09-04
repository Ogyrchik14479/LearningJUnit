package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.WorkExperienceDto;
import igor.reznikov.ResumeConstructor.entities.WorkExperience;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface WorkExperienceMapper {
    WorkExperienceMapper INSTANCE = Mappers.getMapper(WorkExperienceMapper.class);

    WorkExperienceDto toWorkExperienceDto(WorkExperience workExperience);

    WorkExperience toWorkExperience(WorkExperienceDto workExperienceDto);

    List<WorkExperienceDto> toWorkExperienceDtoList(List<WorkExperience> workExperienceList);
}
