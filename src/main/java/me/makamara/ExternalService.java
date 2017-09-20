package me.makamara;

import org.springframework.cloud.netflix.feign.FeignClient;
import me.makamara.Domain.Student;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@FeignClient(url = "https://hshkhnutpf.localtunnel.me", name = "getStudents")
public interface ExternalService {
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    List<Student> findAllStudentsFromExternalService();
}