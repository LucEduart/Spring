package com.curso.domains.enums;

public enum OrderStatus {

    OPEN(0,"ROLE_OPEN"), PROGRESS(1, "ROLE_PROGRESS"), CLOSED(2, "ROLE_CLOSED");

    private int id;
    private String orderStatus;
    
    private OrderStatus(int id, String orderStatus) {
        this.id = id;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    
    public static OrderStatus ToEnum(Integer id) {
        if(id==null) return null;
        for(OrderStatus x : OrderStatus.values()){
            if(id.equals(x.getId())){
                return x;
            }   
        }
        throw new  IllegalArgumentException("Ordem Inválida");   
    }

}
