package org.example.exercicecommande.infrastructure.repository;

import org.example.exercicecommande.infrastructure.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}
