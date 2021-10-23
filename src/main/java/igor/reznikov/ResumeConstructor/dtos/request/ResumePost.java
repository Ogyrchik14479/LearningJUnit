package igor.reznikov.ResumeConstructor.dtos.request;

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
public class ResumePost {

    Long id;

    BasicInformationPost basicInformation;

    PersonalInformationPost personalInformation;

    Collection<WorkExperiencePost> workExperienceList;

    Collection<EducationPost> educationList;

    Collection<CoursePost> courseList;

    Collection<AchievementPost> achievementList;

    Collection<PublicationPost> publicationList;

    Collection<SkillPost> skillList;

    Collection<LanguagePost> languageList;

    Collection<HobbyPost> hobbyList;

    Collection<CustomizableSectionPost> customizableSectionList;

    Collection<RecommendationPost> recommendationList;
}
