package org.avc.service;


import org.avc.DTO.UserDTO;
import org.avc.DTO.mapper.UserMapper;
import org.avc.entity.UserEntity;
import org.avc.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDTO addUser(UserDTO userDTO) {
        UserEntity userEntity = userMapper.toEntity(userDTO);
        UserEntity newEntity = userRepository.save(userEntity);

        return userMapper.toDTO(newEntity);
    }

    @Override
    public UserDTO editUser(Long id, UserDTO userDTO) {
       UserEntity userEntity = fetchUserById(id);
       userDTO.setId(id);
       userMapper.updateUser(userDTO, userEntity);
       UserEntity editedEntity = userRepository.save(userEntity);
       return userMapper.toDTO(editedEntity);
    }


    public void deleteUser(Long id) {
        UserEntity user = fetchUserById(id);
        userRepository.delete(user);

    }

    private UserEntity fetchUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
