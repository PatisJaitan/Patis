package com.example.testapis.service;

import com.example.testapis.model.Student;
import com.example.testapis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // Constructor-based dependency injection
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Retrieve all users
    public List<Student> getAllUsers() {
        return studentRepository.findAll();
    }

    // Retrieve a user by ID
    public Optional<Student> getUserById(Integer id) {
        return studentRepository.findById(id);
    }

    // Add a new user
    public void addUser(Student user) {
        studentRepository.save(user);
    }

    // Update an existing user
    public boolean updateUser(Integer id, Student updatedUser) {
        Optional<Student> existingUserOpt = studentRepository.findById(id);
        if (existingUserOpt.isPresent()) {
            Student existingUser = existingUserOpt.get();
            existingUser.setStudentName(updatedUser.getStudentName());
            existingUser.setPhone(updatedUser.getPhone());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setAddress(updatedUser.getAddress());
            existingUser.setUser(updatedUser.getUser());
            existingUser.setPassword(updatedUser.getPassword());
            studentRepository.save(existingUser);
            return true;
        }
        return false;
    }

    // Delete a user by ID
    public boolean deleteUser(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
