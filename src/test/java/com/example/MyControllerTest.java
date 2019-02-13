package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static javax.swing.UIManager.get;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//k
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreeting() throws Exception{

        this.mockMvc.perform((RequestBuilder) get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("<html>\n" +
                        "<body>\n" +
                        "Hello, Army!\n" +
                        "</body>\n" +
                        "</html>")));

        this.mockMvc.perform((RequestBuilder) get("/pushka?name=lol")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("<html>\n<body>\n<div> Hello, lol</div>\n</body>\n</html>")));
    }
}