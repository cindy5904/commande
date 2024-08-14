package org.example.exercicecommande.shared.dto;

import org.example.exercicecommande.domain.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private int id;
    private String name;
    private String email;
    private List<OrderDTO> orderDTOS;

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
        orderDTOS = new ArrayList<>();
    }

    public UserDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDTO(UserDTO user) {
    }

    public UserDTO(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderDTO> getOrderDTOS() {
        return orderDTOS;
    }

    public void setOrderDTOS(List<OrderDTO> orderDTOS) {
        this.orderDTOS = orderDTOS;
    }
}
