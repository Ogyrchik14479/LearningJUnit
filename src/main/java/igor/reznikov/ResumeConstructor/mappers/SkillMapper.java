package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.SkillPost;
import igor.reznikov.ResumeConstructor.dtos.response.SkillView;
import igor.reznikov.ResumeConstructor.entities.Skill;
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
