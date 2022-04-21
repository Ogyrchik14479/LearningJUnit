package igor.reznikov.resume.constructor.entities;

import igor.reznikov.resume.constructor.enums.EmploymentTypeEnum;
import igor.reznikov.resume.constructor.enums.WorkScheduleEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
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

    //TODO возможно сделать валюту выбор, и в int превратить поле
    @Column(name = "desired_salary")
    String desiredSalary;

    @Enumerated(EnumType.STRING)
    @Column(name = "employment_type")
    EmploymentTypeEnum employmentTypeEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "work_schedule")
    WorkScheduleEnum workScheduleEnum;

    //TODO добавить boolean для поменты есть в телеге, вотсапп, вайбер
    @Column(name = "telephone_number")
    String telephoneNumber;

    String email;

    @OneToOne
    @JoinColumn(name = "resume_id")
    Resume resume;

}
