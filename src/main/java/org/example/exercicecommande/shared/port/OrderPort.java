package org.example.exercicecommande.shared.port;

import org.example.exercicecommande.shared.dto.OrderDTO;

import java.util.List;

public interface OrderPort {
    OrderDTO[] save(OrderDTO order);
    List<OrderDTO> getAll(int userId);
    boolean delete(int id);
}
