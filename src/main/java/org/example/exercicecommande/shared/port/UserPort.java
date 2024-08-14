package org.example.exercicecommande.shared.port;

import org.example.exercicecommande.shared.dto.UserDTO;

public interface UserPort {
    UserDTO save(UserDTO user);
    UserDTO getUserById(int id);

}
