package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.BasicInformationDto;
import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasicInformationMapper {

    BasicInformationMapper INSTANCE = Mappers.getMapper(BasicInformationMapper.class);

    @Mappings({
        @Mapping(source = "employmentTypeEnum", target = "employmentType"),
        @Mapping(source = "workScheduleEnum", target = "workSchedule")
    })
    BasicInformationDto toBasicInformationDto(BasicInformation basicInformation);

    @InheritInverseConfiguration
    BasicInformation toBasicInformation(BasicInformationDto basicInformationDto);
}
