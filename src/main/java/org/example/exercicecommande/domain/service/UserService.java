package org.example.exercicecommande.domain.service;

import org.example.exercicecommande.shared.dto.UserDTO;

public interface UserService {
    UserDTO save(UserDTO user);
    UserDTO getUserById(int id);

    Object save(String name, String email);
}
