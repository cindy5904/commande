package org.example.exercicecommande.domain.service;

import org.example.exercicecommande.shared.dto.OrderDTO;
import org.example.exercicecommande.shared.port.OrderPort;

import java.util.List;

public interface OrderService {
    OrderPort save(OrderDTO order);
    List<OrderDTO> getAll(int userId);
    boolean delete(int id);
}
