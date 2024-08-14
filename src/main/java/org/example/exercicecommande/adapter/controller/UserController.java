package org.example.exercicecommande.adapter.controller;

import org.example.exercicecommande.domain.service.UserService;
import org.example.exercicecommande.shared.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestParam String name, @RequestParam String email) {
        return ResponseEntity.ok((UserDTO) userService.save(name, email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable int id) {
        UserDTO userDTO = userService.getUserById(id);

        if (userDTO != null) {
            return ResponseEntity.ok(userDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
