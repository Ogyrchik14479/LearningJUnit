package igor.reznikov.ResumeConstructor.entities;

import java.sql.Date;
import javax.persistence.Entity;
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
public class WorkExperience extends AbstractPersistable<Long> {

    String organization;

    String position;

    Date startOfWork;

    Date endOfWork;

    @Type(type = "org.hibernate.type.TextType")
    String jobResponsibilitiesAndAchievements;
}
