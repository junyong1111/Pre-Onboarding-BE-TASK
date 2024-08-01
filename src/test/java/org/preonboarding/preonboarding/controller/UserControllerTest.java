package org.preonboarding.preonboarding.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("User Controller Test - 회원정보")
@WebMvcTest
class UserControllerTest {
    private  final MockMvc mvc;

    public UserControllerTest(@Autowired MockMvc mockMvc){
        this.mvc = mockMvc;
    }

    @DisplayName("[GET] - 로그인 요청")
    @Test
    public void givenUserInfo_whenFindUser_thenReturnSuccess() throws Exception{
        // given


        // when & then
        mvc.perform(get("/api/v1/users/"))
                .andExpect(status().isOk());


    }

}