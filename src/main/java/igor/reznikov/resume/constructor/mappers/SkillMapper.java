package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.SkillPost;
import igor.reznikov.resume.constructor.dtos.response.SkillView;
import igor.reznikov.resume.constructor.entities.Skill;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SkillMapper {

    SkillMapper INSTANCE = Mappers.getMapper(SkillMapper.class);

    @Mapping(source = "skillLevelEnum", target = "skillLevel")
    SkillView toSkillDto(Skill skill);

    @InheritInverseConfiguration
    Skill toSkill(SkillView skillView);

    @InheritInverseConfiguration
    @Mapping(target = "resume.id", source = "resumeId")
    Skill toSkill(SkillPost skillPost);
}
