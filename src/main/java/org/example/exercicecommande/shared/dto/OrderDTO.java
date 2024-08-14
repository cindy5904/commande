package org.example.exercicecommande.shared.dto;

public class OrderDTO {
    private int oderId;
    private int userId;
    private String product;

    public OrderDTO(int oderId, int userId, String product) {
        this.oderId = oderId;
        this.userId = userId;
        this.product = product;
    }

    public OrderDTO(String product) {
        this.product = product;
    }

    public OrderDTO(OrderDTO order) {
    }

    public int getOderId() {
        return oderId;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
