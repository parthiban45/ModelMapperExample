package com.modelmapper.example;

import com.modelmapper.example.dto.OrderDTO;
import com.modelmapper.example.dto.UserDTO;
import com.modelmapper.example.model.Order;
import com.modelmapper.example.model.User;
import org.junit.Test;

public class ModelMapperExampleTest {
    @Test
    public void test_toUser_ExplicitMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Test");
        userDTO.setLastName("User");
        userDTO.setUserName("TestUSer");
        System.out.print(modelMapperExample.toEntity(userDTO).toString());
    }
    @Test
    public void test_toDTO_ExplicitMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("User");
        user.setUserName("TestUSer");
        System.out.print(modelMapperExample.toDTO(user));
    }
    @Test
    public void test_toOrderEntity_DefaultMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderid(123);
        orderDTO.setOrderName("TestOrder");
        orderDTO.setOrderQuantity(12);
        orderDTO.setOrderValue(15000);
        System.out.print(modelMapperExample.toOrderEntity(orderDTO));
    }
    @Test
    public void test_toOrderDTO_DefaultMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        Order order = new Order();
        order.setOrderid(123);
        order.setOrderName("TestOrder");
        order.setOrderQuantity(12);
        order.setOrderValue(15000);
        System.out.print(modelMapperExample.toOrderDTO(order));
    }

}
