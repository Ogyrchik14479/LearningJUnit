package igor.reznikov.ResumeConstructor.dtos;

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
public class EducationDto  {

    String id;

    String institution;

    String faculty;

    String specialization;

    String formOfEducation;

    String yearOfGraduation;

}
