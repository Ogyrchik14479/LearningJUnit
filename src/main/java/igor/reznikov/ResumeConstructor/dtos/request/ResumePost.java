package igor.reznikov.ResumeConstructor.dtos.request;

import java.util.ArrayList;
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

    BasicInformationPost basicInformation = new BasicInformationPost();

    PersonalInformationPost personalInformation = new PersonalInformationPost();

    Collection<WorkExperiencePost> workExperienceList = new ArrayList<>();

    Collection<EducationPost> educationList = new ArrayList<>();

    Collection<CoursePost> courseList = new ArrayList<>();

    Collection<AchievementPost> achievementList = new ArrayList<>();

    Collection<PublicationPost> publicationList = new ArrayList<>();

    Collection<SkillPost> skillList = new ArrayList<>();

    Collection<LanguagePost> languageList = new ArrayList<>();

    Collection<HobbyPost> hobbyList = new ArrayList<>();

    Collection<CustomizableSectionPost> customizableSectionList = new ArrayList<>();

    Collection<RecommendationPost> recommendationList = new ArrayList<>();
}
