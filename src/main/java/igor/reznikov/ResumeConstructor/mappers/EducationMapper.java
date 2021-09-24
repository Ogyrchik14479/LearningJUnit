package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.response.EducationView;
import igor.reznikov.ResumeConstructor.entities.Education;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EducationMapper {

    EducationMapper INSTANCE = Mappers.getMapper(EducationMapper.class);

    @Mapping(source = "formOfEducationEnum", target = "formOfEducation")
    EducationView toEducationDto(Education education);

    @InheritInverseConfiguration
    Education toEducation(EducationView educationView);
}
