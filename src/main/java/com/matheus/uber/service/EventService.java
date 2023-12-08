package com.matheus.uber.service;

import com.matheus.uber.dto.EmailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "emailservice", url = "http://localhost:8081/api")
public interface EventService {

    @PostMapping("email")
    void sendEmail(@RequestBody EmailDTO email);
}
