package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.response.WorkExperienceView;
import igor.reznikov.ResumeConstructor.entities.WorkExperience;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface WorkExperienceMapper {
    WorkExperienceMapper INSTANCE = Mappers.getMapper(WorkExperienceMapper.class);

    WorkExperienceView toWorkExperienceDto(WorkExperience workExperience);

    WorkExperience toWorkExperience(WorkExperienceView workExperienceView);

    List<WorkExperienceView> toWorkExperienceDtoList(List<WorkExperience> workExperienceList);
}
