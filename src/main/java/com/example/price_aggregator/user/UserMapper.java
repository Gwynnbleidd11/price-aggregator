package com.example.price_aggregator.user;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserDto userDto);
    UserDto mapToUserDto(User user);
    List<UserDto> mapToUserDtoList(List<User> usersList);
}
