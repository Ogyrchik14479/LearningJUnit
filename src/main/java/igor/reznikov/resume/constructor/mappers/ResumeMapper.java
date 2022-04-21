package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.ResumePost;
import igor.reznikov.resume.constructor.dtos.response.ResumeView;
import igor.reznikov.resume.constructor.entities.Resume;
import org.mapstruct.Mapper;


@Mapper(uses = {
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
}, componentModel = "spring")
public interface ResumeMapper {

    ResumeView toResumeDTO(Resume resume);

    Resume toResume(ResumePost resumePost);
}

