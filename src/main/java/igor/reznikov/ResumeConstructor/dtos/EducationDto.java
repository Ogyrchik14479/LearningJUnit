package igor.reznikov.ResumeConstructor.dtos;

import igor.reznikov.ResumeConstructor.entities.Resume;
import igor.reznikov.ResumeConstructor.enums.FormOfEducationEnum;
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
public class EducationDto  {

    String institution;

    String faculty;

    String specialization;

    String formOfEducation;

    String yearOfGraduation;

}
