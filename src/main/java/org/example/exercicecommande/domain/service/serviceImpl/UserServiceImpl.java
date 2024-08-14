package org.example.exercicecommande.domain.service.serviceImpl;

import org.example.exercicecommande.domain.service.UserService;
import org.example.exercicecommande.shared.dto.UserDTO;
import org.example.exercicecommande.shared.port.UserPort;

public class UserServiceImpl implements UserService {
    private final UserPort userPort;

    public UserServiceImpl(UserPort userPort) {
        this.userPort = userPort;
    }

    @Override
    public UserDTO save(UserDTO user) {
         UserDTO users = new UserDTO(user);
         users = userPort.save(users);
         return users;
    }

    @Override
    public UserDTO getUserById(int id) {
        UserDTO user = new UserDTO(id);
        user = userPort.getUserById(id);
        return user;

    }
}
