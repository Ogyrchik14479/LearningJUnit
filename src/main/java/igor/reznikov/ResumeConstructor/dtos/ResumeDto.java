package igor.reznikov.ResumeConstructor.dtos;

import igor.reznikov.ResumeConstructor.entities.Course;
import java.util.Collection;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResumeDto {

    BasicInformationDto basicInformation;

    PersonalInformationDto personalInformation;

    Collection<Course> courseList;
}
