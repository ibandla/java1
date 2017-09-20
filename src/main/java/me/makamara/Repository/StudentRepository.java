package me.makamara.Repository;

import java.util.List;

// import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.query.Param;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import me.makamara.Domain.Student;

// @RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByFirstNameContainingIgnoreCase(String firstName);


}