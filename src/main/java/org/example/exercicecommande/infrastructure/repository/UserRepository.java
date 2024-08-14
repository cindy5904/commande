package org.example.exercicecommande.infrastructure.repository;

import org.example.exercicecommande.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
