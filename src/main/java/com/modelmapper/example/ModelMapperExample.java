package com.modelmapper.example;


import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import com.modelmapper.example.dto.*;
import com.modelmapper.example.model.*;

public class ModelMapperExample {

    private static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.addMappings(new PropertyMap<User, UserDTO>() {
            @Override
            protected void configure() {
                map().setUserName(this.source.getUserName());
                map().setFirstName(this.source.getFirstName());
                map().setLastName(this.source.getLastName());
            }
        });
    }

    public static void main(String[] args){


    }

    public User toEntity(UserDTO userDTO){
        return modelMapper.map(userDTO, User.class);
    }

    public UserDTO toDTO(User user){
        return modelMapper.map(user, UserDTO.class);
    }

    public Order toOrderEntity(OrderDTO orderDTO){
        return modelMapper.map(orderDTO, Order.class);
    }

    public OrderDTO toOrderDTO(Order order){
        return modelMapper.map(order, OrderDTO.class);
    }

}
