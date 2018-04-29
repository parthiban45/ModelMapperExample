package com.modelmapper.example.dto;


import java.util.Date;

import lombok.Data;

@Data
public class OrderDTO {

    private int orderid;
    private int orderValue;
    private Date orderDate;
    private int orderQuantity;
    private String orderName;


}
