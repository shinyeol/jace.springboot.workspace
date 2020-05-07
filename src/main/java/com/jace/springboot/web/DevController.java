package com.jace.springboot.web;

import com.jace.springboot.web.Dto.DevResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @GetMapping("/home")
    public String Home() {
        return "hello";
    }

    @GetMapping("/home/dto")
    public DevResponseDto devDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new DevResponseDto(name, amount);
    }
}
