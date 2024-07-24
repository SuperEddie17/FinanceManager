package org.avc.service;

import org.avc.DTO.UserDTO;

public interface UserService {

    UserDTO addUser(UserDTO user);

    UserDTO editUser(Long id, UserDTO user);

    void deleteUser(Long id);


}
