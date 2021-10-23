package igor.reznikov.ResumeConstructor.dtos.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BasicInformationPost {

    String name;

    String surname;

    String patronymic;

    String desiredSalary;

    String employmentType;

    String workSchedule;

    String telephoneNumber;

    String email;

    Long resumeId;
}

