package org.example.exercicecommande.infrastructure.portImpl;

import org.example.exercicecommande.infrastructure.entity.UserEntity;
import org.example.exercicecommande.infrastructure.repository.UserRepository;
import org.example.exercicecommande.shared.dto.UserDTO;
import org.example.exercicecommande.shared.port.UserPort;

import java.util.Optional;

public class UserPortImpl implements UserPort {
    private final UserRepository userRepository;

    public UserPortImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO save(UserDTO user) {
        UserEntity userEntity = UserEntity.builder().name(user.getName()).email(user.getEmail()).build();
        userEntity = userRepository.save(userEntity);
        return new UserDTO(userEntity.getId(), userEntity.getName(), userEntity.getEmail());
    }

    @Override
    public UserDTO getUserById(int id) {
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isPresent()) {
            UserEntity userEntity = userEntityOptional.get();
            return new UserDTO(userEntity.getId(), userEntity.getName(), userEntity.getEmail());
        } else {
            return null;
        }
    }
}
