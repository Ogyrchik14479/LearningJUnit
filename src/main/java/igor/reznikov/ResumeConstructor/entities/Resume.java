package igor.reznikov.ResumeConstructor.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "resumes")
public class Resume extends AbstractPersistable<Long> {

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    BasicInformation basicInformation;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    PersonalInformation personalInformation;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<WorkExperience> workExperienceList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Education> educationList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Course> courseList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Achievement> achievementList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Publication> publicationList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Skill> skillList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Language> languageList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<Hobby> hobbyList;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    List<CustomizableSection> customizableSectionList;
}
