package com.devterial.identity_service.mapper;

import com.devterial.identity_service.Dto.request.PermissionRequest;
import com.devterial.identity_service.Dto.request.RoleRequest;
import com.devterial.identity_service.Dto.response.PermissionResponse;
import com.devterial.identity_service.Dto.response.RoleResponse;
import com.devterial.identity_service.entity.Permission;
import com.devterial.identity_service.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
