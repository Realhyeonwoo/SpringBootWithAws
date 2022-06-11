package com.hyeonwoo.book.springboot.web;


import com.hyeonwoo.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
//    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam int amount) {
    public HelloResponseDto helloDto(@ModelAttribute HelloResponseDto helloDto) {
        return helloDto;
    }
}
