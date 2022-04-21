package igor.reznikov.resume.constructor.entities;

import igor.reznikov.resume.constructor.enums.FormOfEducationEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Education extends AbstractPersistable<Long> {

    String institution;

    String faculty;

    String specialization;

    @Enumerated(EnumType.STRING)
    @Column(name = "form_of_education")
    FormOfEducationEnum formOfEducationEnum;

    @Column(name = "year_of_graduation")
    Integer yearOfGraduation;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
