package igor.reznikov.ResumeConstructor.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "work_experience")
public class WorkExperience extends AbstractPersistable<Long> {

    String organization;

    String position;

    @Column(name = "start_of_work")
    Date startOfWork;

    @Column(name = "end_of_work")
    Date endOfWork;

    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "job_responsibilities_and_achievements")
    String jobResponsibilitiesAndAchievements;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
