package igor.reznikov.ResumeConstructor.dtos;

import java.util.Collection;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResumeDto {

    String id;

    BasicInformationDto basicInformation;

    PersonalInformationDto personalInformation;

    Collection<WorkExperienceDto> workExperienceList;

    Collection<EducationDto> educationList;

    Collection<CourseDto> courseList;

    Collection<AchievementDto> achievementList;

    Collection<PublicationDto> publicationList;

    Collection<SkillDto> skillList;

    Collection<LanguageDto> languageList;

    Collection<HobbyDto> hobbyList;

    Collection<CustomizableSectionDto> customizableSectionList;

    Collection<RecommendationDto> recommendationList;
}
