package com.devterial.identity_service.mapper;

import com.devterial.identity_service.Dto.request.UserCreationRequest;
import com.devterial.identity_service.Dto.request.UserUpdateRequest;
import com.devterial.identity_service.Dto.response.UserResponse;
import com.devterial.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toUserResponse(User user);
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
