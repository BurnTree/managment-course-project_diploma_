package com.bntu.project.backend.service;

import com.bntu.project.backend.dto.AuthDto;
import com.bntu.project.backend.dto.UserDto;
import com.bntu.project.backend.entity.Student;
import com.bntu.project.backend.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findById(int id);
    Student update(Student upStudent);
    Student add(Student student);
    void delete(int id);
    UserDto auth(AuthDto authDto);
//    List<Student> getSortedStudent(int idTeacher, int idGroup);
}
