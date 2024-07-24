package org.avc.controller;



import org.avc.DTO.UserDTO;
import org.avc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {

        return userService.addUser(userDTO);
    }

    @PutMapping("/{id}")
    public UserDTO editUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        return userService.editUser(id, userDTO);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable Long id){
        userService.deleteUser(id);
    }

}
