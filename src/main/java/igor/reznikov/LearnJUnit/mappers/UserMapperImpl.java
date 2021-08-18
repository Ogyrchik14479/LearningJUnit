package igor.reznikov.LearnJUnit.mappers;

import igor.reznikov.LearnJUnit.dtos.UserDto;
import igor.reznikov.LearnJUnit.entities.User;

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
