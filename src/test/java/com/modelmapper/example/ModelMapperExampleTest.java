package com.modelmapper.example;

import com.modelmapper.example.dto.OrderDTO;
import com.modelmapper.example.dto.UserDTO;
import com.modelmapper.example.model.Order;
import com.modelmapper.example.model.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ModelMapperExampleTest {
    @Test
    public void test_toUser_ExplicitMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Test");
        userDTO.setLastName("User");
        User user = modelMapperExample.toEntity(userDTO);
        assertEquals(user.getFirstName(),userDTO.getFirstName());
        assertEquals(user.getLastName(),userDTO.getLastName());
    }
    @Test
    public void test_toDTO_ExplicitMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("User");
        user.setUserName("TestUSer");
        UserDTO userDTO = modelMapperExample.toDTO(user);
        assertEquals(userDTO.getFirstName(),user.getFirstName());
        assertEquals(userDTO.getLastName(),user.getLastName());
    }
    @Test
    public void test_toOrderEntity_DefaultMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderid(123);
        orderDTO.setName("TestOrder");
        orderDTO.setOrderQuantity(12);
        orderDTO.setValue(15000);
        Order order = modelMapperExample.toOrderEntity(orderDTO);
        assertEquals(order.getOrderName(), orderDTO.getName());
        assertEquals(order.getOrderDate(), orderDTO.getOrderDate());
        assertEquals(order.getOrderid(), orderDTO.getOrderid());
        assertEquals(order.getOrderQuantity(), orderDTO.getOrderQuantity());
        assertEquals(order.getOrderValue(), orderDTO.getValue());

    }
    @Test
    public void test_toOrderDTO_DefaultMapping(){
        ModelMapperExample modelMapperExample = new ModelMapperExample();
        Order order = new Order();
        order.setOrderid(123);
        order.setOrderName("TestOrder");
        order.setOrderQuantity(12);
        order.setOrderValue(15000);
        OrderDTO orderDTO = modelMapperExample.toOrderDTO(order);
        assertEquals(orderDTO.getName(),order.getOrderName());
        assertEquals(orderDTO.getOrderDate(),order.getOrderDate());
        assertEquals(orderDTO.getOrderid(),order.getOrderid());
        assertEquals(orderDTO.getOrderQuantity(),order.getOrderQuantity());
    }

}
