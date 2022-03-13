package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main8 {

    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"John\",\"age\":21}";

        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json, User.class);

        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
