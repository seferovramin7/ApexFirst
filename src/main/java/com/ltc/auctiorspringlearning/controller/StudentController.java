package com.ltc.auctiorspringlearning.controller;

import com.ltc.auctiorspringlearning.dto.StudentDto;
import com.ltc.auctiorspringlearning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentController {

    private final StudentService service;


    @PostMapping("save")
    public void save(@RequestBody StudentDto dto) {
        service.save(dto);
    }

}
