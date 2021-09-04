package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.ResumeDto;
import igor.reznikov.ResumeConstructor.entities.Resume;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper( uses = {
        BasicInformationMapper.class,
        PersonalInformationMapper.class,
        WorkExperienceMapper.class,
        EducationMapper.class,
        CourseMapper.class,
        AchievementMapper.class,
        PublicationMapper.class,
        SkillMapper.class,
        LanguageMapper.class,
        HobbyMapper.class,
        CustomizableSectionMapper.class,
        RecommendationMapper.class,
})
public interface ResumeMapper {

    ResumeMapper INSTANCE = Mappers.getMapper(ResumeMapper.class);

    ResumeDto toResumeDTO(Resume resume);

    Resume toResume(ResumeDto resumeDto);
}

