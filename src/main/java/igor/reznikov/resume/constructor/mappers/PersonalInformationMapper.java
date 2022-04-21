package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.PersonalInformationPost;
import igor.reznikov.resume.constructor.dtos.response.PersonalInformationView;
import igor.reznikov.resume.constructor.entities.PersonalInformation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface PersonalInformationMapper {

    PersonalInformationMapper INSTANCE = Mappers.getMapper(PersonalInformationMapper.class);

    @Mappings({
            @Mapping(source = "degreeOfEducationEnum", target = "degreeOfEducation"),
            @Mapping(source = "migrationEnum", target = "migration"),
            @Mapping(source = "maritalStatusEnum", target = "maritalStatus"),
            @Mapping(source = "genderEnum", target = "gender"),
            @Mapping(target = "dateOfBirth")
    })
    PersonalInformationView toPersonalInformationDto(PersonalInformation personalInformation);

    @InheritInverseConfiguration
    @Mapping(target = "dateOfBirth")
    PersonalInformation toPersonalInformation(PersonalInformationView personalInformationView);

    @InheritInverseConfiguration
    @Mapping(target = "dateOfBirth")
    @Mapping(target = "resume.id", source = "resumeId")
    PersonalInformation toPersonalInformation(PersonalInformationPost personalInformationPost);
}
