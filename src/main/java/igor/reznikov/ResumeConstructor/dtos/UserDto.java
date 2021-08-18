package igor.reznikov.ResumeConstructor.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    String name;

    String patronymic;

    String surname;

    String gender;
}
