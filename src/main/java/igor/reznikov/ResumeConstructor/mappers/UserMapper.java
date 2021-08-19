package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.UserDto;
import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto userToUserDto(BasicInformation basicInformation);
    BasicInformation userDtoToUser(UserDto userDto);
}
