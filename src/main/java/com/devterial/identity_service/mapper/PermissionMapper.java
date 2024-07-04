package com.devterial.identity_service.mapper;

import com.devterial.identity_service.Dto.request.PermissionRequest;
import com.devterial.identity_service.Dto.response.PermissionResponse;
import com.devterial.identity_service.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
