package igor.reznikov.LearnJUnit.entities;

import igor.reznikov.LearnJUnit.enums.FormOfEducationEnum;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Education extends AbstractPersistable<Long> {

    String institution;

    String faculty;

    String specialization;

    @Enumerated(EnumType.STRING)
    FormOfEducationEnum formOfEducationEnum;

    Integer yearOfGraduation;
}
