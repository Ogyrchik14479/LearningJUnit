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
@Table(name = "courses")
public class Course extends AbstractPersistable<Long> {

    String name;

    String institution;

    @Column(name = "start_of_course")
    Date startOfCourse;

    @Column(name = "end_of_course")
    Date endOfCourse;

    @Type(type = "org.hibernate.type.TextType")
    String description;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
