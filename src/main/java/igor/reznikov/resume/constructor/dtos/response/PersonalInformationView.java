package igor.reznikov.resume.constructor.dtos.response;

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
public class PersonalInformationView {

    String id;

    String cityOfResidence;

    String citizenship;

    String dateOfBirth;

    String gender;

    String maritalStatus;

    String existenceOfChildren;

    String migration;

    String degreeOfEducation;

}
