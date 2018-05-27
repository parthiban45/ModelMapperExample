package com.modelmapper.example.model;

import java.util.Date;

import lombok.Data;

@Data
public class Order {
    private int orderid;
    private int orderValue;
    private Date orderDate;
    private int orderQuantity;
    private String orderName;
}
