package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.SkillDto;
import igor.reznikov.ResumeConstructor.entities.Skill;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SkillMapper {

    SkillMapper INSTANCE = Mappers.getMapper(SkillMapper.class);

    @Mapping(source = "skillLevelEnum", target = "skillLevel")
    SkillDto toSkillDto(Skill skill);

    @InheritInverseConfiguration
    Skill toSkill(SkillDto skillDto);
}
