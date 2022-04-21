package igor.reznikov.resume.constructor.entities;

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
@Table(name = "customizable_sections")
public class CustomizableSection extends AbstractPersistable<Long> {

    String sectionName;

    @Type(type = "org.hibernate.type.TextType")
    String text;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
