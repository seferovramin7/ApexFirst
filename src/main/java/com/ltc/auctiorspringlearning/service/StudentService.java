package com.ltc.auctiorspringlearning.service;

import com.ltc.auctiorspringlearning.dao.Student;
import com.ltc.auctiorspringlearning.dto.StudentDto;
import com.ltc.auctiorspringlearning.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    public void save(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);
        studentRepository.save(student);
    }


    public StudentDto findById(Long id) {
        Student byId = studentRepository.findById(id).get();
        return modelMapper.map(byId, StudentDto.class);
    }


}
