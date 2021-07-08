package br.com.pedrodavi.backend.testsreport.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
@AutoConfigureMockMvc
public class HelloControllerTest {

    static String API_URL = "/api/hello";

    MockHttpServletRequestBuilder request;

    @Autowired
    MockMvc mvc;

    @Test
    void getHello() throws Exception {
        request = get(API_URL).accept(MediaType.APPLICATION_JSON);
        mvc.perform(request).andExpect(status().isOk());
    }

}
