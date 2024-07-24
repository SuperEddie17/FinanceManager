package org.avc.DTO.mapper;


import org.avc.DTO.UserDTO;
import org.avc.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserDTO source);

    UserDTO toDTO(UserEntity source);

    void updateUser(UserDTO source, @MappingTarget UserEntity target);
}
