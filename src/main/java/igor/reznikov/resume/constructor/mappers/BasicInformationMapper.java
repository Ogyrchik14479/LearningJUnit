package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.BasicInformationPost;
import igor.reznikov.resume.constructor.dtos.response.BasicInformationView;
import igor.reznikov.resume.constructor.entities.BasicInformation;
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
    BasicInformationView toBasicInformationDto(BasicInformation basicInformation);

    @InheritInverseConfiguration
    BasicInformation toBasicInformation(BasicInformationView basicInformationView);

    @InheritInverseConfiguration
    @Mapping(target = "resume.id", source = "resumeId")
    BasicInformation toBasicInformation(BasicInformationPost basicInformationPost);
}
