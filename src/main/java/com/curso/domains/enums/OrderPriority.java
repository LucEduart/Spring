package com.curso.domains.enums;

public enum OrderPriority {

    LOW(0,"LOW"), MID(1, "MID"), RIGH(2, "RIGH");

    private int id;
    private String orderPriority;
    
    private OrderPriority(int id, String orderPriority) {
        this.id = id;
        this.orderPriority = orderPriority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(String orderPriority) {
       this.orderPriority = orderPriority;
    }

    public static OrderPriority ToEnum(Integer id) {
        if(id==null) return null;
        for(OrderPriority x : OrderPriority.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new  IllegalArgumentException("Ordem Inválida");   
    }


}
