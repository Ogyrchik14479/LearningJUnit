package igor.reznikov.ResumeConstructor.repositories;

import igor.reznikov.ResumeConstructor.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
