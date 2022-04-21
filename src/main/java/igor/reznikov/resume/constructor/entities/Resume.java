package igor.reznikov.resume.constructor.entities;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.lang.Nullable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "resumes")
public class Resume {

    @Id @GeneratedValue private @Nullable Long id;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    BasicInformation basicInformation;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    PersonalInformation personalInformation;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<WorkExperience> workExperienceList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Education> educationList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Course> courseList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Achievement> achievementList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Publication> publicationList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Skill> skillList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Language> languageList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Hobby> hobbyList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<CustomizableSection> customizableSectionList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    Collection<Recommendation> recommendationList;
}
