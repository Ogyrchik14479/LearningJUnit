package igor.reznikov.ResumeConstructor.entities;

import igor.reznikov.ResumeConstructor.enums.EmploymentTypeEnum;
import igor.reznikov.ResumeConstructor.enums.WorkScheduleEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "basic_information")
public class BasicInformation extends AbstractPersistable<Long> {

    String name;

    String surname;

    String patronymic;

    String photo;

    @Enumerated(EnumType.STRING)
    @Column(name = "employment_type")
    EmploymentTypeEnum employmentTypeEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "work_schedule")
    WorkScheduleEnum workScheduleEnum;

    @Column(name = "telephone_number")
    String telephoneNumber;

    String email;

    @OneToOne
    Resume resume;

}
