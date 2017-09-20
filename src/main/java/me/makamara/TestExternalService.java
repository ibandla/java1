package me.makamara;
import me.makamara.Domain.Student;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import me.makamara.groupwork.GroupService;
import java.util.List;


@Component
public class TestExternalService implements CommandLineRunner {
  private final  org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
   
    @Autowired
    private final GroupService group;

    public TestExternalService (GroupService group) {
        this.group = group;
    }


    @Override
    public void run (String... strings) throws Exception {
         logger.info("HHHHHHHHHH ");
         String group1 = "{\"name\": \"ibandla\",\"students\": [{\"firstName\":\"Christian\",\"lastName\": \"Musombi\",\"regNo\": 84705},{\"firstName\":\"Celline\",\"lastName\": \"Odawo\",\"regNo\": 82232},{\"firstName\":\"Nicholas\",\"lastName\": \"Kanyagia\",\"regNo\": 82779},{\"firstName\":\"Sharleene\"\"lastName\": \"Irungu\",\"regNo\": 84048}]}";
         String group2 = "{\"name\": \"denominator\", \"students\": \"secret\"}";
        Long groupid = group.update(group1);   
        logger.info("Student name is " + groupid.toString());
        // students.forEach(student -> {
        //     logger.info("Student name is " + student.getFirstName());
        // });
    }
}