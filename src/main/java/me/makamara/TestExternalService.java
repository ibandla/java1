package me.makamara;
import me.makamara.Domain.Student;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import me.makamara.ExternalService;
import java.util.List;


@Component
public class TestExternalService implements CommandLineRunner {
  private final  org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
   
    @Autowired
    private final ExternalService externalService;

    public TestExternalService (ExternalService externalService) {
        this.externalService = externalService;
    }


    @Override
    public void run (String... strings) throws Exception {
         logger.info("HHHHHHHHHH ");
        List<Student> students = externalService.findAllStudentsFromExternalService();
        
        students.forEach(student -> {
            logger.info("Student name is " + student.getFirstName());
        });
    }
}