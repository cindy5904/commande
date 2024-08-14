package org.example.exercicecommande.domain.service.serviceImpl;

import org.example.exercicecommande.domain.service.OrderService;
import org.example.exercicecommande.shared.dto.OrderDTO;
import org.example.exercicecommande.shared.port.OrderPort;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final OrderPort orderPort;

    public OrderServiceImpl(OrderPort orderPort) {
        this.orderPort = orderPort;
    }

    @Override
    public OrderPort save(OrderDTO order) {
        OrderDTO orders = new OrderDTO(order);
        orders = (OrderDTO) orderPort.save(orders);
        return (OrderPort) orders;
    }

    @Override
    public List<OrderDTO> getAll(int userId) {
        return orderPort.getAll(userId);
    }


    @Override
    public boolean delete(int id) {
        return orderPort.delete(id);
    }
}
