package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.EducationPost;
import igor.reznikov.resume.constructor.dtos.response.EducationView;
import igor.reznikov.resume.constructor.entities.Education;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EducationMapper {


    @Mapping(source = "formOfEducationEnum", target = "formOfEducation")
    EducationView toEducationDto(Education education);

    @InheritInverseConfiguration
    Education toEducation(EducationView educationView);

    @InheritInverseConfiguration
    @Mapping(target = "resume.id", source = "resumeId")
    Education toEducation(EducationPost educationPost);
}
