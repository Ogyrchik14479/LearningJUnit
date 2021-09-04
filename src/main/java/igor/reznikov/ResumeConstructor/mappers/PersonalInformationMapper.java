package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.PersonalInformationDto;
import igor.reznikov.ResumeConstructor.entities.PersonalInformation;
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
    PersonalInformationDto toPersonalInformationDto(PersonalInformation personalInformation);

    @InheritInverseConfiguration
    @Mapping(target = "dateOfBirth")
    PersonalInformation toPersonalInformation(PersonalInformationDto personalInformationDto);

}
