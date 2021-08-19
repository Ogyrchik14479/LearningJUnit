package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.UserDto;
import igor.reznikov.ResumeConstructor.entities.BasicInformation;

public class UserMapperImpl implements UserMapper{
    @Override
    public UserDto userToUserDto(BasicInformation basicInformation) {

        if ( basicInformation == null ) {
            return null;
        }

        UserDto userDto = new UserDto();
        userDto.setGender(basicInformation.getGenderEnum().toString());
        userDto.setName(basicInformation.getName());
        userDto.setSurname(basicInformation.getSurname());
        userDto.setPatronymic(basicInformation.getPatronymic());

        return userDto;
    }

    @Override
    public BasicInformation userDtoToUser(UserDto userDto) {
        return null;
    }
}
