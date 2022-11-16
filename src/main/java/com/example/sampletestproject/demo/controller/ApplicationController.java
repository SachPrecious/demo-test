package com.example.sampletestproject.demo.controller;

import com.example.sampletestproject.demo.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping("/app/helloworld")
    public Response getGreeting() {

        Response response = new Response();
        response.setCode("SAMPLE_CODE");
        response.setMessage("THIS IS TO CHECK AUTOMATE BUILD welcome ANSIBLE and springboot");
        return response;

    }


}
