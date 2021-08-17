package igor.reznikov.LearnJUnit.mappers;

import igor.reznikov.LearnJUnit.dtos.UserDto;
import igor.reznikov.LearnJUnit.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
}
