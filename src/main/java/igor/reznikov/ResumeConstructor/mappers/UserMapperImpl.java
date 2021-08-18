package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.UserDto;
import igor.reznikov.ResumeConstructor.entities.User;

public class UserMapperImpl implements UserMapper{
    @Override
    public UserDto userToUserDto(User user) {

        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();
        userDto.setGender(user.getGenderEnum().toString());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setPatronymic(user.getPatronymic());

        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        return null;
    }
}
