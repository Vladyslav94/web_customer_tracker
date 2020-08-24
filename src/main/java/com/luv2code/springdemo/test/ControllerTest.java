//package com.luv2code.springdemo.test;
//
//import com.luv2code.StartApp;
//import com.luv2code.springdemo.controller.CustomerController;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(CustomerController.class)
//@ContextConfiguration(classes = StartApp.class)
//@AutoConfigureMockMvc
//@ComponentScan({"com.luv2code", "src/main/java/com.luv2code.springdemo.repository"})
////@SpringBootTest(classes = StartApp.class)
//public class ControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//
//    @Test
//    public void testHomePage() throws Exception {
//        this.mockMvc.perform(MockMvcRequestBuilders.get("/customer/list")
//                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"));
//    }
//}
