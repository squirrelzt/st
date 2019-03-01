package com.annotation.controller;

import com.annotation.main.AnnotationApplicationMain;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AnnotationApplicationMain.class)
public class ArrayParamControllerTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void arrayParam() {
        MockHttpServletRequestBuilder builders = MockMvcRequestBuilders.post(URI.create("/array/strings"))
                .contentType(MediaType.APPLICATION_JSON)
                .param("names", "tom,jack,kate");
        try {
            MvcResult mvcResult = mockMvc.perform(builders).andReturn();
            System.out.println(mvcResult.getResponse());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
