package org.example.exercicecommande.infrastructure.restOrder.impl;

import org.example.exercicecommande.infrastructure.restOrder.config.RestClient;
import org.example.exercicecommande.shared.dto.OrderDTO;
import org.example.exercicecommande.shared.port.OrderPort;

import java.util.Arrays;
import java.util.List;

public class OrderPortImpl implements OrderPort {

    private final RestClient<OrderDTO[], OrderDTO> restClient;

    public OrderPortImpl(RestClient<OrderDTO[], OrderDTO> restClient) {
        this.restClient = restClient;
    }

    @Override
    public OrderDTO[] save(OrderDTO order) {
        return restClient.post("orders", OrderDTO.class, order);
    }

    @Override
    public List<OrderDTO> getAll(int userId) {
        return Arrays.stream(restClient.get("orders/"+userId, OrderDTO[].class)).toList();
    }


    @Override
    public boolean delete(int id) {
        return false;
    }
}
