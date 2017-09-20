package me.makamara.Controller;

import me.makamara.Domain.Student;
import me.makamara.Repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;
@RestController
@RequestMapping(value="students", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public Student createstudent (@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> FindAll(){
        return studentRepository.findAll();
    }

    @GetMapping(value="search")
    public List<Student>search(@RequestParam String firstName){
        return studentRepository.findAll();
    }

    @GetMapping(value="{id}")
    public Student findByid(@PathVariable Long id){
        return studentRepository.findOne(id);
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable Long id){
        studentRepository.delete(id);
    }

    @PatchMapping(value= "{id}")
    public Student updateStudent(){
        return null;
    }
}
