package igor.reznikov.ResumeConstructor.entities;

import igor.reznikov.ResumeConstructor.enums.DegreeOfEducationEnum;
import igor.reznikov.ResumeConstructor.enums.GenderEnum;
import igor.reznikov.ResumeConstructor.enums.MaritalStatusEnum;
import igor.reznikov.ResumeConstructor.enums.MigrationEnum;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class PersonalInformation extends AbstractPersistable<Long> {

    @Column(name = "city_of_residence")
    String cityOfResidence;

    String citizenship;

    @Column(name = "date_of_birth")
    Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    GenderEnum genderEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    MaritalStatusEnum maritalStatusEnum;

    @Column(name = "existence_of_children")
    Boolean existenceOfChildren;

    @Column(name = "migration")
    MigrationEnum migrationEnum;

    @Column(name = "degree_of_education")
    DegreeOfEducationEnum degreeOfEducationEnum;

    @OneToOne
    @JoinColumn(name = "resume_id")
    Resume resume;
}
