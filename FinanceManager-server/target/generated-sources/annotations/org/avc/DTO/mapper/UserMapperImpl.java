package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.UserDTO;
import org.avc.entity.UserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(UserDTO source) {
        if ( source == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( source.getId() );
        userEntity.setUsername( source.getUsername() );
        userEntity.setPassword( source.getPassword() );
        userEntity.setEmail( source.getEmail() );

        return userEntity;
    }

    @Override
    public UserDTO toDTO(UserEntity source) {
        if ( source == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( source.getId() );
        userDTO.setUsername( source.getUsername() );
        userDTO.setPassword( source.getPassword() );
        userDTO.setEmail( source.getEmail() );

        return userDTO;
    }

    @Override
    public void updateUser(UserDTO source, UserEntity target) {
        if ( source == null ) {
            return;
        }

        target.setId( source.getId() );
        target.setUsername( source.getUsername() );
        target.setPassword( source.getPassword() );
        target.setEmail( source.getEmail() );
    }
}
