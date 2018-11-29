package br.com.springmvc.springmvcdois.resource;

import br.com.springmvc.springmvcdois.entity.Student;
import br.com.springmvc.springmvcdois.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentResource {

    private static final long serialVersionUID = 8709929794662562231L;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Student> buscar(@PathVariable Long id){
        return ResponseEntity.ok(studentRepository.getOne(id));
    }
}
