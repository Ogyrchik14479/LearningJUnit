package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.WorkExperiencePost;
import igor.reznikov.resume.constructor.dtos.response.WorkExperienceView;
import igor.reznikov.resume.constructor.entities.WorkExperience;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = DateMapper.class)
public interface WorkExperienceMapper {

    WorkExperienceView toWorkExperienceDto(WorkExperience workExperience);

    WorkExperience toWorkExperience(WorkExperienceView workExperienceView);

    @Mapping(target = "resume.id", source = "resumeId")
    WorkExperience toWorkExperience(WorkExperiencePost workExperienceView);

    List<WorkExperienceView> toWorkExperienceDtoList(List<WorkExperience> workExperienceList);
}
