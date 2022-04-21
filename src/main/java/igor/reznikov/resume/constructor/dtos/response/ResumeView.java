package igor.reznikov.resume.constructor.dtos.response;

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
public class ResumeView {

    String id;

    BasicInformationView basicInformation;

    PersonalInformationView personalInformation;

    Collection<WorkExperienceView> workExperienceList;

    Collection<EducationView> educationList;

    Collection<CourseView> courseList;

    Collection<AchievementView> achievementList;

    Collection<PublicationView> publicationList;

    Collection<SkillView> skillList;

    Collection<LanguageView> languageList;

    Collection<HobbyView> hobbyList;

    Collection<CustomizableSectionView> customizableSectionList;

    Collection<RecommendationView> recommendationList;
}
