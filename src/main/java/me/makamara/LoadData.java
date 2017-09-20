package me.makamara;

import me.makamara.Domain.Student;
import me.makamara.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoadData implements CommandLineRunner{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(Arrays.asList(
                new Student("Wear","Sandals"),
                new Student("Shakhalkha","khwa"),
                new Student("Children","Boots"),
                new Student("Faces","evil")
        ));
    }
}
