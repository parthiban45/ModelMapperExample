package com.modelmapper.example.dto;


import java.util.Date;

import lombok.Data;

@Data
public class OrderDTO {
    private int orderid;
    private String name;
    private int value;
    private Date orderDate;
    private int orderQuantity;
}
